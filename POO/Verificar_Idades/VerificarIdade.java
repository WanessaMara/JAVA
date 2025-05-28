package Verificar_Idades;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite seu nome: ");
        String nome = teclado.next();

        System.out.println(" Digite sua idade: ");
        int idade = teclado.nextInt();

        String mensagem = " Maior Idade ";
        verificarMaiorIdade(idade, nome);

    }

    public static void verificarMaiorIdade(int idade, String mensagem){

        if(idade >= 18){
            System.out.println(" Maior Idade. ");
        }else {
            System.out.println(" Digite novamente. ");
        }
    }




}
