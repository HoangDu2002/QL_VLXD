/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.KhachHangDao;
import POJO.KhachHangPOJO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form frmKhachHang
     */
    public frmKhachHang() {
        initComponents();
        loadDataToTable();
    }

    public void loadDataToTable() {
        KhachHangDao p = new KhachHangDao();
        ArrayList<KhachHangPOJO> ds = p.dsKH();

        DefaultTableModel model = (DefaultTableModel) tbl_qlkh.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "GIới tính"});
        for (KhachHangPOJO kh : ds) {
            Object[] row = new Object[]{kh.makh, kh.tenkh, kh.sodt, kh.diachi, kh.gioitinh};
            model.addRow(row);
        }
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSodt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenkh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGioitinh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_qlkh = new javax.swing.JTable();
        btnTimkiem = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Khách hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 4, 4));
        jLabel1.setText("Quản lý khách hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        txtMakh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        txtSodt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên khách hàng:");

        txtTenkh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        txtDiachi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Giới tính:");

        txtGioitinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/repair.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tbl_qlkh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_qlkh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_qlkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlkhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_qlkh);

        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimkiem.setText("TÌm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnLammoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new.png"))); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/real-estate.png"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnTimkiem)
                .addGap(18, 18, 18)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMakh)
                                            .addComponent(txtTenkh)
                                            .addComponent(txtGioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSodt)
                                            .addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBack)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimkiem)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bidingtblPB() {
        KhachHangDao p = new KhachHangDao();
        ArrayList<KhachHangPOJO> ds = p.dsKH();
        int index = tbl_qlkh.getSelectedRow();
        KhachHangPOJO kh = ds.get(index);
        txtMakh.setText(kh.getMakh());
        this.txtMakh.setEditable(false);
        txtTenkh.setText(kh.getTenkh());
        txtSodt.setText(kh.getSodt());
        txtDiachi.setText(kh.getDiachi());
        txtGioitinh.setText(kh.getGioitinh());

    }

    public void reset() {

        this.txtMakh.setText("");
        this.txtTenkh.setText("");
        this.txtSodt.setText("");
        this.txtDiachi.setText("");
        this.txtGioitinh.setText("");
        this.txtTim.setText("");

    }

    public void them() {
        KhachHangPOJO kh = new KhachHangPOJO(txtMakh.getText(), txtTenkh.getText(), txtSodt.getText(), txtDiachi.getText(), txtGioitinh.getText());
        KhachHangDao p = new KhachHangDao();
        p.themKhachHang(kh);

    }

    public void xoa() {
        KhachHangDao p = new KhachHangDao();
        p.xoaKhachHang(txtMakh.getText());

    }

    public void sua() {
        KhachHangPOJO kh = new KhachHangPOJO(txtMakh.getText(), txtTenkh.getText(), txtSodt.getText(), txtDiachi.getText(), txtGioitinh.getText());
        KhachHangDao p = new KhachHangDao();
        p.suaKhachHang(kh);
    }

    public void timkiem() {
        KhachHangDao p = new KhachHangDao();
        ArrayList<KhachHangPOJO> ds = p.timKiemTheoMaKH(txtTim.getText());

        DefaultTableModel model = (DefaultTableModel) tbl_qlkh.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã nhân viên", "Họ tên", "Số điện thoại", "Ngày sinh", "Giới tính", "Lương"});
        for (KhachHangPOJO kh : ds) {
            Object[] row = new Object[]{kh.makh, kh.tenkh, kh.sodt, kh.diachi, kh.gioitinh};
            model.addRow(row);
        }

    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (this.txtMakh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không thể bỏ trống!", "thông báo", 2);
        else if (this.txtMakh.getText().length() > 10)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không được lớn hơn 5 ký tự!", "thông báo", 2);
        else {
            xoa();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (this.txtMakh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMakh.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            them();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (this.txtMakh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMakh.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã khách hàng không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            sua();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        reset();
        this.btnThem.setEnabled(true);
        this.txtMakh.setEditable(true);
        this.txtMakh.requestFocus();
        loadDataToTable();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmDanhMuc frm = new frmDanhMuc();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbl_qlkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlkhMouseClicked
        // TODO add your handling code here:
        this.btnThem.setEnabled(false);
        bidingtblPB();
    }//GEN-LAST:event_tbl_qlkhMouseClicked

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
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLammoi;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_qlkh;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtTenkh;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
