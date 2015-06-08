package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

/*Escreva um programa que leia uma palavra de cinco letras e produza todas as possíveis palavras de 3 letras
 * que podem ser derivadas das palavra de cinco letras. Por exemplo: as palavras de três letras produzidas
 * a partir da palavra "casal" incluem "cas", "sal", "asa", etc.
 */
public class ExercicioIndexOf2 {
	
	public static void main(String args[])
	{
		String s, str = "";
		int qtde = 1;
		
		s = JOptionPane.showInputDialog("Entre com a palavra de 5 letras");
		
		for (int p1 = 0; p1 <= 4; p1++)
		{
			for (int p2 = 0; p2 <= 4; p2++)
			{
				if (p2 == p1)
					continue;
				
				for (int p3 = 0; p3 <= 4; p3++)
				{
					if ((p3 == p1) || (p3 == p2))
						continue;
					
					if (qtde % 10 == 0)
						str = str + s.charAt(p1) + s.charAt(p2) + s.charAt(p3) + "\n";
					else
						str = str + s.charAt(p1) + s.charAt(p2) + s.charAt(p3) + " - ";
						qtde++;
				}
			}
		}
		//System.out.println(str);
		JOptionPane.showMessageDialog(null, "Quantidade = " + qtde + "\n" + str);
	}

}
