import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int num1, num2, quociente, restoDiv;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1º número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2º número: "));
		
		quociente = num1/num2;
		restoDiv = num1%num2;
		JOptionPane.showMessageDialog(null,"O quociente dos numeros "+ 
									num1 +" e " + num2 + " é: "+ quociente
									+" e o resto é: "+ restoDiv);

		
	}

}


/*
dividendo = divisor * quociente + resto
6. Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.
*/