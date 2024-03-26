/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class MatHangPOJO {

    public String mamh;
    public String tenmh;
    public int dongianhap;
    public int dongiaban;
    public String tenncc;
    public String xuatxu;
    public int soluong;
    public String ghichu;
    
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

    public int getDongianhap() {
        return dongianhap;
    }

    public void setDongianhap(int dongianhap) {
        this.dongianhap = dongianhap;
    }

    public int getDongiaban() {
        return dongiaban;
    }

    public void setDongiaban(int dongiaban) {
        this.dongiaban = dongiaban;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public MatHangPOJO() {
    }

    public MatHangPOJO(String mamh, String tenmh, int dongianhap, int dongiaban, String tenncc, String xuatxu, int soluong, String ghichu) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.dongianhap = dongianhap;
        this.dongiaban = dongiaban;
        this.tenncc = tenncc;
        this.xuatxu = xuatxu;
        this.soluong = soluong;
        this.ghichu = ghichu;
    }
    
}
