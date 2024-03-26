/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class KhachHangPOJO {

    public String makh;
    public String tenkh;
    public String sodt;
    public String diachi;
    public String gioitinh;
    
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public KhachHangPOJO() {
    }

    public KhachHangPOJO(String makh, String tenkh, String sodt, String diachi, String gioitinh) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sodt = sodt;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }
    
}
