/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javamysql.MySQLManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DoriaN EdgardO
 */
public class actualizar_DatosContacto extends javax.swing.JFrame {

    MySQLManager CC = new MySQLManager();
    Connection con = CC.getConexion();
    /**
     * Creates new form Frm_acceder
     */
    public actualizar_DatosContacto() {
        initComponents();
        setLocationRelativeTo(null);
        cargartabla();
    }

     public void cargartabla(){
        DefaultTableModel cargar = new DefaultTableModel();
        cargar.addColumn("Alumno");
        cargar.addColumn("Apellido");
        cargar.addColumn("Email");
        cargar.addColumn("Nombre");
        cargar.addColumn("Telefono");
        TablaRe.setModel(cargar);
        
        String[] datos = new String[5];
        
        try{
            Statement read = con.createStatement();
            ResultSet rs = read.executeQuery("SELECT * FROM contact_list");
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                cargar.addRow(datos);
                
            }
             TablaRe.setModel(cargar);
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        Apellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRe = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DATOS DEL CONTACTO");

        jLabel3.setText("Apellido:");

        Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        jLabel6.setText("Teléfono: ");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        jLabel7.setText("Alumno:");

        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        TablaRe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaRe);

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("LISTA DE CONTACTOS:");

        jButton1.setText("ATRÁS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(limpiar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(372, 372, 372)
                                    .addComponent(jButton1))
                                .addComponent(jScrollPane1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modificar)
                                .addGap(129, 129, 129)
                                .addComponent(actualizar)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(actualizar)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumnoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        Alumno.setText(null);
        Apellido.setText(null);
        Email.setText(null);
        Nombre.setText(null);
        Telefono.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        if (Alumno.getText().isEmpty()|| Apellido.getText().isEmpty() || Email.getText().isEmpty() || Nombre.getText().isEmpty() || Telefono.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No dejar Campos Vacios");
        } else {
            Actualizar();
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lista_contactos form = new lista_contactos();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
         int fila = TablaRe.getSelectedRow();
        if (fila >= 0) {
            Alumno.setText(TablaRe.getValueAt(fila, 0).toString());
            Apellido.setText(TablaRe.getValueAt(fila, 1).toString());
            Email.setText(TablaRe.getValueAt(fila, 2).toString());
            Nombre.setText(TablaRe.getValueAt(fila, 3).toString());
            Telefono.setText(TablaRe.getValueAt(fila, 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
      
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fila = TablaRe.getSelectedRow();
        String Valor = TablaRe.getValueAt(fila,0).toString();
       if (fila>=0){
         try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/isunah_prog2","root","2022yahir");
            PreparedStatement pps = connection.prepareStatement("DELETE from contact_list where Alumno='" + Valor +"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato eliminado exitosamente");
            cargartabla();
         }
         catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
         }
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Actualizar() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/isunah_prog2","root","2022yahir");
            PreparedStatement pps = connection.prepareStatement("UPDATE contact_list SET alumno='" + Alumno.getText() + "', nombre='" + Apellido.getText() + "'"
                    + ",apellido='" + Email.getText() + "',email='" + Nombre.getText() + "'"
                    + "Where Telefono= '" + Telefono.getText() + "'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Modificados");
            cargartabla();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());

        }

    }
   
                
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
            java.util.logging.Logger.getLogger(actualizar_DatosContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_DatosContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_DatosContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_DatosContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualizar_DatosContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alumno;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable TablaRe;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables
}
