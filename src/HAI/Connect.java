/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI;

import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hai","root","abc");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
