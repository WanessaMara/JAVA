package ClasseAbstrata;

public class TestaFuncionario {

    public static void main(String[]args){

        Gerente gerente = new Gerente();
        Desenvolvedor dev = new Desenvolvedor();

        gerente.setSalario(1000);
        System.out.println(gerente.getBonus());

        dev.setSalario(1000);
        System.out.println(dev.getBonus());

        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adicional(dev);
        totalizador.adicional(gerente);
        System.out.println(totalizador.getTotal());
    }
}
