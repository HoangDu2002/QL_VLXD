/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Asus
 */
public class checkLoginPOJO {

    public String suKien;
    public String user;
    public String loginLogoutTime;
    public String ipAdd;

    public checkLoginPOJO() {
        
    }
    
    
    public String getSuKien() {
        return suKien;
    }

    public void setSuKien(String suKien) {
        this.suKien = suKien;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLoginLogoutTime() {
        return loginLogoutTime;
    }

    public void setLoginLogoutTime(String loginLogoutTime) {
        this.loginLogoutTime = loginLogoutTime;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    

    
    
    public checkLoginPOJO(String suKien, String user, String loginLogoutTime, String ipAdd) {
        this.suKien = suKien;
        this.user = user;
        this.loginLogoutTime = loginLogoutTime;
        this.ipAdd = ipAdd;
    }

    
}
