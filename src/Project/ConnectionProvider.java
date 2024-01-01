/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import java.sql.Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aksha
 */
public class ConnectionProvider {
    public static Connection getCon(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1?zeroDateTimeBehavior=convertToNull","root","root@123");
        return con;
        
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
