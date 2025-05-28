package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/* 11.Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo*/

		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Digite um numero inteiro: ");
		int num1 = teclado.nextInt();
		
		System.out.println(" Digite outro numero inteiro: ");
		int num2 = teclado.nextInt();
		
		System.out.println(" Digite um numero real: ");
		double numReal = teclado.nextDouble();
	
		
	// a. o produto do dobro do primeiro com metade do segundo .
		int produto;	
		produto = (num1 * 2) * num2 / 2;
	
	// b. a soma do triplo do primeiro com o terceiro.
		double soma;
		soma = (num1 * 3) + numReal;
	
	// c. o terceiro elevado ao cubo
		double cubo;
		cubo = Math.pow(numReal, 3);
	
		System.out.println(" Resultado de a: " + produto);
		System.out.println(" Resultado de b: " + soma);
		System.out.println(" Resultadp de c: " + cubo);
		
	
	}

}
