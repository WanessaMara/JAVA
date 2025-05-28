package ProvaPratica;

public class Gato {
    private String nome; // nome do gato
    private String raca;
    private String corOlhos;

    Gato(String nome, String raca, String corOlhos) {
        this.nome = nome;
        this.raca = raca;
        this.corOlhos = corOlhos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public String verificarRaca() {
        if (raca.equals("persa") || raca.equals("siames") || raca.equals("angora") || raca.equals("maine coon") || raca.equals("sphynx")) {
            System.out.println(" Raça verificada");
        } else {
            System.out.println(" Raça não encontrada, digite novamente.");
        }
        return raca;
    }

    public String verificarCorOlhos() {
        if (corOlhos.equals("preto") || corOlhos.equals("vermelho")) {
        System.out.println(" Cor dos olhos não aceita, digite novamente.");
        } else{
            System.out.println(" Cor dos olhos verificada.");
        }
        return corOlhos;
    }
    public String toString(){
        return "Gato - " +
                "Nome: " + getNome() + "\n" +
                "Raça: " + getRaca() + "\n" +
                "Cor dos Olhos: " + getCorOlhos();
    }
}
