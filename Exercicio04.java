import java.util.Scanner;

/*
 * 4. Dado os tr�s lados de um tri�ngulo determinar o per�metro do mesmo. 
 */

public class Exercicio04 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		double lado01, lado02, lado03, perimetro;
		
		
		System.out.println("Qual o tamanho do primeiro lado ? ");
		lado01 = sc.nextDouble();
		
		System.out.println("Qual o tamanho do segundo lado ? ");
		lado02 = sc.nextDouble();
		
		System.out.println("Qual o tamanho do terceiro lado ? ");
		lado03 = sc.nextDouble();
		
		perimetro = lado01 + lado02 + lado03;
		
		System.out.println("O per�metro do tri�ngulo �: "+ perimetro);
		
		
		sc.close();

	}

}
