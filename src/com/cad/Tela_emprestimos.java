package com.cad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_emprestimos extends javax.swing.JFrame {
// declaração de variáveis
  
    ResultSet retornou_consulta,Retorna_consulta_combobox,Retorna_consulta_combobox_cdd;
    
    String dataa;
    String consulta_titulo,
            consulta_autor,
            consulta_editora,
            consulta_cdd,
            consulta_cdu;
    
    public Tela_emprestimos() {
        
        initComponents();
        
        //configurações tela
        setResizable(false);
        this.setLocationRelativeTo(null);
        //fim
        
        //configurações das seleções
        
        
        //deixa os campos centralizados
            
            Texto_cdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            Texto_cdu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            Campo_Altor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            Campo_Editora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            Campo_prateleira.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            
        //fim centralizado.
        
//remover seleção
        
               int limpaTitulo=Selec_Título.getItemCount();
               for (int i=limpaTitulo;i !=1;i--) {
                    
                   Selec_Título.removeItemAt(1);
        }      

        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        Texto_cdd = new javax.swing.JTextField();
        Texto_cdu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Campo_Altor = new javax.swing.JTextField();
        Campo_Editora = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Selec_Título = new javax.swing.JComboBox();
        Texto_titulo = new javax.swing.JTextField();
        Campo_prateleira = new javax.swing.JTextField();
        bt_pesquisa = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        Data_devolucao = new com.toedter.calendar.JDateChooser();
        Data_emprestimos = new com.toedter.calendar.JDateChooser();
        Campo_celular = new javax.swing.JFormattedTextField();
        Campo_nome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fundo1 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        fundo3 = new javax.swing.JLabel();
        fundo4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bt_finalizar = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        bt_Limpar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();

        jDesktopPane2.setBackground(new java.awt.Color(102, 255, 102));
        jDesktopPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jDesktopPane2.setEnabled(false);
        jDesktopPane2.setOpaque(false);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("CDD:");
        jLabel4.setBounds(40, 180, 50, 20);
        jDesktopPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("CDU:");
        jLabel5.setBounds(40, 220, 50, 20);
        jDesktopPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Título:");
        jLabel6.setBounds(40, 20, 50, 20);
        jDesktopPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField3.setBounds(80, 210, 210, 30);
        jDesktopPane2.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Altor:");
        jLabel7.setBounds(40, 60, 50, 20);
        jDesktopPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Editora:");
        jLabel8.setBounds(30, 100, 50, 20);
        jDesktopPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Numero da");
        jLabel9.setBounds(10, 130, 70, 20);
        jDesktopPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Prateleira");
        jLabel10.setBounds(10, 140, 60, 20);
        jDesktopPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField8.setBounds(80, 10, 340, 30);
        jDesktopPane2.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField6.setBounds(80, 50, 340, 30);
        jDesktopPane2.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField9.setBounds(80, 90, 340, 30);
        jDesktopPane2.add(jTextField9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField10.setBounds(80, 170, 210, 30);
        jDesktopPane2.add(jTextField10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setBackground(new java.awt.Color(102, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a prateleira", "Prateleira 1", "Prateleira 2", "Prateleira 3", "Prateleira 4", "Prateleira 5", "Prateleira 6", "Prateleira 7" }));
        jComboBox1.setAutoscrolls(true);
        jComboBox1.setBounds(80, 130, 210, 30);
        jDesktopPane2.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 255, 51));

        jDesktopPane3.setBackground(new java.awt.Color(102, 255, 102));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane3.setEnabled(false);
        jDesktopPane3.setOpaque(false);

        Texto_cdd.setEditable(false);
        Texto_cdd.setBackground(new java.awt.Color(64, 18, 14));
        Texto_cdd.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cdd.setBounds(80, 80, 210, 30);
        jDesktopPane3.add(Texto_cdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Texto_cdu.setEditable(false);
        Texto_cdu.setBackground(new java.awt.Color(153, 153, 153));
        Texto_cdu.setBounds(80, 120, 210, 30);
        jDesktopPane3.add(Texto_cdu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("CDD:");
        jLabel11.setBounds(50, 80, 50, 20);
        jDesktopPane3.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("CDU:");
        jLabel12.setBounds(50, 120, 50, 20);
        jDesktopPane3.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Título:");
        jLabel13.setBounds(40, 50, 50, 20);
        jDesktopPane3.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Campo_Altor.setEditable(false);
        Campo_Altor.setBackground(new java.awt.Color(64, 18, 14));
        Campo_Altor.setForeground(new java.awt.Color(255, 255, 255));
        Campo_Altor.setBounds(80, 240, 210, 30);
        jDesktopPane3.add(Campo_Altor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Campo_Editora.setEditable(false);
        Campo_Editora.setBackground(new java.awt.Color(153, 153, 153));
        Campo_Editora.setBounds(80, 200, 210, 30);
        jDesktopPane3.add(Campo_Editora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Altor:");
        jLabel14.setBounds(30, 250, 50, 20);
        jDesktopPane3.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Editora:");
        jLabel15.setBounds(20, 210, 50, 20);
        jDesktopPane3.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Numero da");
        jLabel16.setBounds(20, 160, 70, 20);
        jDesktopPane3.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Prateleira");
        jLabel17.setBounds(20, 170, 60, 20);
        jDesktopPane3.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Selec_Título.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        Selec_Título.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Selec_TítuloItemStateChanged(evt);
            }
        });
        Selec_Título.setBounds(80, 40, 210, 30);
        jDesktopPane3.add(Selec_Título, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Texto_titulo.setBounds(290, 40, 130, 30);
        jDesktopPane3.add(Texto_titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Campo_prateleira.setEditable(false);
        Campo_prateleira.setBackground(new java.awt.Color(64, 18, 14));
        Campo_prateleira.setForeground(new java.awt.Color(255, 255, 255));
        Campo_prateleira.setBounds(80, 160, 210, 30);
        jDesktopPane3.add(Campo_prateleira, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_pesquisa.setBackground(new java.awt.Color(0, 0, 0));
        bt_pesquisa.setForeground(new java.awt.Color(255, 255, 255));
        bt_pesquisa.setText("Pesquisar");
        bt_pesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });
        bt_pesquisa.setBounds(300, 120, 120, 110);
        jDesktopPane3.add(bt_pesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel29.setText("jLabel24");
        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Do Lívro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jLabel29.setBounds(0, 0, 430, 290);
        jDesktopPane3.add(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel30.setText("jLabel24");
        jLabel30.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel31.setText("jLabel24");
        jLabel31.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel32.setText("jLabel24");
        jLabel32.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel33.setText("jLabel24");
        jLabel33.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel34.setText("jLabel24");
        jLabel34.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel35.setText("jLabel24");
        jLabel35.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_1 - Cópia.png"))); // NOI18N
        jLabel36.setText("jLabel24");
        jLabel36.setBounds(-10, -10, 450, 310);
        jDesktopPane3.add(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBounds(250, 90, 430, 290);
        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 0)));
        jDesktopPane4.setEnabled(false);
        jDesktopPane4.setOpaque(false);
        Data_devolucao.setBounds(160, 130, 130, 30);
        jDesktopPane4.add(Data_devolucao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Data_emprestimos.setBounds(160, 80, 130, 30);
        jDesktopPane4.add(Data_emprestimos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        try {
            Campo_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_celular.setBounds(160, 170, 130, 30);
        jDesktopPane4.add(Campo_celular, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Campo_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_nomeActionPerformed(evt);
            }
        });
        Campo_nome.setBounds(70, 40, 220, 30);
        jDesktopPane4.add(Campo_nome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Data de Devolução:");
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel21.setBounds(20, 130, 130, 30);
        jDesktopPane4.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Celular:");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel20.setBounds(20, 170, 60, 30);
        jDesktopPane4.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Empréstimo");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel19.setBounds(20, 100, 80, 17);
        jDesktopPane4.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nome:");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel18.setBounds(20, 50, 40, 17);
        jDesktopPane4.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setBounds(20, 80, 60, 17);
        jDesktopPane4.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        fundo.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(fundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        jLabel24.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        jLabel2.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        fundo1.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(fundo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        fundo2.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(fundo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        fundo3.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(fundo3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fundo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Cor_2 - Cópia.png"))); // NOI18N
        fundo4.setBounds(-10, -10, 370, 250);
        jDesktopPane4.add(fundo4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBounds(700, 110, 340, 230);
        jDesktopPane1.add(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Balao-tela4.png"))); // NOI18N
        jLabel22.setBounds(10, 100, 200, 240);
        jDesktopPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_finalizar.setBackground(new java.awt.Color(0, 0, 0));
        bt_finalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_finalizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_finalizar.setText("Concluir emprestimo.");
        bt_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_finalizarActionPerformed(evt);
            }
        });
        bt_finalizar.setBounds(700, 360, 340, 70);
        jDesktopPane1.add(bt_finalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_menu.setBackground(new java.awt.Color(0, 0, 0));
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        bt_menu.setBounds(120, 420, 90, 30);
        jDesktopPane1.add(bt_menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bt_Limpar.setBackground(new java.awt.Color(0, 0, 0));
        bt_Limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Limpar.setText("Limpar");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });
        bt_Limpar.setBounds(120, 390, 90, 30);
        jDesktopPane1.add(bt_Limpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Personagem-04.gif"))); // NOI18N
        jLabel23.setBounds(30, 320, 100, 150);
        jDesktopPane1.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cad/Fundo-04.png"))); // NOI18N
        ver.setBounds(-100, -80, 1260, 650);
        jDesktopPane1.add(ver, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimparActionPerformed

        //apagar campos de textos primeiro painel
        Texto_cdd.setText("");
        Texto_cdu.setText("");
        Texto_titulo.setText("");
        Campo_prateleira.setText("");
        Campo_Editora.setText("");
        Campo_Altor.setText("");
        // fim apagar campos de texto.

        //apagar combobox's
        int java=Selec_Título.getItemCount();
        for (int i=java;i !=1;i--) {

            Selec_Título.removeItemAt(1);
        }
        //fim apagar Combobox

        //apagar segundo painel
        Campo_nome.setText("");
        Campo_celular.setText("");

        Data_emprestimos.setDate(null);
        Data_devolucao.setDate(null);

    }//GEN-LAST:event_bt_LimparActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed

        Tela_de_Menu tlp=new Tela_de_Menu();
        this.setVisible(false);
        tlp.setVisible(true);

    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_finalizarActionPerformed
        try {
            //transforma data normal em data de sql
            java.util.Date dataEmprestimo,dataDevolucao;
            dataEmprestimo=Data_emprestimos.getDate();
            dataDevolucao=Data_devolucao.getDate();
            java.sql.Date dataSql1 = new java.sql.Date (dataEmprestimo.getTime ());
            java.sql.Date datasql2 = new java.sql.Date(dataDevolucao.getTime());
            //fim data.
            //primeiro conteiner

            String Titulo=Selec_Título.getSelectedItem().toString();
            String Cdd=Texto_cdd.getText();
            String Cdu=Texto_cdu.getText();
            String Prateleira=Campo_prateleira.getText();
            String Editora=Campo_Editora.getText();
            String Autor=Campo_Altor.getText();

            //fim p.c.

            //segindo conteiner
            String Nome=Campo_nome.getText();
            String Celular=Campo_celular.getText();
            // titulo,autor,editora,prateleira,cdd,cdu,nome,D_emprestimo,D_devolucao,celular

            BD_biblioteca bancoSalvarEmprestimo = new BD_biblioteca();
            bancoSalvarEmprestimo.Gerar_emprestimos_livro(Titulo,Autor,Editora,Prateleira,Cdd,Cdu,Nome,dataSql1,datasql2,Celular);
            
            bancoSalvarEmprestimo.conexão.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_emprestimos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_emprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bt_finalizarActionPerformed

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed

        String título = Texto_titulo.getText();
        //String autor = "" + Selec_Autor.getSelectedItem();
        //String editora = "" + Selec_Editora.getSelectedItem();
        String CDD = Texto_cdd.getText();
        String CDU = Texto_cdu.getText();

        String opcao="";
        String digitado="";
        boolean retornoResultSet = false;

        //ok
        if ((título.equals("null")||(título.equals("")))&&/*((autor.equals("null"))||(autor.equals("")))&&((editora.equals("null"))||(editora.equals("")))&&*/
            ((CDD.equals("null"))||CDD.equals(""))&&((CDU.equals("null"))||(CDU.equals("")))) {
            JOptionPane.showMessageDialog(null, "Preencha algum Título \n Para Clicar em Pesquisar.","***Bicad_beta***",2);
        }

        //ok

        //problema de incompatibilidade resolvido no dia 29/01/2014

        else if ((!título.equals("null")||(!título.equals("")))&&/*((autor.equals("null"))||(autor.equals("")))&&((editora.equals("null"))||(editora.equals("")))&&*/
            ((CDD.equals("null"))||CDD.equals(""))&&((CDU.equals("null"))||(CDU.equals("")))) {

            //chama a class de conxão e com título
            //select * from nomedatabela where nome da coluna like "digitadopelousuário%";   //isso faz com que o que for digitado pelo usuário seja usado para pesquisar
            //prencher os outros campos com os dados consultados

            int java=Selec_Título.getItemCount();
            for (int i=java;i !=1;i--) {

                Selec_Título.removeItemAt(1);
            }

            try {

                opcao="titulo";
                digitado=Texto_titulo.getText();

                BD_biblioteca banco = new BD_biblioteca();
                retornou_consulta=banco.Fazer_consulta_de_livros(opcao, digitado);

                //    Selec_Título.addItem("Selecione o Título");
                while(retornou_consulta.next()){

                    Selec_Título.addItem(retornou_consulta.getString("titulo"));
                    retornoResultSet = true;

                }

                if (!retornoResultSet) {
                    JOptionPane.showMessageDialog(null, "Título Ainda não Cadastrado.","***Bicad_beta***",2);
                    int javaa=Selec_Título.getItemCount();
                    for (int i=javaa;i !=1;i--) {

                        Selec_Título.removeItemAt(1);
                    }
                }

                else{

                    Selec_Título.setSelectedIndex(0);
                    banco.conexão.close();
                    JOptionPane.showMessageDialog(null, "Consulta Concluída!!!\n\nSelecione Um Título","***Bicad_beta***",1);

                }
                banco.conexão.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "erro na consulta: título.");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "erro na consulta: título.");
            }

        }

        //fim do botão pesquisa
    }//GEN-LAST:event_bt_pesquisaActionPerformed

//Pesquisa Banco de dados Por ìtem de titulo selecionado
    private void Selec_TítuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Selec_TítuloItemStateChanged

        String verTitulo=""+Selec_Título.getSelectedItem();

        if (!verTitulo.equals("Selecione")) {

            //(evt.getStageChange()==1) faz com que o jCombobox execute apenas um vez.
            if (evt.getStateChange()==1) {
                try {
                    BD_biblioteca b_biblioteca=new BD_biblioteca();
                    Retorna_consulta_combobox=b_biblioteca.Coonsulta_do_Combobox_titulo(verTitulo);

                    Texto_cdd.setText("");
                    Texto_cdu.setText("");

                    while(Retorna_consulta_combobox.next()){

                        Texto_cdd.setText(Retorna_consulta_combobox.getString("cdd"));

                        Texto_cdu.setText(Retorna_consulta_combobox.getString("cdu"));

                        String prateleira=Retorna_consulta_combobox.getString("prateleira");
                        Campo_prateleira.setText(prateleira);

                        String editoraa=Retorna_consulta_combobox.getString("editora");
                        Campo_Editora.setText(editoraa);

                        String autor = Retorna_consulta_combobox.getString("autor");
                        Campo_Altor.setText(autor);

                    }

                    Texto_titulo.setText("");
                    BD_biblioteca bancodd=new BD_biblioteca();
                    bancodd.conexão.close();

                } catch (SQLException ex) {
                    Logger.getLogger(Tela_emprestimos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Tela_emprestimos.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        else{
            if (evt.getStateChange()==1) {
                System.out.println("");

            }

        }
    }//GEN-LAST:event_Selec_TítuloItemStateChanged

    private void Campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_nomeActionPerformed

    
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
            java.util.logging.Logger.getLogger(Tela_emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_emprestimos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_Altor;
    private javax.swing.JTextField Campo_Editora;
    private javax.swing.JFormattedTextField Campo_celular;
    private javax.swing.JTextField Campo_nome;
    private javax.swing.JTextField Campo_prateleira;
    private com.toedter.calendar.JDateChooser Data_devolucao;
    private com.toedter.calendar.JDateChooser Data_emprestimos;
    private javax.swing.JComboBox Selec_Título;
    private javax.swing.JTextField Texto_cdd;
    private javax.swing.JTextField Texto_cdu;
    private javax.swing.JTextField Texto_titulo;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JButton bt_finalizar;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundo1;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundo3;
    private javax.swing.JLabel fundo4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
