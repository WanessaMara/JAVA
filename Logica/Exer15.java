package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/* 15.Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela 
abaixo:

+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
(8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$


Obs.: Salário Bruto - Descontos = Salário Líquido.*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite o quanto você ganha por hora: ");
		double valorHora = teclado.nextDouble();
		
		System.out.println(" Digite o numero de horas trabalhadas no mês: ");
		double horasTrabalhadas = teclado.nextDouble();
	
		double salarioBruto = valorHora * horasTrabalhadas;
		double INSS = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) *5;
		double IR = (salarioBruto / 100) *11;
		
		double totalDescontos = INSS + sindicato + IR;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println(" Seu salario bruto é: " + salarioBruto);
		
		System.out.println(" INSS: " + INSS);
		System.out.println(" Sindicato: " + sindicato);
		System.out.println(" IR: " + IR);
		System.out.println(" Total de Descontos: " + totalDescontos);
		System.out.println(" Salario Liquido: " + salarioLiquido);
				
	
	}

}
