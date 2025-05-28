package listaRepeticaoWhile;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {

		// criar um objeto de classe random
		Random aleatorio = new Random();
		
		//variaveis
		int dado1, dado2, jogadas = 0, soma;
		int count = 0;
		
		// loop do dado
		while(true) {
		
		// gerar um número aleatorio de 0 a 6 para um dado
		dado1 = aleatorio.nextInt(1, 7);		
		dado2 = aleatorio.nextInt(1, 7);
		soma = dado1 + dado2;

		System.out.println(" Dado 1: " + dado1 + " \n Dado 2: " + dado2 +
				"\n Soma de jogadas: " + soma);
		
		if (soma == 7) {
			System.out.println("=== Ganhei ===");
		} else {
			System.out.println(" \nNão foi dessa vez, tente de novo. :( ");
		}
		jogadas++;
		count = jogadas;
		System.out.println(" \nQuantidade de vezes jogadas: " + count);
		System.out.println(" \nTotal de jogadas: " + jogadas);
		break; } 
	}
}