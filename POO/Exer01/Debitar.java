package Exer01;

public class Debitar {
    public static float debitar(float saldo, float valorDebito){
        if(saldo >= valorDebito){
            return saldo - valorDebito;
        }else{
            System.out.println(" Saldo insuficiente para realizar o débito. ");
            return saldo;
        }
    }
}
