package com.wanessa.cursojava.aula14;

import java.util.Scanner;

public class Multiplos_IFELSE {

	public static void main(String[] args) {
		
		// compra de produto
		// barato <= 10
		// 10 > valor <15 - pedir desconto
		// 15 >= valor < 17 - pesquisar mais
		// >= 17 - muito caro
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite um valor: ");
		double valor = teclado.nextDouble();
		
		if ( valor <= 10) {
			System.out.println(" Pode comprar o produto. ");
		} else if ( valor > 10 && valor < 15) {
			System.out.println(" Está barato, mas pode pedir desconto. ");
		} else if (valor >= 15 && valor < 17) {
			System.out.println(" Podemos pesquisar mais. ");
		} else  { // valor maior que 17
			System.out.println(" O produto está muito caro.");
		}
	}

}
