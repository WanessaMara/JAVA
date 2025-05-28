package Get_Set;


public class Principal_Nome_CPF {
    public static void main(String [] args){

        // chamando o método
        Cliente_ Cliente_1 = new Cliente_(" Wanessa " , " 1234 ");

        // exibindo os dados
        System.out.println(" Nome do cliente: " + Cliente_1.getNome());
        System.out.println(" Número do CPF: " + Cliente_1.getCpf());

        // alteração dos dados
        Cliente_1.setNome(" Britinei ");
        Cliente_1.setCpf(" 4321 ");

        // exibindo os novos dados
        System.out.println(" Novo nome do cliente: " + Cliente_1.getNome());
        System.out.println(" Novo CPF do cliente: " + Cliente_1.getCpf());
        
    }
}
