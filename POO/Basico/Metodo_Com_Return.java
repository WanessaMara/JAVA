package Basico;

import java.util.Scanner;

public class Metodo_Com_Return {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.println(" Digite um número: ");
        numero = teclado.nextInt();

        int resultado = calcularDobro(numero);

        System.out.println(" O dobro do número é: " + resultado);

        teclado.close();
    }

    public static int calcularDobro(int numero){

        int dobro = numero * 2;

        return dobro;
    }
}
