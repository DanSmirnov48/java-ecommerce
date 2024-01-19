package models;

import java.io.Serializable;

public class Clothing extends Product implements Serializable{
    //attributes
    private String measurement = "";
    //empty constructor
    public Clothing(){
        super();
        measurement = "";
    }
    //constructor with all the parametres
    public Clothing(Integer productIdIn, String productNameIn, double priceIn, int StockLevelIn, byte[] ProductImage, String measurementIn) {
        super(productIdIn, productNameIn, priceIn, StockLevelIn, ProductImage);
        this.measurement = measurementIn;
    }
    //constructor with all the parametres
    protected Clothing(int productIdIn, String productNameIn, double priceIn, int StockLevelIn, String measurementIn) {
        super(productIdIn, productNameIn, priceIn, StockLevelIn);
        this.measurement = measurementIn;
    }
    //constructor with every parametre exept productId
    protected Clothing(String productNameIn, double priceIn, int StockLevelIn, String measurementIn) {
        super(productNameIn, priceIn, StockLevelIn);
        this.measurement = measurementIn;
    }
    //getters
    public String getMeasurement() {
        return measurement;
    }
    //setters
    protected void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}
