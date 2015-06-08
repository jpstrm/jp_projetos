package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


//utiliza para verificar o menor valor entre dois números, que podem ser do tipo double, float, int ou long.
public class MetodoMin {
	
	public static void main(String[] args)
	{
		int i1 = 9, i2 = 7;
		float f1 = 7, f2 = 3;
		long l1 = 100000, l2 = 1500003;
		double d1 = 3.5, d2 = 100.75;
		
		JOptionPane.showMessageDialog(null, "Menor inteiro: " + Math.min(i1, i2) +
											"\nMenor float: " + Math.min(f1, f2) +
											"\nMenor long: " + Math.min(l1, l2) +
											"\nMenor double: " + Math.min(d1, d2));
	}
}
