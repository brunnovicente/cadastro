package modelo;

import java.util.ArrayList;

public class Banco {
    
    private ArrayList<Cliente> clientes;
    private int chave;
    
    public Banco(){
        this.clientes = new ArrayList();
        this.chave = 1;
    }
    
    public void cadastrar(Cliente c){
        c.setId(chave);
        this.clientes.add(c);
        this.chave++;
    }
    
    public ArrayList<Cliente> consulta(){
        return this.clientes;
    }
    
    public void excluir(int id){
        
    }
    
    public void editar(Cliente cliente){
        
    }
    
    public void imprimir(){
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente);
        }
    }//Fim do imprimir
    
}//Fim da Classe Banco
