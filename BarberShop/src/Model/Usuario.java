/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Matheus Bezerra
 */
public class Usuario extends Pessoa {
   
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String cpf, String senha) {
        super(id, nome, cpf);
        this.senha = senha;
    }

    public Usuario(int id, String nome,char sexo, String dataNascimento, String telefone,  String email, String cpf,  String senha,String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
  
   
    
    
}
