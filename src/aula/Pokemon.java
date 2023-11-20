package aula;

public class Pokemon {
    
    private String tipo;
    private String nome;
    private int ataque;
    private int vida;
    
    public Pokemon(String tipo, String nome, int ataque, int vida){
        this.tipo = tipo;
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }
    
    public void curar(Cura cura){
        this.vida += cura.getValor();
    }
    
    public void atacar(Pokemon inimigo){
        int vidaInimigo = inimigo.getVida();
        vidaInimigo -= this.ataque;
        inimigo.setVida(vidaInimigo);
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "tipo=" + tipo + ", nome=" + nome + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
    
}//Fim da classe
