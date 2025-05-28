package com.wanessa.cursojava.aula36;

public class Endereco {

    private String nomeRua;
    private String numero;
    private String complementeto;
    private String cidade;
    private String estado;
    private String cep;


    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplementeto() {
        return complementeto;
    }

    public void setComplementeto(String complementeto) {
        this.complementeto = complementeto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
