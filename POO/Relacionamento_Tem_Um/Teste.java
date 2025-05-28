package com.wanessa.cursojava.aula36;

public class Teste {
    public static void main(String [] args){

        Contato contato = new Contato();
        contato.setNome("Wanessa");
        //contato.setEndereco("Amisterdã");
        //contato.setTelefone("85 9 8989-8989");

        // relacionamento tem-um endereço
        Endereco end = new Endereco();
        end.setCep("61650-540");
        end.setNomeRua("Catumbi");
        end.setNumero("702");
        end.setComplementeto(" ");
        end.setCidade("Caucaia");
        end.setEstado("Ceará");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("85");
        telefone.setNumero("9 8989-8989");

        // relacionamento um-muitos telefone
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("85");
        telefone2.setNumero("9 5555-5555");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        // Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        // != representa diferente de
        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /* if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        } */

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
