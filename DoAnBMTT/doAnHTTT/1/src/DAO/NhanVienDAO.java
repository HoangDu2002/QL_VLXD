/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.NhanVienPOJO;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Asus
 */
public class NhanVienDAO {

    public static ArrayList<NhanVienPOJO> dsNV() {
        ArrayList<NhanVienPOJO> ds = new ArrayList<NhanVienPOJO>();
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            // Lấy danh sách mã nhân viên từ nguồn dữ liệu
            ArrayList<String> maNhanVienList = getEmployeeIDs(); // Sử dụng phương thức mới để lấy danh sách mã nhân viên

            for (String maNhanVien : maNhanVienList) {
                // Gọi hàm PL/SQL để lấy thông tin nhân viên
                CallableStatement callableStatement = provider.getConnect().prepareCall("{ ? = call GetEmployeeInfo(?) }");
                callableStatement.registerOutParameter(1, Types.NVARCHAR); // Đảm bảo đăng ký kiểu dữ liệu là Types.NVARCHAR
                callableStatement.setString(2, maNhanVien);
                callableStatement.execute();

                // Lấy kết quả từ tham số đầu ra
                String result = callableStatement.getString(1);

                if (result != null && !result.isEmpty()) {
                    // Phân tách kết quả và thêm vào danh sách
                    String[] info = result.split("\n");
                    if (info.length == 7) {
                        NhanVienPOJO nhanvien = new NhanVienPOJO();
                        nhanvien.setManv(info[0]);
                        nhanvien.setHoten(info[1]);
                        nhanvien.setSodt(info[2]);
                        nhanvien.setDiachi(info[3]);
                        nhanvien.setNgaysinh(info[4]);
                        nhanvien.setGioitinh(info[5]);
                        nhanvien.setLuong(Integer.parseInt(info[6]));
                        ds.add(nhanvien);
                    }
                }
            }

            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    // Đây là phần code mới cho việc lấy danh sách mã nhân viên từ nguồn dữ liệu
    public static ArrayList<String> getEmployeeIDs() {
        ArrayList<String> employeeIDs = new ArrayList<>();
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            CallableStatement callableStatement = provider.getConnect().prepareCall("{call GetAllEmployeeIDs(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR); // Sử dụng OracleTypes.CURSOR thay vì Types.NVARCHAR
            callableStatement.execute();

            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);

            while (resultSet.next()) {
                employeeIDs.add(resultSet.getString("MANV"));
            }

            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return employeeIDs;
    }
    
    public static boolean themNhanVien(NhanVienPOJO nv) {
        boolean kq = false;
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            // Gọi hàm PL/SQL để thêm nhân viên
            CallableStatement callableStatement = provider.getConnect().prepareCall("{ call InsertEmployee(?, ?, ?, ?, ?, ?, ?, ?) }");
            callableStatement.setString(1, nv.getManv());
            callableStatement.setString(2, nv.getHoten());
            callableStatement.setString(3, nv.getSodt());
            callableStatement.setString(4, nv.getDiachi());
            callableStatement.setString(5, nv.getNgaysinh());
            callableStatement.setString(6, nv.getGioitinh());
            callableStatement.setInt(7, nv.getLuong());
            callableStatement.registerOutParameter(8, Types.NUMERIC); // Đăng ký kiểu dữ liệu đầu ra là NUMBER
            callableStatement.execute();

            // Lấy kết quả từ tham số đầu ra
            int result = callableStatement.getInt(8);

            // Kết quả của hàm InsertEmployee là 1 hoặc 0
            kq = (result == 1);

            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            // Xử lý lỗi tại đây nếu cần
        }
        return kq;
    }

    public static boolean xoaNhanVien(String manv) {
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            // Gọi hàm PL/SQL để xóa nhân viên
            CallableStatement callableStatement = provider.getConnect().prepareCall("{ call DeleteEmployee(?) }");
            callableStatement.setString(1, manv);
            callableStatement.execute();

            // Xóa thành công, không cần trả về giá trị
            provider.close();
            return true; // Trả về true khi xóa thành công
        } catch (Exception ex) {
            ex.printStackTrace();
            return false; // Trả về false khi có lỗi
        }
    }

    public static boolean suaNhanVien(NhanVienPOJO nv) {
        boolean kq = false;
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            // Gọi hàm PL/SQL để cập nhật thông tin nhân viên
            CallableStatement callableStatement = provider.getConnect().prepareCall("{ call UpdateEmployee(?, ?, ?, ?, ?, ?, ?) }");
            callableStatement.setString(1, nv.getManv());
            callableStatement.setString(2, nv.getHoten());
            callableStatement.setString(3, nv.getSodt());
            callableStatement.setString(4, nv.getDiachi());
            callableStatement.setString(5, nv.getNgaysinh());
            callableStatement.setString(6, nv.getGioitinh());
            callableStatement.setInt(7, nv.getLuong());
            callableStatement.execute();

            // Cập nhật thành công, không cần trả về giá trị
            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kq;
    }

    public static ArrayList<NhanVienPOJO> timKiemTheoMaNV(String manv) {
        ArrayList<NhanVienPOJO> ds = new ArrayList<NhanVienPOJO>();
        try {
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();

            // Gọi hàm PL/SQL để tìm kiếm nhân viên theo Mã NV
            CallableStatement callableStatement = provider.getConnect().prepareCall("{ ? = call SearchEmployeeByMANV(?) }");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR); // Đăng ký kiểu dữ liệu đầu ra
            callableStatement.setString(2, manv);
            callableStatement.execute();

            // Lấy kết quả từ tham số đầu ra
            ResultSet rs = (ResultSet) callableStatement.getObject(1);

            while (rs.next()) {
                NhanVienPOJO nv = new NhanVienPOJO();
                nv.setManv(rs.getString("MANV"));
                nv.setHoten(rs.getString("TENNV"));
                nv.setSodt(rs.getString("SODT"));
                nv.setDiachi(rs.getString("DIACHI"));
                nv.setNgaysinh(rs.getString("NGAYSINH"));
                nv.setGioitinh(rs.getString("GIOITINH"));
                nv.setLuong(rs.getInt("LUONG"));
                ds.add(nv);
            }

            provider.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return ds;
    }
}
