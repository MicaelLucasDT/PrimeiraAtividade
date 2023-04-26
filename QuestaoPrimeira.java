import java.util.Scanner;  


public class QuestaoPrimeira {

	public static void main(String[] args) {
	
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Insira um valor");
		double n1 = entrada.nextDouble();
		System.out.println("Insira outro valor");
		double n2 = entrada.nextDouble();
		
		double soma = n1 + n2;
		double sub = n1 - n2;
		double mult = n1 * n2;
		double div = n1 / n2;
		
		System.out.println("A soma dos dois valores é igual a:" + soma);
		System.out.println("A subtração dos dois valores é igual a:" + sub);
		System.out.println("A multiplicação dos dois valores é igual a:" + mult);
		System.out.println("A divisão dos dois valores é igual a:" + div);
		
		
	}

}
