package Game;

import java.util.Scanner;

    public class Mago extends Personagem {

    public Mago(String nome, int nivel){
        super(nome, nivel);
    }

    @Override
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cadastro do personagem: ");
        System.out.println(" Digite o nome: ");
        nome = sc.nextLine();
        System.out.println(" Digite o nivel: ");
        nivel = sc.nextInt();
    }

    public String toString(){
        return " Mago - " + super.toString();
    }
}

