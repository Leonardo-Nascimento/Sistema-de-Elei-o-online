/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eleicao.candidato;

/**
 *
 * @author Ariane
 */
public class lCandidato {
    private String lnome;
    private int lnumero;
    private int lqndVoto;

    public String getLnome() {
        return lnome;
    }

    public void setLnome(String lnome) {
        this.lnome = lnome;
    }

    public int getLnumero() {
        return lnumero;
    }

    public void setLnumero(int lnumero) {
        this.lnumero = lnumero;
    }
    
    public int getlqndVoto(){
        return lqndVoto;
    }

    public void setlqndVoto(int lqndVoto) {
        this.lqndVoto = lqndVoto;
    }
    
    
    public lCandidato(int numero,String nome) {
        this.lnome = nome;
        this.lnumero = numero;
    }

    public lCandidato(){
        
    }

    public lCandidato novoCand(int numero, String nome){
        lCandidato novocand = new lCandidato(numero, nome);
        
        return novocand;                
    }
    
    
}
