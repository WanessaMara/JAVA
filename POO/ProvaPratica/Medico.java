package ProvaPratica;

public class Medico {
    private String nome;
    private String crm;
    private String estado;

    Medico(String nome, String crm, String estado) {
        this.nome = nome;
        this.crm = crm;
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    // verificar CRM com a String Regex
    public boolean verificarCRM() {
        // expressao verifica se o CRM esta correto
        String regex = "\\d{3}\\.\\d{3}";
        // if para verificar se é valido
        if (crm.matches(regex)) {
            System.out.println(" CRM do médico válido. ");
            return true;
        } else {
            System.out.println(" CRM inválido, digite novamente. ");
            return false;
        }
    }
        // verificar estado
        public String verificarEstado(){
            if (estado.equalsIgnoreCase("ce")
                    || estado.equalsIgnoreCase("sp")
                    || estado.equalsIgnoreCase("rj")
                    || estado.equalsIgnoreCase("ba")) {
                System.out.println(" Verificação do Estado válida. ");
            } else {
                System.out.println(" Estado não válido, digitar novamente. ");
            }
            return estado;
        }

        public String toString(){
            return "Médico - " +
                    "Nome: " + getNome() + "\n" +
                    "CRM: " + getCrm() + "\n" +
                    "Estado: " + getEstado();

        }
    }

