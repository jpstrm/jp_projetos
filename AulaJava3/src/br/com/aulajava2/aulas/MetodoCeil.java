package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

//o m�todo ceil arredonda os valores para o pr�ximo inteiro, ex: 7.6 = 8.0
//m�todo round arredonda um n�mero da meneira correta, at� .5 arredonda pra cima, abaixo disso arredonda pra baixo
public class MetodoCeil {
	
	public static void main(String[] args)
	{
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero double: "));
		
		JOptionPane.showMessageDialog(null, "O valor digitado �: " + num +
											"\nUsando o ceil: " + Math.ceil(num));
	}

}
