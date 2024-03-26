/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class CT_HoaDonBanPOJO {
    
    public String mahd;
    public String makh;
    public String ngaymua;
    public int tongtien;
    
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahh) {
        this.mahd = mahh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public CT_HoaDonBanPOJO() {
    }

    public CT_HoaDonBanPOJO(String mahd, String makh, String ngaymua, int tongtien) {
        this.mahd = mahd;
        this.makh = makh;
        this.ngaymua = ngaymua;
        this.tongtien = tongtien;
    }
    
}
