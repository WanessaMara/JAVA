package ProvaPratica;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // atributos de cada dado
        String nome;
        int matricula;
        float nota1, nota2;

        // print de interação ao usuario do primeiro aluno
        System.out.println(" Entre com o nome do primeiro aluno: ");
        nome = sc.next();
        System.out.println(" Entre com a matricula do aluno: ");
        matricula = sc.nextInt();
        System.out.println(" Entre com a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println(" Entre com a segunda nota: ");
        nota2 = sc.nextFloat();

        // puxar a class aluno e mostrar seus atributos
        Aluno aluno1 = new Aluno(matricula, nome);
        aluno1.calcularMedia(nota1, nota2);
        aluno1.verificarMatricula();
        // toString substitui exibir info
        System.out.println(aluno1.toString());

        // print para o segundo aluno
        System.out.println(" Entre com o nome do segundo aluno: ");
        nome = sc.next();
        System.out.println(" Entre com a matricula: ");
        matricula = sc.nextInt();
        System.out.println(" Entre com sua primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println(" Entre com sua segunda nota: ");
        nota2 = sc.nextFloat();

        Aluno aluno2 = new Aluno(matricula, nome);
        aluno2.calcularMedia(nota1, nota2);
        aluno2.verificarMatricula();
        System.out.println(aluno2.toString());

        // apresentar os dados dos dois alunos
        System.out.println(" Dados dos dois aluno: ");

        System.out.print(aluno1.toString());
        System.out.println();
        System.out.print(aluno2.toString());

        sc.close();
    }
}
