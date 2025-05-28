package Projeto;

import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Calculadora Java.");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro número:");
                double num1 = sc.nextDouble();

                System.out.println("Digite o segundo número:");
                double num2 = sc.nextDouble();

                double resultado = 0;

                boolean opcaoValida = true;

                switch (opcao){
                    case 1 :
                        resultado = adicionar(num1, num2);
                        break;
                    case 2 :
                        resultado = subtrair(num1, num2);
                        break;
                    case 3 :
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4 :
                        if (num2 != 0){
                            resultado = divisao(num1, num2);
                        } else {
                            System.out.println("Divisão por 0.");
                            opcaoValida = false;
                        }
                        break;
                    default:
                        opcaoValida = false;
                        break;
                }

                if (opcaoValida){
                    System.out.println("Resultado: " + resultado);
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrando...");
        sc.close();

    }

    public static double adicionar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }



}
