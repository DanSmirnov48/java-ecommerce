package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class SerProducts {
    
    public static Date randomDate(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2021, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        Date date = Date.from(randomDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return date;
    }
    
    private static void addProuct(Product p){
        Supplier<Integer> getRandom = () -> new Random().nextInt(100);
        p.setProductId(getRandom.get());
        addProductToHashMapOfAllProducts(p);
    }
    
    public static void addProductToHashMapOfAllProducts(Product product){
        HashMap<Integer, Product> allProductsHashMap = deserializeHashMap();
        while(allProductsHashMap.containsKey(product.getProductId())){
            Supplier<Integer> getRandom = () -> new Random().nextInt(100);
            product.setProductId(getRandom.get());
        }
        allProductsHashMap.put(product.getProductId(), product);
        serialiseHashMap(allProductsHashMap);
    }
    
    private static HashMap<Integer, Product> hashMapOfAllProducts(){
        HashMap<Integer, Product> allProductsHashMap = new DBManager().loadProducts();
        
        for(Map.Entry<Integer, Product> product : allProductsHashMap.entrySet()){
            var p = product.getValue();
            
            p.setProductAddedOn(randomDate());
            p.setProductDeletedOn(null);
            p.setProductAvailible(true);
        }
        
        return allProductsHashMap;
    }
    
    public static HashMap<Integer, Product> deserializeHashMap(){
        try{
            File f = new File("files\\products.ser");
            if(f.exists() && !f.isDirectory()) { 
                FileInputStream fis = new FileInputStream("files\\products.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                HashMap<Integer, Product> allProductsHashMap = (HashMap)ois.readObject();
                ois.close();
                fis.close();
                serialiseHashMap(allProductsHashMap);
                return allProductsHashMap;
            }
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println("File Doesn't Exist!");
        }
        return new HashMap();
    }
    
    public static void serialiseHashMap(HashMap<Integer, Product> allProductsHashMap){
        try {
            FileOutputStream fos = new FileOutputStream("files\\products.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(allProductsHashMap);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    private static void testMap(HashMap<Integer, Product> allProductsHashMap){
        for(Map.Entry<Integer, Product> product : allProductsHashMap.entrySet()){
            var p = product.getValue();

            System.out.print("Name: " + p.getProductName() + ", ");
            System.out.print("Price: " + p.getPrice() + ", ");
            System.out.print("Stock Level: " + p.getStockLevel() + ", ");
            System.out.print("Added On: " + p.getProductAddedOn() + ", ");
            System.out.print("Deleted On: " + p.getProductDeletedOn() + ", ");
            System.out.print("Is Avalible: " + p.isProductAvailible());

            System.out.println();
        }
    }
    
    public static boolean compareHashMap(){
        HashMap<Integer, Product> databaseMap = new DBManager().loadProducts();
        HashMap<Integer, Product> serMap = deserializeHashMap();
        return databaseMap.keySet().equals(serMap.keySet());
    }
    
    public static Set differenceOfHashMaps(){
        HashMap<Integer, Product> databaseMap = new DBManager().loadProducts();
        HashMap<Integer, Product> serMap = deserializeHashMap();
        
        HashSet<Integer> unionKeys = new HashSet<>(databaseMap.keySet());
        unionKeys.addAll(serMap.keySet());
        
        unionKeys.removeAll(databaseMap.keySet());

        return unionKeys;
    }
    
    private static HashMap<Integer, Product> deletedProductsHashMap(){
        HashMap<Integer, Product> unexistingProduct = new HashMap<>();
        
        Set keys = differenceOfHashMaps();
        keys.forEach((var key) -> {
            var p = Product.getProductById((int)key);
            unexistingProduct.put(p.getProductId(), p);
        });
        
        return unexistingProduct;
    }
}
