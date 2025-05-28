package Primeiro_Programa;

/**
 * A classe Calculadora realiza operações matemáticas básicas.
 */

public class Calculadora {
    /**
     * Soma dois números inteiros.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da soma.
     */

    public int soma(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     * 
     * @param a Minuendo.
     * @param b Subtraendo.
     * @return Resultado da subtração.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultadoSoma = calc.soma(5, 5);
        int resultadoSubtracao = calc.subtrair(10, 5);

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtracao: " + resultadoSubtracao);
    }
}
