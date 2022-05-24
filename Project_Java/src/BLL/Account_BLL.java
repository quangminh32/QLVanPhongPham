/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author ASUS
 */
import DAL.AccountDAL;
import DTO.Account;
import javax.swing.JTable;
public class Account_BLL {
    AccountDAL dal = new AccountDAL();
    public String DeleteAccount(String username){
        if(dal.DeleteAccount(username))
            return "Xoa thanh cong";
        else
            return "Da co loi xay ra";
    } 
    public String UpdateAccount(Account ac){
        if(dal.UpdateAccount(ac))
            return "Cap nhat thanh cong";
        else
            return "Da co loi xay ra";
            
    }
    public String InsertAccount(Account ac){
        if(dal.InsertAccount(ac))
            return "Them tai khoan thanh cong";
        else
            return "Da co loi xay ra";
    }
      public boolean dangNhap(String username, String pass){
         return dal.dangNhap(username, pass);
      }
      public void findByUser(String username,JTable jtable){
          dal.findByUser(username, jtable);
      } 
      public void showAccount(JTable jtable){
          dal.showAccount(jtable);
      }
}
