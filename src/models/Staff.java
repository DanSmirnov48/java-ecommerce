package models;

/**
 *
 * @author daniil
 */
public class Staff extends User{
    //attributes
    private String position ="";
    private double salary = 0;
    //empty constructor
    public Staff(){
        super();
        position = "";
        salary = 0;
    }
    //constructor with all the parametres
    public Staff(String userNameIn, String passwordIn, String firstNameIn, String lastNameIn, String positionIn, double salaryIn) {
        super(userNameIn, passwordIn, firstNameIn, lastNameIn);
        this.position = positionIn;
        this.salary = salaryIn;
    }
    //gettets
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    //setters
    protected void setPosition(String position) {
        this.position = position;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }
}
