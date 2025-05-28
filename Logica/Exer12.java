package com.wanessa.cursojava.aula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/* 12.Faça um programa para o cálculo de uma folha de pagamento, 
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
a empresa que deposita). O Salário Líquido corresponde ao Salário 
Bruto menos os descontos. O programa deverá pedir ao usuário o 
valor da sua hora e a quantidade de horas trabalhadas no mês.

o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00 
(-) IR (5%) : R$ 55,00 
(-) INSS ( 10%) : R$ 110,00 
FGTS (11%) : R$ 121,00 
Total de descontos : R$ 165,00 
Salário Liquido : R$ 935,00*/
		
		Scanner teclado = new Scanner(System.in);
		
		// valor da hora
		System.out.println(" Digite o valor da sua hora: ");
		int hora = teclado.nextInt();
		
		// horas trabalhadas no mês
		System.out.println(" Digite suas horas trabalhadas: ");
		int horaTrab = teclado.nextInt();
			
		double salarioBruto = hora * horaTrab;
		
		int percentualIR = 0;

		// salario Bruto menos o percentual
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto < 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double IR = (salarioBruto /100) * percentualIR;
		
		double INSS = (salarioBruto /100) * 10;
		
		double FGTS = (salarioBruto /100) * 11;
	
		double descontos = IR + INSS;
		
		double salarioLiquido = salarioBruto - descontos;
	
		System.out.println(" Salário Bruto: (" + hora + " * " + horaTrab + "): " +salarioBruto);
	
		System.out.println(" IR (5%): " + percentualIR);
	
		System.out.println(" INSS (10%): " + INSS);
	
		System.out.println(" FGTS (11%): " + FGTS);
		
		System.out.println(" Total de descontos: " + descontos);
	
		System.out.println(" Salário Liquido: " + salarioLiquido);
	
	}

}
