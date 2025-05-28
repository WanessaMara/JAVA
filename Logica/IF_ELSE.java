package com.wanessa.cursojava.aula14;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade >=18) {
			System.out.println(" Você é maior de idade. ");
		} else {
			System.out.println(" Você é menor de idade. ");
		}
	}

}
