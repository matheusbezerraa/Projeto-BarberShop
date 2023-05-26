/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Matheus Bezerra
 */
public class Main {
    
    public static void main(String[]args){
        String nome = "Matheus";    
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
         System.out.println(servico.getDescricao());
         System.out.println(servico.getValor());
         
         Cliente cliente = new Cliente("Rua doutor Machado 434", "5204020",1,"Matheus","00188997229");
          System.out.println(cliente.getNome());
          
         Usuario usuario = new Usuario(1, "barbeiro", "00188997229", "1234"); 
          System.out.println(usuario.getNome());
          
          Agendamento agendamento = new Agendamento(1,cliente,servico,0,"30/08/2024 09:15");
          System.out.println(agendamento.getCliente().getCpf());
          
              
    }
    
}
