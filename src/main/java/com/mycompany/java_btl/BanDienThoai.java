/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java_btl;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetyt
 */
public class BanDienThoai extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String hang = "";
    String rom = "";
    public BanDienThoai() {
        initComponents();
        conn = KetNoiCSDL.CSDL();
        jbang.setSelectionForeground(Color.WHITE);
        jbang.setSelectionBackground(Color.PINK);
        jbang.setBackground(Color.WHITE);
        jbang.getTableHeader().setForeground(Color.RED);
        jcbhang.setSelectedIndex(0);
        jcbrom.setSelectedIndex(0);
        ShowBang();
    }
    
    public void ShowBang(){
        String sql = "select * from dienthoai";
        DefaultTableModel tbmodel = (DefaultTableModel) jbang.getModel();
        tbmodel.setRowCount(0);

        Object obj[] = new Object[6];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                obj[0] = rs.getInt("madt");
                obj[1] = rs.getString("tendt");
                obj[2] = rs.getString("hangdt");
                obj[3] = rs.getInt("giadt");
                obj[4] = rs.getString("dungluongdt");
                obj[5] = rs.getInt("soluong");
                tbmodel.addRow(obj);
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public int Check(){
        int flag = 0;
        if(jtxtten.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
            jtxtten.requestFocus();
            flag = 0;
        }
        else if(jtxtgia.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
            jtxtgia.requestFocus();
            flag = 0;
        }
        else if(jtxtsoluong.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được bỏ trống");
            jtxtsoluong.requestFocus();
            flag = 0;
        }
        else if(Pattern.matches("[0-9]+", jtxtgia.getText().trim())== false){
            JOptionPane.showMessageDialog(this, "Vui lòng chỉ nhập số");
            jtxtgia.requestFocus();
            flag = 0;
        }
        else if(Pattern.matches("[0-9]+", jtxtsoluong.getText().trim())== false){
            JOptionPane.showMessageDialog(this, "Vui lòng chỉ nhập số");
            jtxtsoluong.requestFocus();
            flag = 0;
        }
        else if(Integer.parseInt(jtxtgia.getText().trim())<=0){
            JOptionPane.showMessageDialog(this, "Giá phải lớn hơn 0");
            jtxtgia.requestFocus();
            flag = 0;
        }  
        else if(Integer.parseInt(jtxtsoluong.getText().trim())<=0){
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
            jtxtsoluong.requestFocus();
            flag = 0;
        }
        else{
            flag =1;
        }
        return flag;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfull = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtxttimkiem = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        background_table = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jtxtten = new javax.swing.JTextField();
        jtxtgia = new javax.swing.JTextField();
        jtxtsoluong = new javax.swing.JTextField();
        jcbhang = new javax.swing.JComboBox<>();
        jcbrom = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DanhDZ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfull.setBackground(new java.awt.Color(205, 255, 216));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Hãng", "Giá", "Dung lượng", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jbang.setRowHeight(30);
        jbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jbang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 690, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("MENU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 100, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Tìm kiếm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 110, 30));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fa-Team-Fontawesome-FontAwesome-Cart-Plus.24.png"))); // NOI18N
        jButton1.setText("Thêm vào giỏ hàng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, 40));

        jtxttimkiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttimkiemActionPerformed(evt);
            }
        });
        jPanel1.add(jtxttimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 290, -1));

        jButton8.setBackground(new java.awt.Color(102, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons8-Ios7-Very-Basic-Search.24.png"))); // NOI18N
        jButton8.setText("Tìm kiếm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 150, -1));

        background_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tb.png"))); // NOI18N
        jPanel1.add(background_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("TÙY CHỌN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Tên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Hãng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Giá");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Số lượng");

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Microsoft-Fluentui-Emoji-Mono-Plus.24.png"))); // NOI18N
        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons8-Ios7-Very-Basic-Settings-Wrench-Filled.24.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Microsoft-Fluentui-Emoji-Mono-Minus.24.png"))); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictogrammers-Material-Broom.24.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Custom-Icon-Design-Mono-General-1-Close.24.png"))); // NOI18N
        jButton6.setText("Thoát");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ionic-Ionicons-Cart.24.png"))); // NOI18N
        jButton7.setText("Xem giỏ hàng");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jtxtten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttenActionPerformed(evt);
            }
        });

        jtxtgia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtgia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtgiaKeyPressed(evt);
            }
        });

        jtxtsoluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtxtsoluong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsoluongKeyPressed(evt);
            }
        });

        jcbhang.setBackground(new java.awt.Color(102, 153, 255));
        jcbhang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcbhang.setForeground(new java.awt.Color(255, 255, 255));
        jcbhang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "Samsung", "Oppo", "Xiaomi", "Vivo", "Realme", "Tecno" }));
        jcbhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbhangActionPerformed(evt);
            }
        });

        jcbrom.setBackground(new java.awt.Color(102, 153, 255));
        jcbrom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcbrom.setForeground(new java.awt.Color(255, 255, 255));
        jcbrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32GB", "64GB", "128GB", "256GB", "512GB", "1TB" }));
        jcbrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbromActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Dung lượng");

        javax.swing.GroupLayout panelfullLayout = new javax.swing.GroupLayout(panelfull);
        panelfull.setLayout(panelfullLayout);
        panelfullLayout.setHorizontalGroup(
            panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfullLayout.createSequentialGroup()
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfullLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))
                    .addGroup(panelfullLayout.createSequentialGroup()
                        .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfullLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtgia)
                                    .addComponent(jcbhang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtten)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfullLayout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelfullLayout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelfullLayout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfullLayout.createSequentialGroup()
                                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelfullLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfullLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbrom, 0, 183, Short.MAX_VALUE)
                                    .addComponent(jtxtsoluong))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelfullLayout.createSequentialGroup()
                        .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfullLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelfullLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelfullLayout.setVerticalGroup(
            panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfullLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelfullLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbhang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbrom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(panelfull, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Sửa
        if(Check() == 1){
            try {
                DefaultTableModel tbmodel = (DefaultTableModel) jbang.getModel();
                int i = jbang.getSelectedRow();
                String ma = tbmodel.getValueAt(i, 0).toString();
                String ten = jtxtten.getText();
                String hangdt = hang ;
                int gia = Integer.parseInt(jtxtgia.getText().trim());
                String dungluongdt = rom;
                int soluong = Integer.parseInt(jtxtsoluong.getText().trim());
                String sql_2 = "select * from giohang where madt like '" +ma+ "'";
                pst = conn.prepareStatement(sql_2);
                rs = pst.executeQuery();
                boolean m = rs.next();
                if(m == false){  
                    String sql = "update dienthoai set tendt = '" +ten+ "', hangdt = '" +hangdt+ "', giadt = '" +gia+ "', dungluongdt = '" +dungluongdt+ "', soluong = '" +soluong+ "' where madt like '" +ma+ "'";
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    jButton5ActionPerformed(evt);
                    JOptionPane.showMessageDialog(this, "Đã sửa");
                    
                }
                else{
                   JOptionPane.showMessageDialog(this, "Hàng đang trong giỏ, không thể sửa");
                }
                
            }catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, e);
                }
                }
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Clear
        jtxtten.setText("");
        jtxtgia.setText("");
        jtxtsoluong.setText("");
        jtxttimkiem.setText("");
        jcbhang.setSelectedIndex(0);
        jcbrom.setSelectedIndex(0);
        ShowBang();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Thoat
        int chon = JOptionPane.showConfirmDialog(this, "Exit ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Them
        if(Check() == 1){
            String ten = jtxtten.getText();
            String hangdt = hang;
            int gia = Integer.parseInt(jtxtgia.getText().trim());
            String dungluongdt = rom;
            int soluong = Integer.parseInt(jtxtsoluong.getText().trim());
            try {
                String sql = "INSERT INTO dienthoai (tendt, hangdt, giadt, dungluongdt, soluong) VALUES('" +ten+ "','" +hangdt+ "','" +gia+ "','" +dungluongdt+ "','" +soluong+"')";
                pst = conn.prepareStatement(sql);
                pst.execute();
                jButton5ActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Đã thêm");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Xoa
        DefaultTableModel tbmodel = (DefaultTableModel) jbang.getModel();
        if(jbang.getSelectedRowCount() == 1){
            try {
                //delete
                int i = jbang.getSelectedRow();
                String ma = tbmodel.getValueAt(i, 0).toString();
                String sql_3 = "select * from giohang where madt like '" +ma+ "'";
                pst = conn.prepareStatement(sql_3);
                rs = pst.executeQuery();
                boolean m = rs.next();
                if(m == false){
                    String sql = "delete from dienthoai where madt like "+ma+"";
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    //reset mã cho nó đẹp
                    int reset_ma = jbang.getRowCount();
                    String sql_2 = "alter table dienthoai auto_increment =  "+reset_ma+"";
                    pst = conn.prepareStatement(sql_2);
                    pst.execute();
                    jButton5ActionPerformed(evt);
                    JOptionPane.showMessageDialog(this, "Đã xóa");
                    }
                else{
                    JOptionPane.showMessageDialog(this, "Hàng đang trong giỏ, không thể xóa");
                }
                
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            if(jbang.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Bảng rỗng");
            }
            else{
                JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
            }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbangMouseClicked
        // Xuat thong tin len jtxt
        try {
            DefaultTableModel tbmodel = (DefaultTableModel) jbang.getModel();
            int i = jbang.getSelectedRow();
            jtxtten.setText(tbmodel.getValueAt(i, 1).toString());
            jcbhang.setSelectedItem(tbmodel.getValueAt(i, 2).toString());
            jtxtgia.setText(tbmodel.getValueAt(i, 3).toString());
            jcbrom.setSelectedItem(tbmodel.getValueAt(i, 4).toString());
            jtxtsoluong.setText(tbmodel.getValueAt(i, 5).toString());
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jbangMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Gio hang
        new GioHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Them vao gio hang
        
        if(jbang.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Chưa chọn hàng hóa");
        }
        else{
            try {
                    int i = jbang.getSelectedRow();
                    String input = JOptionPane.showInputDialog("Vui lòng nhập số lượng");
                    while(Pattern.matches("[0-9]+", input) == false || Integer.parseInt(input)<=0 || Integer.parseInt(input) >  Integer.parseInt(jbang.getValueAt(i, 5).toString())){
                        JOptionPane.showMessageDialog(this, "Số lượng không đúng");
                        input = JOptionPane.showInputDialog("Vui lòng nhập số lượng");
                    }

                    String ma = jbang.getValueAt(i, 0).toString();
                    String ten = jbang.getValueAt(i, 1).toString();
                    String hangdt = jbang.getValueAt(i, 2).toString();
                    int gia = Integer.parseInt(jbang.getValueAt(i, 3).toString());
                    String dungluong = jbang.getValueAt(i, 4).toString();
                    int sluonghh = Integer.parseInt(input);
                
                    String sql_2 = "INSERT INTO giohang (madt, tendt, hangdt, giadt, dungluongdt, soluong) VALUES('" +ma+ "','" +ten+ "','" +hangdt+ "','" +gia+ "','" +dungluong+ "','" +sluonghh+ "')";
                    pst = conn.prepareStatement(sql_2);
                    pst.execute();
                    
                    String sql_3 = "update dienthoai set soluong = soluong - "+sluonghh+" where madt like '"+ma+"'";
                    pst = conn.prepareStatement(sql_3);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(this, "Đã thêm vào giỏ hàng");
                    jButton5ActionPerformed(evt);
                
            } catch (Exception e) {
//                //JOptionPane.showMessageDialog(null, e);
            }


//            try {
//                int i = jbang.getSelectedRow();
//                String input = JOptionPane.showInputDialog("Vui lòng nhập số lượng");
//                while(Pattern.matches("[0-9]+", input) == false || Integer.parseInt(input)<=0 || Integer.parseInt(input) >  Integer.parseInt(jbang.getValueAt(i, 5).toString())){
//                    JOptionPane.showMessageDialog(this, "Số lượng không đúng");
//                    input = JOptionPane.showInputDialog("Vui lòng nhập số lượng");
//                }
//                String ma = jbang.getValueAt(i, 0).toString();
//                String ten = jbang.getValueAt(i, 1).toString();
//                String hangdt = jbang.getValueAt(i, 2).toString();
//                int gia = Integer.parseInt(jbang.getValueAt(i, 3).toString());
//                String dungluong = jbang.getValueAt(i, 4).toString();
//                int sluonghh = Integer.parseInt(input);
//                String sql = "select sum(soluong) from giohang where madt like '" +ma+ "'";
//                pst = conn.prepareStatement(sql);
//                rs = pst.executeQuery();
//                int d=0;
//                if(rs.next()){
//                    d = rs.getInt("sum(soluong)");
//                }
//                
//                String sql_1 = "select sum(soluong) from dienthoai where madt like '" +ma+ "'";
//                pst = conn.prepareStatement(sql_1);
//                rs = pst.executeQuery();
//                int d1=0;
//                if(rs.next()){
//                    d1 = rs.getInt("sum(soluong)");
//                }
//                
//                if(sluonghh + d > d1){
//                 JOptionPane.showMessageDialog(this, "Vượt quá số lượng");
//                }
//                else{
//                    String sql_2 = "INSERT INTO giohang (madt, tendt, hangdt, giadt, dungluongdt, soluong) VALUES('" +ma+ "','" +ten+ "','" +hangdt+ "','" +gia+ "','" +dungluong+ "','" +sluonghh+ "')";
//                    pst = conn.prepareStatement(sql_2);
//                    pst.execute();
//                    JOptionPane.showMessageDialog(this, "Đã thêm vào giỏ hàng");
//                    jButton5ActionPerformed(evt);
//                }
//                
//            } catch (Exception e) {
//                //JOptionPane.showMessageDialog(null, e);
//            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Tim kiem
        if(jtxttimkiem.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin tìm kiếm");
            jtxttimkiem.requestFocus();
        }
        else{
            String timkiem = jtxttimkiem.getText().trim();
            String sql = "select * from dienthoai where tendt like '%"+timkiem+"%'";
            DefaultTableModel tbmodel = (DefaultTableModel) jbang.getModel();
            tbmodel.setRowCount(0);
            Object obj[] = new Object[6];
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    obj[0] = rs.getInt("madt");
                    obj[1] = rs.getString("tendt");
                    obj[2] = rs.getString("hangdt");
                    obj[3] = rs.getInt("giadt");
                    obj[4] = rs.getString("dungluongdt");
                    obj[5] = rs.getInt("soluong");
                    tbmodel.addRow(obj);
                }
                if(jbang.getRowCount()==0){
                   JOptionPane.showMessageDialog(this, "Không tìm thấy");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed

    }//GEN-LAST:event_jButton2KeyPressed

    private void jtxtgiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtgiaKeyPressed
        // Check gia
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jtxtgia.setEditable(false);
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số");
        }
        jtxtgia.setEditable(true);
        jtxtgia.requestFocus();
    }//GEN-LAST:event_jtxtgiaKeyPressed

    private void jtxtsoluongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsoluongKeyPressed
        // Check so luong
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jtxtsoluong.setEditable(false);
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số");
        }
        jtxtsoluong.setEditable(true);
        jtxtsoluong.requestFocus();
    }//GEN-LAST:event_jtxtsoluongKeyPressed

    private void jtxttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttimkiemActionPerformed

    private void jcbhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbhangActionPerformed
        //Hãng
        hang = jcbhang.getItemAt(jcbhang.getSelectedIndex());
    }//GEN-LAST:event_jcbhangActionPerformed

    private void jcbromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbromActionPerformed
        //ROM
        rom = jcbrom.getItemAt(jcbrom.getSelectedIndex());
    }//GEN-LAST:event_jcbromActionPerformed

    private void jtxttenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttenActionPerformed

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
            java.util.logging.Logger.getLogger(BanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanDienThoai().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jbang;
    private javax.swing.JComboBox<String> jcbhang;
    private javax.swing.JComboBox<String> jcbrom;
    private javax.swing.JTextField jtxtgia;
    private javax.swing.JTextField jtxtsoluong;
    private javax.swing.JTextField jtxtten;
    private javax.swing.JTextField jtxttimkiem;
    private javax.swing.JPanel panelfull;
    // End of variables declaration//GEN-END:variables
}
