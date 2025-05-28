package listaRepeticaoWhile;

import java.util.Scanner;

public class Exer51 {

	private static int i;

	public static void main(String[] args) {
		/* 51)O sistema de avaliação de uma determinada disciplina obedece aos seguintes
critérios:

Durante o semestre são dadas três notas;
A nota final é obtida pela média aritmética das notas dadas durante o curso;
É considerado aprovado o aluno que obtiver a nota final superior ou igual a 60 e
que tiver comparecido a um mínimo de 40 aulas.

Fazer um algoritmo que:
a. Leia um conjunto de dados, contendo o número de matrícula, as três
notas e a freqüência (número de aulas freqüentadas) de 100 alunos.
b. Calcule:
i. A nota final de cada aluno;
ii. A maior e a menor nota da turma;
iii. A média da turma;
iv. O total de alunos reprovados;
v. A porcentagem de alunos reprovados por freqüência.

Escreva:
Para cada aluno, o número de matrícula, a freqüência, a nota final e o
código (aprovado ou reprovado);
A maior e a menor nota da turma;
A média da turma;
O total de alunos reprovados;
A porcentagem de alunos reprovados por freqüência.*/
	
		// Sistema de avaliação
	
		Scanner teclado = new Scanner(System.in);
		
		//variaveis
		int totalAlunos = 2;
		int aulasMinimas = 40;
		int alunosAprovados = 0;
		int alunosReprovados = 0;
		int alunosFaltosos = 0;
		double maiorNota = 0.0;
		double menorNota = 10000.0;
		double somaNotas = 0.0;
		
		// loop para da dados do 1 aluno em diante, enquanto for verdadeiro ira rodar
		for (int i = 1; i <= totalAlunos; i++) {
			System.out.println(" Dados dos alunos: " + i + ":");
		
		// dados da matrícula
		System.out.println(" Digite sua matrícula: ");
		int matricula = teclado.nextInt();
		
		// dados da 1ª nota
		System.out.println(" Digite sua primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		// dados da 2ª nota
		System.out.println(" Digite sua segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		// dados da 3ª nota
		System.out.println(" Digite sua terceira nota: ");
		double nota3 = teclado.nextDouble();
		
		// dados da frequencia
		System.out.println(" Digite seu número de aulas frequentadas: ");
		int frequencia = teclado.nextInt();
			
		
		//medias 
		double mediaFinal = (nota1 + nota2 + nota3) /3;
		somaNotas += mediaFinal;
		
		// calculo maior nota e menor nota
		if (mediaFinal > maiorNota) maiorNota = mediaFinal;
		if (mediaFinal < menorNota) menorNota = mediaFinal;
		
		if (mediaFinal >= 60 && frequencia >= aulasMinimas) {
			alunosAprovados++;
			System.out.println(" Alunos " + i + ": Aprovados");
		}else {
			alunosReprovados++;
			System.out.println(" Aluno " + i + ": Reprovados");
		}
			if (frequencia < aulasMinimas) alunosFaltosos++;
		}
			
			// calculo media da turma
			double mediaTurma = somaNotas / totalAlunos;
			double percentualReprovadosFrequencia = ((double) alunosFaltosos / totalAlunos) * 100;
			
			System.out.println(" \nPorcentagem da turma: \nMaior Nota: " + maiorNota +
					"\nMenor Nota: " + menorNota + "\nMédia da Turma: " + mediaTurma 
					+ "\nTotal de Alunos Reprovados: " + alunosReprovados + 
					"\nPorcentagem de Alunos Reprovados por Frequências: " 
					+ percentualReprovadosFrequencia + "%"); 
		
	}

}
