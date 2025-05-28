package Herença;

public class TesteTelefones {
    public static void main(String[]args){
        TelefoneFixo fixo = new TelefoneFixo("123456", "VIVO");
        TelefoneCelular celular = new TelefoneCelular("999999", "CLARO");

        fixo.fazerChamada("888888"); // Chamando a partir do telefone fixo
        fixo.transferirChamada("777777"); // Transferindo chamada do telefone fixo

        celular.fazerChamada("222222"); // Chamando a partir do telefone celular
        celular.enviarSMS("Olá!", "959566"); // Enviando SMS do telefone celular
    }
}
