package Composição;

public class Principal {
    public static void main(String[]args){

        // criando um carro com um motor
        Carro carro = new Carro("Toyota", "Hilux", "3.0");

        // ligando e desligando o carro
        carro.ligarCarro();
        System.out.println();
        carro.desligarCarro();

    }
}
