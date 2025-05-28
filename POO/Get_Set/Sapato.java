package Get_Set;

public class Sapato {
    private int tamanho;
    public Sapato(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public void exibirInfo(){
        System.out.println(" Tamanho: " + tamanho);
    }
}
