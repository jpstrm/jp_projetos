package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;

public class TratandoExcecoes2 
{
	public static void main (String[] args)
	{
		int x = 20, y = 0, z;
		
		try
		{
			z = x / y;
			System.out.println(z);
		}
		catch (Exception erro)
		{
			JOptionPane.showMessageDialog(null,	"Erro, nome do erro: " + erro.getMessage());
			erro.printStackTrace();
		}
	}
}