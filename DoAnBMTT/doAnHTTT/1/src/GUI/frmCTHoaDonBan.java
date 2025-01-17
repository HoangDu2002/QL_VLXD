/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.CT_HoaDonBanDAO;
import POJO.CT_HoaDonBanPOJO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmCTHoaDonBan extends javax.swing.JFrame {

    /**
     * Creates new form frmCTHoaDonBan
     */
    public frmCTHoaDonBan() {
        initComponents();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        txtNgaymua = new javax.swing.JTextField();
        txtMakh = new javax.swing.JTextField();
        txtTongtien = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_qlcthdb = new javax.swing.JTable();
        btnTimkiem = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi tiết hoá đơn bán");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 2, 2));
        jLabel1.setText("Quản lý chi tiết hoá đơn bán");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã hoá đơn:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mã khách hàng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày mua:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tổng tiền:");

        txtMahd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtNgaymua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNgaymua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaymuaActionPerformed(evt);
            }
        });

        txtMakh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtTongtien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

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

        tbl_qlcthdb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_qlcthdb.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_qlcthdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlcthdbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_qlcthdb);

        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
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
                .addGap(97, 97, 97)
                .addComponent(btnTimkiem)
                .addGap(18, 18, 18)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(131, 131, 131)
                                .addComponent(txtTongtien))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBack))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtNgaymua)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgaymua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void loadDataToTable() {
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        ArrayList<CT_HoaDonBanPOJO> ds = p.dsCTHDB();

        DefaultTableModel model = (DefaultTableModel) tbl_qlcthdb.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã hoá đơn", "Mã khách hàng", "Ngày mua", "Tổng tiền"});
        for (CT_HoaDonBanPOJO cthdb : ds) {
            Object[] row = new Object[]{cthdb.mahd, cthdb.makh, cthdb.ngaymua, cthdb.tongtien};
            model.addRow(row);
        }
    }

    public void bidingtblPB() {
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        ArrayList<CT_HoaDonBanPOJO> ds = p.dsCTHDB();
        int index = tbl_qlcthdb.getSelectedRow();
        CT_HoaDonBanPOJO cthdb = ds.get(index);
        txtMahd.setText(cthdb.getMahd());
        this.txtMahd.setEditable(false);
        txtMakh.setText(cthdb.getMakh());
        this.txtMakh.setEditable(false);
        txtNgaymua.setText(cthdb.getNgaymua());
        txtTongtien.setText(cthdb.getTongtien() + "");
    }

    public void reset() {

        this.txtMahd.setText("");
        this.txtMakh.setText("");
        this.txtNgaymua.setText("");
        this.txtTongtien.setText("");
        this.txtTim.setText("");

    }

    public void them() {
        CT_HoaDonBanPOJO cthdb = new CT_HoaDonBanPOJO(txtMahd.getText(), txtMakh.getText(), txtNgaymua.getText(), Integer.parseInt(txtTongtien.getText()));
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        p.themCTHoaDonBan(cthdb);
    }

    public void xoa() {
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        p.xoaCTHoaDonBan(txtMahd.getText());

    }

    public void sua() {
        CT_HoaDonBanPOJO cthdb = new CT_HoaDonBanPOJO(txtMahd.getText(), txtMakh.getText(), txtNgaymua.getText(), Integer.parseInt(txtTongtien.getText()));
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        p.suaCTHoaDonBan(cthdb);
    }

    public void timkiem() {
        CT_HoaDonBanDAO p = new CT_HoaDonBanDAO();
        ArrayList<CT_HoaDonBanPOJO> ds = p.timKiemTheoMaHD(txtTim.getText());

        DefaultTableModel model = (DefaultTableModel) tbl_qlcthdb.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã hoá đơn", "Mã khách hàng", "Ngày mua", "Tổng tiền"});
        for (CT_HoaDonBanPOJO cthdb : ds) {
            Object[] row = new Object[]{cthdb.mahd, cthdb.makh, cthdb.ngaymua, cthdb.tongtien};
            model.addRow(row);
        }

    }

    private void txtNgaymuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaymuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaymuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (this.txtMahd.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không thể bỏ trống!", "thông báo", 2);
        else if (this.txtMahd.getText().length() > 10)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không được lớn hơn 5 ký tự!", "thông báo", 2);
        else {
            xoa();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (this.txtMahd.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMahd.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            sua();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (this.txtMahd.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMahd.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã hoá đơn không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            them();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmHoaDonBan frm = new frmHoaDonBan();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        reset();
        this.btnThem.setEnabled(true);
        this.txtMahd.setEditable(true);
        this.txtMakh.setEditable(true);
        this.txtMahd.requestFocus();
        loadDataToTable();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void tbl_qlcthdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlcthdbMouseClicked
        // TODO add your handling code here:
        this.btnThem.setEnabled(false);
        bidingtblPB();
    }//GEN-LAST:event_tbl_qlcthdbMouseClicked

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_btnTimkiemActionPerformed

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
            java.util.logging.Logger.getLogger(frmCTHoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCTHoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCTHoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCTHoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCTHoaDonBan().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_qlcthdb;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtNgaymua;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
