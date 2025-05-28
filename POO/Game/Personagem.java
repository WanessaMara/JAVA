package Game;

public abstract class Personagem {
    protected String nome;
    protected int nivel;

    // public para confirmar os atributos
    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    // criação da class abstrata
    public abstract void cadastrar();

    // to String para impriri o resultado da class
    public String toString(){
        return " Nome: " + nome + ", Nivel: " + nivel;
    }
}