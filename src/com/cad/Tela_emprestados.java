
package com.cad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Jairo Chaves
 */
public class Tela_emprestados extends javax.swing.JFrame {

    DefaultTableModel Modelo_tabela;
    ResultSet retornou_Tabela;
    
    
    public Tela_emprestados() {
   
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        setResizable(false);
//   setTitle("ver");
        
        
        //tabela
        String cabeçalho []={"Nº Do Empres.","Titulo","Autor","Editora","Prateleira","CDD","CDU","Usuario","Data Do Emprestimo","Data de Devulução","Telefône"};
        String dados[][]={};
        Modelo_tabela=new DefaultTableModel(dados,cabeçalho);
        tabela.setModel(Modelo_tabela);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        selecao = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JButton();
        campoDigitado = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 255, 51));

        jDesktopPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDesktopPane3.setEnabled(false);
        jDesktopPane3.setOpaque(false);

        selecao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Selecione --", "Todos", "CDD", "CDU", "Titulo", "Pessoa" }));
        selecao.setToolTipText("Escolha um ítem para fazer a pesquisa");
        selecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecaoItemStateChanged(evt);
            }
        });
        selecao.setBounds(130, 10, 200, 40);
        jDesktopPane3.add(selecao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de Pesquisa:");
        jLabel3.setBounds(0, 30, 150, 20);
        jDesktopPane3.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        jLabel6.setBounds(0, 30, 130, 20);
        jDesktopPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titulo.setText(".");
        titulo.setBounds(0, 70, 130, 20);
        jDesktopPane3.add(titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBounds(-10, 70, 140, 20);
        jDesktopPane3.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pesquisar.setBackground(new java.awt.Color(0, 0, 0));
        pesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pesquisar.setForeground(new java.awt.Color(255, 255, 255));
        pesquisar.setText("Pesquisar");
        pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        pesquisar.setBounds(340, 10, 100, 100);
        jDesktopPane3.add(pesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campoDigitado.setBackground(new java.awt.Color(0, 0, 0));
        campoDigitado.setFont(new java.awt.Font("STARWARS", 0, 14)); // NOI18N
        campoDigitado.setForeground(new java.awt.Color(255, 255, 255));
        campoDigitado.setBounds(130, 60, 200, 40);
        jDesktopPane3.add(campoDigitado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBounds(630, 30, 450, 120);
        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setBounds(240, 70, 0, 0);
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10", "Título 11"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jScrollPane1.setBounds(10, 240, 1070, 240);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menu");
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        menu.setBounds(990, 200, 70, 30);
        jDesktopPane1.add(menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Personagem-05.gif"))); // NOI18N
        jLabel2.setBounds(30, 40, 120, 190);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        limpar.setBackground(new java.awt.Color(0, 0, 0));
        limpar.setForeground(new java.awt.Color(255, 255, 255));
        limpar.setText("Limpar");
        limpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        limpar.setBounds(990, 160, 70, 30);
        jDesktopPane1.add(limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTREGAR LIVRO.");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(860, 160, 120, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Fundo-05.png"))); // NOI18N
        jLabel1.setBounds(-20, 0, 1150, 500);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        
        Tela_de_Menu tlp=new Tela_de_Menu();
        this.setVisible(false);
        tlp.setVisible(true);
        
    }//GEN-LAST:event_menuActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // if (pesquisa = null){ livro não emprestado.\n Está na prateleira!}
        String Selecionado=selecao.getSelectedItem().toString();
        String Digitado=campoDigitado.getText();
        if(Selecionado.equals("Todos")){
            try {
                
                
                BD_biblioteca consultaTabela =new BD_biblioteca();
                retornou_Tabela=consultaTabela.Consulta_Para_Tabela(Selecionado, Digitado);
                
                while (retornou_Tabela.next()){
                    //titulo,autor,editora,prateleira,cdd,cdu,nome,D_emprestimo,D_devolucao,celular
                    //"Titulo","Autor","Editora","Prateleira","CDD","CDU","Usuario","Data Do Emprestimo","Data de Devulução","Telefône"
                    
                    
                    java.sql.Date dataBanco_pedido=retornou_Tabela.getDate("D_emprestimo");
                    java.sql.Date dataBanco_devolucao=retornou_Tabela.getDate("D_devolucao");
                    SimpleDateFormat formatarData =  new  SimpleDateFormat ( "dd-MM-yyyy" ); 
                    
                    String Data_emprestimos = formatarData . format (  dataBanco_pedido );
                    String Data_devolucao=    formatarData . format (dataBanco_devolucao);
                    
                Object coloca[]=
                
                    {retornou_Tabela.getInt("id"),retornou_Tabela.getString("titulo"),retornou_Tabela.getString("autor"),retornou_Tabela.getString("editora"),
                    retornou_Tabela.getString("prateleira"),retornou_Tabela.getString("cdd"),retornou_Tabela.getString("cdu"),retornou_Tabela.getString("nome"),
                    Data_emprestimos,Data_devolucao,retornou_Tabela.getString("celular")};
               
                            Modelo_tabela.addRow(coloca);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Tela_emprestados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela_emprestados.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        else if ((Selecionado.equals("-- Selecione --"))||(Digitado.equals(""))||(Digitado==null)) {
            JOptionPane.showMessageDialog(null, "Selecione a Opção e Digite o Valor a Ser Pesquisado.","***Bicad_beta***",2);
        }
        else
        {
            try {
        
                
                
                BD_biblioteca consultaTabela =new BD_biblioteca();
                retornou_Tabela=consultaTabela.Consulta_Para_Tabela(Selecionado, Digitado);
                
                while (retornou_Tabela.next()){
                
                    java.sql.Date dataBanco_pedido=retornou_Tabela.getDate("D_emprestimo");
                    java.sql.Date dataBanco_devolucao=retornou_Tabela.getDate("D_devolucao");
                    SimpleDateFormat formatarData =  new  SimpleDateFormat ( "dd-MM-yyyy" ); 
                    
                    String Data_emprestimos = formatarData . format (  dataBanco_pedido );
                    String Data_devolucao=    formatarData . format (dataBanco_devolucao);
                Object coloca[]={retornou_Tabela.getInt("id"),retornou_Tabela.getString("titulo"),retornou_Tabela.getString("autor"),retornou_Tabela.getString("editora"),
                    retornou_Tabela.getString("prateleira"),retornou_Tabela.getString("cdd"),retornou_Tabela.getString("cdu"),retornou_Tabela.getString("nome"),
                    Data_emprestimos,Data_devolucao,retornou_Tabela.getString("celular")};
                        
                        //add a linha a tabela.
                        Modelo_tabela.addRow(coloca);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Tela_emprestados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela_emprestados.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        campoDigitado.setText("");
        
        
        
        
    }//GEN-LAST:event_pesquisarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Modelo_tabela.setRowCount(0);
    }//GEN-LAST:event_limparActionPerformed

    private void selecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecaoItemStateChanged
        if (evt.getStateChange()==1) {
            String selecionado=selecao.getSelectedItem().toString();
            if (selecionado.equals("-- Selecione --")) {
                titulo.setText(".");
                
                //-- Selecione --, Todos, CDD, CDU, Titulo, Pessoa
                
            }
            else if(selecionado.equals("Todos")){
            
                titulo.setText("Clique em pesquisar");
            
            }
             else if(selecionado.equals("Pessoa")){
            
                titulo.setText("Digite o Nome");
            
            }
            else {
                 
                titulo.setText("Digite o "+selecionado);
            
            }
            
            
        }
    }//GEN-LAST:event_selecaoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Tela_pede_password solicita =new Tela_pede_password();
        this.setVisible(false);
        solicita.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_emprestados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDigitado;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton menu;
    private javax.swing.JButton pesquisar;
    private javax.swing.JComboBox selecao;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
