package Application.resouce;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class NutricionistaResouce {

    //Json - Retorna dados na URL, converções diferentes ou compatibilizar classe java existente
    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome_nutricionista")
    private String nome;

    @JsonProperty("idade")
    private LocalDate idade;

    @JsonProperty("codidoRegistro")
    private String codidoRegistro;

    @JsonProperty("idPaciente")
    private String idPaciente;

    /* nome_nutricionista : Renata
       idPaciente : 1 */

    public NutricionistaResouce(){

    }

    public NutricionistaResouce(Long id, String nome, LocalDate idade, String codidoRegistro, String idPaciente) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.codidoRegistro = codidoRegistro;
        this.idPaciente = idPaciente;
    }

    // construtores
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodidoRegistro() {
        return codidoRegistro;
    }

    public void setCodidoRegistro(String codidoRegistro) {
        this.codidoRegistro = codidoRegistro;
    }

    @Override
    public String toString() {
        return "NutricionistaResouce{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", codidoRegistro='" + codidoRegistro + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                '}';
    }
}

