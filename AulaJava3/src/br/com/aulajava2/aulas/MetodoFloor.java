package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

//o método floor arredonda um número para baixo, ex: 7.6 = 7.0
public class MetodoFloor {
	
	public static void main(String arg[])
	{
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor double: "));
		
		JOptionPane.showMessageDialog(null, "Valor digitado: " + num +
											"\nUsandoo floor: " + Math.floor(num));
	}

}
