package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


/*Quando se deseja um n�mero ao quadrado ou qualquer outro valor de pot�ncia usa-se o m�todo pow.
 * A potencia��o de um n�mero pode ser calculada pelo m�todo pow. Tem que se inserir o valor
 * da base e da pot�ncia, devem ser do tipo double.
 */
public class MetodoPow {
	
	public static void main(String[] args)
	{
		int base = 5, expoente = 3;
		double b = 2, exp = 5;
		
		JOptionPane.showMessageDialog(null, "Pot�ncia 1: " + Math.pow(base, expoente) +
									"\nPot�ncia 2: " + Math.pow(b, exp));
	}

}
