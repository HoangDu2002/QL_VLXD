/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.*; 
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HUNG
 */
public class DBconnection {
     public static Connection getConnection(){
         Connection conn=null;
         try{
            String strconn = "jdbc:oracle:thin:@192.168.56.1:1521:orcl";
            conn = DriverManager.getConnection(strconn,"test_java","123");
            if(conn!=null)
            {
                System.out.println("Kết nối thành công");

            }
            else{
                 System.out.println("Kết nối thất bại");
             }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         return conn;
     }
}
