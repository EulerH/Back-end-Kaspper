

/*
 * 2. Dado o tamanho do lado de um quadrado, calcular a �rea e o per�metro do mesmo.
 */
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double lado = 0;
		double resultP = 0;
		double resultA = 0;

		
		System.out.println("Qual tamanho dos lados do quadrado? ");
		lado = sc.nextDouble()*2;
		
		
		
		resultP = lado * 4;
		System.out.println("O per�metro do quadrado �: "+ resultP);
		
		resultA  = lado*4;
		
		System.out.println("A �rea do quadrado �: "+ resultA);
		
		sc.close();
	}
	

}
