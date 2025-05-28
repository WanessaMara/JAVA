package ClasseAbstrata;

public class TotalizadorDeBonus {

    public double total = 0;

    public void adicional(Funcionario f){
        this.total += f.getBonus();
    }

    public double getTotal(){
        return total;
    }
}
