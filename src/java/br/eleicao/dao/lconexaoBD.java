/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lconexaoBD {
        
        private static Connection con = null;	
	
        
    
    public  lconexaoBD(){
		
	}
    
    
    public static Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/dbEleicao";
		String usuario = "postgres";
		String senha = "123456";
		String Driver = "org.postgresql.Driver";    
                
                try
		{
			Class.forName (Driver);
                        con = DriverManager.getConnection (url, usuario,senha);
                        
                        con.setAutoCommit(true);
                       // st = con.prepareStatement(sql);
			System.out.println ("Conexão com o BD realizado com sucesso!");
			
		}
		catch (Exception e){        
			System.err.println ("Não foi possível estabelecer conexão com o BD");
			System.out.println(e.getMessage());
		}
        return con;
    }

	public void FecharConexao(){ 

		try {
			con.close ();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println ("Conexão finalizada");

	}
}





