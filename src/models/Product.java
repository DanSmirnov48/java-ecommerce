package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import models.Enums.ProductStock;
import models.Enums.ProductType;

public class Product implements Serializable{
    //Attributes.
    private Integer productId;
    private String productName;
    private double price;
    private int StockLevel;
    private byte[] ProductImage;
    
    private Date ProductAddedOn;
    private Date ProductDeletedOn;
    public boolean ProductAvailible;
    
    // Constructor - 5 Parameters.
    public Product(Integer productId, String productName, double price, int StockLevel, byte[] ProductImage, Date ProductAddedOn, Date ProductDeletedOn, boolean ProductAvailible){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.StockLevel = StockLevel;
        this.ProductImage = ProductImage;
        this.ProductAddedOn = ProductAddedOn;
        this.ProductDeletedOn = ProductDeletedOn;
        this.ProductAvailible = ProductAvailible;
    }
    
    // Constructor - 5 Parameters.
    public Product(Integer productId, String productName, double price, int StockLevel, byte[] ProductImage){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.StockLevel = StockLevel;
        this.ProductImage = ProductImage;
    }

    // Constructor - 4 Parameters.
    public Product(int productId, String productName, double price, int StockLevel) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.StockLevel = StockLevel;
    }

    // Constructor - 3 Parameters (excluding productId).
    public Product(String productName, double price, int StockLevel) {
        this.productId = 0;
        this.productName = productName;
        this.price = price;
        this.StockLevel = StockLevel;
    }
    
    // Constructor - 0 Parameters.
    public Product(){
        productId = 0;
        productName = "";
        price = 0;
        StockLevel = 0;
    }

    //Getters.
    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return StockLevel;
    }
    
    public byte[] getProductImage() {
        return ProductImage;
    }
    
    public Date getProductAddedOn() {
        return ProductAddedOn;
    }

    public Date getProductDeletedOn() {
        return ProductDeletedOn;
    }

    public boolean isProductAvailible() {
        return ProductAvailible;
    }
    
    //Setters.
    protected void setProductId(Integer productId) {
        this.productId = productId;
    }

    protected void setProductName(String productName) {
        this.productName = productName;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setStockLevel(int StockLevel) {
        this.StockLevel = StockLevel;
    }  
    
    protected void setProductImage(byte[] ProductImage) {
        this.ProductImage = ProductImage;
    }
    
    protected void setProductAddedOn(Date ProductAddedOn) {
        this.ProductAddedOn = ProductAddedOn;
    }  
    
    protected void setProductDeletedOn(Date ProductDeletedOn) {
        this.ProductDeletedOn = ProductDeletedOn;
    }
    
    protected void setProductAvailible(boolean ProductAvailible) {
        this.ProductAvailible = ProductAvailible;
    }

    @Override
    public String toString(){
        return productName;
    }
    
    private static ArrayList<Integer> listOfAllProductsID(){
        ArrayList<Integer> productsID = new ArrayList<>();
        new DBManager().loadProducts().entrySet().forEach(productEntry -> {
            productsID.add(productEntry.getValue().getProductId());
        });
        return productsID;
    }
    
    public static Product getProductById(int id){
        HashMap<Integer, Product> products = new DBManager().loadProducts();
        var product = products.get(id);
        return product;
    }
    
    private void listOfMostPopularProduct(int skip){
        var arr = DBManager.getAllProductId().toArray();
        Arrays.stream(arr)
            .skip(skip)
            .collect(Collectors.groupingBy(s -> s))
            .forEach((k, v) -> System.out.println(k+" has been bought "+v.size() + " times."));
    }
    
    public static void test(){
        var arr = DBManager.getAllProductId().toArray();
        Arrays.stream(arr)
            .collect(Collectors.groupingBy(s -> s))
            .forEach((k, v) -> System.out.println(k+" "+v.size()));
    }
    
    public static Product getMostPopularProduct(){
        var num = mostCommonProduct(DBManager.getAllProductId());
        return getProductById(num);
    }
    
    private static <T> T mostCommonProduct(List<T> list) {
        Map<T, Integer> map = new HashMap<>();

        for (T t : list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        }

        Entry<T, Integer> max = null;

        for (Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        return max.getKey();
    }
    
    public static ArrayList<Integer> getUnboughtProducts(){
        ArrayList<Integer> productsID;
        Set<Integer> allProductsList = new HashSet<>(listOfAllProductsID());
        Set<Integer> boughtProducts = new HashSet<>(DBManager.getAllProductId());
        
        allProductsList.removeAll(boughtProducts);
        productsID = new ArrayList<>(allProductsList);
        
        return productsID;
    }
    
    public static int getProductStock(ProductStock productStock){
        int count = 0;
        HashMap<Integer, Product> products = new DBManager().loadProducts();
        for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
            var stock = productEntry.getValue().getStockLevel();
            switch(productStock){
                case ALL:
                    count++;
                    break;
                case IN_STOCK:
                    if(stock > 0)
                        count++;
                    break;
                case OUT_OF_STOCK:
                    if(stock == 0)
                        count++;
                    break;
            }
        }
        return count;
    }
    
    public static int countProductType(ProductType type){
        int count = 0;
        HashMap<Integer, Product> products = new DBManager().loadProducts();
            for(Map.Entry<Integer, Product> productEntry : products.entrySet()){
                var product = productEntry.getValue();
                
                switch(type){
                    case ALL:
                        count++;
                        break;
                    case CLOTHING:
                        if(product.getClass().getName().equals("models.Clothing")){
                            count++;
                        }
                        break;
                    case FOOTWEAR:
                        if(product.getClass().getName().equals("models.Footwear")){
                            count++;
                        }
                        break;
                }
            }
        return count;
    }

}
