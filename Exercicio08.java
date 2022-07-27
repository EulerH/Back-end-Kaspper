import java.util.Scanner;


public class Exercicio08 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner( System.in);
		double far = 0;
		double celc = 0;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		far = sc.nextDouble();

		celc = (far - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é: " + celc + "graus");

		sc.close();

	}
}


/*
8. Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um 
valor de temperatura em Fahrenheit e exibi-lo em Celsius 
*/

//Formula Conversão Fahrenheit para Celsius é C = 5/9(F-32)

