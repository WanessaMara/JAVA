package POO;

public class ProgramaPrincipal {
    public static void main(String [] args){

        // Criar um new obj => nova instancia
        //tipo(classe) -> var = new classs()
        Pessoa pessoa1 = new Pessoa("Wanessa", 22, 1.63, 83.5);

//        pessoa1.setNome("Wanessa");
//        pessoa1.setIdade(22);
//        pessoa1.setAltura(1.63);
//        pessoa1.setPeso(83.5);

//        System.out.println(pessoa1.getNome());
//        System.out.println(pessoa1.getIdade());
//        System.out.println(pessoa1.getAltura());
//        System.out.println(pessoa1.getPeso());

        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade() + " " + pessoa1.getAltura() + " " + pessoa1.getPeso());
        System.out.println(pessoa1.calcularImc());
        System.out.println(pessoa1.classificarImc());



    }
}
