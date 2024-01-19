package models;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author daniil
 */
public class Customer extends User{
    //attributes
    private String addressLine1 = "";
    private String addressLine2 = "";
    private String town = "";
    private String postCode = "";
    private boolean isRegistered;
    private boolean isFullyRegistered;

    private HashMap<Integer, Order> orders = new HashMap<>();
    //empty constructor
    public Customer(){
        super();
        addressLine1 = "";
        addressLine2 = "";
        town = "";
        postCode = "";
        isRegistered = true;
        orders = new HashMap();
    }
    //constructor with all the parametres exept isRegistered.
    public Customer(String userNameIn, String passwordIn, String firstNameIn, String lastNameIn,
                    String addressLine1In, String addressLine2In, String townIn, String postCodeIn) {
        super(userNameIn, passwordIn, firstNameIn, lastNameIn);
        this.addressLine1 = addressLine1In;
        this.addressLine2 = addressLine2In;
        this.town = townIn;
        this.postCode = postCodeIn;
        this.isRegistered = true;
        orders = new HashMap();
    }
    //gettets
    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getTown() {
        return town;
    }

    public String getPostCode() {
        return postCode;
    }

    public boolean isIsRegistered() {
        return isRegistered;
    }
    
    public boolean isIsFullyRegistered() {
        return isFullyRegistered;
    }

    public HashMap<Integer, Order> getOrders() {
        return orders;
    }
    
    //setters
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
    
    public void setIsFullyRegistered(boolean isFullyRegistered) {
        this.isFullyRegistered = isFullyRegistered;
    }

    public void setOrders(HashMap<Integer, Order> orders) {
        this.orders = orders;
    }
    
    public static Customer getCustomerByUsername(String username){
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        return customers.get(username);
    }
    
    public static Customer getCustomerByOrderId(int orderId){
        HashMap<String, Customer> customers = new DBManager().loadCustomer();
        for(Entry<String, Customer> cEntries : customers.entrySet()){
            var customer = cEntries.getValue();
            if(customer.getOrders().containsKey(orderId))
                return customer;
        }
        return null;
    }
    
    public static void deleteCustomer(String userName){
        DBManager.deleteCustomer(userName);
    }

    public static User editUser(User user, String username){
        return DBManager.editUsers(user, username);
    }
}
