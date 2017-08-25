
package com.cad.erros;

import com.cad.BD_biblioteca;
import com.cad.Tela_de_Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Chaves
 */
public class Tela_converte extends javax.swing.JFrame {

           String Opcao,
                  digitado,
                  resultado,
                  quero;
           ResultSet rs;
           
           
    public Tela_converte() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        CampoRes = new javax.swing.JTextField();
        SubTitulo2 = new javax.swing.JLabel();
        Painel4 = new javax.swing.JLabel();
        selecao = new javax.swing.JComboBox();
        bt_Converter = new javax.swing.JButton();
        Campo_recebe = new javax.swing.JTextField();
        SubTitulo = new javax.swing.JLabel();
        Titulo_1 = new javax.swing.JLabel();
        Painel2 = new javax.swing.JLabel();
        Painel3 = new javax.swing.JLabel();
        Personagem = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Fundo_0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoRes.setEditable(false);
        CampoRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CampoRes.setBounds(110, 230, 190, 50);
        jDesktopPane1.add(CampoRes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SubTitulo2.setBackground(new java.awt.Color(51, 51, 51));
        SubTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo2.setText(".");
        SubTitulo2.setOpaque(true);
        SubTitulo2.setBounds(30, 240, 70, 30);
        jDesktopPane1.add(SubTitulo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Painel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/lkl.png"))); // NOI18N
        Painel4.setText("jLabel1");
        Painel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Painel4.setBounds(10, 220, 310, 70);
        jDesktopPane1.add(Painel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        selecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Selecione --", "CDD para CDU", "CDD para Título", "CDU para CDD", "CDU para Título", "Título para CDD", "Titulo para CDU" }));
        selecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecaoItemStateChanged(evt);
            }
        });
        selecao.setBounds(30, 40, 270, 40);
        jDesktopPane1.add(selecao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_Converter.setBackground(new java.awt.Color(0, 0, 0));
        bt_Converter.setFont(new java.awt.Font("STARWARS", 0, 14)); // NOI18N
        bt_Converter.setForeground(new java.awt.Color(255, 255, 255));
        bt_Converter.setText("CONVERTER");
        bt_Converter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bt_Converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConverterActionPerformed(evt);
            }
        });
        bt_Converter.setBounds(60, 150, 220, 50);
        jDesktopPane1.add(bt_Converter, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Campo_recebe.setBackground(new java.awt.Color(0, 0, 0));
        Campo_recebe.setFont(new java.awt.Font("STARWARS", 0, 12)); // NOI18N
        Campo_recebe.setForeground(new java.awt.Color(255, 255, 255));
        Campo_recebe.setBounds(120, 90, 180, 50);
        jDesktopPane1.add(Campo_recebe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SubTitulo.setBackground(new java.awt.Color(51, 51, 51));
        SubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo.setText(".");
        SubTitulo.setOpaque(true);
        SubTitulo.setBounds(20, 100, 100, 30);
        jDesktopPane1.add(SubTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Titulo_1.setFont(new java.awt.Font("STARWARS", 0, 12)); // NOI18N
        Titulo_1.setForeground(new java.awt.Color(0, 255, 255));
        Titulo_1.setText("ESCOLHA A OPÇÃO DE CONVERSÃO");
        Titulo_1.setBounds(50, 10, 250, 30);
        jDesktopPane1.add(Titulo_1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Painel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/lk.png"))); // NOI18N
        Painel2.setText("jLabel1");
        Painel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Painel2.setBounds(10, 10, 310, 200);
        jDesktopPane1.add(Painel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Painel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/lk.png"))); // NOI18N
        Painel3.setText("jLabel1");
        Painel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Painel3.setBounds(10, 10, 310, 200);
        jDesktopPane1.add(Painel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Personagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/Personagem-07.gif"))); // NOI18N
        Personagem.setBounds(460, 180, 80, 120);
        jDesktopPane1.add(Personagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        Menu.setBounds(360, 260, 70, 30);
        jDesktopPane1.add(Menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Limpar.setBackground(new java.awt.Color(0, 0, 0));
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        Limpar.setBounds(360, 230, 70, 30);
        jDesktopPane1.add(Limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Fundo_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/erros/Fundo-07.jpg"))); // NOI18N
        Fundo_0.setText("jLabel1");
        Fundo_0.setBounds(-20, -10, 620, 380);
        jDesktopPane1.add(Fundo_0, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecaoItemStateChanged
        if (evt.getStateChange()==1) {
            
            String Selecionado=selecao.getSelectedItem().toString();
            if (Selecionado.equals("-- Selecione --")) {

                SubTitulo.setText(".");
                SubTitulo2.setText(".");
                
            }
            else if(Selecionado.equals("CDD para CDU")){
            
                SubTitulo.setText("  Digite o CDD");
                SubTitulo2.setText("  O CDU é:");
            }
            else if(Selecionado.equals("CDD para Título")){
            
                SubTitulo.setText("  Digite o CDD");
                SubTitulo2.setText("  O Título é:");
            
            }
            else if(Selecionado.equals("CDU para CDD")){
            
                SubTitulo.setText("  Digite o CDU");
                SubTitulo2.setText("  O CDD é:");
            }
            else if(Selecionado.equals("CDU para Título")){
                SubTitulo.setText("  Digite o CDU");
                SubTitulo2.setText("  O Título é:");
            
            }
            else if(Selecionado.equals("Título para CDD")){
            
                SubTitulo.setText(" Digite o Título");
                SubTitulo2.setText("  O CDD é:");
            }   
            else if(Selecionado.equals("Titulo para CDU")){
                SubTitulo.setText("  Digite o Título");
                SubTitulo2.setText("  O CDU é:");
            
            }
            
        }
    }//GEN-LAST:event_selecaoItemStateChanged

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        
        SubTitulo.setText(".");
        SubTitulo2.setText(".");
        Campo_recebe.setText("");
        CampoRes.setText("");
        selecao.setSelectedIndex(0);
        
                
    }//GEN-LAST:event_LimparActionPerformed

    private void bt_ConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConverterActionPerformed
            
        String Selecionado2=selecao.getSelectedItem().toString();
            if (Selecionado2.equals("-- Selecione --")) {
                System.out.println("");
            }else if(Selecionado2.equals("CDD para CDU")){
                Opcao="CDD";quero="CDU";
            }else if(Selecionado2.equals("CDD para Título")){
                Opcao="CDD";quero="titulo";
            }else if(Selecionado2.equals("CDU para CDD")){
                Opcao="CDU";quero="CDD";
            }else if(Selecionado2.equals("CDU para Título")){
                 Opcao="CDU";quero="titulo";
            }else if(Selecionado2.equals("Título para CDD")){
                Opcao="titulo";quero="CDD";
            }else if(Selecionado2.equals("Titulo para CDU")){
                Opcao="titulo";quero="CDU";
            }
            /*pega o que foi digitado*/
            digitado=Campo_recebe.getText();
        try {    
            BD_biblioteca Banco=new BD_biblioteca();
            rs=Banco.Conversao(Opcao, digitado);
            while(rs.next()){
            resultado=rs.getString(quero);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tela_converte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_converte.class.getName()).log(Level.SEVERE, null, ex);
        }
   CampoRes.setText(resultado);          
            
    }//GEN-LAST:event_bt_ConverterActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Tela_de_Menu menu=new Tela_de_Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_converte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_converte().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoRes;
    private javax.swing.JTextField Campo_recebe;
    private javax.swing.JLabel Fundo_0;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Painel2;
    private javax.swing.JLabel Painel3;
    private javax.swing.JLabel Painel4;
    private javax.swing.JLabel Personagem;
    private javax.swing.JLabel SubTitulo;
    private javax.swing.JLabel SubTitulo2;
    private javax.swing.JLabel Titulo_1;
    private javax.swing.JButton bt_Converter;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JComboBox selecao;
    // End of variables declaration//GEN-END:variables
}
