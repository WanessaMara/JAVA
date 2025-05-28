package Basico;

import java.util.Scanner;

public class Metodos {
    public static void main (String [] arags) {
        Scanner teclado = new Scanner(System.in);

    System.out.println(" Digite um número: ");
    int numero, dobro;

    numero = teclado.nextInt();
    // dobro = numero 8 2;

    String mensagem = " Chama papai! ";

    teste(mensagem);

    calcularDobro(numero);

    teclado.close();
    }

    public static void calcularDobro(int numero){
        int dobro;

        dobro = numero * 2;

        System.out.println(" O dobro é: " + dobro);
    }

    public static void teste(String mensagem){

        System.out.println(mensagem);
    }



}

