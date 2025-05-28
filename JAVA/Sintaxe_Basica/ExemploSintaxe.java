package Sintaxe_Basica;

public class ExemploSintaxe {

    public static void main(String[] args) {

        // 1 - Impressão de texto
        System.out.println("O ano é: " + 2025);

        // 2 - Tipos primitivos
        int idade = 25;
        int anoAtual = 2025;

        System.out.println("A idade é: " + idade);
        System.out.println("O ano atual é: " + anoAtual);

        double altura = 1.62;
        double pi = 3.14;

        System.out.println("A altura é: " + altura + "\nPI é: " + pi);

        // Textos Strings
        String nome = "Aila";

        System.out.println("O nome é: " + nome);

        // booleano
        boolean acesso = false;
        boolean logado = true;

        System.out.println("Tem acesso? " + acesso);
        System.out.println("Está logado? " + logado);

        // 3 - Operadores
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));

        // 4 - Operadores Compostos
        System.out.println("Op composto soma: " + (a += 5));
        System.out.println("Op composto subtração: " + (a -= 5));

        // 5 - op de incremento e decremento
        int contador = 0;

        contador++;
        contador++;
        contador--;

        System.out.println("Valor do contador:" + contador);
    }

}
