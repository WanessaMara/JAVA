package ProvaPratica;

public class Aluno {
    // class private
    private int matricula; // dados da matricula

    private String nome; // dados do nome do aluno

    private float media; // dados da media

    Aluno(int matricula, String nome){  // atribui int e String para matricula e nome
        this.matricula = matricula;
        this.nome = nome;
    }
    public void setNome (String nome) {  // atribui tanto nome e matricula um set e get
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }

    // verificar matricula
    public void verificarMatricula(){
        System.out.printf("Matricula: %d%n ", matricula);
    }
    // classe calcular media do aluno
    public float calcularMedia(float nota1, float nota2){
        this.media = (nota1 + nota2) / 2;
        return media;
    }
    // metodo toString
    public String toString(){
        return "Aluno - " +
                "Nome: " + getNome() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Média: " + media + ")";
    }
}
