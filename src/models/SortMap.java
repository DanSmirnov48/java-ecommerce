package models;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMap{
    
    /**
    * How do I use Java Doc, please help...
    * @param unsortMap Takes in an unsorted Map, Integer Key and Order Value
    * @param order Sort in: <p>Ascending order = true. <p>Descending order = false;
    * @return returns sorted Map 
    */
    public static Map<Integer, Order> sortByComparator(Map<Integer, Order> unsortMap, final boolean order){
        List<Entry<Integer, Order>> list = new LinkedList<>(unsortMap.entrySet());
        Collections.sort(list, (Entry<Integer, Order> o1, Entry<Integer, Order> o2) -> {
            if(order)
                return o1.getKey().compareTo(o2.getKey());
            else
                return o2.getKey().compareTo(o1.getKey());
        });

        Map<Integer, Order> sortedMap = new LinkedHashMap<>();
        for (Entry<Integer, Order> entry : list)
            sortedMap.put(entry.getKey(), entry.getValue());

        return sortedMap;
    }
    
    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }
    
    public static Map<Integer, Product> sortProductsByName(Map<Integer, Product> unsortMap, final boolean order){
        List<Entry<Integer, Product>> list = new LinkedList<>(unsortMap.entrySet());

        list.sort((o1, o2) -> order ? o1.getValue().getProductName().compareTo(o2.getValue().getProductName()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().getProductName().compareTo(o2.getValue().getProductName()) : o2.getValue().getProductName().compareTo(o1.getValue().getProductName()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().getProductName().compareTo(o1.getValue().getProductName()));
        return list.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }
    
    public static Map<Integer, Product> sortProductsByPrice(Map<Integer, Product> unsortMap, final boolean order){
        List<Entry<Integer, Product>> list = new LinkedList<>(unsortMap.entrySet());

        list.sort((o1, o2) -> order ? Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice()) : Double.compare(o2.getValue().getPrice(), o1.getValue().getPrice()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : Double.compare(o2.getValue().getPrice(), o1.getValue().getPrice()));
        return list.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }
    
    private static Map<Integer, Product> sortProductsByPrice2(Map<Integer, Product> unsortMap, final boolean order){
        List<Entry<Integer, Product>> list = new LinkedList<>(unsortMap.entrySet());
        Collections.sort(list, (Entry<Integer, Product> o1, Entry<Integer, Product> o2) -> {
            if(order)
                return Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice());
            else
                return Double.compare(o2.getValue().getPrice(), o1.getValue().getPrice());
        });

        Map<Integer, Product> sortedMap = new LinkedHashMap<>();
        for (Entry<Integer, Product> entry : list)
            sortedMap.put(entry.getKey(), entry.getValue());

        return sortedMap;
    }

    private static void printMap(Map<Integer, Order> map){
        for (Map.Entry<Integer, Order> entry : map.entrySet())
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
    }
}
