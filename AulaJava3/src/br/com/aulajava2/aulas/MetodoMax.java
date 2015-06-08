package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

//método max verifica em dois valores qual é o maior que podem ser do tipo double, float, int ou long.
public class MetodoMax {
	
	public static void main(String[] args)
	{
		int a1 = 5, a2 = 10;
		float f1 = 4.0f, f2 = 5.8f;
		double d1 = 150.8, d2 = 100.3;
		
		JOptionPane.showMessageDialog(null, "Maior inteiro: " + Math.max(a1, a2) +
											"\nMaior float: " + Math.max(f1, f2) + 
											"\nMaior double: " + Math.max(d1, d2));
		
	}
}
