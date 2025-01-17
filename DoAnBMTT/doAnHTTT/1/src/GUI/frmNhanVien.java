/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.NhanVienDAO;
import POJO.NhanVienPOJO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class frmNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form frmNhanVien
     */
    private DefaultTableModel model; // Chuyển model thành thuộc tính của lớp

    public frmNhanVien() {

        initComponents();

        // Khởi tạo model ở đây
        model = new DefaultTableModel();
        tbl_qlnv.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Giới tính", "Lương"});

        loadDataToTable();
    }

    public void loadDataToTable() {
        // Tạo một SwingWorker để thực hiện tải dữ liệu trong nền
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                NhanVienDAO nhanVienDAO = new NhanVienDAO();
                ArrayList<NhanVienPOJO> ds = nhanVienDAO.dsNV();

                // Xóa tất cả dữ liệu cũ trong bảng
                model.setRowCount(0);

                // Thêm dữ liệu mới vào bảng
                for (NhanVienPOJO nv : ds) {
                    Object[] row = new Object[]{nv.getManv(), nv.getHoten(), nv.getSodt(), nv.getDiachi(), nv.getNgaysinh(), nv.getGioitinh(), nv.getLuong()};
                    model.addRow(row);
                }
                return null;
            }
        };

        worker.execute(); // Bắt đầu thực hiện tải dữ liệu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_qlnv = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtGioitinh = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhân viên");

        tbl_qlnv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_qlnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_qlnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlnvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_qlnv);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/real-estate.png"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã nhân viên: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên nhân viên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Số điện thoại:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ngày sinh:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Giới tính:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Lương:");

        txtHoten.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        txtManv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtDiachi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtNgaysinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtGioitinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/repair.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 5, 18));
        jLabel9.setText("Quản lý nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtDiachi)
                                    .addComponent(txtManv)
                                    .addComponent(txtSDT))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnTimkiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(179, 179, 179))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(623, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem)
                    .addComponent(btnLamMoi))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(518, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmDanhMuc frm = new frmDanhMuc();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public void bidingtblNV() {
        int index = tbl_qlnv.getSelectedRow();

        if (index >= 0) {
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            ArrayList<NhanVienPOJO> ds = nhanVienDAO.dsNV();

            if (index < ds.size()) {
                NhanVienPOJO nv = ds.get(index);
                txtManv.setText(nv.getManv());
                txtManv.setEditable(false);
                txtHoten.setText(nv.getHoten());
                txtSDT.setText(nv.getSodt());
                txtDiachi.setText(nv.getDiachi());
                txtNgaysinh.setText(nv.getNgaysinh());
                txtGioitinh.setText(nv.getGioitinh());
                txtLuong.setText(String.valueOf(nv.getLuong()));
            }
        }
    }

    public void reset() {

        this.txtManv.setText("");
        this.txtHoten.setText("");
        this.txtSDT.setText("");
        this.txtDiachi.setText("");
        this.txtNgaysinh.setText("");
        this.txtGioitinh.setText("");
        this.txtLuong.setText("");
        this.txtTim.setText("");

    }

    public void them() {
        NhanVienPOJO nv = new NhanVienPOJO(txtManv.getText(), txtHoten.getText(), txtSDT.getText(), txtDiachi.getText(),
                txtNgaysinh.getText(), txtGioitinh.getText(), Integer.parseInt(txtLuong.getText()));
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        boolean result = nhanVienDAO.themNhanVien(nv);
        if (result) {
            // Thao tác thêm thành công
        } else {
            // Xử lý khi thêm thất bại
        }

    }

    public void xoa() {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        boolean result = nhanVienDAO.xoaNhanVien(txtManv.getText());
        if (result) {
            // Thao tác xóa thành công
        } else {
            // Xử lý khi xóa thất bại
        }

    }

    public void sua() {
        NhanVienPOJO nv = new NhanVienPOJO(txtManv.getText(), txtHoten.getText(), txtSDT.getText(), txtDiachi.getText(),
                txtNgaysinh.getText(), txtGioitinh.getText(), Integer.parseInt(txtLuong.getText()));
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        boolean result = nhanVienDAO.suaNhanVien(nv);
        if (result) {
            // Thao tác sửa thành công
        } else {
            // Xử lý khi sửa thất bại
        }
    }

    public void timkiem() {
        String manvToSearch = txtTim.getText();

        if (manvToSearch.isEmpty()) {
            // Hiển thị toàn bộ dữ liệu nếu không có Mã NV tìm kiếm
            bidingtblNV();
        } else {
            // Tìm kiếm dữ liệu theo Mã NV
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            ArrayList<NhanVienPOJO> ds = nhanVienDAO.timKiemTheoMaNV(manvToSearch);

            DefaultTableModel model = (DefaultTableModel) tbl_qlnv.getModel();
            model.setRowCount(0); // Xóa tất cả các dòng trong bảng

            for (NhanVienPOJO nv : ds) {
                Object[] row = new Object[]{nv.getManv(), nv.getHoten(), nv.getSodt(), nv.getNgaysinh(), nv.getGioitinh(), nv.getLuong()};
                model.addRow(row);
            }
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (this.txtManv.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtManv.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            them();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (this.txtManv.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtManv.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            sua();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (this.txtManv.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không thể bỏ trống!", "thông báo", 2);
        else if (this.txtManv.getText().length() > 10)
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được lớn hơn 5 ký tự!", "thông báo", 2);
        else {
            xoa();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbl_qlnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlnvMouseClicked
        // TODO add your handling code here:
        this.btnThem.setEnabled(false);
        bidingtblNV();
    }//GEN-LAST:event_tbl_qlnvMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        reset();
        this.btnThem.setEnabled(true);
        this.txtManv.setEditable(true);
        this.txtManv.requestFocus();
        loadDataToTable();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_qlnv;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables

}
