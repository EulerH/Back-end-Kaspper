import javax.swing.JOptionPane;

public class TesteCMaiorValor {

	public static void main(String[] args) {

/* int  palpite = Integer.parseInt(JOptionPane.showInputDialog(null, 
		"Digite o seu número: "));*/
		
		int maiorValor, num1, num2, num3,num4;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1 valor"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2 valor"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3 valor"));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 4 valor"));
		
		
		
		
		
		maiorValor = num1 + num2 + num3 + num4;
		
		JOptionPane.showMessageDialog(null,"o primeiro valor é: "+ maiorValor);

	}

}



/**
 * 

import javax.swing.JOptionPane;

public class Exerc7 {

	public static void main(String[] args) {

		int idade = 0;
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade em dias: "));

		int idade_ano = idade / 365;
		int idade_mes = idade_ano * 12;
		int idade_dias = idade_mes * 30;

		JOptionPane.showMessageDialog(null,
				"A idade é : " + idade_ano + " Anos " + idade_mes + " Meses " + idade_dias + " dias ");

	}

}
*/
