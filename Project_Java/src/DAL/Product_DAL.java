/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

//import DTO.CategoryProduct;
import DTO.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vuong
 */
public class Product_DAL {

    Connect sqlconnect = new Connect();

    public boolean insert(Product stud) throws Exception {
        Connection con = sqlconnect.getConnect();
        String sql = "insert into SANPHAM(TENSP,GIA,TONKHO,MALOAI) values(?,?,?,?)";
        try (
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, stud.getName());
            pstmt.setString(2, stud.getPrice());
            pstmt.setInt(3, stud.getTonkho());
            pstmt.setString(4, stud.getCategory());
//        conn.close();
            return pstmt.executeUpdate() > 0;
        }
    }

    public void getCategory(JComboBox jcombobox) {
        try {
            Connection conn = sqlconnect.getConnect();
            String q = "SELECT TENLOAISP FROM LOAISP";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            jcombobox.removeAllItems();
            while (rs.next()) {
                jcombobox.addItem(rs.getString("TENLOAISP"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Search(String key, JTable jtable, String mode) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            Connection con = sqlconnect.getConnect();

            String q = "";
            if (mode == "MaSP") {
                q = "SELECT * FROM SANPHAM WHERE MASP LIKE ?";
            } else if(mode =="TenSP"){
                q = "SELECT * FROM SANPHAM WHERE TENSP LIKE ?";
            }
            else if(mode =="LoaiSP"){
                q = "SELECT * FROM SANPHAM WHERE MALOAI LIKE ?";
            }
            else if (mode == "HetHang")
                q = "SELECT * FROM SANPHAM WHERE TONKHO = 0";
            PreparedStatement st = con.prepareStatement(q);
            if(mode != "HetHang")
                st.setString(1, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {               
                Product stud = new Product();
                stud.setId(rs.getString("MASP"));
                stud.setName(rs.getString("TENSP"));
                stud.setPrice(rs.getString("GiA"));
                stud.setTonkho(rs.getInt("TONKHO"));
                stud.setCategory(rs.getString("MALOAI"));
                list.add(stud);         
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            Object[] row = new Object[5];
            model.setRowCount(0);
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getPrice();
                row[3] = list.get(i).getTonkho();
                row[4] = list.get(i).getCategory();
                model.addRow(row);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public ArrayList<Product> productList() throws SQLException, ClassNotFoundException {
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Connection conn = sqlconnect.getConnect();

            String query = "SELECT * FROM SANPHAM";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Product product = new Product(rs.getString("MASP"), rs.getNString("TENSP"), rs.getString("GiA"), rs.getInt("TONKHO"), rs.getString("MALOAI"));
                productList.add(product);
            }
            conn.close();
//            
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return productList;

    }

    public void showProduct(JTable tblp) {
        try {

            ArrayList<Product> list = productList();
            DefaultTableModel model = (DefaultTableModel) tblp.getModel();
            Object[] row = new Object[6];
            model.setRowCount(0);
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getPrice();
                row[3] = list.get(i).getTonkho();
                row[4] = list.get(i).getCategory();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public boolean update(Product stud2) throws Exception {
        String sql = "update SANPHAM set TENSP = ?,GiA= ?,TONKHO=?,MALOAI= ? where  MASP= ?";
        Connection conn = sqlconnect.getConnect();
        try (
                //                SqlConnect conn = DatabaseHelper1.openConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(5, stud2.getId());
            pstmt.setString(1, stud2.getName());
            pstmt.setString(2, stud2.getPrice());
            pstmt.setInt(3, stud2.getTonkho());
            pstmt.setString(4, stud2.getCategory());
            return pstmt.executeLargeUpdate() > 0;

        }
//        return false;
    }

    public boolean delete(String maSP) throws Exception {
        String sql = "delete from SANPHAM where MASP = ?";
        Connection conn = sqlconnect.getConnect();
        try (
                //                SqlConnect conn = DatabaseHelper1.openConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, maSP);

            return pstmt.executeUpdate() > 0;
        }
//        return false;
    }
}
