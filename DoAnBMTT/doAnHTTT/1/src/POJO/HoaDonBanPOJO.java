/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class HoaDonBanPOJO {
    
    public String mahd;
    public String manv;
    public String mamh;
    public String tenmh;
    public int soluong;
    public int dongia;
    public int tongtien;
    public String ngayban;

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public HoaDonBanPOJO() {
    }

    public HoaDonBanPOJO(String mahd, String manv, String mamh, String tenmh, int soluong, int dongia, int tongtien, String ngayban) {
        this.mahd = mahd;
        this.manv = manv;
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.tongtien = tongtien;
        this.ngayban = ngayban;
    }
    
}
