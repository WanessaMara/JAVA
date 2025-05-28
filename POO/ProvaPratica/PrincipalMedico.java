package ProvaPratica;

import java.util.Scanner;

public class PrincipalMedico {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String crm;
        String estado;

        System.out.println(" Entre com o nome do médico: ");
        nome = sc.next();
        System.out.println(" Digite o seu CRM (ex: 123.123): ");
        crm = sc.next();
        System.out.println(" Digite seu estado (CE, SP, RJ ou BA): ");
        estado = sc.next();

        Medico medico1 = new Medico(nome, crm, estado);
        medico1.verificarCRM();
        medico1.verificarEstado();
        System.out.println(medico1.toString());

        sc.close();
    }
}
