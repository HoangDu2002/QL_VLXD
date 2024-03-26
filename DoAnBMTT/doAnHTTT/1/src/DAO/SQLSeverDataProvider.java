/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import DAO.Database;
import static DAO.Database.conn;
import static DAO.Database.database;
import static DAO.Database.pass;
import static DAO.Database.user;

/**
 *
 * @author Asus
 */
public class SQLSeverDataProvider {

    Connection connection;

    public void open() {
        try {

            String user = "test_java";
            String pass = "123";

            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@192.168.56.1:1521:orcl";

            connection = DriverManager.getConnection(url, user, pass);
            //            System.out.println("ok r");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void close() {
        try {
            this.connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnect() {
        return connection;
    }

    public ResultSet excuteQuery(String url) {
        ResultSet rs = null;
        try {
            Statement st = connection.createStatement();
            rs = st.executeQuery(url);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public int extuteUpdate(String url) {
        int n = -1;
        try {
            Statement st = connection.createStatement();
            n = st.executeUpdate(url);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public static void main(String[] args) {
        SQLSeverDataProvider s = new SQLSeverDataProvider();
        s.open();
    }

}
