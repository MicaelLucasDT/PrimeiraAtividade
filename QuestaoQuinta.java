import java.util.Scanner;
import java.text.DecimalFormat;




public class QuestaoQuinta {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o número de pães vendidos durante o dia:");
		double paes = entrada.nextDouble();
		System.out.println("Insira o número de broas vendidas durante o dia:");
		double broas = entrada.nextDouble();
		
		double ValorPaes = paes * 0.12;
		double ValorBroas = broas * 1.50;
		
		double ValorTotal = ValorPaes + ValorBroas;
		
		System.out.println("O valor arreacado com as vendas dos pães foi: " + "R$"+ValorPaes);
		System.out.println("O valor arrecadado com as vendas das broas foi:" + "R$"+ValorBroas);
		System.out.println("O valor total arrecadado foi: " + ValorTotal);
		
		double poupança = ValorTotal / 10;
		System.out.println("O valor que deverá ser guardado na poupança será de: " + "R$"+poupança);
		
		
		

	}

}
