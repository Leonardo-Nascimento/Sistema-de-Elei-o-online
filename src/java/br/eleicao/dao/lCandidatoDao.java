/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.dao;

import br.eleicao.candidato.lCandidato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Ariane
 */
public class lCandidatoDao{
        private ResultSet rs = null;
        private PreparedStatement ps = null;
        private Connection con = lconexaoBD.getConnection();
        
	public void listarCandidatos() throws SQLException{
            
          try{
                   
                if (con==null){     
                       
                   }
                       
                String sql = "select * from candidato";
		rs = ps.executeQuery(sql);

			while(rs.next()){
                            //vai dar erro , tem q ajeitar o nome das colunas depois
                            System.out.print("Nomes: "+rs.getString("nome"));
                            System.out.println(" Número: "+rs.getString("numero"));               
                        }                
		}
                
		catch (Exception e){
			System.err.println ("Erro ao executar query!!!");
			System.out.println(e.getMessage());

		}finally{
                           // con.close(); 
                          }

        }

	public boolean inserirCandidato(int numero, String nome) throws SQLException{
		
                boolean verificaNumCand = false;
                int numerocand = numero;
                String nomecand = nome;
		String sql = "select numeroCand from candidato where numeroCand ="+numero;
                try{                                      
                    
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    if(rs.next()== true){
                        verificaNumCand = true;
                    }else{
                        sql = "insert into candidato values(?,?)";
                        
                        ps = con.prepareStatement(sql);
                        ps.setInt(1,numerocand);
                        ps.setString(2,nomecand);                                        
                        ps.executeUpdate();
                    
                    }
                }catch (Exception e){
			System.err.println ("Não foi possível inserir os valores");
			System.out.println(e.getMessage());
			e.printStackTrace();
                        //con.close();
		}
                return verificaNumCand;
        }





        public boolean votacao(lCandidato candidato){
        boolean votado = false;
        int numerocand = 0;
        String nomecand = null;
        lCandidato cand = null;
        
        
            try{	
                    cand = candidato;
                    numerocand = cand.getLnumero();
                    nomecand = cand.getLnome();
                
                    String sql = "insert into voto values(?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setInt(1,numerocand);
                    ps.setString(2,nomecand);                                        
                    ps.executeUpdate();
                    votado = true;
                // criação de um novo objeto lCandidato com os valores trazidos do banco
                
                
            }catch (Exception e){
			System.err.println ("Não foi possível inserir os valores");
			System.out.println(e.getMessage());
			e.printStackTrace();
            
                }
            
            return votado;
            
        }
        
        public lCandidato verificaCand(int numero){
        String sql = "select * from  candidato where numerocand =" +numero ;            
        
        int numerocand = 0;
        String nomecand = null;
        lCandidato cand = null;
            try{    
                ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
                if(rs.next()== true){
                numerocand = Integer.parseInt(rs.getString("numerocand"));
                nomecand = rs.getString("nomecand");
                cand = new lCandidato(numerocand, nomecand);
                }
        
                }catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();            
                }
                
                return cand;
        
        }


}
        
        
        
        

