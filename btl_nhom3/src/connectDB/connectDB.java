/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class connectDB {
    static final String db_url ="jdbc:mysql://localhost:3306/nhom3";
    static final String user = "root";
    static final String pass ="";
    public Connection getConnection()throws SQLException{
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(db_url, user,pass);
            System.out.println("Ket noi thanh cong");
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
