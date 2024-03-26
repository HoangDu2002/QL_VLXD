/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.NhaCungCapPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO {

    public static ArrayList<NhaCungCapPOJO> dsNCC() {
        ArrayList<NhaCungCapPOJO> ds = new ArrayList<NhaCungCapPOJO>();
        try {
            String sql = "select * from NHACUNGCAP";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                NhaCungCapPOJO ncc = new NhaCungCapPOJO();
                ncc.setMancc(rs.getString("MANCC"));
                ncc.setTenncc(rs.getString("TENNCC"));
                ncc.setSdt(rs.getString("SODT"));
                ncc.setDiachi(rs.getString("DIACHI"));
                ds.add(ncc);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static boolean themNhaCungCap(NhaCungCapPOJO ncc) {
        boolean kq = false;
        int a;
        String sql = String.format("insert into NHACUNGCAP  values(N'%s',N'%s',N'%s',N'%s') ",
                ncc.getMancc(), ncc.getTenncc(), ncc.getSdt(), ncc.getDiachi());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static boolean xoaNhaCungCap(String ncc) {
        boolean kq = false;
        String sql = String.format("delete NHACUNGCAP where MANCC=N'%s'", ncc);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;

    }

    public static boolean suaNhaCungCap(NhaCungCapPOJO ncc) {
        boolean kq = false;
        int a;
        String sql = String.format("update NHACUNGCAP set TENNCC='%s',SODT='%s',DIACHI='%s' where MANCC='%s' ",
                ncc.getTenncc(), ncc.getSdt(), ncc.getDiachi(), ncc.getMancc());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.extuteUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }

    public static ArrayList<NhaCungCapPOJO> timKiemTheoMaNCC(String mancc) {
        ArrayList<NhaCungCapPOJO> ds = new ArrayList<NhaCungCapPOJO>();
        try {
            String sql = "Select * from NHACUNGCAP ncc where MANCC like '%" + mancc + "%'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                NhaCungCapPOJO ncc = new NhaCungCapPOJO();
                ncc.setMancc(rs.getString("MANCC"));
                ncc.setTenncc(rs.getString("TENNCC"));
                ncc.setSdt(rs.getString("SODT"));
                ncc.setDiachi(rs.getString("DIACHI"));
                ds.add(ncc);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
