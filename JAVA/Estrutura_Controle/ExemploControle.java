package Estrutura_Controle;

public class ExemploControle {

    public static void main(String[] args) {
        // 1 - if - else (condicionais)
        // operadores de comparação ( x > y, a == b)

        int idade = 18;

        // if => começa a condição
        // () => recebe a condição
        // {} => corpo da condição
        // else => recebe a condição se não for verdadeira
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade");
        }

        // else - if => atua como intermediário do if e else
        int hora = 12;

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        // 2 - operadores de comparação
        // = -> é atribuição e == -> é comparação

        int x = 5;
        int y = 10;

        System.out.println("x == y:" + (x == y));
        System.out.println("x != y:" + (x != y));
        System.out.println("x > y:" + (x > y));
        System.out.println("x < y:" + (x < y));
        System.out.println("x >= y:" + (x >= y));
        System.out.println("x <= y:" + (x <= y));

        // operadores lógicos
        // && -> AND , || -> OR , != -> NOT
        // && - op1 && op2 = boolean (apenas se as operações forem true)
        // || - op1 || op2 = boolean (se alguma operação for true)
        // != - !valor = inverte o valor (true -> false ou false -> true)

        boolean temDinheiro = true;
        boolean temTempo = false;

        if (temDinheiro && temTempo) {
            System.out.println("Pode viajar!!");
        } else {
            System.out.println("Não pode viajar :( ");
        }

        // 3 - LOOPS - While e For
        // FOCO em FOR
        // Laços de repetições (repetir alto, até que sua condição seja atendida),
        // evita repetição mecânica do código (ela vira automática)

        int contador = 1;

        while (contador <= 5){ // Precisa ter condição de encerramento para n cair em loop infinito
            System.out.println(contador + " ");
            contador++; // iteração = cada passagem pela estrutura do loop
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        // Exemplos Praticos - Analise Numerica
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int somaPar = 0;
        int somaImpar = 0;

        // chamar a unidade da minha lista : lista
        for (int num : numeros){

            if(num % 2 == 0){ // -> faz a divisão para saber se o % 2 == 0
                somaPar += num; // -> pega a variavel soma num da lista numeros
                //System.out.println("Número Par: " + num);
            }else {
                somaImpar += num;
                //System.out.println("Número Impar: " + num);
            }

            if (num % 3 == 0) {
                System.out.println("O número " + num + " é multiplo de 3.");
            }

        }

            System.out.println("Soma dos pares: " + somaPar);
            System.out.println("Soma dos impares: " + somaImpar);

            // break -> ejetar o loop (PARAR)
            // continue -> pular uma execução (continua o loop até o break ou a condição for false)
            for (int i = 1; i <= 10; i++){ // variaveis em loops, podem conter mesmo nome
                if (i == 2){
                    continue;
                }
                if (i == 5){
                    break;
                }
                System.out.println(i);
            }
    }
}
