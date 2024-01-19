package models;

/**
 *
 * @author danie
 */
public class User {
    //Attributes.
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    // Constructor - 4 Parameters.
    public User(String userName, String password, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Constructor - 0 Parameters.
    public User(){
        userName = "";
        password = "";
        firstName = "";
        lastName = "";
    }

    //Getters.
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
       
    //Setters.
    protected void setUserName(String userName) {
        this.userName = userName;
    } 
    
    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
}