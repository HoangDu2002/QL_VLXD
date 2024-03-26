/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.checkLoginPOJO;
import POJO.nhatKiPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class loginLogoutDAO {
    public static ArrayList<checkLoginPOJO> dsLog() {
        ArrayList<checkLoginPOJO> ds = new ArrayList<checkLoginPOJO>();
        try {
            String sql = "select * FROM LOGIN_LOGOUT_LOGS";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);

            while (rs.next()) {
                checkLoginPOJO nk = new checkLoginPOJO();
                nk.setSuKien(rs.getString("SUKIEN"));
                nk.setUser(rs.getString("USERNAME"));
                nk.setLoginLogoutTime(rs.getString("LOGIN_LOGOUT_TIME"));
                nk.setIpAdd(rs.getString("IP_ADDRESS"));

                

                ds.add(nk);
            }
           // provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    
}
