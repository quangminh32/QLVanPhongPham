/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class HoaDon {
    private int MAHD;
    private String TENKH;
    private int SDTKH;
    private int TONG;
    private String NGAY;
    private String NV;

    public int getMAHD() {
        return MAHD;
    }

    public HoaDon(int MAHD, String TENKH, int SDTKH, String NGAY,int TONG,String NV) {
        this.MAHD = MAHD;
        this.TENKH = TENKH;
        this.SDTKH = SDTKH;
        this.TONG = TONG;
        this.NGAY = NGAY;
        this.NV = NV;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public void setSDTKH(int SDTKH) {
        this.SDTKH = SDTKH;
    }

    public void setTONG(int TONG) {
        this.TONG = TONG;
    }

    public void setDATE(String NGAY) {
        this.NGAY = NGAY;
    }

    public void setNV(String NV) {
        this.NV = NV;
    }

    public String getTENKH() {
        return TENKH;
    }

    public int getSDTKH() {
        return SDTKH;
    }

    public int getTONG() {
        return TONG;
    }

    public String getNGAY() {
        return NGAY;
    }

    public String getNV() {
        return NV;
    }
    
    
    
}
