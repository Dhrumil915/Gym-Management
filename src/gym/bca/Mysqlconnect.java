/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.bca;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author KRATOS
 */
public class Mysqlconnect {
    Connection co=null;
    public static Connection MysqlDB(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymbca","root","root");
             return co;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             return null;
        }
      
    }
}
