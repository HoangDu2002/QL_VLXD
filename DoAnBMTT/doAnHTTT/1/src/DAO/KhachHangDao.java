/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.KhachHangPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangDao {

    public static ArrayList<KhachHangPOJO> dsKH() {
        ArrayList<KhachHangPOJO> ds = new ArrayList<KhachHangPOJO>();
        try {
            String sql = "select * from KHACHHANG";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                KhachHangPOJO kh = new KhachHangPOJO();
                kh.setMakh(rs.getString("MAKH"));
                kh.setTenkh(rs.getString("TENKH"));
                kh.setSodt(rs.getString("SODT"));
                kh.setDiachi(rs.getString("DIACHI"));
                kh.setGioitinh(rs.getString("GIOITINH"));
                ds.add(kh);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themKhachHang(KhachHangPOJO kh) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into KHACHHANG  values(N'%s',N'%s',N'%s',N'%s',N'%s') ",
                kh.getMakh(), kh.getTenkh(), kh.getSodt(), kh.getDiachi(), kh.getGioitinh());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaKhachHang(String makh) {
        boolean kq = false;
        String sql = String.format("delete KHACHHANG where MAKH=N'%s'", makh);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaKhachHang(KhachHangPOJO kh) {
        boolean kq = false;
        int a;
        String sql = String.format("update KHACHHANG set TENKH='%s',SODT='%s',DIACHI='%s',GIOITINH='%s' where MAKH='%s' ",
                kh.getTenkh(), kh.getSodt(), kh.getDiachi(), kh.getGioitinh(), kh.getMakh());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<KhachHangPOJO> timKiemTheoMaKH(String makh) {
        ArrayList<KhachHangPOJO> ds = new ArrayList<KhachHangPOJO>();
        try {
            String sql = "Select * from KHACHHANG kh where MAKH like '%" + makh + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                KhachHangPOJO kh = new KhachHangPOJO();
                kh.setMakh(rs.getString("MAKH"));
                kh.setTenkh(rs.getString("TENKH"));
                kh.setSodt(rs.getString("SODT"));
                kh.setDiachi(rs.getString("DIACHI"));
                kh.setGioitinh(rs.getString("GIOITINH"));
                ds.add(kh);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
