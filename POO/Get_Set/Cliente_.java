package Get_Set;

public class Cliente_ {
    private String nome;
    private String cpf;
    public Cliente_(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void exibirInfo(){
        System.out.println(" Nome: " + nome);
        System.out.println(" CPF: " + cpf);
    }
}
