package br.com.aulajava2.lertexto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto
{
	public static String ler(File arquivo)
	{
		StringBuffer sb = new StringBuffer();
		
		try
		{
			FileReader reader = new FileReader(arquivo);
			int c = 0;
			
			while(c != -1)
			{
				c = reader.read();
				//if (c != -1)
				//{
					sb.append( (char) c);
				//}
			}
			reader.close();
		}
		catch (IOException erro)
		{
			System.out.println("Ocorreu um erro na leitura do arquivo: ");
			erro.printStackTrace();
		}
		return sb.toString();
	}
}
