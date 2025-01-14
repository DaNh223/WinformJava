/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java_btl;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetyt
 */
public class GioHang extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form GioHang
     */
    public GioHang() {
        initComponents();
        conn = KetNoiCSDL.CSDL();
        ShowGioHang();
    }

    public void ShowGioHang(){
        String sql = "select * from giohang";
        DefaultTableModel tbmodel = (DefaultTableModel) tbgiohang.getModel();
        tbmodel.setRowCount(0);
        tbgiohang.setSelectionForeground(Color.WHITE);
        tbgiohang.setSelectionBackground(Color.PINK);
        tbgiohang.setBackground(Color.WHITE);
        tbgiohang.getTableHeader().setForeground(Color.RED);
        Object obj[] = new Object[7];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("stt");
                obj[1] = rs.getInt("madt");
                obj[2] = rs.getString("tendt");
                obj[3] = rs.getString("hangdt");
                obj[4] = rs.getInt("giadt");
                obj[5] = rs.getString("dungluongdt");
                obj[6] = rs.getInt("soluong");
                tbmodel.addRow(obj);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        tbgiohang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbgiohang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbgiohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Tên", "Hãng", "Giá", "Dung lượng", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbgiohang.setRowHeight(30);
        jScrollPane1.setViewportView(tbgiohang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 770, 440));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("GIỎ HÀNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 190, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colebemis-Feather-Delete.24.png"))); // NOI18N
        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictogrammers-Material-Broom.24.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 140, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Erix-Subyarko-Medical-Invoice-Bill-Payment-Billing-Hospital.32.png"))); // NOI18N
        jButton3.setText("Xuất hóa đơn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 142, -1, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ionic-Ionicons-Return-down-back-outline.24.png"))); // NOI18N
        jButton4.setText("Về menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 140, 40));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Custom-Icon-Design-Mono-General-1-Close.24.png"))); // NOI18N
        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 140, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("TÙY CHỌN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giohang (2).png"))); // NOI18N
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Xuat hoa don
        if(tbgiohang.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Chưa có hàng hóa");
        }
        else{
            File file = new File("Hoadon.txt");
            try {
                int tongtien = 0;
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.format("%70s\n", "HÓA ĐƠN"));
                bw.write(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","STT", "Mã","Tên","Hãng","Giá","Dung lượng","Số lượng"));
                for(int i = 0; i < tbgiohang.getRowCount(); i++){
                    for (int j = 0;j < tbgiohang.getColumnCount(); j++){
                        bw.write(String.format("%-20s", tbgiohang.getValueAt(i, j).toString()));
                    }
                    tongtien+= (Integer.parseInt(tbgiohang.getValueAt(i, 4).toString())*Integer.parseInt(tbgiohang.getValueAt(i, 6).toString()));
                    bw.newLine();
                    try {
                    //Trừ số lượng bán vào database
                    String mahh = tbgiohang.getValueAt(i, 1).toString();
                    String sql = "update dienthoai set soluong = soluong - (select sum(soluong) from giohang where madt like '" +mahh+ "') where madt like '"+mahh+"'";
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    
                    //Xóa hh nếu đã hết số lượng
                    String sql_2 = "delete from dienthoai where soluong =0";
                    pst = conn.prepareStatement(sql_2);
                    pst.execute();
                    
                    //reset stt cho nó đẹp
                    int reset_ma = tbgiohang.getRowCount()-1;
                    String sql_3 = "alter table giohang auto_increment =  "+reset_ma+"";
                    pst = conn.prepareStatement(sql_3);
                    pst.execute();
                    
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                bw.write(String.format("%90s", "Tổng tiền: ")+ tongtien);
                bw.close();
                fw.close(); 
                jButton2ActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Đã xuất hóa đơn");

            } catch (IOException ex) {
                Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Ve menu
        new BanDienThoai().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Thoat
        int chon = JOptionPane.showConfirmDialog(this, "Exit ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // clear
        
        try {
            for (int i=0;i< tbgiohang.getRowCount();i++){
                String ma = tbgiohang.getValueAt(i, 1).toString();
                 int soluong = Integer.parseInt(tbgiohang.getValueAt(i, 6).toString());
                String sql_3 = "update dienthoai set soluong = soluong + "+soluong+" where madt like '"+ma+"'";
                pst = conn.prepareStatement(sql_3);
                pst.execute();
            }
            
            DefaultTableModel tbmodel = (DefaultTableModel) tbgiohang.getModel();
            tbmodel.setRowCount(0);
            String sql = "delete from giohang";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            int reset_ma = tbgiohang.getRowCount();
            String sql_2 = "alter table giohang auto_increment =  "+reset_ma+"  ";
            pst = conn.prepareStatement(sql_2);
            pst.execute();
            ShowGioHang();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Xóa
        if(tbgiohang.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Chưa chọn hàng hóa");
        }
        else{
            DefaultTableModel tbmodel = (DefaultTableModel) tbgiohang.getModel();
            int i = tbgiohang.getSelectedRow();
            String stt = tbmodel.getValueAt(i, 0).toString();
            String mahh = tbmodel.getValueAt(i, 1).toString();
            int soluong = Integer.parseInt(tbmodel.getValueAt(i, 6).toString());
            try {
                //Cộng số lượng
                String sql_3 = "update dienthoai set soluong = soluong + "+soluong+" where madt like '"+mahh+"'";
                pst = conn.prepareStatement(sql_3);
                pst.execute();
                
                //xóa
                String sql = "delete from giohang where stt like '"+stt+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                
                //Reset stt cho đẹp
                int reset_ma = tbgiohang.getRowCount();
                String sql_2 = "alter table giohang auto_increment =  "+reset_ma+"";
                pst = conn.prepareStatement(sql_2);
                pst.execute();
                ShowGioHang();
                JOptionPane.showMessageDialog(this, "Đã xóa");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GioHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GioHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbgiohang;
    // End of variables declaration//GEN-END:variables
}
