import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int idade; 
		String pessoa;
		
		
		int ano = 365;
		int mes = 30;
		//int dia = 1;
		
		///saber quantos dias tem através do ano.
		
	
		System.out.println("Qual seu nome?: " );
		pessoa = sc.next();
		System.out.println("Qual a sua idade ? " );
		idade = sc.nextInt();
		
	
		
		System.out.println(pessoa + " tem " + idade + " anos de idade. ");
		
		int resultDiasVida = (idade * ano);
		
		int resultMesVida = (resultDiasVida / mes);
		
		System.out.println("A sua quantidade de dias vivo é de "+ resultDiasVida
							+ " e "+ resultMesVida + " Mêses. ");
		

		
		sc.close();

	}

}



/*
 * 7. Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.
 */