/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaControlador;

import Modelo.Login;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author adria
 */
public class Ventana_practica2_6 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_practica2_6
     */
    Login login = new Login();

    Border original;

    public Ventana_practica2_6() {
        initComponents();
        msg_incorrecta.setVisible(false);
        original = caja_username.getBorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panel_loggin = new javax.swing.JPanel();
        etiqueta_instrucciones = new javax.swing.JLabel();
        eiqueta_usuario = new javax.swing.JLabel();
        etiqueta_contrasena = new javax.swing.JLabel();
        caja_username = new javax.swing.JTextField();
        caja_password = new javax.swing.JPasswordField();
        opcion_mostrar = new javax.swing.JCheckBox();
        boton_loggear = new javax.swing.JButton();
        msg_incorrecta = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        etiqueta_instrucciones.setText("Por favor, introdzca sus credenciales para acceder.");

        eiqueta_usuario.setText("Usuario");

        etiqueta_contrasena.setText("Contraseña");

        caja_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caja_usernameMouseClicked(evt);
            }
        });
        caja_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_usernameActionPerformed(evt);
            }
        });
        caja_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja_usernameKeyReleased(evt);
            }
        });

        caja_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_passwordActionPerformed(evt);
            }
        });

        opcion_mostrar.setText("Mostrar");
        opcion_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_mostrarActionPerformed(evt);
            }
        });

        boton_loggear.setText("Loggear");
        boton_loggear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_loggearActionPerformed(evt);
            }
        });

        msg_incorrecta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        msg_incorrecta.setForeground(new java.awt.Color(255, 0, 0));
        msg_incorrecta.setText("Usuario o contraseña incorerctos");

        javax.swing.GroupLayout panel_logginLayout = new javax.swing.GroupLayout(panel_loggin);
        panel_loggin.setLayout(panel_logginLayout);
        panel_logginLayout.setHorizontalGroup(
            panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logginLayout.createSequentialGroup()
                .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_logginLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_instrucciones)
                            .addGroup(panel_logginLayout.createSequentialGroup()
                                .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eiqueta_usuario)
                                    .addComponent(etiqueta_contrasena))
                                .addGap(18, 18, 18)
                                .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(caja_password, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(caja_username))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcion_mostrar))))
                    .addGroup(panel_logginLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(boton_loggear)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(msg_incorrecta)
                .addGap(142, 142, 142))
        );
        panel_logginLayout.setVerticalGroup(
            panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiqueta_instrucciones)
                .addGap(30, 30, 30)
                .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eiqueta_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_logginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion_mostrar)
                    .addComponent(caja_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_contrasena))
                .addGap(27, 27, 27)
                .addComponent(msg_incorrecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_loggear))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_loggin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel_loggin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcion_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion_mostrarActionPerformed

    private void boton_loggearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_loggearActionPerformed
        String username = caja_username.getText();
        String password = String.valueOf(caja_password.getPassword());
        Boolean credenciales_correctas = login.comprobarUsuarioRegistrado(username, password);
        if (credenciales_correctas) {
            
        } else {
            vibrar();
            avisoIncorrectas();
        }
    }//GEN-LAST:event_boton_loggearActionPerformed

    public void vibrar() {
        final int originalX = this.getLocationOnScreen().x;  // Obtener la posición original en X
        final int originalY = this.getLocationOnScreen().y;  // Obtener la posición original en Y

        // Creamos un hilo para que no bloquee el hilo principal de la UI
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    // Mover la ventana a posiciones levemente distintas
                    this.setLocation(originalX + (int) (Math.random() * 10 - 5),
                            originalY + (int) (Math.random() * 10 - 5));
                    Thread.sleep(20);  // Pausa breve entre cada movimiento
                }
                // Volver a la posición original al finalizar
                this.setLocation(originalX, originalY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    //para conectar la otra ventana se pone nombreventana.setVisible(true);
    public void avisoIncorrectas() {
        int altura = caja_username.getHeight();
        int ancho = caja_username.getWidth();
        
        msg_incorrecta.setVisible(true);
//        Border rojo = new Border(Color.RED);
        Border bordeRojo = BorderFactory.createLineBorder(Color.RED,2);
        caja_username.setBorder(bordeRojo);
        caja_password.setBorder(bordeRojo);
    }

    public void resetearLogin() {
        msg_incorrecta.setVisible(false);
        caja_username.setBorder(original);
        caja_password.setBorder(original);
    }


    private void caja_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_usernameActionPerformed

    }//GEN-LAST:event_caja_usernameActionPerformed

    private void caja_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_passwordActionPerformed

    }//GEN-LAST:event_caja_passwordActionPerformed

    private void caja_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_usernameKeyReleased
      
    }//GEN-LAST:event_caja_usernameKeyReleased

    private void caja_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_usernameMouseClicked
        resetearLogin();
    }//GEN-LAST:event_caja_usernameMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_practica2_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_practica2_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_practica2_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_practica2_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_practica2_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_loggear;
    private javax.swing.JPasswordField caja_password;
    private javax.swing.JTextField caja_username;
    private javax.swing.JLabel eiqueta_usuario;
    private javax.swing.JLabel etiqueta_contrasena;
    private javax.swing.JLabel etiqueta_instrucciones;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel msg_incorrecta;
    private javax.swing.JCheckBox opcion_mostrar;
    private javax.swing.JPanel panel_loggin;
    // End of variables declaration//GEN-END:variables
}
