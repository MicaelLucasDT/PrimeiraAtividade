import java.util.Scanner;


public class QuestaoSexta {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número:");
		int num = entrada.nextInt();
		
		int suc = num + 1;
		int ant = num - 1;
		
		System.out.println("O sucessor do número é:" + suc);
		System.out.println("O antercessor do número é:" + ant );
		
		
		
		

	}

}
