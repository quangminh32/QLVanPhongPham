/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author ASUS
 */
import DTO.Product;
import javax.swing.*;
import DTO.CTHD;
import DAL.CTHD_DAL;
public class CTHD_BLL {
    CTHD_DAL dal = new CTHD_DAL();
    public Product getSP(String TENSP){
        return dal.getSP(TENSP);
    }
    public void insert(CTHD cthd,JTable jtable){
        dal.insert(cthd);
        dal.CTHD(cthd.getMAHD(), jtable);
    }
    public boolean isDup(CTHD cthd){
        return dal.isDup(cthd);
        
    }
     public void delete(int MAHD, int MASP){
         dal.delete(MAHD, MASP);
     }
    public void updateCTHD(CTHD cthd,JTable jtable){
        dal.updateCTHD(cthd);
        dal.CTHD(cthd.getMAHD(), jtable);
    }
    public void updateTong(int tong,int mahd){
        dal.updateTong(tong, mahd);
    }
    public int getNum(String masp){
        return dal.getNum(masp);
    }
    public void UpdateTonkho(String masp,int tonkho){
        dal.UpdateTonkho(masp, tonkho);
    }
    public void getItem(String key,JComboBox b){
        dal.getItem(key,b);
    }
     public void CTHD(int MAHD, JTable jtable){
         dal.CTHD(MAHD, jtable);
     }
}
