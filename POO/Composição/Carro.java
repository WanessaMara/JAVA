package Composição;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor; // Composição: Carro tem um Motor

    public Carro(String marca, String modelo, String cilindradaMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindradaMotor); // Instanciando um Motor
    }

    public void ligarCarro(){
        System.out.println(" Ligando o carro " + marca + " " + modelo + " " + motor.getCilindrada());
        motor.ligar(); // chamando método do Motor
    }

    public void desligarCarro(){
        System.out.println(" Desligando o carro " + marca + " " + modelo);
        motor.desligar(); // chamando método do Motor
    }
}
