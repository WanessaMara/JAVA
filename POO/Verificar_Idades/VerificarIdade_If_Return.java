package Verificar_Idades;

import java.util.Scanner;

public class VerificarIdade_If_Return {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite a idade do atleta: ");
        int idade = teclado.nextInt();

        boolean resposta = verificarIdade(idade);

        if(resposta == true){
            System.out.println(" O atleta é maior de idade. ");
        }else{
            System.out.println(" O atleta é menor de idade. ");
        }

teclado.close();

    }
    public static boolean verificarIdade(int idade){

        if(idade >= 18){
            return true;
        }else{
            return false;
        }
    }
}
