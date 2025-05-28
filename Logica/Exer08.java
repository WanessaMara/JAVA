package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		/* 8. Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês.*/
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite o valor que você ganha por hora: ");
		double valorHora = teclado.nextDouble();
		
		System.out.println(" Digite o valor de horas trabalhadas no mês: ");
		double horaTrabalhada = teclado.nextDouble();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println(" Total do salario é: " + salario);

	}
}
