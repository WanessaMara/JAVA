package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		/* 13.Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, utilizando as 
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou 
abaixo do peso.*/

		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		
		System.out.println(" Digite seu sexo: H para homem, M para mulher ");
		char sexo = teclado.next().charAt(0);
		
		double pesoIdeal;
		
		if (sexo == 'H' || sexo == 'h') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println(" Seu peso ideal é: " + pesoIdeal);
		} else if (sexo == 'M' || sexo == 'm') {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println(" Seu peso ideal é: " + pesoIdeal);
		} else {
			System.out.println(" Sexo não identificado. Por favor, digitar novamente. ");
		}
		
	}

}
