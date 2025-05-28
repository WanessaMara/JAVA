package ClasseAbstrata;

public abstract class Funcionario {
    private String nome;
    protected double salario;

    public abstract double getBonus();

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
}
