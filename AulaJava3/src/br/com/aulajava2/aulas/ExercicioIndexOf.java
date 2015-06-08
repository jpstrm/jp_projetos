package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

/*escreva um programa que insira uma linha de texto e um caractere de pesquisa. Utilize o m�todo
String indexOf para determinar o n�mero de ocorr�ncias do caractere no texto.*/
public class ExercicioIndexOf {
	public static void main(String args[])
	{
		String s, str;
		char c;
		int posicao, qtde = 0;
		
		s = JOptionPane.showInputDialog("Digite o texto");
		str = JOptionPane.showInputDialog("Digite o caracter de pesquisa");
		
		c = str.charAt(0);
		posicao = s.indexOf(c, 0);
		System.out.println("antes do while: " + posicao);
		
		while (posicao != -1 )
		{
			System.out.println("no while: " + posicao);
			posicao = s.indexOf(c, posicao + 1);
			qtde++;
		}
		
		JOptionPane.showMessageDialog(null, "Texto = " + s +
											"\nN�meros de vezes encontrado = " + qtde);
		System.out.println("depois do while: " + posicao);
	}

}
