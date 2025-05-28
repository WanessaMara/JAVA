package Herença;

public class TelefoneCelular extends Telefone{

    private String operadora;

    public TelefoneCelular(String numero, String operadora){
        super(numero);
        this.operadora = operadora;
    }

    public void enviarSMS(String mensagem, String numeroDestino){
        System.out.println(" Enviando SMS para " + numeroDestino + ":" + mensagem);
    }
}
