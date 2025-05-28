package Get_Set;

public class Funcionario {
        private float salario;
        public Funcionario(float salario){
            this.salario = salario;
        }
        public float getSalario(){
            return salario;
        }
        public void setSalario(){
            this.salario = salario;
        }
        public void exibirInfo(){
            System.out.println(" Salário: " + salario);
        }
}
