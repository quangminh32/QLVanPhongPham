/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author ASUS
 */

import DAL.khachHang_DAL;
import DTO.khachHang;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class khachHang_BLL {
    khachHang_DAL dal = new khachHang_DAL();
    public List<khachHang> findAll(){
        try {
            return dal.findAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
    }
     public List<khachHang> findByPhoneNumber(String phoneNumber){
        try {
            return dal.findByPhoneNumber(phoneNumber);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
    public void delete(int id){
        try {
            dal.delete(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(khachHang kh){
        try {
            dal.update(kh);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(khachHang kh){
        try {
            dal.insert(kh);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void edit(int id,int number, String input){
        try {
            dal.edit(id, number, input);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khachHang_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
