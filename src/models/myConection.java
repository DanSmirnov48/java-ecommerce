package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class myConection {
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\ShopDB.accdb"); 
            Statement stmt = con.createStatement();
        }catch(SQLException e){
            System.out.println("SQL exception occured" + e);
        }
        return con;
    }
}
