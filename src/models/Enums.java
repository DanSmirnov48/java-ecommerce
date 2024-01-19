package models;

public class Enums {
    
    public static enum CustomerFileOperation {
        CREATION,
        LAST_ACCESS,
        LAST_MODIFIED
    }
    
    public static enum ProductType{
        ALL,
        CLOTHING,
        FOOTWEAR
    }
    
    public static enum OrderStatus{
        PROCESSING,
        DISPATCHED,
        ARRIVED,
        CANCELED,
        TOTAL
    }
    
    public static enum ProductStock{
        ALL,
        IN_STOCK,
        OUT_OF_STOCK
    }

}
