/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.MatHangDAO;
import POJO.MatHangPOJO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmMatHang extends javax.swing.JFrame {

    /**
     * Creates new form frmMatHang
     */
    public frmMatHang() {
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
        txtMamh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenncc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenmh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtXuatxu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDongianhap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDongiaban = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGhichu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_qlmh = new javax.swing.JTable();
        btnTimkiem = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        btnLammoi = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mặt hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 10, 10));
        jLabel1.setText("Quản lý mặt hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã mặt hàng:");

        txtMamh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp:");

        txtTenncc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên mặt hàng:");

        txtTenmh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Xuất xứ:");

        txtXuatxu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Đơn giá nhập:");

        txtDongianhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Số lượng:");

        txtSoluong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Đơn giá bán:");

        txtDongiaban.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDongiaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiabanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Ghi chú:");

        txtGhichu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGhichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhichuActionPerformed(evt);
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

        tbl_qlmh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_qlmh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_qlmh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlmhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_qlmh);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDongiaban))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMamh)
                                                .addComponent(txtTenmh, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                            .addComponent(txtDongianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenncc)
                                    .addComponent(txtXuatxu)
                                    .addComponent(txtSoluong)
                                    .addComponent(txtGhichu)))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBack)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addComponent(btnTimkiem)
                .addGap(18, 18, 18)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMamh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenncc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTenmh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDongianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDongiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimkiem)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadDataToTable() {
        MatHangDAO p = new MatHangDAO();
        ArrayList<MatHangPOJO> ds = p.dsMH();

        DefaultTableModel model = (DefaultTableModel) tbl_qlmh.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã mặt hàng", "Tên mặt hàng", "Đơn giá nhập", "Đơn giá bán", "Tên nhà cung cấp", "Xuất xứ", "Số lượng", "Ghi chú"});
        for (MatHangPOJO mh : ds) {
            Object[] row = new Object[]{mh.mamh, mh.tenmh, mh.dongianhap, mh.dongiaban, mh.tenncc, mh.xuatxu, mh.soluong, mh.ghichu};
            model.addRow(row);
        }
    }

    public void bidingtblPB() {
        MatHangDAO p = new MatHangDAO();
        ArrayList<MatHangPOJO> ds = p.dsMH();
        int index = tbl_qlmh.getSelectedRow();
        MatHangPOJO mh = ds.get(index);
        txtMamh.setText(mh.getMamh());
        this.txtMamh.setEditable(false);
        txtTenmh.setText(mh.getTenmh());
        txtDongianhap.setText(mh.getDongianhap() + "");
        txtDongiaban.setText(mh.getDongiaban() + "");
        txtTenncc.setText(mh.getTenncc());
        txtXuatxu.setText(mh.getXuatxu());
        txtSoluong.setText(mh.getSoluong() + "");
        txtGhichu.setText(mh.getGhichu());
    }

    public void reset() {

        this.txtMamh.setText("");
        this.txtTenmh.setText("");
        this.txtDongianhap.setText("");
        this.txtDongiaban.setText("");
        this.txtTenncc.setText("");
        this.txtXuatxu.setText("");
        this.txtSoluong.setText("");
        this.txtGhichu.setText("");
        this.txtTim.setText("");

    }

    public void them() {
        MatHangPOJO mh = new MatHangPOJO(txtMamh.getText(), txtTenmh.getText(), Integer.parseInt(txtDongianhap.getText()), Integer.parseInt(txtDongiaban.getText()),
                txtTenncc.getText(), txtXuatxu.getText(), Integer.parseInt(txtSoluong.getText()), txtGhichu.getText());
        MatHangDAO p = new MatHangDAO();
        p.themMatHang(mh);

    }

    public void xoa() {
        MatHangDAO p = new MatHangDAO();
        p.xoaMatHang(txtMamh.getText());

    }

    public void sua() {
        MatHangPOJO mh = new MatHangPOJO(txtMamh.getText(), txtTenmh.getText(), Integer.parseInt(txtDongianhap.getText()), Integer.parseInt(txtDongiaban.getText()),
                txtTenncc.getText(), txtXuatxu.getText(), Integer.parseInt(txtSoluong.getText()), txtGhichu.getText());
        MatHangDAO p = new MatHangDAO();
        p.suaMatHang(mh);
    }

    public void timkiem() {
        MatHangDAO p = new MatHangDAO();
        ArrayList<MatHangPOJO> ds = p.timKiemTheoMaMH(txtTim.getText());

        DefaultTableModel model = (DefaultTableModel) tbl_qlmh.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Mã mặt hàng", "Tên mặt hàng", "Đơn giá nhập", "Đơn giá bán", "Tên nhà cung cấp", "Xuất xứ", "Số lượng", "Ghi chú"});
        for (MatHangPOJO mh : ds) {
            Object[] row = new Object[]{mh.mamh, mh.tenmh, mh.dongianhap, mh.dongiaban, mh.tenncc, mh.xuatxu, mh.soluong, mh.ghichu};
            model.addRow(row);
        }

    }

    private void txtDongiabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDongiabanActionPerformed

    private void txtGhichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhichuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (this.txtMamh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMamh.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không được lớn hơn 5 ký tự!", "Thông báo", 2);
        else {
            them();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (this.txtMamh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không thể bỏ trống!", "thông báo", 2);
        else if (this.txtMamh.getText().length() > 10)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không được lớn hơn 5 ký tự!", "thông báo", 2);
        else {
            xoa();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (this.txtMamh.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không thể bỏ trống!", "Thông báo", 2);
        else if (this.txtMamh.getText().length() > 5)
            JOptionPane.showMessageDialog(null, "Mã mặt hàng không được lớn hơn 5 ký tự!", "Thông báo", 2);
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
        this.txtMamh.setEditable(true);
        this.txtMamh.requestFocus();
        loadDataToTable();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmDanhMuc frm = new frmDanhMuc();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbl_qlmhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlmhMouseClicked
        // TODO add your handling code here:
        this.btnThem.setEnabled(false);
        bidingtblPB();
    }//GEN-LAST:event_tbl_qlmhMouseClicked

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
            java.util.logging.Logger.getLogger(frmMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMatHang().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_qlmh;
    private javax.swing.JTextField txtDongiaban;
    private javax.swing.JTextField txtDongianhap;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtMamh;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenmh;
    private javax.swing.JTextField txtTenncc;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtXuatxu;
    // End of variables declaration//GEN-END:variables
}