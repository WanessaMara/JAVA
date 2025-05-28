package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExemploNumero {
    public static void main(String [] args){

        // Criando um ArrayList para armazenar números inteiros
        List<Integer> numeros = new ArrayList<>();

        //Adicionando elementos ao ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Exibindo os elementos do ArrayList
        System.out.println(" Elementos do ArrayList: ");
        for(Integer numero : numeros){
            System.out.println(numero);
        }

        // Acessando um elemento específico pelo índice
        int segundoNumero = numeros.get(1);
        System.out.println(" Segundo número: " + segundoNumero);

        // Removendo um elemento do ArrayList
        numeros.remove(2); // remove o número 3

        // Exibindo os elementos atualizados do ArrayList
        System.out.println(" Elementos do ArrayList após remoção: ");
        for(Integer numero : numeros){
            System.out.println(numero);
        }

        // Verificando o tamanho do ArrayList
        int tamanho = numeros.size();
        System.out.println(" Tamanho do ArrayList: " + tamanho);

        // Verificando se o ArrayList está vazio
        boolean estaVazio = numeros.isEmpty();
        System.out.println(" O ArrayList está vazio? " + estaVazio);
    }
}
