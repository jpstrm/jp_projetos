package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

public class CompareTo {
	public static void main(String[] args)
	{
		String s1 = "uva";
		String s2 = "abacaxi";
		String res = "";
		
		//compareTo - compara as strings de acordo com a tabela ASC, e n�o pelo tamanho de letras
		if (s1.compareTo(s2) == 0)
		{
			res = "Strings iguais";
		} else if (s1.compareTo(s2) > 0) {
				res = "String " + s1 + " � maior que a string " + s2;
			} else {
				res = "String " + s1 + " � menor que a string " + s2;
			}
		
		//System.out.println(res);
		JOptionPane.showMessageDialog(null, res);
	}

}
