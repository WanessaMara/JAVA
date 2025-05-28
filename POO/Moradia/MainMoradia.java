package Moradia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMoradia {
    public static void main(String[] args){
        List<Moradia> moradias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Cadastro da casa com endereço, número de moradores e quantidade de quartos.
        System.out.println(" Quantas casas desejas cadastrar? ");
        int numCasas = sc.nextInt();
        for(int i = 0; i < numCasas; i++){
            Casa casa = new Casa("", 0, 0);
            casa.cadastrar();
            moradias.add(casa);
        }

        // Cadastro do apartamento com endereço, quantidade de moradores e número de andares.
        System.out.println(" Quantos apartamentos deseja cadastrar? ");
        int numApartamentos = sc.nextInt();
        for(int i = 0; i < numApartamentos; i++){
            Apartamento apartamento = new Apartamento("", 0, 0);
            apartamento.cadastrar();
            moradias.add(apartamento);
        }
        System.out.println(" Lista de Moradias: ");
        for(Moradia moradia : moradias){
            System.out.println(moradia);
        }

    }
}
