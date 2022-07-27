/*
 * 5. Ler um número inteiro e exibir o seu sucessor
 */

import java.util.Scanner;


public class Exercicio05 {


		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				int numero = 0;
				
				System.out.println("Digite um número para saber qual seu antecessor e sucessor");
				numero = sc.nextInt();

				
				numero = numero +1;
				System.out.println("O número sucessor do número digitado é "+ numero);
				numero = numero -2;
				System.out.println("O número antecessor do número digitado é "+numero);
			}
			
		}

	

}
