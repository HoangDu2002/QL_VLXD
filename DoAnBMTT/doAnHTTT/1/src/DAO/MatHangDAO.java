/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.MatHangPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MatHangDAO {

    public static ArrayList<MatHangPOJO> dsMH() {
        ArrayList<MatHangPOJO> ds = new ArrayList<MatHangPOJO>();
        try {
            String sql = "select * from MATHANG";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                MatHangPOJO hd = new MatHangPOJO();
                hd.setMamh(rs.getString("MAMH"));
                hd.setTenmh(rs.getString("TENMH"));
                hd.setDongianhap(rs.getInt("DONGIANHAP"));
                hd.setDongiaban(rs.getInt("DONGIABAN"));
                hd.setTenncc(rs.getString("TENNCC"));
                hd.setXuatxu(rs.getString("XUATXU"));
                hd.setSoluong(rs.getInt("SOLUONG"));
                hd.setGhichu(rs.getString("GHICHU"));
                ds.add(hd);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themMatHang(MatHangPOJO mh) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into MATHANG  values(N'%s',N'%s',N'%d',N'%d',N'%s',N'%s',N'%d',N'%s') ",
                mh.getMamh(), mh.getTenmh(), mh.getDongianhap(), mh.getDongiaban(), mh.getTenncc(), mh.getXuatxu(), mh.getSoluong(), mh.getGhichu());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaMatHang(String mamh) {
        boolean kq = false;
        String sql = String.format("delete MATHANG where MAMH=N'%s'", mamh);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaMatHang(MatHangPOJO mh) {
        boolean kq = false;
        int a;
        String sql = String.format("update MATHANG set TENMH='%s',DONGIANHAP='%d',DONGIABAN='%d',TENNCC='%s',XUATXU='%s',SOLUONG='%d',GHICHU='%s' where MAMH='%s' ",
                mh.getTenmh(), mh.getDongianhap(), mh.getDongiaban(), mh.getTenncc(), mh.getXuatxu(), mh.getSoluong(), mh.getGhichu(), mh.getMamh());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<MatHangPOJO> timKiemTheoMaMH(String mamh) {
        ArrayList<MatHangPOJO> ds = new ArrayList<MatHangPOJO>();
        try {
            String sql = "Select * from MATHANG mh where MAMH like '%" + mamh + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                MatHangPOJO mh = new MatHangPOJO();
                mh.setMamh(rs.getString("MAMH"));
                mh.setTenmh(rs.getString("TENMH"));
                mh.setDongianhap(rs.getInt("DONGIANHAP"));
                mh.setDongiaban(rs.getInt("DONGIABAN"));
                mh.setTenncc(rs.getString("TENNCC"));
                mh.setXuatxu(rs.getString("XUATXU"));
                mh.setSoluong(rs.getInt("SOLUONG"));
                mh.setGhichu(rs.getString("GHICHU"));
                ds.add(mh);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
