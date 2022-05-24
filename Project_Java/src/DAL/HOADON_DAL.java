/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import DTO.HoaDon;
import DTO.Product;

/**
 *
 * @author ASUS
 */
public class HOADON_DAL {

    Connect sqlconnect = new Connect();

    public void SearchBill(String key, String mode, JTable jtable) {
        ArrayList<HoaDon> hdlist = new ArrayList<>();

        try {
            Connection con = sqlconnect.getConnect();

            String q = "";
            if (mode == "MaHD") {
                q = "SELECT * FROM HOADON WHERE MAHD=?";
            } else if (mode == "TenKH") {
                q = "SELECT * FROM HOADON WHERE TENKH LIKE ?";

            } else if (mode == "Ngay") {
                q = "SELECT * FROM HOADON WHERE NGAY LIKE ?";
            } else if (mode == "NV") {
                q = "SELECT * FROM HOADON WHERE NV LIKE ?";
            }
            PreparedStatement st = con.prepareStatement(q);
            if (mode == "TenKH" || mode == "NV" || mode == "Ngay") {
                st.setString(1, "%" + key + "%");
            } else {
                st.setString(1, key);
            }
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getInt("MAHD"), rs.getString("TENKH"), rs.getInt("SDTKH"), rs.getString("NGAY"), rs.getInt("TONGTIEN"), rs.getString("NV"));
                hdlist.add(hd);
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[6];
            for (int i = 0; i < hdlist.size(); i++) {
                row[0] = hdlist.get(i).getMAHD();
                row[1] = hdlist.get(i).getTENKH();
                row[2] = hdlist.get(i).getSDTKH();
                row[4] = hdlist.get(i).getTONG();
                row[3] = hdlist.get(i).getNGAY();
                row[5] = hdlist.get(i).getNV();
                model.addRow(row);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getYear(JComboBox b) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "select distinct YEAR(NGAY) AS NGAY FROM HOADON ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            b.removeAllItems();
            while (rs.next()) {
                b.addItem(rs.getString("NGAY"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int DoanhThu(String year, String month) {
        try {
            int s=0;
            Connection con = sqlconnect.getConnect();
            String q = "select SUM(TONGTIEN) AS TONG From HOADON WHERE YEAR(NGAY)=? and month(NGAY)=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, year);
            st.setString(2, month);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                s = rs.getInt("TONG");
            }
            return s;
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void combobox(JComboBox b) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM HOADON";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            b.removeAllItems();
            while (rs.next()) {
                String s = rs.getString("MAHD");
                b.addItem(s);
            }
            b.getSelectedItem().toString();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getALLSP(JTable jtable) throws ClassNotFoundException {
        ArrayList<Product> splist = new ArrayList<>();
        try {
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM SANPHAM";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Product sp = new Product(rs.getString("MASP"), rs.getNString("TENSP"), rs.getString("GiA"), rs.getInt("TONKHO"), rs.getString("MALOAISP"));
                splist.add(sp);
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[5];
            for (int i = 0; i < splist.size(); i++) {
                row[0] = splist.get(i).getId();
                row[1] = splist.get(i).getName();
                row[2] = splist.get(i).getPrice();
                row[3] = splist.get(i).getTonkho();
                row[4] = splist.get(i).getCategory();
                model.addRow(row);
                con.close();

            }
        } catch (SQLException e) {

        }
    }
    public void Report_SP(JTable jtable,String ngay){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "SELECT MASP,TENSP,SUM(SOLUONG) AS SOLUONGBANRA FROM CTHD   WHERE MAHD IN (SELECT MAHD FROM HOADON WHERE NGAY=?) GROUP BY TENSP,MASP";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1,ngay);
            ResultSet rs = st.executeQuery();
             DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            while(rs.next()){
                String MaSP = rs.getString("MASP");
                String tenSP = rs.getString("TENSP");
                String br = rs.getString("SOLUONGBANRA");
                String tbdata[]={MaSP,tenSP,br};
                model.addRow(tbdata);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void Report_NV(JTable jtable,String ngay){
        try{
            Connection con = sqlconnect.getConnect();
            String q = "select NV,SUM(TONGTIEN) AS DoanhThu,COUNT(NV)AS SLHOADON FROM HOADON WHERE NGAY=? GROUP BY NV";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1,ngay);
            ResultSet rs = st.executeQuery();
             DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            while(rs.next()){
                String NV = rs.getString("NV");
                String TONG = rs.getString("DoanhThu");
                String sl = rs.getString("SLHOADON");
                String tbdata[]={NV,TONG,sl};
                model.addRow(tbdata);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void getALLBill(JTable jtable) throws ClassNotFoundException {
        ArrayList<HoaDon> hdlist = new ArrayList<>();
        try {
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM HOADON";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getInt("MAHD"), rs.getString("TENKH"), rs.getInt("SDTKH"), rs.getString("NGAY"), rs.getInt("TONGTIEN"), rs.getString("NV"));
                hdlist.add(hd);
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[6];
            for (int i = 0; i < hdlist.size(); i++) {
                row[0] = hdlist.get(i).getMAHD();
                row[1] = hdlist.get(i).getTENKH();
                row[2] = hdlist.get(i).getSDTKH();
                row[4] = hdlist.get(i).getTONG();
                row[3] = hdlist.get(i).getNGAY();
                row[5] = hdlist.get(i).getNV();
                model.addRow(row);
                con.close();

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateHD(HoaDon hd) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE HOADON SET TENKH=?,SDTKH=?,NGAY=?,TONGTIEN=?,NV=? WHERE MAHD=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, hd.getTENKH());
            st.setInt(2, hd.getSDTKH());
            st.setString(3, hd.getNGAY());
            st.setInt(4, hd.getTONG());
            st.setString(5, hd.getNV());
            st.setInt(6, hd.getMAHD());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hóa Ðon " + hd.getMAHD() + " đã được cập nhật");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insertbill(HoaDon hd) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "INSERT INTO HOADON(TENKH,SDTKH,NGAY,TONGTIEN,NV) VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, hd.getTENKH());
            st.setInt(2, hd.getSDTKH());
            st.setString(3, hd.getNGAY());
            st.setInt(4, hd.getTONG());
            st.setString(5, hd.getNV());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hóa Ðon mới được thêm thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void delbill(int MAHD) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "DELETE FROM HOADON WHERE MAHD=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, MAHD);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hóa Ðon số " + MAHD + " đã bị xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
