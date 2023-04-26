import java.util.Scanner;



public class QuestaoSegunda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura em Farenheit:");
		double temp = entrada.nextDouble();
		
		double resultado = (temp - 32) / 1.8;
		System.out.println("A temperatura em graus Celsius é:" + resultado);
		
		
		
		
		

	}

}
