package com.wanessa.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		 
		int i = 1; // count
		int max = 10;
		
		System.out.println(" Contador até: " + max);
	
		while(i <= max) {
			System.out.println(" Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
		
		System.out.println(i); // valor de i = 11;
	 
		do {
			i++;
			System.out.println(" Valor de i: " + i);
		} while (i < 15);
		System.out.println(i);
	}
}
