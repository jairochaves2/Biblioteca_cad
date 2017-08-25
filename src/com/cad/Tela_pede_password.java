
package com.cad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Chaves
 */
public class Tela_pede_password extends javax.swing.JFrame {
String password;
ResultSet voltou;
String confirmacao;   
    public Tela_pede_password() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        senha.setHorizontalAlignment(javax.swing.JPasswordField.CENTER);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jDesktopPane1.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("STARWARS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 0, 0));
        jLabel3.setText("PASSWORD");
        jLabel3.setBounds(140, 30, 80, 30);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setForeground(new java.awt.Color(255, 0, 0));
        senha.setBounds(100, 60, 150, 30);
        jDesktopPane1.add(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Password.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBounds(-20, 20, 110, 130);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("VALIDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(120, 103, 100, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        jLabel1.setBounds(0, 0, 290, 150);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        password =senha.getText();
        
        try {
            
            BD_biblioteca banco=new BD_biblioteca();
            voltou=banco.chave();
            
            while (voltou.next()) {                
                confirmacao=voltou.getString("password");
                     
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Tela_pede_password.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_pede_password.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (password.equalsIgnoreCase(confirmacao)) {
            
            
            Tela_entregar_livro Tela_entregar=new Tela_entregar_livro();
            this.setVisible(false);
            Tela_entregar.setVisible(true);
            
            
        }
        else{
        JOptionPane.showMessageDialog(null, "Senha Incorreta!!!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_pede_password().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
