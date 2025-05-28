package Get_Set;

public class Cliente {
    private String nome;
    public Cliente(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public void exibirInfor(){
        System.out.println(" Nome: " + nome);
    }
}
