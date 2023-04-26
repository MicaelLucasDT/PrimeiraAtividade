import java.util.Scanner;


public class QuestaoSetima {

	public static void main(String[] args) {				
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = entrada.nextLine();
		
		System.out.println("Qual seu peso?");
		double peso = entrada.nextDouble();	
		
		System.out.println("Qual sua altura?");
		double altura = entrada.nextDouble();
		
		double alt = altura * altura;
		double imc = peso/alt;		
		
		System.out.println("Olá " + nome + "!!!");
		System.out.println("Seu IMC é:" + imc);
		
		

	}

}
