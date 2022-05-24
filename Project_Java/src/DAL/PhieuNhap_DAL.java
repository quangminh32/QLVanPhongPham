/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author ASUS
 */
import DTO.PhieuNhap;
import DAL.Connect;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PhieuNhap_DAL {

    Connect sqlconnect = new Connect();

    public boolean Getall(JTable jtable) {
        ArrayList<PhieuNhap> splist = new ArrayList<>();
        try {
            Connection con = sqlconnect.getConnect();
            String q = "SELECT * FROM PHIEUNHAP";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                PhieuNhap sp = new PhieuNhap(rs.getInt("MAPHIEU"), rs.getNString("MASP"), rs.getInt("SOLUONG"), rs.getString("NGAY"), rs.getString("NCC"));
                splist.add(sp);
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[5];
            for (int i = 0; i < splist.size(); i++) {
                row[0] = splist.get(i).getMaPhieu();
                row[1] = splist.get(i).getMaSP();
                row[2] = splist.get(i).getSoluong();
                row[3] = splist.get(i).getNgay();
                row[4] = splist.get(i).getNCC();
                model.addRow(row);
                con.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean InsertPN(PhieuNhap hd) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "INSERT INTO PHIEUNHAP (MASP,SOLUONG,NGAY,NCC) VALUES(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, hd.getMaSP());
            st.setInt(2, hd.getSoluong());
            st.setString(3, hd.getNgay());
            st.setString(4, hd.getNCC());
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean UpdatePN(PhieuNhap hd) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE PHIEUNHAP SET MASP=?,SOLUONG=?,NGAY=?,NCC=? WHERE MAPHIEU=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, hd.getMaSP());
            st.setInt(2, hd.getSoluong());
            st.setString(3, hd.getNgay());
            st.setString(4, hd.getNCC());
            st.setInt(5, hd.getMaPhieu());
            st.executeUpdate();
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean DelPN(int MaPhieu) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "DELETE PHIEUNHAP WHERE MAPHIEU=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, MaPhieu);
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getNum(String masp) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "SELECT TONKHO FROM SANPHAM WHERE MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, masp);
            ResultSet rs = st.executeQuery();
            rs.next();
            int tonkho = rs.getInt("TONKHO");
            return tonkho;

        } catch (Exception e) {
            e.printStackTrace();
            return -999;

        }
    }

    public void UpdateTonkho(String masp, int tonkho) {
        try {
            Connection con = sqlconnect.getConnect();
            String q = "UPDATE SANPHAM SET TONKHO=? WHERE MASP=?";
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1, tonkho);
            st.setString(2, masp);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean CheckSP(String masp) {
        try {
            Connection con = sqlconnect.getConnect();
            String sql = "SELECT * FROM SANPHAM where MASP=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masp);
            ResultSet rs = ps.executeQuery();
            boolean result = rs.next();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void SearchPN(String key, String mode, JTable jtable) {
        ArrayList<PhieuNhap> splist = new ArrayList<>();
        String q = "";
        try {
            if (mode == "NCC") {
                q = "SELECT * FROM PHIEUNHAP WHERE NCC LIKE ?";
            } else if (mode == "Ngay") {
                q = "SELECT * FROM PHIEUNHAP WHERE NGAY LIKE ?";
            } else if (mode == "MaSP") {
                q = "SELECT * FROM PHIEUNHAP WHERE MASP LIKE ?";
            } else if (mode == "MaPhieu") {
                q = "SELECT * FROM PHIEUNHAP WHERE MAPHIEU LIKE ?";
            }
            Connection con = sqlconnect.getConnect();
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, "%" + key + "%");
             ResultSet rs = st.executeQuery();
             while (rs.next()) {
                PhieuNhap sp = new PhieuNhap(rs.getInt("MAPHIEU"), rs.getNString("MASP"), rs.getInt("SOLUONG"), rs.getString("NGAY"), rs.getString("NCC"));
                splist.add(sp);
            }
            DefaultTableModel model = (DefaultTableModel) jtable.getModel();
            model.setRowCount(0);
            Object row[] = new Object[5];
            for (int i = 0; i < splist.size(); i++) {
                row[0] = splist.get(i).getMaPhieu();
                row[1] = splist.get(i).getMaSP();
                row[2] = splist.get(i).getSoluong();
                row[3] = splist.get(i).getNgay();
                row[4] = splist.get(i).getNCC();
                model.addRow(row);
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
