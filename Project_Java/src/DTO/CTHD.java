/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class CTHD {
    private int MAHD;
    private int MASP;
    private String TENSP;
    private int SOLUONG;
    private int GIA;
    private int TONG;

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int MASP) {
        this.MASP = MASP;
    }

    public CTHD(int MAHD, int MASP,String TENSP, int SOLUONG, int gia,int tong) {
        this.MAHD = MAHD;
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.SOLUONG = SOLUONG;
        this.GIA = gia;
        this.TONG = tong;
    }

    public int getMAHD() {
        return MAHD;
    }

    public int getTONG() {
        return TONG;
    }

    public void setTONG(int TONG) {
        this.TONG = TONG;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int gia) {
        this.GIA = gia;
    }
    
}
