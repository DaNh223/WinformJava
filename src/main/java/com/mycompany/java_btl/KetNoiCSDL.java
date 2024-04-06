/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_btl;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hetyt
 */
public class KetNoiCSDL {
    public static Connection CSDL(){
        try {
            String username = "root";
            String password = "773450";
            //database url
            String sql = "jdbc:mysql://localhost:3306/khodienthoai?zeroDateTimeBehavior=CONVERT_TO_NULL";
            //driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sql, username, password);
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ko connect duoc");
            return null;
        }
}
}