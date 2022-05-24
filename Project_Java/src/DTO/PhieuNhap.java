/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class PhieuNhap {
    private int MaPhieu;
    private String MaSP;
    private int Soluong;
    private String Ngay;
    private String NCC;

    public PhieuNhap(int MaPhieu, String MaSP, int Soluong, String Ngay, String NCC) {
        this.MaPhieu = MaPhieu;
        this.MaSP = MaSP;
        this.Soluong = Soluong;
        this.Ngay = Ngay;
        this.NCC = NCC;
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getNCC() {
        return NCC;
    }

    public void setNCC(String NCC) {
        this.NCC = NCC;
    }
    
    
}
