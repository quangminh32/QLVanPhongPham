/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Connect {
    public Connection getConnect() throws SQLException, ClassNotFoundException{
        Connection con = null;
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          String url ="jdbc:sqlserver://localhost:1433;user=sa;password=123456;DatabaseName=Java;integratedSecurity=false;trustServerCertificate=true";
         con = DriverManager.getConnection(url,"sa","123456");
        }
        catch (SQLServerException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Khong the ket noi CSDL","ERROR",JOptionPane.OK_OPTION);
        }
        
        return con;
    }
}
