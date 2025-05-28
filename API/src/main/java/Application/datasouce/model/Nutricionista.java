package Application.datasouce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "nutricionista") //entidade do banco
public class Nutricionista implements Serializable {

    @Id //identificador unico
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nurtricionista_seq") //gera id automatico
    @SequenceGenerator(name = "nutricionista_seq", sequenceName = "nutricionista_sequence", allocationSize = 0)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private LocalDate idade;

    @Column(name = "codigo_registro")
    private String codigoRegistro;

    @Column(name = "id_paciente")
    private Long idPaciente;

    public Nutricionista(String nome, LocalDate idade, String codigoRegistro, Long idPaciente){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCodigoRegistro(codigoRegistro);
        this.setIdPaciente(idPaciente);
    }

    public Nutricionista(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }
}
