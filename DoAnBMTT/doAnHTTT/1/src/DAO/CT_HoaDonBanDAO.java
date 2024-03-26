/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.CT_HoaDonBanPOJO;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class CT_HoaDonBanDAO {

    public static ArrayList<CT_HoaDonBanPOJO> dsCTHDB() {
        ArrayList<CT_HoaDonBanPOJO> ds = new ArrayList<CT_HoaDonBanPOJO>();
        try {
            String sql = "select * from CT_HOADONBAN";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                CT_HoaDonBanPOJO cthdb = new CT_HoaDonBanPOJO();
                cthdb.setMahd(rs.getString("MAHD"));
                cthdb.setMakh(rs.getString("MAKH"));
                cthdb.setNgaymua(rs.getString("NGAYMUA"));
                cthdb.setTongtien(rs.getInt("TONGTIEN"));
                ds.add(cthdb);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themCTHoaDonBan(CT_HoaDonBanPOJO cthdb) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into CT_HOADONBAN  values(N'%s',N'%s',N'%s',N'%d') ",
                cthdb.getMahd(), cthdb.getMakh(), cthdb.getNgaymua(), cthdb.getTongtien());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaCTHoaDonBan(String cthdb) {
        boolean kq = false;
        String sql = String.format("delete CT_HOADONBAN where MAHD=N'%s'", cthdb);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaCTHoaDonBan(CT_HoaDonBanPOJO cthdb) {
        boolean kq = false;
        int a;
        String sql = String.format("update CT_HOADONBAN set MAKH='%s',NGAYMUA='%s',TONGTIEN='%d' where MAHD='%s' ",
                cthdb.getMakh(), cthdb.getNgaymua(), cthdb.getTongtien(), cthdb.getMahd());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<CT_HoaDonBanPOJO> timKiemTheoMaHD(String macthdb) {
        ArrayList<CT_HoaDonBanPOJO> ds = new ArrayList<CT_HoaDonBanPOJO>();
        try {
            String sql = "Select * from CT_HOADONBAN ct where MAHD like '%" + macthdb + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                CT_HoaDonBanPOJO cthdb = new CT_HoaDonBanPOJO();
                cthdb.setMahd(rs.getString("MAHD"));
                cthdb.setMakh(rs.getString("MAKH"));
                cthdb.setNgaymua(rs.getString("NGAYMUA"));
                cthdb.setTongtien(rs.getInt("TONGTIEN"));
                ds.add(cthdb);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
