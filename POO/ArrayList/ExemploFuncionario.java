package ArrayList;


import ClasseAbstrata.Desenvolvedor;
import ClasseAbstrata.Funcionario;
import ClasseAbstrata.Gerente;
import ClasseAbstrata.TotalizadorDeBonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploFuncionario {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Importados da classe abstrata
        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        List<Funcionario> listaFuncionario = new ArrayList<>();

        // while para escolher opções do menu
        while(true){
            System.out.println(" Digite o tipo de funcionário a ser adicionado (1 para Desenvolvedor, 2 para Gerente, ou 0 para sair): ");
            int tipoFuncionario = sc.nextInt();

            // if para a opção 0
            if(tipoFuncionario == 0){
                break;
            }

            System.out.println(" Digite o nome do funcionário: ");
            String nome = sc.next();

            System.out.println(" Digite o salário do funcionário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = null;
            // if para adicionar dev e gerente
            if(tipoFuncionario == 1){
                funcionario = new Desenvolvedor();
            } else if(tipoFuncionario == 2){
                funcionario = new Gerente();
            }else {
                System.out.println(" Tipo de funcionário inválido. ");
                continue;
            }

            funcionario.setNome(nome);
            funcionario.setSalario(salario);
            listaFuncionario.add(funcionario);
            totalizador.adicional(funcionario);
        }

        System.out.println(" Funcionários adicionados: ");
        for (Funcionario f : listaFuncionario){
            System.out.println(" Nome: " + f.getNome() + ", Salário: " + f.getSalario());
        }
        System.out.println(" Total de bônus: " + totalizador.getTotal());

        sc.close();
    }
}
