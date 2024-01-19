package models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DBManager {
    
    // HashMap class with a key - String and Customer as a value.
    public HashMap<String, Customer> loadCustomer(){
        Connection conn = myConection.getConnection();
        //Creating new HashMap with key String and Customer as a value.
        HashMap<String, Customer> customers = new HashMap();
        try{
            Statement stmt = conn.createStatement();
            //using sql, selecting all data from Customers table
            ResultSet rs  = stmt.executeQuery("SELECT * FROM Customers");
            // while there is more data to fetch, taking each value from database and assigning it to a string
            while(rs.next()){
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postcode = rs.getString("Postcode");

                //unsing all fenthed data, creating an instance of a Customer constuctor and passing fethced data to constuctor
                Customer customer = new Customer(userName, password, firstName, lastName, addressLine1, addressLine2, town, postcode);
                // using HashMap pushing the username as a key and an intance of a Constuctor as a value.
                customers.put(userName, customer);
            }
            //after while loop ends, closing the connection to database
            conn.close();
        }
        //catching any outor  that may occure during the previous stage
        catch(SQLException e){
            System.err.println("outor loading Staff: " + e.getMessage());
        }
        //returning the HashMap.
        finally {
            customers = loadCustomerOrders(customers);
            return customers;
        }
    }
    
    public HashMap<String, Staff> loadStuff(){
        Connection conn = myConection.getConnection();
        HashMap<String, Staff> staff = new HashMap();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs  = stmt.executeQuery("SELECT * FROM Staff");
            while(rs.next()){
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                Double salary = rs.getDouble("Salary");

                Staff staffConstructor = new Staff(userName, password, firstName, lastName, position, salary);
                staff.put(userName, staffConstructor);
            }
            conn.close();
        }
        catch(SQLException e){
            System.err.println("outor loading Staff: " + e.getMessage());
        }
        finally {return staff;}
    }
    
    //Creating function customerLogin with two parameters userName and Password
    public Customer customerLogin(String userName, String password){
        //Creating new HashMap with key String and Customer as a value.
        HashMap<String, Customer> customers = loadCustomer();
        //if hashMap contains a UserName key
        if(customers.containsKey(userName)){
            //getting a UserName from hashMap and assigning it to customer
            Customer customer = customers.get(userName);
            //if the password is equals to the password that has been passed in function paramenters
            if(customer.getPassword().equals(password)){
                //returning customer value
                return customer;
                //if not returning nothing
            }else return null;
        }else return null;
    }
    
    public Staff StaffLogin(String userName, String password){
        HashMap<String, Staff> staffHashMap = loadStuff();
        if(staffHashMap.containsKey(userName)){
            Staff staff = staffHashMap.get(userName);
            if(staff.getPassword().equals(password)){
                return staff;
            }else return null;
        }else return null;
    }
    
    public boolean userExists(String userName){
        if(loadCustomer().containsKey(userName))
            return true;
        else
            return loadStuff().containsKey(userName);
    }
    
    public void updateUserPassword(String username, String newPassword){
        if(loadCustomer().containsKey(username)){
            var customer = loadCustomer().get(username);

            Connection con = myConection.getConnection();
            PreparedStatement PS;
            String UpdateQuery = "UPDATE `Customers` SET  `Password`= ?  WHERE `Username` = ?";
            try {
                PS = con.prepareStatement(UpdateQuery);
                PS.setString(1, newPassword);
                PS.setString(2, customer.getUserName());
                if (PS.executeUpdate() !=0)
                    System.out.println("Customer Password Updated"); 
                else
                    System.out.println("Something went Wrong");
            } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
    
    // HashMap class with a key - Integer and Product as a value.
    public HashMap<Integer, Product> loadProducts(){
        Connection conn = myConection.getConnection();
        //Creating new HashMap with key Integer and Product as a value.
        HashMap<Integer, Product> products = new HashMap();
        try{
            Statement stmt = conn.createStatement();
            //using sql, selecting all data from Products table
            ResultSet rs  = stmt.executeQuery("SELECT * FROM Products");
            // while there is more data to fetch, taking each value from database and assigning it to a variable
            while(rs.next()){
                int productlId = rs.getInt("ProductId");
                String productName = rs.getString("ProductName");
                double price = rs.getDouble("Price");
                int stockLevel = rs.getInt("StockLevel");
                String measurement = rs.getString("Measurement");
                int size = rs.getInt("Size");
                byte[] img = rs.getBytes("ProductImg");
                //if the measurement column is empty or contains no values(meaning we are working with footwear)
                if(measurement == null || measurement.equalsIgnoreCase("")){
                    //unsing all fenthed data, creating an instance of a Footwear constuctor and passing fethced data to constuctor
                    Footwear footware = new Footwear(productlId, productName, price, stockLevel, img, size);
                    // using HashMap pushing the productl id as a key and an intance of a Footwear as a value.
                    products.put(productlId, footware);
                //if the measurement column is not empty or contains no values(meaning we are working with clothing)
                }else{
                    //unsing all fenthed data, creating an instance of a Clothing constuctor and passing fethced data to constuctor
                    Clothing clothing = new Clothing(productlId, productName, price, stockLevel, img, measurement);
                    // using HashMap pushing the productl id as a key and an intance of a Clothing as a value.
                    products.put(productlId, clothing);
                }
            }
            //closing the connection to database
            conn.close();
        }
        catch(SQLException e){
            System.err.println("outor loading Products: " + e.getMessage());
        }
        finally {return products;}
    }
    
    //public method to register a new Customer
    public void registerCustomer(Customer customer){
        if(!userExists(customer.getUserName())){
            Connection conn = myConection.getConnection();
            try {
                //creating a prepeared statiment
                PreparedStatement PS;
                //SQL command, insetert values into Custoemr table, naming all the rows where the 
                            //values would go and creating a placeholders for the values
                String SQL = ("INSERT INTO Customers (Username, Password, FirstName, LastName, "
                        + "AddressLine1, AddressLine2, Town, Postcode) VALUES (?,?,?,?,?,?,?,?)");
                //executing a prepared Statiment and passing in SQL String command
                PS = conn.prepareStatement(SQL);
                //assigning value to the first placeholder by using Prepared Statiment.
                //repeating process for every other value, order must match the placeholder.
                PS.setString(1, customer.getUserName());
                PS.setString(2, customer.getPassword());
                PS.setString(3, customer.getFirstName());
                PS.setString(4, customer.getLastName());
                PS.setString(5, customer.getAddressLine1());
                PS.setString(6, customer.getAddressLine2());
                PS.setString(7, customer.getTown());
                PS.setString(8, customer.getPostCode());
                //if Prepareded Statiment went well, prining success msg
                if (PS.executeUpdate() !=0)
                    System.out.println("New User Added"); 
                //else, print an outor msg
                else
                   System.out.println("Something went Wrong");
                //closing the connection to the database
            }catch(SQLException e){
                System.err.println(e.getLocalizedMessage());
            }finally{
                try { conn.close(); } catch (SQLException ex) {
                    System.err.println(ex.getLocalizedMessage());
                }
            }
        }
    }
    
    public void EditProduct(Product product, boolean withImage){
        Connection conn = myConection.getConnection();
        PreparedStatement PS;
        String UpdateQuery = "";
        if(withImage == true){
            try {
                if(product.getClass().getName().equals("models.Footwear")){
                    var footwear = (Footwear)product;
                    UpdateQuery = "UPDATE `Products` SET `ProductName` = ?, `Price` = ?, `StockLevel` = ?, `Size` = ?, `ProductImg` = ? WHERE `ProductId` = ?";
                    PS = conn.prepareStatement(UpdateQuery);
                    PS.setInt(4, footwear.getSize());
                }else{
                    var clothing = (Clothing)product;
                    UpdateQuery = "UPDATE `Products` SET `ProductName` = ?, `Price` = ?, `StockLevel` = ?, `Measurement` = ?, `ProductImg` = ? WHERE `ProductId` = ?";
                    PS = conn.prepareStatement(UpdateQuery);
                    PS.setString(4, clothing.getMeasurement());
                }
                PS.setString(1, product.getProductName());
                PS.setDouble(2, product.getPrice());
                PS.setInt(3, product.getStockLevel());
                PS.setBytes(5, product.getProductImage());
                PS.setInt(6, product.getProductId());
                if (PS.executeUpdate() !=0)
                    System.out.println("Product Data Updated");
                else
                    System.out.println("Something went Wrong");
            } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }finally{
                try { conn.close(); } catch (SQLException ex) {
                    System.err.println(ex.getLocalizedMessage());
                }
            }
        }else{
            try {
                if(product.getClass().getName().equals("models.Footwear")){
                    var footwear = (Footwear)product;
                    UpdateQuery = "UPDATE `Products` SET `ProductName` = ?, `Price` = ?, `StockLevel` = ?, `Size` = ? WHERE `ProductId` = ?";
                    PS = conn.prepareStatement(UpdateQuery);
                    PS.setInt(4, footwear.getSize());
                }else{
                    var clothing = (Clothing)product;
                    UpdateQuery = "UPDATE `Products` SET `ProductName` = ?, `Price` = ?, `StockLevel` = ?, `Measurement` = ? WHERE `ProductId` = ?";
                    PS = conn.prepareStatement(UpdateQuery);
                    PS.setString(4, clothing.getMeasurement());
                }
                PS.setString(1, product.getProductName());
                PS.setDouble(2, product.getPrice());
                PS.setInt(3, product.getStockLevel());
                PS.setInt(5, product.getProductId());
                if (PS.executeUpdate() !=0)
                    System.out.println("Product Data Updated");
                else
                    System.out.println("Something went Wrong");
            } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }finally{
                try { conn.close(); } catch (SQLException ex) {
                    System.err.println(ex.getLocalizedMessage());
                }
            }
        }
    }
    
    //public methoid to delete the product, takes in one paramenter which is ID of the product
    public void DeleteProduct(int ID){
        Connection conn = myConection.getConnection();
        try {
            PreparedStatement PS;
            //creating an SQL command to delete from where ID equals to ID passed in as a paramenter
            String SQL = ("DELETE FROM `Products` WHERE `ProductId` =?");
            PS = conn.prepareStatement(SQL);
            //using prepeared statement, setting the value if ID to the paramenter ID
            PS.setInt(1, ID);
            //if Update was successfull, print success msg
            if (PS.executeUpdate() !=0)
                System.out.println("Product Deleted"); 
            else
                System.out.println("Something went Wrong");
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
    
    //public method to write the order customer has placed, takes an order and String as an arguments
    public int writeOrder(Order order, String Customer){
        Connection conn = myConection.getConnection();
        Integer orderId = 0;
        try {    
            PreparedStatement PS;
            //creating sql command to insert all the values to the Orders table
            String SQL = ("INSERT INTO Orders (OrderId, OrderDate, Username, OrderTotal, Status)"
                    + "VALUES (?,?,?,?,?)");
            PS = conn.prepareStatement(SQL);
            PS.setInt(1, order.getOrderId());
            PS.setString(2, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(order.getOrderDate()));
            PS.setString(3, Customer);
            PS.setDouble(4, order.getOrderTotal());
            PS.setString(5, order.getStstus());
            if (PS.executeUpdate() !=0)
                System.out.println("Order has been written"); 
            else
                System.out.println("Something went Wrong");
            ResultSet RS = PS.getGeneratedKeys();
            if(RS.next()) orderId = RS.getInt(1);
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
        return orderId;
    }
    
    public void writeOrderLine(OrderLine orderLine, int orderId){
        Connection conn = myConection.getConnection();
            PreparedStatement PS;
        try {
            //creating sql command to insert all the values to the Orders table
            String SQL = ("INSERT INTO OrderLines (OrderLineId, ProductId, Quantity, LineTotal, OrderId)"
                    + "VALUES (?,?,?,?,?)");
            PS = conn.prepareStatement(SQL);
            PS.setInt(1, orderLine.getOrderLineId());
            PS.setInt(2, orderLine.getProduct().getProductId());
            PS.setInt(3, orderLine.getQuantity());
            PS.setDouble(4, orderLine.getLineTotal());
            PS.setInt(5, orderId);
            if (PS.executeUpdate() !=0)
                System.out.println("OrderLine has been written");
            else
                System.out.println("Something went Wrong");
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
    
    public void updateProductQuantity(Product product){
        Connection conn = myConection.getConnection();
        PreparedStatement PS;
        try {
            String UpdateQuery = "UPDATE `Products` SET `StockLevel` = ? WHERE `ProductId` = ?";
            PS = conn.prepareStatement(UpdateQuery);
            PS.setInt(1, product.getStockLevel());
            PS.setInt(2, product.getProductId());
            if (PS.executeUpdate() !=0)
                System.out.println("Product Data Updated");
            else
                System.out.println("Something went Wrong");
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
    
    public ArrayList<Clothing> ClothingList(){
        ArrayList<Clothing> clothingList = new ArrayList<>();
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT * FROM Products WHERE `Measurement` <> ''");
            Clothing C;
            while(RS.next()){
                C = new Clothing(RS.getInt("ProductId"),
                                RS.getString("ProductName"),
                                RS.getDouble("Price"),
                                RS.getInt("StockLevel"),
                                RS.getBytes("ProductImg"),
                                RS.getString("Measurement"));
                clothingList.add(C);
            }conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        return clothingList;    
    }
    
    public ArrayList<Footwear> FootwearList(){
        ArrayList<Footwear> footwearList = new ArrayList<>();
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT * FROM Products WHERE `Size` IS NOT NULL");
            Footwear F;
            while(RS.next()){
                F = new Footwear(RS.getInt("ProductId"),
                                RS.getString("ProductName"),
                                RS.getDouble("Price"),
                                RS.getInt("StockLevel"),
                                RS.getBytes("ProductImg"),
                                RS.getInt("Size"));
                footwearList.add(F);
            }conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        return footwearList;    
    }
    
    public ArrayList<Product> ProductList(){
        ArrayList<Product> productList = new ArrayList<>();
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT * FROM Products");
            while(RS.next()){
                int productlId = RS.getInt("ProductId");
                String productName = RS.getString("ProductName");
                double price = RS.getDouble("Price");
                int stockLevel = RS.getInt("StockLevel");
                byte[] img = RS.getBytes("ProductImg");
                String measurement = RS.getString("Measurement");
                int size = RS.getInt("Size");

                if(measurement == null || measurement.equalsIgnoreCase("")){
                    Footwear footwear = new Footwear(productlId, productName, price, stockLevel, img, size);
                    productList.add(footwear);
                }else{
                    Clothing clothing = new Clothing(productlId, productName, price, stockLevel, img, measurement);
                    productList.add(clothing);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
        return productList;
    }
    
    public void InsertProduct(Product product){
        Connection conn = myConection.getConnection();
        PreparedStatement PS = null;
        try {
            if(product.getClass().getName().equals("models.Clothing")){
                var clothing = (Clothing)product;
                String SQL = ("INSERT INTO Products (ProductName, Price, StockLevel, Measurement, ProductImg) VALUES (?,?,?,?,?)");
                PS = conn.prepareStatement(SQL);
                PS.setString(1, clothing.getProductName());
                PS.setDouble(2, clothing.getPrice());
                PS.setInt(3, clothing.getStockLevel());
                PS.setString(4, clothing.getMeasurement());
                PS.setBytes(5, clothing.getProductImage());
            }else{
                var footwear = (Footwear)product;
                String SQL = ("INSERT INTO Products (ProductName, Price, StockLevel, Size, ProductImg) VALUES (?,?,?,?,?)");
                PS = conn.prepareStatement(SQL);
                PS.setString(1, footwear.getProductName());
                PS.setDouble(2, footwear.getPrice());
                PS.setInt(3, footwear.getStockLevel());
                PS.setInt(4, footwear.getSize());
                PS.setBytes(5, footwear.getProductImage());
            }
            if (PS.executeUpdate() !=0){
                System.out.println("New product Added"); 
            }else{
               System.out.println("Something went Wrong");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
    
    public ArrayList<Product> SearchProductList(String ValueSearched){
        ArrayList<Product> productListSearched = new ArrayList<>();
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT `ProductId`, `ProductName`, `Price`, `StockLevel`, `ProductImg`, `Measurement`, `Size` "
                    + "FROM Products WHERE ProductName LIKE '%"+ValueSearched+"%' ");
            Product P;
            while(RS.next()){
                int productlId = RS.getInt("ProductId");
                String productName = RS.getString("ProductName");
                double price = RS.getDouble("Price");
                int stockLevel = RS.getInt("StockLevel");
                byte[] img = RS.getBytes("ProductImg");
                String measurement = RS.getString("Measurement");
                int size = RS.getInt("Size");

                if(measurement == null || measurement.equalsIgnoreCase("")){
                    Footwear footwear = new Footwear(productlId, productName, price, stockLevel, img, size);
                    productListSearched.add(footwear);
                }else{
                    Clothing clothing = new Clothing(productlId, productName, price, stockLevel, img, measurement);
                    productListSearched.add(clothing);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
        return productListSearched;
    }
    
    protected static ArrayList<Integer> getAllProductId(){
        ArrayList<Integer> productIDs = new ArrayList<>();
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT `ProductId` FROM OrderLines");
            while(RS.next()){
                productIDs.add(RS.getInt("ProductId"));
            }
            conn.close();
        } catch (SQLException ex) { System.err.println(ex.getLocalizedMessage()); }
        return productIDs; 
    }

    public HashMap<String, Customer> loadCustomerOrders(HashMap<String, Customer> customers){
        Connection conn = myConection.getConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * From Orders");
            while(rs.next()){
                int orderId = rs.getInt("OrderId");
                Date orderDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString("OrderDate"));
                String username = rs.getString("Username");
                double orderTotal = rs.getDouble("OrderTotal");
                String status = rs.getString("Status");

                Order order = new Order(orderId, orderDate, orderTotal, status);
                if(customers.containsKey(username)){
                    Customer customer = customers.get(username);
                    customer.getOrders().put(orderId, order);
                }
            }
           conn.close();
        }
        catch(SQLException | ParseException ex){ System.err.println(ex.getLocalizedMessage()); }
        finally{ 
            customers = loadCustomerOrderLines(customers);
            return customers; 
        }
    }
    
    public HashMap<String, Customer> loadCustomerOrderLines(HashMap<String, Customer> customers){
        Connection conn = myConection.getConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * From OrderLines");
            while(rs.next()){
                int orderLineID = rs.getInt("OrderLineId");
                int productId = rs.getInt("ProductId");
                int quantity = rs.getInt("Quantity");
                double lineTotal = rs.getDouble("LineTotal");
                int orderId = rs.getInt("OrderId");
                
                HashMap<Integer, Product> products = loadProducts();
                var productBought = products.get(productId);
                var orderLine = new OrderLine(orderLineID, productBought, quantity, lineTotal);
                
                for(Map.Entry<String, Customer> customerEntry : customers.entrySet()){
                    var customer = customerEntry.getValue();
                    if(customer.getOrders().containsKey(orderId)){
                        var orderLineOrder = customer.getOrders().get(orderId);
                        orderLineOrder.getOrderLines().put(orderLineID, orderLine);
                    }
                }
            }
            conn.close();
        }
        catch(Exception ex){ System.err.println(ex.getLocalizedMessage()); }
        finally{ return customers; }
    }
    
    protected static User editUsers(User user, String username){
        Connection con = myConection.getConnection();
        PreparedStatement PS;
        String UpdateQuery = "";
        if(user.getClass().getName().equals("models.Customer")){
            Customer customer = (Customer)user;
            try {
                UpdateQuery = "UPDATE `Customers` SET `Username` = ?, `Password`= ?, `FirstName`= ?, `LastName`= ?, "
                        + "`AddressLine1`= ?, `AddressLine2`= ?, `Town`= ?, `Postcode`= ?  WHERE `Username` = ?";
                PS = con.prepareStatement(UpdateQuery);
                PS.setString(1, customer.getUserName());
                PS.setString(2, customer.getPassword());
                PS.setString(3, customer.getFirstName());
                PS.setString(4, customer.getLastName());
                PS.setString(5, customer.getAddressLine1());
                PS.setString(6, customer.getAddressLine2());
                PS.setString(7, customer.getTown());
                PS.setString(8, customer.getPostCode());
                PS.setString(9, username);
                if (PS.executeUpdate() !=0){
                    System.out.println("Customer Data Updated"); 
                    return customer;
                }
                else
                    System.out.println("Something went Wrong");
            } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }else{
            Staff staff = (Staff)user;
            try {
                UpdateQuery = "UPDATE `Staff` SET `Username` = ?, `Password`= ?, `FirstName`= ?, `LastName`= ?, "
                        + "`Position`= ?, `Salary`= ?  WHERE `Username` = ?";
                PS = con.prepareStatement(UpdateQuery);
                PS.setString(1, staff.getUserName());
                PS.setString(2, staff.getPassword());
                PS.setString(3, staff.getFirstName());
                PS.setString(4, staff.getLastName());
                PS.setString(5, staff.getPosition());
                PS.setDouble(6, staff.getSalary());
                PS.setString(7, username);
                if (PS.executeUpdate() !=0){
                    System.out.println("Staff Data Updated"); 
                    return staff;
                }
                else
                    System.out.println("Something went Wrong");
            } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
        return null;
    }
    
    protected static void deleteCustomer(String userName){
        Connection con = myConection.getConnection();
        PreparedStatement PS;
        try {
            String SQL = ("DELETE FROM `Customers` WHERE `Username` =?");
            PS = con.prepareStatement(SQL);
            PS.setString(1, userName);
            if (PS.executeUpdate() !=0)
                System.out.println("Customers Deleted"); 
            else
                System.out.println("Something went Wrong");
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
    
    protected static Customer getCustomerByOrderId(int orderId){
        Connection conn = myConection.getConnection();
        Statement ST;
        ResultSet RS;
        try {
            ST = conn.createStatement();
            RS = ST.executeQuery("SELECT `Username` FROM Orders WHERE `OrderId` = " + orderId);
            if(RS.next()){
                return Customer.getCustomerByUsername(RS.getString("Username"));
            }
            conn.close();
        } catch (SQLException ex) { System.err.println(ex.getLocalizedMessage()); }
        return null;
    }
    
    protected static void updateProductStatus(String status, int orderId){
        Connection conn = myConection.getConnection();
        PreparedStatement PS;
        try {
            String UpdateQuery = "UPDATE `Orders` SET `Status` = ? WHERE `OrderId` = ?";
            PS = conn.prepareStatement(UpdateQuery);
            PS.setString(1, status);
            PS.setInt(2, orderId);
            if (PS.executeUpdate() ==0)
                System.out.println("Something went Wrong");
        } catch (SQLException ex) {
            System.err.println(ex.getLocalizedMessage());
        }finally{
            try { conn.close(); } catch (SQLException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
}
