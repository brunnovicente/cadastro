package aula;

import sistema.Aluno;

public class Main {

    public static void main(String[] args) {
       Pokemon charizard = new Pokemon("Fogo", "Charizard", 120, 500);
       Pokemon blastoise = new Pokemon("Água", "Blastoise", 100, 400);
       Cura c = new Cura(50);
       
       charizard.atacar(blastoise);
       charizard.atacar(blastoise);
       blastoise.atacar(charizard);
       charizard.curar(c);
       
       System.out.println(blastoise); 
       System.out.println(charizard);
    }//Fim do main
    
}//Fim da Classe Principal
