package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

//Equals verifica se as strings s�o iguais em rela��o as strings apenas, o equalsIgnoreCase ignora se as strings est�o em caixa alta ou n�o.
public class Equals {
	public static void main(String[] args)
	{
		String nome1, nome2;
		//String s1 = new String("EstUdo");
		
		nome1 = JOptionPane.showInputDialog("Insira uma palavra para comparar");
		nome2 = JOptionPane.showInputDialog("Digite outra palavra");
		
		if (nome1.equalsIgnoreCase(nome2))
		{
			JOptionPane.showMessageDialog(null, "Os dados s�o iguais");
		} else {
			JOptionPane.showMessageDialog(null, "Os dados n�o s�o iguais");
		}
		
		/*if (s1.equalsIgnoreCase("Estudo"))
		{
			JOptionPane.showMessageDialog(null, "Valor igual");
		} else {
			JOptionPane.showMessageDialog(null, "Valor diferente");
		}*/
	}

}
