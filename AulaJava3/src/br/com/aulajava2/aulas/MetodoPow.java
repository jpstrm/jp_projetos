package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


/*Quando se deseja um número ao quadrado ou qualquer outro valor de potência usa-se o método pow.
 * A potenciação de um número pode ser calculada pelo método pow. Tem que se inserir o valor
 * da base e da potência, devem ser do tipo double.
 */
public class MetodoPow {
	
	public static void main(String[] args)
	{
		int base = 5, expoente = 3;
		double b = 2, exp = 5;
		
		JOptionPane.showMessageDialog(null, "Potência 1: " + Math.pow(base, expoente) +
									"\nPotência 2: " + Math.pow(b, exp));
	}

}
