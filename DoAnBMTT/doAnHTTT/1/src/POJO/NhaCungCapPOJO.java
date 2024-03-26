/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class NhaCungCapPOJO {
    
    public String mancc;
    public String tenncc;
    public String sdt;
    public String diachi;

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public NhaCungCapPOJO() {
    }

    public NhaCungCapPOJO(String mancc, String tenncc, String sdt, String diachi) {
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.sdt = sdt;
        this.diachi = diachi;
    }
    
}
