package models;

import java.io.Serializable;

public class Footwear extends Product  implements Serializable{
    //attributes
    private int size = 0;
    //empty constructor
    public Footwear(){
        super();
        size = 0;
    }
    
    //constructor with all the parametres
    public Footwear(Integer productIdIn, String productNameIn, double priceIn, int StockLevelIn, byte[] ProductImage, int sizeIn) {
        super(productIdIn, productNameIn, priceIn, StockLevelIn, ProductImage);
        this.size = sizeIn;
    }
    //constructor with all the parametres
    protected Footwear(int productIdIn, String productNameIn, double priceIn, int StockLevelIn, int sizeIn) {
        super(productIdIn, productNameIn, priceIn, StockLevelIn);
        this.size = sizeIn;
    }
    //constructor with every parametre exept productId
    protected Footwear(String productNameIn, double priceIn, int StockLevelIn, int sizeIn) {
        super(productNameIn, priceIn, StockLevelIn);
        this.size = sizeIn;
    }

    //getters
    public int getSize() {
        return size;
    }
    //setters
    protected void setSize(int size) {
        this.size = size;
    }
}
