package br.com.aulajava2.lertexto.buffer;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LendoBuffer
{
	public static String ler(File arquivo)
	{
		StringBuffer sb = new StringBuffer();
		
		try
		{
			FileReader reader = new FileReader(arquivo);
			BufferedReader bufReader = new BufferedReader(reader);
			String s;
			
			do
			{
				s = bufReader.readLine();
				if (s != null)
				{
					sb.append(s + "\r\n");
				}
			} while(s !=null);
			reader.close();
			bufReader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return sb.toString();
	}
}