/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java_btl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author hetyt
 */
public class DangKy extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public DangKy() {
        initComponents();
        conn = KetNoiCSDL.CSDL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxttendn = new javax.swing.JTextField();
        jtxtpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtxnpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("ĐĂNG KÝ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons8-Windows-8-Users-Name.24.png"))); // NOI18N
        jLabel3.setText("Tên đăng nhập");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons8-Windows-8-Security-Password-2.24.png"))); // NOI18N
        jLabel4.setText("Mật khẩu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 40));

        jtxttendn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxttendn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttendnActionPerformed(evt);
            }
        });
        getContentPane().add(jtxttendn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 220, 40));

        jtxtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 220, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 140, 40));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictogrammers-Material-Lock-check.24.png"))); // NOI18N
        jLabel5.setText("Xác nhận mật khẩu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 40));

        jtxtxnpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtxnpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtxnpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtxnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dangky.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxttendnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttendnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttendnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Dang Ky
        String tendn = jtxttendn.getText();
        String pass = jtxtpass.getText();
        String xnpass = jtxtxnpass.getText();
        if(tendn.isEmpty() || pass.isEmpty() || xnpass.isBlank()){
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
        }
        else{
            if(pass.equals(xnpass)){
                try {
                    if(Pattern.matches("[[0-9][a-z][A-Z]]+", jtxttendn.getText())== false){
                        JOptionPane.showMessageDialog(this, "Tên đăng nhập chỉ gồm số và chữ!");
                    }
                    else{
                        String sql = "INSERT INTO taikhoan(tentk, matkhau) VALUES('" +tendn+ "', '" +pass+ "')";
                        pst = conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(this, "Đã đăng ký thành công");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Chưa đăng ký được");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng mật khẩu");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Tro ve
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtxtxnpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtxnpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtxnpassActionPerformed

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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JTextField jtxttendn;
    private javax.swing.JPasswordField jtxtxnpass;
    // End of variables declaration//GEN-END:variables
}
