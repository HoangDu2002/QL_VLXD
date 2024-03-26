/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.nhatKiPOJO;
import java.security.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class nhatkiDAO {
        public static ArrayList<nhatKiPOJO> dsNK() {
        ArrayList<nhatKiPOJO> ds = new ArrayList<nhatKiPOJO>();
        try {
            String sql = "select * from GHINHATKI";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                nhatKiPOJO nk = new nhatKiPOJO();
                nk.setSuKien(rs.getString("SUKIEN"));
                nk.setDoiTuong(rs.getString("DOITUONG"));
                nk.setHoatDong(rs.getString("TRUYCAP"));
                nk.setTruyCap(rs.getString("HOATDONG"));
                nk.setThoiGian(rs.getString("THOIGIAN"));
                

                ds.add(nk);
            }
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
        
        
        

        
      
  
}
    

