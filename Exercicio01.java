import java.util.Scanner;

/*
 * 1. Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
perímetro.
 */
public class Exercicio01 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		double lados = 0;
		double largura = 0;
		
		
		double area = 0;
		double perimetro = 0;
	
		
		//Perímetro do retângulo = 2 x (base + altura).
		
		
		System.out.println("Qual o tamanho dos lados do retângulo ? ");
		lados = sc.nextDouble() *2;
		
		System.out.println("Qual o tamanho das larguras do retângulo ? ");
		largura = sc.nextDouble() *2;
		
		
		perimetro = lados + largura;
		
		System.out.println("O perímetro do triângulo é "+ perimetro); ;
		
		
		area = lados * largura;
		
		System.out.println("A área do triângulo é "+ area);
		
		
		sc.close();
	}

	
}
