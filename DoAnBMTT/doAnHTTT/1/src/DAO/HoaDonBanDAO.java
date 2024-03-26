/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.HoaDonBanPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonBanDAO {

    public static ArrayList<HoaDonBanPOJO> dsHD() {
        ArrayList<HoaDonBanPOJO> ds = new ArrayList<HoaDonBanPOJO>();
        try {
            String sql = "select * from HOADONBAN";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                HoaDonBanPOJO hd = new HoaDonBanPOJO();
                hd.setMahd(rs.getString("MAHD"));
                hd.setManv(rs.getString("MANV"));
                hd.setMamh(rs.getString("MAMH"));
                hd.setTenmh(rs.getString("TENMH"));
                hd.setSoluong(rs.getInt("SOLUONG"));
                hd.setDongia(rs.getInt("DONGIA"));
                hd.setTongtien(rs.getInt("TONGTIEN"));
                hd.setNgayban(rs.getString("NGAYBAN"));
                ds.add(hd);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themHoaDonBan(HoaDonBanPOJO hd) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into HOADONBAN  values(N'%s',N'%s',N'%s',N'%s',N'%d',N'%d',N'%d',N'%s') ",
                hd.getMahd(), hd.getManv(), hd.getMamh(), hd.getTenmh(), hd.getSoluong(), hd.getDongia(), hd.getTongtien(), hd.getNgayban());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaHoaDonBan(String mahd) {
        boolean kq = false;
        String sql = String.format("delete HOADONBAN where MAHD=N'%s'", mahd);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaHoaDonBan(HoaDonBanPOJO hd) {
        boolean kq = false;
        int a;
        String sql = String.format("update HOADONBAN set MANV='%s',MAMH='%s',TENMH='%s',SOLUONG='%d',DONGIA='%d',TONGTIEN='%d',NGAYMUA='%s' where MAHD='%s' ",
                hd.getManv(), hd.getMamh(), hd.getTenmh(), hd.getSoluong(), hd.getDongia(), hd.getTongtien(), hd.getNgayban(), hd.getMahd());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<HoaDonBanPOJO> timKiemTheoMaHD(String mahd) {
        ArrayList<HoaDonBanPOJO> ds = new ArrayList<HoaDonBanPOJO>();
        try {
            String sql = "Select * from HOADONBAN hd where MAHD like '%" + mahd + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                HoaDonBanPOJO hd = new HoaDonBanPOJO();
                hd.setMahd(rs.getString("MAHD"));
                hd.setManv(rs.getString("MANV"));
                hd.setMamh(rs.getString("MAMH"));
                hd.setTenmh(rs.getString("TENMH"));
                hd.setSoluong(rs.getInt("SOLUONG"));
                hd.setDongia(rs.getInt("DONGIA"));
                hd.setTongtien(rs.getInt("TONGTIEN"));
                hd.setNgayban(rs.getString("NGAYBAN"));
                ds.add(hd);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
