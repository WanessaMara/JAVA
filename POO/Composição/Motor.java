package Composição;

public class Motor {
    String cilindrada;

    public Motor(String cilindrada){
        this.cilindrada = cilindrada;
    }

    public String getCilindrada(){
        return cilindrada;
    }

    public void ligar(){
        System.out.println(" Motor Ligado! ");
    }

    public void desligar(){
        System.out.println(" Motor Desligado! ");
    }
}
