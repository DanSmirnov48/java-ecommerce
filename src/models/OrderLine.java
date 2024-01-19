package models;

import java.io.Serializable;

/**
 *
 * @author daniil
 */
public class OrderLine implements Serializable{
    //Attributes.
    private int orderLineId;
    private Product product;
    private int quantity;
    private double lineTotal;

    // Constructor - 4 Parameters.
    public OrderLine(int orderLineId, Product product, int quantity, double lineTotal) {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    // Constructor - 3 Parameters excluding lineTotal.
    public OrderLine(int orderLineId, Product product, int quantity) {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.lineTotal = product.getPrice() * quantity;
    }
    //Getters.
    public int getOrderLineId() {
        return orderLineId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLineTotal() {
        return lineTotal;
    }
    //Setters.
    protected void setOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }

    protected void setProduct(Product product) {
        this.product = product;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
}
