
package br.eleicao.usuario;

public class lUsuario {
    private String nome;
    private String email;
    private String senha;
    
    public lUsuario(){
        
    }
    
    public lUsuario(String emailUsu, String senhaUsu) {
       this.email = emailUsu;
       this.senha = senhaUsu;
    }
    
    public lUsuario(String nomeUsu,String emailUsu, String senhaUsu) {
       this.nome = nomeUsu;
       this.email = emailUsu;
       this.senha = senhaUsu;
    }
    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
