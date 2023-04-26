import java.util.Scanner;



public class QuestaoTerceira {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura em Celsius:");
		double temp = entrada.nextDouble();
		
		double resultado = temp * 1.8 + 32;
		System.out.println("A temperatura em graus Farenheit é:" + resultado);
		
		
		
		

	}

}
