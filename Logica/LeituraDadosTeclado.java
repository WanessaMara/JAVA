package com.wanessa.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println(" Digite seu nome completo : ");
		String nomeCompleto = teclado.nextLine();
		System.out.println(" Seu nome completo é: " + nomeCompleto);
		
		System.out.println(" Digite seu primeiro nome: ");
		String primeiroNome = teclado.next();
		System.out.println(" Seu primeiro nome é: " + primeiroNome);
		
		System.out.println(" Digite sua idade: "); 
		int idade = teclado.nextInt();
		System.out.println(" Sua idade é: " + idade);
		
		System.out.println(" Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println(" Sua altura é: " + altura);*/
		
		System.out.println(" Digite seu nome, sua idade, sua altura, quantidade de filhos e se tem animais: ");
		String nome = teclado.next();
		int idade = teclado.nextInt();
		float altura = teclado.nextFloat();
		byte qntdFilhos = teclado.nextByte();
		boolean temPet = teclado.nextBoolean();
		
		System.out.println(" Você digitou os seguintes valores: ");
		System.out.println(" Seu nome é: " + nome);
		System.out.println(" Sua idade é: " + idade);
		System.out.println(" Sua altura é: " + altura);
		System.out.println(" Quantidade de filhos: " + qntdFilhos);
		System.out.println(" Tem animal de estimação? " + temPet);
	
	}
}
