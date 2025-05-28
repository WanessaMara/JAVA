package com.wanessa.cursojava.aula15;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		/*4. Faça um Programa que verifique se uma letra digitada é vogal ou 
consoante*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite uma letra. ");
		String letra = teclado.next();
		
		 /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
		letra.equalsIgnoreCase("u")) {
			System.out.println(" Vogal.");
		} else {
			System.out.println(" Consoante. ");
		} */	
	
		if (letra.length() > 1) {
			System.out.println(" Letra inválida. Digite novamente. ");
		} else {
			switch (letra) {
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": 
			case "A": 
			case "E": 
			case "I": 
			case "O": 
			case "U": System.out.println(" Vogal."); break;
			default: System.out.println(" Consoante. ");
		}
	} 
		
	}

}
