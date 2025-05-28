package ProvaPratica;

import java.util.Scanner;

public class PrincipalGato {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        String raca;
        String corOlhos;

        System.out.println(" Digite o nome do gato: ");
        nome = sc.next();
        System.out.println(" Digite a raça do seu gato: ");
        raca = sc.next();
        System.out.println(" Digite a cor dos olhos: ");
        corOlhos = sc.next();

        Gato gato1 = new Gato(nome, raca, corOlhos);
        gato1.verificarRaca();
        gato1.verificarCorOlhos();
        System.out.println(gato1.toString());

        sc.close();
    }
}
