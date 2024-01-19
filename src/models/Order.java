package models;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import models.Enums.CustomerFileOperation;
import models.Enums.OrderStatus;

public class Order implements Serializable{
    
    //Attributes.
    private int OrderId;
    private Date orderDate;
    private double orderTotal;
    private String ststus;
    private HashMap<Integer, OrderLine> orderLines = new HashMap<>();
    
    // Constructor - 0 Parameters.
    public Order(){
        OrderId = 0;
        orderDate = new Date();
        orderTotal = 0;
        ststus = "In Progress";
        orderLines = new HashMap();
    }
    // Constructor - 4 Parameters excluding ordeLine.
    public Order(int OrderId, Date orderDate, double orderTotal, String ststus) {
        this.OrderId = OrderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.ststus = ststus;
        this.orderLines = new HashMap();
    }
    
    //Getters.
    public int getOrderId() {
        return OrderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String getStstus() {
        return ststus;
    }

    //Setters.
    public HashMap<Integer, OrderLine> getOrderLines() {
        return orderLines;
    }

    protected void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    protected void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    protected void setOrderLines(HashMap<Integer, OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
    
    //creating a new method which takes in OrderLine
    public boolean addOrderLine(OrderLine ol){
        boolean canBeAdded = true;
        //looping through orderLines HashMap
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            //actualOrderLine initializing with hashMap values
            var actualOrderLine = olEntry.getValue();
            //if product id from the user selected product equals to the product id from the orderLine hashMap
            if(Objects.equals(ol.getProduct().getProductId(), actualOrderLine.getProduct().getProductId())){
                //canbeadded is false
                canBeAdded = false;
            }
        }
        //if canbeadded is false, return false
        if(!canBeAdded)
            return false;
        else{ //else
            //initializing the orderId int;
            int orderLineId = 0;
            //using while loop checking if orderLines HashMap containes the value of orderId int
            while(orderLines.containsKey(orderLineId))
                //incremering orderId int by one if it exisrs
                orderLineId++;
            //setting the id of orderLineId to orderId int
            ol.setOrderLineId(orderLineId);
            //adding orderId and OrderLine to orderLines HashMap
            orderLines.put(orderLineId, ol);
            return true;
        }
    }
    
    //removeOrderLine method which takes in an int
    public void removeOrderLine(int animalId){
        int orderLineId = -1;
        //looping through orderLines HashMap
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            //actualOrderLine initializing with hashMap values
            var actualOrderLine = olEntry.getValue();
            //if the product id from the orderLine hashMap equals to animalId int
            if(actualOrderLine.getProduct().getProductId() == animalId){
                //getting the OrderLineId from the actualOrderLine values
                orderLineId = actualOrderLine.getOrderLineId();
            }
        }
        //if orderLineId int isnt -1, removing product with OrderLineId
        if(orderLineId != -1){
            orderLines.remove(orderLineId);
        }
    }
    
    public void calculateTotal(){
        //calculating orderTotal for every orderLine in orderLines hashMap
        orderTotal = 0;
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            var actualOrderLine = olEntry.getValue();
            orderTotal = orderTotal + actualOrderLine.getLineTotal();
        }
    }
    
    public static void decrementQuantity(Product product, int quantity){
        product.setStockLevel(product.getStockLevel() - quantity);
        DBManager db = new DBManager();
        db.updateProductQuantity(product);
    }
    
    public static void incrementQuantity(Product product, int quantity){
        product.setStockLevel(product.getStockLevel() + quantity);
        DBManager db = new DBManager();
        db.updateProductQuantity(product);
    }
    
    protected boolean productExists(Product product){
        boolean exists = false;
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            var actualOrderLine = olEntry.getValue();
            if(product.equals(actualOrderLine.getProduct())){
                exists = true;
            }
        }
        return exists;
    }
    
    private int getQuantity(Product product){
        int quantity = 0;
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            var actualOrderLine = olEntry.getValue();
            if(product == actualOrderLine.getProduct()){
                quantity = actualOrderLine.getQuantity();
            }
        }
        return quantity;
    }

    private void appendOrder(OrderLine ol) {
        for(Map.Entry<Integer, OrderLine> olEntry : orderLines.entrySet()){
            var actualOrderLine = olEntry.getValue();
            if(Objects.equals(ol.getProduct().getProductId(), actualOrderLine.getProduct().getProductId())){

                Integer total = ol.getQuantity() + actualOrderLine.getQuantity();
                if(total > actualOrderLine.getProduct().getStockLevel()){
                    System.out.println("Over the stock");
                }else{
                    actualOrderLine.setQuantity(total);
                    System.out.println("Quantity appended");
                }
            }
        }
    }
    
    public static boolean findOrderByOrderId(int orderId){
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        for(Entry<String, Customer> cEntries : customers.entrySet()){
            var customer = cEntries.getValue();
            if(customer.getOrders().containsKey(orderId)){
                return true;
            }
        }
        return false;
    }
    
    public static void updateOrderStatusForEveryCustomer(){
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        for(Entry<String, Customer> cusotmerEntry : customers.entrySet()){
            var customer = cusotmerEntry.getValue();
            for(Entry<Integer, Order> oEntry : customer.getOrders().entrySet()){
                var order = oEntry.getValue();
                if(!(order.getStstus().equals("Cenceled"))){
                    var date = order.getOrderDate();
                    var difference = findDifferenceInTime(date);
                    if(difference > 2){
                        order.setStstus("Dispatched");
                        DBManager.updateProductStatus(order.getStstus(), order.getOrderId());
                    }
                    if(difference > 7){
                        order.setStstus("Arrived");
                        DBManager.updateProductStatus(order.getStstus(), order.getOrderId());
                    }
                }
            }
        }
    }
    
    public static void updateOrderStatus(Customer customer){
        for(Entry<Integer, Order> oEntry : customer.getOrders().entrySet()){
            var order = oEntry.getValue();
            if(!(order.getStstus().equals("Cenceled")) || order.getStstus().equals("Arrived")){
                var difference = findDifferenceInTime(order.getOrderDate());
                if(difference > 2){
                    order.setStstus("Dispatched");
                    DBManager.updateProductStatus(order.getStstus(), order.getOrderId());
                }
                if(difference > 7){
                    order.setStstus("Arrived");
                    DBManager.updateProductStatus(order.getStstus(), order.getOrderId());
                }
            }
        }
    }
    
    public static void updateOrderStatus(Order order){
        DBManager.updateProductStatus(order.getStstus(), order.getOrderId());
    }
    
    private static long findDifferenceInTime(Date orderPlacedDate){
        try {
            SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Format formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String currentDate = formatter.format(new Date());
            String orderPlacedDateString = formatter.format(orderPlacedDate);
            
            Date d1 = sdf.parse(orderPlacedDateString);
            Date d2 = sdf.parse(currentDate); 
            
            long differenceInTime = d2.getTime() - d1.getTime();
            long differenceInDays  = (differenceInTime  / (1000 * 60 * 60 * 24))  % 365;

            return differenceInDays;
            
        } catch (ParseException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return 0;
    }
    
    public static String findArivialTime(Date orderPlacedDate, int days){
        Calendar cal = Calendar.getInstance();
        cal.setTime(orderPlacedDate);
        cal.add(Calendar.DAY_OF_YEAR, days);
        return new SimpleDateFormat("dd MMMM yyyy").format(cal.getTime());
    }
    
    public static Date customersBasketFile(String userName, CustomerFileOperation opperation){
        Date date = null;
        String fileName = "files\\"+userName+".ser";
        
        File f = new File(fileName);
        if(f.exists() && !f.isDirectory()) { 
            try {

                Path file = Paths.get(fileName);
                BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

                FileTime fileDate = null;
                switch(opperation){
                    case CREATION:
                        fileDate = attr.creationTime();
                        break;
                    case LAST_ACCESS:
                        fileDate = attr.lastAccessTime();
                        break;
                    case LAST_MODIFIED:
                        fileDate = attr.lastModifiedTime();
                        break;
                }

                String dateCreated = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fileDate.toMillis());
                date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(dateCreated);

            } catch (IOException | ParseException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }else{
            System.out.println("File " + userName + ".ser does not exist.");
        }

        return date;
    }
    
    public static int countStatus(OrderStatus orderStatus){
        int count = 0;
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        for(Entry<String, Customer> cusotmerEntry : customers.entrySet()){
            var customer = cusotmerEntry.getValue();
            for(Entry<Integer, Order> oEntry : customer.getOrders().entrySet()){
                var status = oEntry.getValue().getStstus();
                switch(orderStatus){
                    case PROCESSING:
                        if(status.equals("Processing"))
                            count++;
                        break;
                    case DISPATCHED:
                        if(status.equals("Dispatched"))
                            count++;
                        break;
                    case ARRIVED:
                        if(status.equals("Arrived"))
                            count++;
                        break;
                    case CANCELED:
                        if(status.equals("Cenceled"))
                            count++;
                        break;
                    case TOTAL:
                            count++;
                        break;
                }
            }
        }
        return count;
    }
}

