import java.util.Scanner;

/*
 * 1. Dado o tamanho da base e da altura de um ret�ngulo, calcular a sua �rea e o seu
per�metro.
 */
public class Exercicio01 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		double lados = 0;
		double largura = 0;
		
		
		double area = 0;
		double perimetro = 0;
	
		
		//Per�metro do ret�ngulo = 2 x (base + altura).
		
		
		System.out.println("Qual o tamanho dos lados do ret�ngulo ? ");
		lados = sc.nextDouble() *2;
		
		System.out.println("Qual o tamanho das larguras do ret�ngulo ? ");
		largura = sc.nextDouble() *2;
		
		
		perimetro = lados + largura;
		
		System.out.println("O per�metro do tri�ngulo � "+ perimetro); ;
		
		
		area = lados * largura;
		
		System.out.println("A �rea do tri�ngulo � "+ area);
		
		
		sc.close();
	}

	
}
