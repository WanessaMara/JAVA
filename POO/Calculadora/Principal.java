package Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um número: ");
        float numero = sc.nextFloat();

        // criação de um objeto da classe calculadora
        Calculadora calc1 = new Calculadora();
        float resultado = calc1.calcularDobro(numero);
        System.out.println(" O dobro do " + numero + " é " + resultado);

        sc.close();
    }
}
