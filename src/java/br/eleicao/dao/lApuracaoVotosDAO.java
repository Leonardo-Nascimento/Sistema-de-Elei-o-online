/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.dao;

import br.eleicao.candidato.lCandidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.rngom.digested.Main;

/**
 *
 * @author Ariane
 */
public class lApuracaoVotosDAO {
        
        private ResultSet rs = null;
        private PreparedStatement ps = null;
        private Connection con = lconexaoBD.getConnection();     
        
        
    
        public  List<lCandidato> apuracaoVotos(){
            String sql ="SELECT numerovot, nomevot, COUNT(*) FROM voto  GROUP BY numerovot, nomevot  order by COUNT(*)desc";
            List <lCandidato> lista = new ArrayList();
            
                try{
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    while(rs.next()){
                    lCandidato cand = new lCandidato();
                    
                    cand.setLnumero(Integer.parseInt(rs.getString("numerovot")));
                    cand.setLnome(rs.getString("nomevot"));
                    cand.setlqndVoto(rs.getInt(3));
                                        
                    lista.add(cand);
                }
               
                }catch(Exception e){
                    System.out.println("Erro: " +e.getMessage());
                }
            return lista;
        }

           
    }
