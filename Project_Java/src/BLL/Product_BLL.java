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
import DAL.Product_DAL;
import javax.swing.JComboBox;
import javax.swing.JTable;
public class Product_BLL {
    Product_DAL dal = new Product_DAL();
    public void showProduct(JTable tblp){
        dal.showProduct(tblp);
    }
    public boolean update(Product stud2) throws Exception{
        return dal.update(stud2);
    }
    public boolean delete(String maSP) throws Exception{
        return dal.delete(maSP);
    }
    public boolean insert(Product stud) throws Exception{
        return dal.insert(stud);
    }
   public void getCategory(JComboBox jcombobox){
       dal.getCategory(jcombobox);
   } 
    public void Search(String key, JTable jtable, String mode) {
        dal.Search(key, jtable, mode);
    }
}
