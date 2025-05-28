package Herença;

public class TelefoneFixo extends Telefone{
    private String operadora;

    public TelefoneFixo(String numero, String operadora){
        super(numero);
        this.operadora = operadora;
    }

    public void transferirChamada(String numeroDestino){
        System.out.println(" Transferindo chamada para: " + numeroDestino);
    }
}
