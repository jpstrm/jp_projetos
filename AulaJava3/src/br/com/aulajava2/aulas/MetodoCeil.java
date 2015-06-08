package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

//o método ceil arredonda os valores para o próximo inteiro, ex: 7.6 = 8.0
//método round arredonda um número da meneira correta, até .5 arredonda pra cima, abaixo disso arredonda pra baixo
public class MetodoCeil {
	
	public static void main(String[] args)
	{
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número double: "));
		
		JOptionPane.showMessageDialog(null, "O valor digitado é: " + num +
											"\nUsando o ceil: " + Math.ceil(num));
	}

}
