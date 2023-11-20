package sistema;

public class Aluno {
    
    private String matricula;
    private int idade;
    private String nascimento;
    
    public Aluno(String matricula, int idade, String nascimento){
        this.matricula = matricula;
        this.idade = idade;
        this.nascimento = nascimento;
    }
    
    public Aluno(){
        
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    public String estudar(String assunto, int capitulo){
        String estudando = "Estou estudando "+assunto;
        return estudando;
    }//Fim do Estudar
    
    public void jogar(){
        System.out.println("Estou jogando!");
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", idade=" + idade + ", nascimento=" + nascimento + '}';
    }

    
    
    
    
}//Fim da Classe
