/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DTO.Account;
import DTO.HoaDon;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
import GUI.Accountform;

/**
 *
 * @author Tuong Vi
 */
public class AccountDAL {

    public static ResultSet rs;
    Connect sqlconnect = new Connect();

    public boolean dangNhap(String username, String pass) {

        try {
            Connection con = sqlconnect.getConnect();
            String sql = "SELECT * FROM ACCOUNT where UserName = ? and Password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            boolean result = rs.next();
            con.close();
            return result;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public void findByUser(String username,JTable jtable) {
        String sql = "select * from ACCOUNT where UserName N'% = ?";
        ArrayList<Account> hdlist = new ArrayList<>();
        try {
            Connection con = sqlconnect.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Account ac = new Account(rs.getString("UserName"),rs.getString("FullName"),rs.getString("Password"));
                    hdlist.add(ac);
                }
                DefaultTableModel model = (DefaultTableModel) jtable.getModel();
                model.setRowCount(0);
                Object row[] = new Object[3];
                for (int i = 0; i < hdlist.size(); i++) {
                    row[0] = hdlist.get(i).getUsername();
                    row[1] = hdlist.get(i).getFullname();
                    row[2] = hdlist.get(i).getPassword();
                    model.addRow(row);
                }
                
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
public ArrayList<Account> accountList() throws SQLException, ClassNotFoundException{
        ArrayList<Account> accountList= new ArrayList<>();
         String sql = "SELECT * FROM ACCOUNT ";
        try{
            Connection con = sqlconnect.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Account ac = new Account(rs.getString("UserName"),rs.getString("FullName"),rs.getString("Password"));
                accountList.add(ac);
            }
            con.close();
        }
        catch(Exception e) {
            System.out.println("Error");
                    e.printStackTrace();
        }
        return accountList;
        
    }
public void showAccount(JTable jtable) {
        try {
            ArrayList<Account> list = accountList();
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            Object[] row = new Object[3];
            model.setRowCount(0);
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getUsername();
                row[1] = list.get(i).getFullname();
                row[2] = list.get(i).getPassword();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Accountform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accountform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean InsertAccount(Account ac) {
        String sql = "insert into ACCOUNT values(?,?,?)";

        try {
            Connection con = sqlconnect.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ac.getUsername());
            ps.setString(2, ac.getFullname());
            ps.setString(3, ac.getPassword());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Account thành công!", "Thông báo", 1);
            con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Account không được thêm", "Thông báo", 1);
        }
        return false;
    }

    public boolean UpdateAccount(Account ac) {
        String sql = "UPDATE ACCOUNT SET Password = ?, FullName = ? where UserName = ?";
        try {
            Connection con = sqlconnect.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(3, ac.getUsername());
            ps.setString(1, ac.getPassword());
            ps.setString(2, ac.getFullname());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean DeleteAccount(String username) {
        String sql = "DELETE FROM ACCOUNT WHERE UserName = ?";
        try {
            Connection con = sqlconnect.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
