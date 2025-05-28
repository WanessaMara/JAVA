package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExemploNome {
    public static void main(String [] args){
        List<String> convidados = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        convidados.add("Ranessa");
        convidados.add("Alone");
        convidados.add("Fulano");
        convidados.add("Beucrano");

        // Exibindo os elementos do ArrayList
        System.out.println(" Elementos do ArrayList: ");
        for(String amigo : convidados){
            System.out.println(amigo);
        }

        // Acessando um elemento específico pelo índice
        String segundoNumero = convidados.get(1);
        System.out.println(" Segundo número: " + segundoNumero);

        convidados.set(1, "MadMAx");

        // Removendo um elemento do ArrayList
        convidados.remove(2); // Remove o número 3

        // Exibindo os elementos atualizados do ArrayList
        System.out.println(" Elementos do ArrayList após remoção: ");
        for(String amigo : convidados){
            System.out.println(amigo);
        }

        // Verificando o tamanho do ArrayList
        int tamanho = convidados.size();
        System.out.println(" Tamanho do ArrayList: " + tamanho);

        // Verificando se o ArrayList está vazio
        boolean estaVazio = convidados.isEmpty();
        System.out.println(" O ArrayList está vazio? " + estaVazio);
    }
}
