package CalculosMatematicos;

import java.util.Scanner;

public class CalcularNota {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite sua primeira nota: ");
        float nota1 = teclado.nextFloat();

        System.out.println(" Digite sua segunda nota: ");
        float nota2 = teclado.nextFloat();

        float resultSoma = calcularSoma(nota1, nota2);
        System.out.println(" Soma das notas: " + resultSoma);

        float resultMedia = calcularMedia(resultSoma);
        System.out.println(" Sua média é: " + resultMedia);

        teclado.close();
    }
    public static float calcularSoma(float nota1, float nota2){
        float soma = nota1 + nota2;
        return soma;
    }
    public static float calcularMedia(float resultSoma){
        float media = (resultSoma) / 2;
        return media;
    }

}
