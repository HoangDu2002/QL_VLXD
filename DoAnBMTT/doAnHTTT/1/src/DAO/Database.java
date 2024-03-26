/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Asus
 */
public class Database {

    Connection connection;

    private static String url = "jdbc:oracle:thin:@192.168.56.1:1521:orcl"; // Sửa URL kết nối
    public static String database = "";
    public static String user = "test_java"; // Thay yourUsername bằng tên người dùng của bạn
    public static String pass = "123"; // Thay yourPassword bằng mật khẩu của bạn
    public static Connection conn;

    public static boolean Connect() {
        try {
            if (user.equals("SYS") || user.equals("sys")) {
                user += " as sysdba";
            }
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, user, pass);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void Disconnect() {
        try {
            if (conn != null) {
                conn.close();
                conn = null; // Gán giá trị null cho kết nối sau khi đã đóng
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection GetConnection() {
        if (conn == null) {
            Connect();
        }
        return conn;
    }
    
    public ResultSet excuteQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement state = conn.createStatement();
            rs = state.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean excuteUpdate(String sql) {
        try {
            Statement state = conn.createStatement();
            state.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static void main(String[] args) {
        Database conn = new Database();
        if(conn.Connect()== true)
        {
            conn.Connect();
        }
        else
            System.out.println("Lỗi rồi");
     
    }
        
}
