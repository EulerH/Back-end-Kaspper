import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int num1, num2, quociente, restoDiv;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1� n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2� n�mero: "));
		
		quociente = num1/num2;
		restoDiv = num1%num2;
		JOptionPane.showMessageDialog(null,"O quociente dos numeros "+ 
									num1 +" e " + num2 + " �: "+ quociente
									+" e o resto �: "+ restoDiv);

		
	}

}


/*
dividendo = divisor * quociente + resto
6. Ler dois n�meros inteiros e exibir o quociente e o resto da divis�o inteira entre eles.
*/