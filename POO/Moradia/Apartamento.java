package Moradia;

import java.util.Scanner;

public class Apartamento extends Moradia{
    private int numeroAndares;

    public Apartamento(String endereco, int qntPessoas, int numeroAndares){
        super(endereco, qntPessoas);
        this.numeroAndares = numeroAndares;
    }

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cadastro do Apartamento: ");
        System.out.println(" Digite o nome da rua: ");
        endereco = sc.nextLine();
        System.out.println(" Digite a quantidade de moradores: ");
        qntdPessoas = sc.nextInt();
        System.out.println(" Digite o número de andares: ");
        numeroAndares = sc.nextInt();
    }

    public String toString(){
        return " Apartamento - " + super.toString() + ", Número de Andares: " + numeroAndares;
    }
}
