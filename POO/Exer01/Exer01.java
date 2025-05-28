package Exer01;

import java.util.Scanner;

public class Exer01 {
    public static void main(String [] args) {
        /* 1 - Faça um programa que recebe o valor da variável saldo no método MAIN.
        Crie dois métodos , um chamado creditar() e outro chamado debitar().
        A impressão da varíavel saldo será no método MAIN.*/

        Scanner sc = new Scanner(System.in);

        System.out.println(" Entre com seu saldo: ");
        float saldo = sc.nextFloat();

        // chamar o método creditor
        System.out.println(" Digite o valor a ser creditado: ");
        float valorCredito = sc.nextFloat();
        saldo = Creditar.creditar(saldo, valorCredito);

        //chamar o método debitor
        System.out.println(" Digite o valor a ser debitado: ");
        float valorDebito = sc.nextFloat();
        saldo = Debitar.debitar(saldo, valorDebito);

        System.out.println(" Saldo final: " + saldo);

        sc.close();
    }
}
