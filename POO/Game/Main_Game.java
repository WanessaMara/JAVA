package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Game {
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Cadastro Arqueiro
        System.out.println("Quantos personagens arqueiros deseja cadastrar?");
        int numArqueiro = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente

        for (int i = 0; i < numArqueiro; i++) {
            System.out.println("Digite o nome do personagem:");
            String nome = sc.nextLine();
            System.out.println("Digite o nível do personagem:");
            int nivel = Integer.parseInt(sc.nextLine());

            personagens.add(new Arqueiro(nome, nivel));
        }

        // Cadastro Cavaleiro
        System.out.println("Quantos personagens cavaleiros deseja cadastrar?");
        int numCavaleiro = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCavaleiro; i++) {
            System.out.println("Digite o nome do personagem:");
            String nome = sc.nextLine();
            System.out.println("Digite o nível do personagem:");
            int nivel = Integer.parseInt(sc.nextLine());

            personagens.add(new Cavaleiro(nome, nivel));
        }

        // Cadastro Mago
        System.out.println("Quantos personagens magos deseja cadastrar?");
        int numMago = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numMago; i++) {
            System.out.println("Digite o nome do personagem:");
            String nome = sc.nextLine();
            System.out.println("Digite o nível do personagem:");
            int nivel = Integer.parseInt(sc.nextLine());

            personagens.add(new Mago(nome, nivel));
        }

        System.out.println("Personagens Cadastrados:");
        for (Personagem personagem : personagens) {
            System.out.println(personagem);
        }

    }
}


