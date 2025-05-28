package Moradia;

public abstract class Moradia {
    protected String endereco;
    protected int qntdPessoas;

    // public para confirmar os atributos
    public Moradia(String endereço, int qntdPessoas){
        this.endereco = endereço;
        this.qntdPessoas = qntdPessoas;
    }

    // criação da class abstrata
    public abstract void cadastrar();

    // to String para impriri o resultado da class
    public String toString(){
        return " Endereço: " + endereco + ", Quantidade de Pessoas: " + qntdPessoas;
    }
}
