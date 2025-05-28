package CalculosMatematicos;

import java.util.Scanner;

public class Calcular_Piscina {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        // dados básicos da piscina
        System.out.println(" Entre com o comprimento da pisicina: ");
        float comprimento = sc.nextFloat();

        System.out.println(" Entre com a largura da pisicina: ");
        float largura = sc.nextFloat();

        System.out.println(" Entre com a profundidade da pisicina: ");
        float profundidade = sc.nextFloat();

        // menu para escolher qual o usuário quer calcular
        System.out.println("MENU");
        System.out.println(" Digite 1 - Para calcular o perímetro: ");
        System.out.println(" Digite 2 - Para calcular a área: ");
        System.out.println(" Digite 3 - Para calcular o volume: ");
        System.out.println("SAIR");

        //interação com o menu acima
        int operacoes = sc.nextInt();
        float resultado =0;

        //switch para confirmar qual número do manu calcular
        switch(operacoes){
            case 1:
                calcularPerimetro(largura, comprimento);
                break;

                case 2:
                    calcularArea(largura, comprimento);
                    break;

                    case 3:
                        calcularVolume(largura, comprimento, profundidade);
                        break;

                        case 4 :
                            break;

                            default:
                                System.out.println(" Opção inválida. Digite novamente.");
                                 break;
        }
        sc.close();
    }
    public static void calcularPerimetro(float largura, float comprimento){
        float perimetro = (largura + comprimento) * 2;
        System.out.println(" O perímetro da piscina é: " + perimetro);
    }
        public static void calcularArea(float largura, float comprimento){
        float area = largura * comprimento;
        System.out.println(" A área da piscina é: " + area);
    }
         public static void calcularVolume(float largura, float comprimento, float profundidade){
         float volume = largura * comprimento * profundidade;
         System.out.println(" O volume da piscina é: " + volume);
    }
}
