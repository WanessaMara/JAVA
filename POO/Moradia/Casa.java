package Moradia;

import java.util.Scanner;

public class Casa extends Moradia{
    private int numeroQuartos;

    public Casa(String endereco, int qntPessoas, int numeroQuartos){
        super(endereco, qntPessoas);
        this.numeroQuartos = numeroQuartos;
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cadastro da casa: ");
        System.out.println(" Digite o nome da sua rua: ");
        endereco = sc.nextLine();
        System.out.println(" Digite a quantidade de moradores: ");
        qntdPessoas = sc.nextInt();
        System.out.println(" Digite o número de quartos da casa: ");
        numeroQuartos = sc.nextInt();

    }
        public String toString(){
            return " Casa - " + super.toString() + ", Número de Quartos: " + numeroQuartos;
        }

    }

