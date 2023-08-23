/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamysql;

import java.sql.*;
import javax.swing.JOptionPane;


public class MySQLManager {
    
    Connection con = null;
    
    
    public Connection getConexion() {

     
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/isunah_prog2","root","2022yahir");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No Conectado");
            JOptionPane.showMessageDialog(null, "Error de conexion"+ e.getMessage());
        }
        return con;
    }
    
}
