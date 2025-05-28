package POO;

// criar objetovos para possuir ações e interações
// Classe -> Objeto = molde do objeto
// new objeto - > nova instância
public class Pessoa {
    // Atributos = caracteristicas do obj
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Contrutor
//    public Pessoa(){
//        this.nome = "Vazio";
//        this.idade = 0;
//        this.altura = 0.0;
//        this.peso = 0.0;
//    }

    // Construtor com Atributos
    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos = Ações
    // setters(SET -> Atribuir Valor) e getters(GET -> Pegar Valor)
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }

    public double calcularImc(){
        return peso / (altura * altura);
    }

    public String classificarImc(){
        double imc = calcularImc();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return  "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade grau II";
        }else{
            return "Obesidade grau III";
        }
    }
}
