/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.KhoPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhoDAO {

    public static ArrayList<KhoPOJO> dsKho() {
        ArrayList<KhoPOJO> ds = new ArrayList<KhoPOJO>();
        try {
            String sql = "select * from KHO";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                KhoPOJO k = new KhoPOJO();
                k.setMakho(rs.getString("MAKHO"));
                k.setMamh(rs.getString("MAMH"));
                k.setSoluong(rs.getInt("SOLUONG"));
                ds.add(k);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themKho(KhoPOJO k) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into KHO  values(N'%s',N'%s',N'%d') ",
                k.getMakho(), k.getMamh(), k.getSoluong());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaKho(String k) {
        boolean kq = false;
        String sql = String.format("delete KHO where MAKHO=N'%s'", k);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaKho(KhoPOJO k) {
        boolean kq = false;
        int a;
        String sql = String.format("update KHO set MAMH='%s',SOLUONG='%d' where MAKHO='%s' ",
                k.getMamh(), k.getSoluong(), k.getMakho());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<KhoPOJO> timKiemTheoMaKho(String makho) {
        ArrayList<KhoPOJO> ds = new ArrayList<KhoPOJO>();
        try {
            String sql = "Select * from KHO ct where MAKHO like '%" + makho + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                KhoPOJO k = new KhoPOJO();
                k.setMakho(rs.getString("MAKHO"));
                k.setMamh(rs.getString("MAMH"));
                k.setSoluong(rs.getInt("SOLUONG"));
                ds.add(k);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }

}
