package DAL;

import DTO.khachHang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class khachHang_DAL {
    Connect sqlconnect = new Connect();
    public  List<khachHang> findAll() throws ClassNotFoundException{
        List<khachHang> khachHangList = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        try { 
            conn = sqlconnect.getConnect();
            String sql = "SELECT * FROM kh";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                khachHang kh = new khachHang(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("phoneNumber"),resultSet.getString("address"));
                khachHangList.add(kh);
            }
        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
        return khachHangList;
    }

    public void insert(khachHang kh) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement statement = null;

        try { 
            conn = sqlconnect.getConnect();

            String sql = "INSERT INTO kh(Name, phoneNumber, ADDRESS) values(?,?,?)";
            statement = conn.prepareCall(sql);
            statement.setString(1,kh.getName());
            statement.setString(2,kh.getPhoneNumber());
            statement.setString(3,kh.getAddress());

            statement.execute();


        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
        return ;
    }

    public void update(khachHang kh) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement statement = null;

        try { 
            conn = sqlconnect.getConnect();

            String sql = "update kh set name=?,phoneNumber=?,address=? where id = ?";
            statement = conn.prepareCall(sql);

            statement.setString(1,kh.getName());
            statement.setString(2,kh.getPhoneNumber());
            statement.setString(3,kh.getAddress());
            statement.setInt(4,kh.getId());
            statement.execute();

        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
        return ;
    }

    public void delete(int id) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = sqlconnect.getConnect();

            String sql = "delete from kh where id = ?";
            statement = conn.prepareCall(sql);

            statement.setInt(1,id);
            statement.execute();


        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
    }

    public List<khachHang> findByPhoneNumber(String phoneNumber) throws ClassNotFoundException{
        List<khachHang> khachHangList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = sqlconnect.getConnect();
            String sql = "SELECT * FROM kh where phoneNumber = ?";
            statement = conn.prepareCall(sql);
            statement.setString(1,phoneNumber);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                khachHang kh = new khachHang(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("phoneNumber"),resultSet.getString("address"));
                khachHangList.add(kh);
            }
        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
        return khachHangList;
    }

    public void edit(int id,int number, String input) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement statement = null;

        try { 
            conn = sqlconnect.getConnect();
            String sql = null;
            if (number == 0){
                 sql = "update kh set name =? where id = ?";
            }
            if (number == 1){
                sql = "update kh set phoneNumber=? where id = ?";
            }
            if (number == 2){
                sql = "update kh set address =? where id = ?";
            }

            statement = conn.prepareCall(sql);

            statement.setString(1,input);
            statement.setInt(2,id);
            statement.execute();


        } catch (SQLException e) {
            Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }

            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    Logger.getLogger(khachHang_DAL.class.getName()).log(Level.SEVERE,null,e);
                }
            }
        }
    }
}