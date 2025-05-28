package com.wanessa.cursojava.aula20;

import java.util.Scanner;

public class Exer06_JogoDaVelha {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // arrays do jogo da velha
        int [][] jogoVelha = new int[3][3];

        // print dos jogadores
        System.out.println(" Jogador 1 = X ");
        System.out.println(" Jogador 2 = O ");

        // iniciando variaveis da jogadas
        int jogada = 1;
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        // loop das jogadas em WHILE para escolhas
        while(!ganhou){
            // if para tais jogadas
            if(jogada % 2 == 1){ // jogador 1
                //priint das possiveis jogadas
                System.out.println(" Vez do jogador 1. Escolha linha e coluna (1-3) ");
                sinal = 'X';
            } else {
                System.out.println(" Vez do jogador 2. Escolha linha e coluna (1-3) ");
                sinal = 'O';
            }
        // loop WHILE para linhas validas de jogadas
        boolean linhaValida = false;
            // loop
            while(!linhaValida){
            System.out.println(" Entre com a linha (1, 2 ou 3) ");
            linha = sc.nextInt();
            // if para escolhas de linhas validas
                if(linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else{
                    System.out.println(" Entrada inválida, tente novamente. ");
                }
        }
            // loop para coluna
            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println(" Entre com a coluna (1, 2 ou  3) ");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else{
                    System.out.println(" Entrada inválida, tente novamente. ");
                }
            }

            // verificar posição válida
            linha--;
            coluna--;
            // if para verifiar jogadas
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println(" Posição já usada, tente novamente. ");
            }else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }
            // print do tabuleiro
            for(int i = 0; i < jogoVelha.length; i++){
                for(int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
            // verificar se tem ganhador
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || //diagonal
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){ //diagonal inversa
                ganhou = true;
                System.out.println(" Parabéns, jogador 1 ganhou! ");
            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){
                ganhou = true;
                System.out.println(" Parabéns, jogador 2 ganhou! ");
            }else if (jogada > 9){
                ganhou = true;
                System.out.println(" Ninguém ganhou essa partida. ");
            }

        }
    sc.close();
    }
}

