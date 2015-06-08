package br.com.aulajava2.lertexto.buffer;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CriaTextoBuffer
{
	public static void escreve(File arquivo, String texto)
	{
		try
		{
			FileWriter writer = new FileWriter(arquivo);
			BufferedWriter bufWriter = new BufferedWriter(writer);
			bufWriter.write(texto);
			bufWriter.close();
			writer.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}