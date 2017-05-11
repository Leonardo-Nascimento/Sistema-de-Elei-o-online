
package br.eleicao.dao;

import br.eleicao.candidato.lCandidato;
import br.eleicao.servlet.lAddUsuario;
import br.eleicao.usuario.lUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class lUsuarioDao {
    
        private ResultSet rs = null;
        private PreparedStatement ps = null;
        private Connection con = lconexaoBD.getConnection();
        
        public boolean inserirUsuario(String nome,String email, String senha) throws SQLException{
		
                boolean inseriUsu = false;
                String nomeUsu = nome;
                String emailUsu = email;
                String senhaUsu = senha;
                
                try{
                    String sql = "insert into usuario values(?,?,?)";
                        
                        ps = con.prepareStatement(sql);
                        ps.setString(1,nomeUsu);
                        ps.setString(2,emailUsu);
                        ps.setString(3,senhaUsu);                                        
                        ps.executeUpdate();
                        inseriUsu = true;
                }catch (Exception e){
			System.err.println ("Não foi possível inserir os valores");
			System.out.println(e.getMessage());
			e.printStackTrace();
                        //con.close();
		}
                return inseriUsu;
        }
        
        public lUsuario verificaUsuario(String email){
        String sql = "select * from usuario where email = '"+email+"'";            
        String emailUsu = null;
        String senhaUsu = null;
        lUsuario usu = null;
            try{    
                ps = con.prepareStatement(sql);               
		rs = ps.executeQuery();
                if(rs.next()== true){
                   emailUsu = rs.getString("email");
                   senhaUsu = rs.getString("senha");
                   usu = new lUsuario(emailUsu, senhaUsu);
                   
                }   
                
                }catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();            
                }
                
                return usu;
        
        }
        
        public lUsuario altenticaUsuario(lUsuario usuario){
        String sql = "select * from usuario where email = ? and senha = ?";
        String nomeUsu;
        String emailUsu;
        String senhaUsu;
        lUsuario usuarioRetorno = null;
            try{
                ps = con.prepareStatement(sql);               
                ps.setString(1,usuario.getEmail());
                ps.setString(2,usuario.getSenha());                
		rs = ps.executeQuery();
                if(rs.next()== true){
                    nomeUsu = rs.getString("nome");
                    emailUsu = rs.getString("email");
                    senhaUsu = rs.getString("senha");
                   usuarioRetorno = new lUsuario(nomeUsu, emailUsu, senhaUsu);                   
                }   
                
                }catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();            
                }
                
                return usuarioRetorno;
        
        }
        
}
