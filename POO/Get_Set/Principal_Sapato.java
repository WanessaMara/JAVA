package Get_Set;

public class Principal_Sapato {
    public static void main(String [] args){

        // chamar o método sapato
        Sapato sapato1 = new Sapato(42);

        // exibir número do sapato
        System.out.println(" Tamanho do sapato: " + sapato1.getTamanho());

        // exibir novo número do sapato
        sapato1.setTamanho(39);
        System.out.println(" Novo tamanho: " + sapato1.getTamanho());


    }
}
