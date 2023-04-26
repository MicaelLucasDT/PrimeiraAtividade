import java.util.Scanner;



public class QuestaoQuarta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o valor da compra:");
		double valor = entrada.nextDouble();
		
		 double prestação = valor / 5;
		 System.out.println("O valor da compra será pago em cinco prestações de " + prestação);
		 
	

	}

}
