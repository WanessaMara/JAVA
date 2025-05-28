package Exer02;

import java.util.Scanner;

public class Exer02 {
    public static void main(String [] args){
         /* 2 - Faça um programa que recebe o valor do salário de um funcionário na MAIN.
         Crie dois métodos, um chamado aumentarDezPorCento() e outro chamado aumentarVintePorCento().
         A impressão da variável salário será no método MAIN.*/

        Scanner sc = new Scanner(System.in);

        // Inserir valor do salário
        System.out.println(" Entre com o salário do funcionário: ");
        float salario = sc.nextFloat();

        // Menu onde o usuário escolhe qual aumento fazer
        System.out.println(" MENU ");
        System.out.println(" Digite 1 - Para aumentar 10%: ");
        System.out.println(" Digite 2 - Para aumentar 20%: ");
        int novoSalario = 0;
        float resultado = sc.nextFloat();

        // chama os métodos para o aumento
        if(resultado == 1){
            novoSalario = (int) AumentarDezPorCento.aumentoDez(salario);
        }else if(resultado == 2){
            novoSalario = (int) AumentarVintePorCento.aumentoVinte(salario);
        }else {
            System.out.println(" Opção Inválida. ");
            return;
        }

        System.out.println(" Salário após o aumento: " + novoSalario);

        sc.close();
    }
}
