
package com.cad;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Chaves
 */
public class BD_biblioteca {
    
    Connection conexão;
    Statement comandoBD;
    ResultSet retorna;
    //java.sql.Date data1,data2;
    

    
    String nome_do_banco="Biblioteca_cad";
    
    public BD_biblioteca() throws ClassNotFoundException {
       
            Class.forName("com.mysql.jdbc.Driver");
       
            try {
                
            conexão=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+nome_do_banco,"root","bancodedados");    
            comandoBD=conexão.createStatement();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "erro na conexão com o banco de dados");
            }

}

  
    //tela1 de cadastro
    public void cadastar_livro( String titulo, String autor, String editora, String prateleira, String cdd, String cdu ){
    
        
        try {
            comandoBD.executeUpdate("insert into cadastro (titulo,autor,editora,prateleira,cdd,cdu) values('"+titulo+"','"+autor+"','"+editora+"','"+prateleira+"','"+cdd+"','"+cdu+"');");
            conexão.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso","***Bicad_beta***",1);
            JOptionPane.showMessageDialog(null, "Título: "+titulo+"\n"+"Autor: "+autor+"\n"+"Editora: "+editora+"\n"+prateleira+"\n"+"CDD: "+cdd+"\n"+"CDU "+cdu,"***Bicad_beta***",1);
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    //ver livros
    
    public ResultSet Fazer_consulta_de_livros(String consultar_por ,String conteudo_digitado) throws SQLException{
       
        
        switch (consultar_por) {
        
            case "titulo":
                try {
                
                retorna=comandoBD.executeQuery("select titulo from cadastro where titulo like '"+conteudo_digitado+"%';");
                
                
               }
                     catch (SQLException ex) {}
                break;
                
                
//            case "autor":
//                try {
//                
//                retorna=comandoBD.executeQuery("select * from cadastro where autor like '"+conteudo_digitado+"%';");
//                
//               }
//                     catch (SQLException ex) {}
//                break;
//            case "editora":
//                try {
//                
//                retorna=comandoBD.executeQuery("select * from cadastro where editora like '"+conteudo_digitado+"%';");
//                
//               }
//                     catch (SQLException ex) {}
//                
//                break;
                
            case "cdd":
                try {
                
                retorna=comandoBD.executeQuery("select * from cadastro where cdd like '"+conteudo_digitado+"%';");
                
               }
                     catch (SQLException ex) {}
                
                break;
            case "cdu":
                try {
                
                retorna=comandoBD.executeQuery("select * from cadastro where cdu like '"+conteudo_digitado+"%';");
                
               }
                     catch (SQLException ex) {}
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Erro na Consulta","***Bicad_beta***",2);
                break;
        }
  
    //conexão.close();
    return retorna;
    
    
 
    
    }
    
    public ResultSet Coonsulta_do_Combobox_titulo(String títuloCBB){
        try {
            retorna=comandoBD.executeQuery("select * from cadastro where titulo = '"+títuloCBB+"';");
            //conexão.close(); 
                
                
           
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
         return retorna;
    }
    
    //salva no banco de dados um emprestimo de livro. 
    public void Gerar_emprestimos_livro(String Titulo,String Autor,String Editora, String Prateleira,String Cdd,String Cdu,String Nome,Date data_emprestimo,
            Date data_devolucao,String Celular){
       
        try {
          
            
            comandoBD.executeUpdate("insert into emprestimos (titulo,autor,editora,prateleira,cdd,cdu,nome,D_emprestimo,D_devolucao,celular) values('"+Titulo+"',"
            + "'"+Autor+"','"+Editora+"','"+Prateleira+"','"+Cdd+"','"+Cdu+"','"+Nome+"','"+data_emprestimo+"','"+data_devolucao+"','"+Celular+"');");
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!!","***Bicad_beta***",0);
            
            conexão.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /*
    
    Inicio da tela de localiz~ção de livros emprestados.
    
    */
    
    public ResultSet Consulta_Para_Tabela(String Opcao,String Escrito){
        
        if (Opcao.equals("Todos")) {
        
            try {
                        
                retorna=comandoBD.executeQuery("select * from emprestimos;");
            
            } catch (SQLException ex) {
                Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if(Opcao.equals("CDD")){
            try {        
                retorna=comandoBD.executeQuery("Select * from emprestimos where cdd = '"+Escrito+"';");
            } catch (SQLException ex) {
                Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        else if(Opcao.equals("CDU")){
            
            try {        
                retorna=comandoBD.executeQuery("Select * from emprestimos where cdu = '"+Escrito+"';");
            } catch (SQLException ex) {
                Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else if(Opcao.equals("Titulo")){
        
            try {        
                
                retorna=comandoBD.executeQuery("Select * from emprestimos where titulo = '"+Escrito+"';");
            } catch (SQLException ex) {
              //  JOptionPane.showMessageDialog(null, "erro");
            }
        
        
        }
        else if(Opcao.equals("Pessoa")){
            try {        
                retorna=comandoBD.executeQuery("Select * from emprestimos where nome = '"+Escrito+"';");
            } catch (SQLException ex) {
                Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
        
        return retorna;
    }
    public ResultSet chave(){
        
        try {
           
           retorna= comandoBD.executeQuery("select * from senha;");
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorna;
        
        }
    
    public ResultSet entrega_livro_id(int id){
        try {
          
           retorna = comandoBD.executeQuery("select * from emprestimos where id = "+id+";");
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorna;
    
    }
    public void entrega_livro_exclusao_confirmada(int id){
        try {    
            
            comandoBD.executeUpdate("delete from emprestimos where id="+id+" ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public ResultSet Pega_prateleira(String opcao,String Digitado){
        
        
        
        try {
            JOptionPane.showMessageDialog(null, opcao+" "+Digitado);
            retorna=comandoBD.executeQuery("select * from emprestimos where "+opcao+" = '"+Digitado+"'; ");
            
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return retorna;
    }
    public ResultSet Conversao(String opcao,String Digitado){
        try {
            retorna=comandoBD.executeQuery("select * from emprestimos where "+opcao+" = "+Digitado+";");
        } catch (SQLException ex) {
            Logger.getLogger(BD_biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return retorna;
    }
}
