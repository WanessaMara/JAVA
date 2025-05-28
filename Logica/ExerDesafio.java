package listaRepeticaoWhile;

public class ExerDesafio {

	public static void main(String[] args) {
		
		int pot, i, potencia;
		pot = 0;
		while(pot <= 10) {
			potencia = pot;
			i = 1;
			while ( i < 3){
				potencia = pot * potencia;
				i++;
			}
		System.out.println( pot + " ^ 3 = " + potencia);
		pot++;
		}
		System.out.println(" === exemplo em for ===");
		for ( pot = 0; pot <= 10; pot++) {
			potencia = pot;
			for ( i = 1; i < 3; i++); {
				potencia = pot * potencia;
			}
			System.out.println(pot + " ^ 3 = " + potencia);
		}
	
	}
}