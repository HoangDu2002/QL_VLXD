/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Admin
 */
public class KhoPOJO {

    public String makho;
    public String mamh;
    public int soluong;
    
    public String getMakho() {
        return makho;
    }

    public void setMakho(String makho) {
        this.makho = makho;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public KhoPOJO() {
    }

    public KhoPOJO(String makho, String mamh, int soluong) {
        this.makho = makho;
        this.mamh = mamh;
        this.soluong = soluong;
    }
    
}
