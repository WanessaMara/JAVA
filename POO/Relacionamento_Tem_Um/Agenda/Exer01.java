package com.wanessa.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {
    /* 1. Escreva	uma	classe	Agenda,	que	contém	vários	contatos	do	tipo	Contato.
Cada	contato	possui	nome,	telefone	e	email. A	Agenda	também	possui	um
nome.	Crie	um	programa	teste	que	peça	para	o	usuário	entrar	com	o
nome	da	Agenda	e	em	seguida	3	contatos.	Crie	métodos	que	retornem
uma	String	com	a	informação	de	cada	contato	e	também	de	todos	os
contatos	da	agenda.*/
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o nome da agenda.");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);
        /*Agenda agenda = new Agenda();
        agenda.setNome(nome); */

        Contato[] contatos = new Contato[3];
        for (int i=0; i<3; i++){
            System.out.println(" Entre com as informações do contato:" + (i+1));
            Contato c = new Contato();

            System.out.println(" Entre com o nome: ");
            nome = sc.nextLine();
            c.setNome(nome);

            System.out.println(" Digite o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.println(" Digite o email: ");
            String email = sc.nextLine();
            c.setEmail(email);

            //Array
            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }

}
