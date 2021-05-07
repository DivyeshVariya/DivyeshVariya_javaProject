/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author dev
 */
public class Conn {
    static Connection c;
    static final String db_url = "jdbc:mysql://localhost:3306/invmngtdb2";
    static final String db_driver = "com.mysql.jdbc.Driver";
    static final String db_user = "root";
    static final String db_pass = "";

    
    
    public  static Connection setConnect(){
        try{            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection(db_url,db_user,db_pass);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return c;
    }
    
    
    
}
