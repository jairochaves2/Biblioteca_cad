/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cad;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Tela_Cadastro_Livros extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_livro
     */
    public Tela_Cadastro_Livros() {
        initComponents();
        setResizable(false);
    this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        Campo_cdd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Campo_titulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Campo_autor = new javax.swing.JTextField();
        Botao_cadastro = new javax.swing.JButton();
        Seleçao_prateleira = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Campo_cdu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_editora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        fundo8 = new javax.swing.JLabel();
        fundo9 = new javax.swing.JLabel();
        fundo10 = new javax.swing.JLabel();
        fundo11 = new javax.swing.JLabel();
        fundo12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Personagem-03.gif"))); // NOI18N
        jLabel2.setBounds(610, 240, 200, 240);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Balao-tela3.png"))); // NOI18N
        jLabel3.setBounds(470, 110, 200, 190);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(102, 255, 102));
        jDesktopPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDesktopPane2.setEnabled(false);
        jDesktopPane2.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CDU:");
        jLabel5.setBounds(40, 220, 50, 20);
        jDesktopPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_cdd.setBounds(80, 170, 210, 30);
        jDesktopPane2.add(Campo_cdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Prateleira");
        jLabel10.setBounds(10, 140, 60, 20);
        jDesktopPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_titulo.setBounds(80, 10, 340, 30);
        jDesktopPane2.add(Campo_titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Título:");
        jLabel6.setBounds(40, 20, 50, 20);
        jDesktopPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Numero da");
        jLabel9.setBounds(10, 130, 70, 20);
        jDesktopPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_autor.setBounds(80, 50, 340, 30);
        jDesktopPane2.add(Campo_autor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Botao_cadastro.setBackground(new java.awt.Color(0, 0, 0));
        Botao_cadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        Botao_cadastro.setText("Cadastrar");
        Botao_cadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Botao_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_cadastroActionPerformed(evt);
            }
        });
        Botao_cadastro.setBounds(300, 130, 120, 110);
        jDesktopPane2.add(Botao_cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Seleçao_prateleira.setBackground(new java.awt.Color(102, 255, 255));
        Seleçao_prateleira.setForeground(new java.awt.Color(255, 0, 0));
        Seleçao_prateleira.setMaximumRowCount(100);
        Seleçao_prateleira.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a prateleira", "Prateleira 1", "Prateleira 2", "Prateleira 3", "Prateleira 4", "Prateleira 5", "Prateleira 6", "Prateleira 7" }));
        Seleçao_prateleira.setAutoscrolls(true);
        Seleçao_prateleira.setBounds(80, 130, 210, 30);
        jDesktopPane2.add(Seleçao_prateleira, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Autor:");
        jLabel7.setBounds(40, 60, 50, 20);
        jDesktopPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_cdu.setBounds(80, 210, 210, 30);
        jDesktopPane2.add(Campo_cdu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CDD:");
        jLabel4.setBounds(40, 180, 50, 20);
        jDesktopPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_editora.setBounds(80, 90, 340, 30);
        jDesktopPane2.add(Campo_editora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Editora:");
        jLabel8.setBounds(30, 100, 50, 20);
        jDesktopPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Editora:");
        jLabel11.setBounds(30, 100, 50, 20);
        jDesktopPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo2.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo8.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo9.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo10.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo11.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1.png"))); // NOI18N
        fundo12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fundo12.setBounds(0, 0, 430, 250);
        jDesktopPane2.add(fundo12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(20, 120, 430, 250);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Menu");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(530, 370, 70, 30);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpar");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(530, 400, 70, 30);
        jDesktopPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Fundo-03.png"))); // NOI18N
        ver.setBounds(-10, -100, 810, 700);
        jDesktopPane1.add(ver, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Tela_de_Menu tlp=new Tela_de_Menu();
       this.setVisible(false);
       tlp.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Botao_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_cadastroActionPerformed
        
        
        String titulo; 
        String autor; 
        String editora; 
        String prateleira; 
        String cdd; 
        String cdu; 
        
        titulo=Campo_titulo.getText();
        autor=Campo_autor.getText();
        editora=Campo_editora.getText();
        prateleira=""+Seleçao_prateleira.getSelectedItem();
        cdd=Campo_cdd.getText();
        cdu=Campo_cdu.getText();
        
        if ((titulo.equals(""))||(autor.equals(""))||(editora.equals(""))||(cdd.equals(""))||(cdu.equals(""))) {
           
            JOptionPane.showMessageDialog(null, "Atenção\nPreenchimento dos Campos Incorreto.\n","***Bicad_beta***",0);
            
            
        }
        else if((prateleira.equals("Selecione a prateleira"))){
            JOptionPane.showMessageDialog(null, "Atenção\nSelecione uma Prateleira.","***Bicad_beta***",0);
        
        
        }
        else{
        
        
        try {
            BD_biblioteca bd=new BD_biblioteca();
            bd.cadastar_livro(titulo, autor, editora, prateleira, cdd,cdu);
            bd.conexão.close();
        }   catch (SQLException ex) {
                Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //limpar
        Campo_titulo.setText("");
        Campo_autor.setText("");
        Seleçao_prateleira.setSelectedIndex(0);
        
        Campo_editora.setText("");
        Campo_cdd.setText("");
        Campo_cdu.setText("");
        }
        
        
        
        
        
    }//GEN-LAST:event_Botao_cadastroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //limpar
        Campo_titulo.setText("");
        Campo_autor.setText("");
        Campo_editora.setText("");
        Campo_cdd.setText("");
        Campo_cdu.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Livros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_cadastro;
    private javax.swing.JTextField Campo_autor;
    private javax.swing.JTextField Campo_cdd;
    private javax.swing.JTextField Campo_cdu;
    private javax.swing.JTextField Campo_editora;
    private javax.swing.JTextField Campo_titulo;
    private javax.swing.JComboBox Seleçao_prateleira;
    private javax.swing.JLabel fundo10;
    private javax.swing.JLabel fundo11;
    private javax.swing.JLabel fundo12;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundo8;
    private javax.swing.JLabel fundo9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
