package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


//c�lcula a raiz quadrada de um n�mero
public class MetodoSqrt {
	
	public static void main(String[] args)
	{
		int a = 9;
		double b = 16;
		
		try {
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
			JOptionPane.showMessageDialog(null, "N�meros digitados: " + a + " e " + b + 
												"\n Raiz quadrada: " + Math.sqrt(a) + " e " + Math.sqrt(b));
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "N�mero inserido n�o � um inteiro!");
			JOptionPane.showMessageDialog(null, "Mensagem de erro: " + e.getMessage());
		}

	}

}
