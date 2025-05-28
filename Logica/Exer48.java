package listaRepeticaoWhile;

import java.util.Scanner;

public class Exer48 {

	private static int porcentagem;

	public static void main(String[] args) {
		/* 48)Foi feita uma pesquisa para determinar o índice de mortalidade infantil 
		 * em um
certo período. Fazer um algoritmo que:
Leia inicialmente, o número de crianças nascidas no período;
Leia, em seguida, um número indeterminado de linhas, contendo, cada
uma, o sexo de uma criança morta (masculino, feminino) e o número de
meses de vida da criança. A última linha, que não entrará nos cálculos,
contém no lugar do sexo a palavra "vazio".;
Determine e imprima:
A porcentagem de crianças mortas no período;
A porcentagem de crianças do sexo masculino mortas no período;
A porcentagem de crianças que viveram 24 meses ou menos no período.8*/

		Scanner teclado = new Scanner(System.in);
		
		// variaveis
		int nascidos = 0;
		int kidsMortas = 0;
		int kidsMasculinasMortas = 0;
		int kidsAte24Meses = 0;
	
		// dados dos nascidos
		System.out.println(" Digite o número de nascidos: ");
		nascidos = teclado.nextInt();
		 
		// leitura de crianças mortas
		System.out.println(" Digite o número de crianças mortas. (Digite vazio para encerrar): ");
		
		while(true) {
			System.out.println(" Sexo ( m - masculino, f - feminino, vazio): ");
			String sexo = teclado.next();
		
			if (sexo.equals("vazio")) {
				break; // encerra o loop se digitar vazio
			}
		
			// dados dos meses
			System.out.println(" Digite os meses de vida da criança: [até 24 meses] ");
			int meses = teclado.nextInt();
			
			// atualiza o contador conforme digitado o sexo
			kidsMortas++;
			
			if (sexo.equals("m")) {
				kidsMasculinasMortas++;
			}
			
			// contador de meses
			if (meses <= 24) {
				kidsAte24Meses++;
			}
		
		}
		
		// calculos das porcentagens
		double porcentagemKidsMortas = (double) kidsMortas / nascidos * 100;
		double porcentagemMasculinasMortas = (double) kidsMasculinasMortas / nascidos * 100;
		double porcentagemAte24Meses = (double) kidsAte24Meses / nascidos * 100;
		
		// print do resultado
		System.out.println(" Resultados: ");
		System.out.println(" Porcentagem de criânças mortas no periodo:  " + porcentagemKidsMortas + "%");
		System.out.println(" Porcentagem de crianças masculinas mortas: " + porcentagemMasculinasMortas + "%");
		System.out.println(" Porcentagem de crianças que viveram 24 meses ou menos: " + porcentagemAte24Meses + "%");
		
			
		}
		
		
	}


