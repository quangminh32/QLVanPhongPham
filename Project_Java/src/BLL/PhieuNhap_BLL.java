/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author ASUS
 */
import DAL.PhieuNhap_DAL;
import DTO.PhieuNhap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class PhieuNhap_BLL {
    PhieuNhap_DAL dal = new PhieuNhap_DAL();
     public boolean Getall(JTable jtable){
         return dal.Getall(jtable);
     }
      public void InsertPN(PhieuNhap hd){
          if(dal.InsertPN(hd)){
              JOptionPane.showMessageDialog(null, "Thêm thành công");
          }
          else
              JOptionPane.showMessageDialog(null, "InsertPN Error");
      }
       public void UpdatePN(PhieuNhap hd) {
          if(dal.UpdatePN(hd)){
              JOptionPane.showMessageDialog(null, "Phiếu Nhập " + hd.getMaPhieu() + " đã được cập nhật");
          }
          else
              JOptionPane.showMessageDialog(null, "UpdatePN Error");
      }
      public void DelPN(int MaPhieu) {
          if(dal.DelPN(MaPhieu)){
              JOptionPane.showMessageDialog(null, "Phiếu Nhập " + MaPhieu + " đã bị xóa");
          }
          else
              JOptionPane.showMessageDialog(null, "DELPN Error");
      }
      public int getNum(String masp){
          return dal.getNum(masp);
      }
      public void UpdateTonkho(String masp,int tonkho){
          dal.UpdateTonkho(masp, tonkho);
      }
      public boolean CheckSP(String masp){
           if(!dal.CheckSP(masp)){
               JOptionPane.showMessageDialog(null, "Mã sản phẩm không tồn tại");
               return false;
           }
           return true;
      }
      public void SearchPN(String key, String mode, JTable jtable) {
          dal.SearchPN(key, mode, jtable);
      }
}
