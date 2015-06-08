package br.com.aulajava2.lertexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarTexto
{
	public static void escreve(File arquivo, String texto)
	{
		try
		{
			FileWriter writer = new FileWriter(arquivo);
			
			char[] c = texto.toCharArray();
			
			for (int cont = 0; cont < c.length; cont++)
			{
				writer.write(c[cont]);
			}
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
