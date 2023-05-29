/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author Matheus Bezerra
 */
public class LoginHelper implements IHelper{
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
    String nome = view.getTextUsuario().getText();
    String senha = new String(view.getTextSenha().getPassword()); // Observe que estamos usando getPassword() em vez de getText() para obter a senha como uma matriz de caracteres
    
    Usuario modelo = new Usuario(0, nome, "", senha); // Observe que estamos passando as variáveis nome e senha para criar o objeto Usuario
    return modelo;
}
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
