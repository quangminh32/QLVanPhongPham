/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author ASUS
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import DTO.CTHD;
import DTO.Product;
public class CTHD_DAL {
    Connect sqlconnect = new Connect();
    public void CTHD(int MAHD, JTable jtable){
        ArrayList<CTHD> cthd = new ArrayList<>();
        try{
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM CTHD WHERE MAHD = ?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1,MAHD);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                CTHD hd = new CTHD(rs.getInt("MAHD"),rs.getInt("MASP"),rs.getString("TENSP"),rs.getInt("SOLUONG"),rs.getInt("GIA"),rs.getInt("TONG"));
                cthd.add(hd);           
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[6];
            for(int i=0;i<cthd.size();i++){
                row[0] = cthd.get(i).getMAHD();
                row[1] = cthd.get(i).getMASP();
                row[2] = cthd.get(i).getTENSP();
                row[3] = cthd.get(i).getSOLUONG();
                row[4] = cthd.get(i).getGIA();
                row[5] = cthd.get(i).getTONG();
                model.addRow(row);
            } 
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void updateTong(int tong,int mahd){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE HOADON SET TONGTIEN=? WHERE MAHD=?";
            PreparedStatement st=con.prepareStatement(q);
            st.setInt(1, tong);
            st.setInt(2, mahd);
            st.executeUpdate(); 
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void getItem(String key,JComboBox b){
        try{
            b.removeAllItems();
            Connection con = sqlconnect.getConnect();
            String q = "SELECT TENSP FROM SANPHAM WHERE TENSP LIKE ?";
            PreparedStatement st=con.prepareStatement(q);
            st.setString(1, "%"+key+"%");
            ResultSet rs = st.executeQuery();         
            while(rs.next()){
                String s = rs.getString("TENSP");
                b.addItem(s);
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void delete(int MAHD, int MASP){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "DELETE FROM CTHD WHERE MAHD=? AND MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, MAHD);
            st.setInt(2,MASP);
            st.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void updateCTHD(CTHD cthd){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE CTHD SET SOLUONG=?,TONG=? WHERE MAHD=? AND MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, cthd.getSOLUONG());
            st.setInt(2, cthd.getTONG());
            st.setInt(3, cthd.getMAHD());
            st.setInt(4, cthd.getMASP());
            st.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public int getNum(String masp){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "SELECT TONKHO FROM SANPHAM WHERE MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, masp);
            ResultSet rs = st.executeQuery();
            rs.next();
            int tonkho = rs.getInt("TONKHO");
            return tonkho;
            
        }
        catch(Exception e){
            e.printStackTrace();
            return -999;
            
        }
    }
    public void UpdateTonkho(String masp,int tonkho){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE SANPHAM SET TONKHO=? WHERE MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, tonkho);
            st.setString(2,masp);
            st.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public Product getSP(String TENSP){
       
        try{
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM SANPHAM WHERE TENSP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, TENSP);
            ResultSet rs = st.executeQuery();
            rs.next();
            Product sp = new Product(rs.getString("MASP"), rs.getNString("TENSP"), rs.getString("GiA"), rs.getInt("TONKHO"),rs.getString("MALOAI"));
            return sp;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    public boolean isDup(CTHD cthd){
        boolean result = true;
        try{
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM CTHD WHERE MAHD=? AND MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, cthd.getMAHD());
            st.setInt(2, cthd.getMASP());
            ResultSet rs = st.executeQuery();
            result = rs.next();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            return result;
        }
    }
    public void insert(CTHD cthd){
        try{
            
            Connection con = sqlconnect.getConnect();
            String q = "INSERT INTO CTHD VALUES(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, cthd.getMAHD());
            st.setInt(2, cthd.getMASP());
            st.setString(3, cthd.getTENSP());
            st.setInt(4, cthd.getSOLUONG());
            st.setInt(5, cthd.getGIA());
            st.setInt(6, cthd.getTONG());
            st.executeUpdate();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
