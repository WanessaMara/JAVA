package com.wanessa.cursojava.aula13;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/* 18.Faça um programa que peça o tamanho de um arquivo para download 
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e 
informe o tempo aproximado de download do arquivo usando este link 
(em minutos).*/

		Scanner teclado = new Scanner(System.in);
	
		System.out.println(" Digite o tamanho do arquivo: ");
		double tamArquivo = teclado.nextDouble();
		System.out.println(" Digite a velocidade da sua internet: ");
		double velocidadeInter = teclado.nextDouble();
		
		double tempo = tamArquivo / velocidadeInter;
		
		System.out.println(" Tempo de download em minutos: " + tempo);
	
	
	}

}
