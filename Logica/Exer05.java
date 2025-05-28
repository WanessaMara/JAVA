package com.wanessa.cursojava.aula15;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/* 5. Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a 
dez.*/
		 
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite sua primeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println(" Digite sua segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) /2;
				
		if ((nota1 + nota2) /2 >= 10) {
			System.out.println(" Aprovado com Distinção. ");
		} else if ((nota1 + nota2) /2 >= 7) {
			System.out.println(" Aprovado. ");
		} else {
			System.out.println(" Reprovado. ");
		}
		
	}

}
