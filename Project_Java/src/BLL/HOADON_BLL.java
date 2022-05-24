/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author ASUS
 */
import DTO.HoaDon;
import DAL.HOADON_DAL;
import javax.swing.*;
public class HOADON_BLL{
    HOADON_DAL dal = new HOADON_DAL();
        public void SearchBill(String key,String mode,JTable jtable){
            dal.SearchBill(key, mode, jtable);
        }
    public void combobox(JComboBox b){
        dal.combobox(b);
    }
    public void getALLSP(JTable jtable) throws ClassNotFoundException{
        dal.getALLSP(jtable);
    }
    public void Report_NV(JTable jtable,String ngay){
        dal.Report_NV(jtable, ngay);
    }
    public void Report_SP(JTable jtable,String ngay){
        dal.Report_SP(jtable, ngay);
    }
    public void getALLBill(JTable jtable) throws ClassNotFoundException{
        dal.getALLBill(jtable);
    }
    public void getYear(JComboBox b){
        dal.getYear(b);
    }
    public int DoanhThu(String year, String month) {
        return dal.DoanhThu(year, month);
    }
    public void UpdateHD(HoaDon hd){
        dal.UpdateHD(hd);
    }
    public void insertbill(HoaDon hd){
        dal.insertbill(hd);
    }
    public void delbill( int MAHD){
        dal.delbill(MAHD);
    }
    
}
