package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


//cálcula a raiz quadrada de um número
public class MetodoSqrt {
	
	public static void main(String[] args)
	{
		int a = 9;
		double b = 16;
		
		try {
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
			JOptionPane.showMessageDialog(null, "Números digitados: " + a + " e " + b + 
												"\n Raiz quadrada: " + Math.sqrt(a) + " e " + Math.sqrt(b));
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Número inserido não é um inteiro!");
			JOptionPane.showMessageDialog(null, "Mensagem de erro: " + e.getMessage());
		}

	}

}
