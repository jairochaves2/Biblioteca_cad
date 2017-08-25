
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
public class Tela_entregar_livro extends javax.swing.JFrame {
int id;
ResultSet rs;
String titulo;
String nome;
   
    public Tela_entregar_livro() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        nº.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        nº = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setEnabled(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("STARWARS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 47, 57));
        jLabel2.setText(" DIGITE O Nº DO EMPRESTIMO");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel2.setOpaque(true);
        jLabel2.setBounds(10, 10, 240, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nº.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nº.setBounds(50, 50, 160, 40);
        jDesktopPane1.add(nº, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("DEVOLVER LIVRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(60, 110, 140, 40);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(24, 18, 44));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(-10, -10, 580, 410);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (nº.getText()==null||nº.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo com o Código do Emprestimo");
        }
        
        else{
        
        
            id=Integer.parseInt(nº.getText());
            try {
            
                BD_biblioteca banco=new BD_biblioteca();
                rs=banco.entrega_livro_id(id);
                while (rs.next()) {                
                
                titulo=rs.getString("titulo");
                nome  =  rs.getString("nome");
                
                }
            
            
            } 
            catch (SQLException ex) {
                Logger.getLogger(Tela_entregar_livro.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela_entregar_livro.class.getName()).log(Level.SEVERE, null, ex);
            }
            int opção=JOptionPane.showConfirmDialog(null, "Esse Código pertence ao livro\n\n\n"+titulo+"\n\n\nEle estava aos Cuidados do(a) Nobre\n\n\n "+nome+"\n\n\nVocê realmente deseja excluir ele? " );
            if (opção==0) {
                try {
                    BD_biblioteca bd=new BD_biblioteca();
                    bd.entrega_livro_exclusao_confirmada(id);
                    
                    JOptionPane.showMessageDialog(null, "Excluído Com Sucesso!","***Bicad_beta***",2);
                    
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Tela_entregar_livro.class.getName()).log(Level.SEVERE, null, ex);
                }
                
           Tela_de_Menu menu=new Tela_de_Menu();
           this.              setVisible(false);
           menu.              setVisible(true ); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Verifique o Código correto na opção do Menu\n\"PESQUISAR LIVROS EMPRESTADOS\"");
            }
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_entregar_livro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nº;
    // End of variables declaration//GEN-END:variables
}
