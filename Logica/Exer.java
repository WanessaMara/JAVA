package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer {

	public static void main(String[] args) {
		
		/* 1) Apresente a mensagem: “É PRECISO FAZER TODOS OS FLUXOGRAMAS E ALGORITMOS 
		PARA APRENDER”.*/
		System.out.println(" È preciso fazer todos os fluxogramas e algoritmos para aprender.");
		
		//2) Apresente seu nome.
		System.out.println(" Meu nome é Wanessa ");
		
		//3) Calcule e apresente o produto entre 28 e 43.
		int resultado = 28 * 43;
		System.out.println(" O produto entre 28 e 43 é: " + resultado);
	
		//4) Calcule e apresente a média entre os números 8, 9 e 7
		float media = (8 + 9 + 7) / 3;
		System.out.println(" A media entre 8, 9, 7 é:  " + media);
		
		//5) Leia e apresente um número inteiro.
		// para ler usa-se SCANNER
		Scanner teclado = new Scanner(System.in); 
		int numero;
		System.out.println(" Digite um numero: " );	
		numero = teclado.nextInt();
		System.out.println(" Valor digitado: " + numero);
		
		
		//6) Leia e apresente dois números inteiros.
		 Scanner teclado = new Scanner(System.in);
		 int a, b;
		 System.out.println(" Digite valor para a: ");
		 a = teclado.nextInt();
		 System.out.println(" Digite valor para b: ");
		 b = teclado.nextInt();
		 System.out.println(" Valor digitado para a e para b é: " + a + " e " + b);
		 
		//7) Receba um número inteiro e apresente seu sucessor e seu antecessor
		
		Scanner teclado = new Scanner(System.in);
		int num, sucessor, antecessor;
		System.out.println(" Digite um numero: ");
		
		num = teclado.nextInt();
		sucessor = num + 1;
		antecessor = num - 1;
		
		System.out.println(" O sucessor do seu numero é: " + sucessor);
		System.out.println(" O antecessor do seu numero é: " + antecessor);
	}
}