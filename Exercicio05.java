/*
 * 5. Ler um n�mero inteiro e exibir o seu sucessor
 */

import java.util.Scanner;


public class Exercicio05 {


		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				int numero = 0;
				
				System.out.println("Digite um n�mero para saber qual seu antecessor e sucessor");
				numero = sc.nextInt();

				
				numero = numero +1;
				System.out.println("O n�mero sucessor do n�mero digitado � "+ numero);
				numero = numero -2;
				System.out.println("O n�mero antecessor do n�mero digitado � "+numero);
			}
			
		}

	

}
