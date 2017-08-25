

package com.cad.erros;

import com.cad.BD_biblioteca;
import com.cad.Tela_de_Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jairo Chaves
 */
public class Tela_prateleira extends javax.swing.JFrame {

   String PegaSelecao;
   String PegaDigitado;
   String retornou;
   String selecionado;
   ResultSet rs;
    public Tela_prateleira() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        Selecao = new javax.swing.JComboBox();
        Campo_pesquisa = new javax.swing.JTextField();
        Titulo_02_ou = new javax.swing.JLabel();
        bt_Pesquisar = new javax.swing.JButton();
        Titulo_01 = new javax.swing.JLabel();
        Fundo_01 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        Titulo_2 = new javax.swing.JLabel();
        Result = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Limpar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Fundo_0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDesktopPane2.setEnabled(false);
        jDesktopPane2.setOpaque(false);

        Selecao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Selecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Selecione --", "CDD", "CDU", "Título" }));
        Selecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelecaoItemStateChanged(evt);
            }
        });
        Selecao.setBounds(140, 20, 170, 40);
        jDesktopPane2.add(Selecao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Campo_pesquisa.setBounds(140, 70, 170, 40);
        jDesktopPane2.add(Campo_pesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Titulo_02_ou.setBackground(new java.awt.Color(165, 93, 111));
        Titulo_02_ou.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo_02_ou.setForeground(new java.awt.Color(0, 255, 255));
        Titulo_02_ou.setText(".");
        Titulo_02_ou.setOpaque(true);
        Titulo_02_ou.setBounds(20, 90, 120, 20);
        jDesktopPane2.add(Titulo_02_ou, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_Pesquisar.setBackground(new java.awt.Color(0, 0, 0));
        bt_Pesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Pesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Pesquisar.setText("Pesquisar");
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });
        bt_Pesquisar.setBounds(320, 10, 110, 110);
        jDesktopPane2.add(bt_Pesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Titulo_01.setBackground(new java.awt.Color(168, 101, 105));
        Titulo_01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo_01.setForeground(new java.awt.Color(0, 255, 255));
        Titulo_01.setText("  Tipo de Pesquisa");
        Titulo_01.setOpaque(true);
        Titulo_01.setBounds(20, 40, 120, 20);
        jDesktopPane2.add(Titulo_01, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Fundo_01.setBackground(new java.awt.Color(0, 153, 255));
        Fundo_01.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fundo_01.setOpaque(true);
        Fundo_01.setBounds(0, 0, 440, 130);
        jDesktopPane2.add(Fundo_01, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(90, 10, 440, 130);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDesktopPane3.setEnabled(false);
        jDesktopPane3.setOpaque(false);

        Titulo_2.setBackground(new java.awt.Color(0, 153, 204));
        Titulo_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo_2.setText("   Esse Livro está na:");
        Titulo_2.setOpaque(true);
        Titulo_2.setBounds(20, 20, 130, 30);
        jDesktopPane3.add(Titulo_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Result.setBounds(160, 10, 210, 40);
        jDesktopPane3.add(Result, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(0, 0, 380, 70);
        jDesktopPane3.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBounds(120, 150, 380, 70);
        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/Personagem-06.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBounds(450, 220, 120, 140);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Limpar.setBackground(new java.awt.Color(0, 0, 0));
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        Limpar.setBounds(40, 290, 70, 30);
        jDesktopPane1.add(Limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        Menu.setBounds(40, 320, 70, 30);
        jDesktopPane1.add(Menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Fundo_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/Fundo-06.png"))); // NOI18N
        Fundo_0.setText("jLabel1");
        Fundo_0.setBounds(0, 0, 600, 370);
        jDesktopPane1.add(Fundo_0, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Tela_de_Menu Tmenu=new Tela_de_Menu();
        this.setVisible(false);
        Tmenu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void SelecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SelecaoItemStateChanged
      if (evt.getStateChange()==1) {
            
          selecionado=Selecao.getSelectedItem().toString();
            
          if (selecionado.equals("-- Selecione --")) {
                Titulo_02_ou.setText(".");
          
          }
          else if(selecionado.equals("Todos")){
            
                Titulo_02_ou.setText("Clique em pesquisar");
            
          }
          else if(selecionado.equals("Pessoa")){
            
                Titulo_02_ou.setText("Digite o Nome");
            
          }
          else {
                 
                Titulo_02_ou.setText("Digite o "+selecionado);
            
          }
      }
    }//GEN-LAST:event_SelecaoItemStateChanged

    private void bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PesquisarActionPerformed
        
        PegaSelecao=Selecao.getSelectedItem().toString();
        PegaDigitado=Campo_pesquisa.getText();
        try {
            BD_biblioteca banco=new BD_biblioteca();
            rs=banco.Pega_prateleira(PegaSelecao, PegaDigitado);
            
            while (rs.next()) {                
            
                retornou=rs.getString("prateleira");
                
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Tela_prateleira.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_prateleira.class.getName()).log(Level.SEVERE, null, ex);
        }
        Result.setText(retornou);
        
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Selecao.setSelectedIndex(0);
        Titulo_02_ou.setText(".");
        Campo_pesquisa.setText("");
        Result.setText("");
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_prateleira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_prateleira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_prateleira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_prateleira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_prateleira().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_pesquisa;
    private javax.swing.JLabel Fundo_0;
    private javax.swing.JLabel Fundo_01;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Result;
    private javax.swing.JComboBox Selecao;
    private javax.swing.JLabel Titulo_01;
    private javax.swing.JLabel Titulo_02_ou;
    private javax.swing.JLabel Titulo_2;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
