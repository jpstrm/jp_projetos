package br.com.aulajava2.lertexto;

import java.io.File;

public class ProgCopiaBinario
{
	public static void main(String[] args)
	{
		try
		{
			File entrada = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\Costa Rican Frog.jpg");
			File saida = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\Copia Costa Rican Frog.jpg");
		
			System.out.println("Iniciando a c�pia...");
			CopiarBinario.copia(entrada, saida);
			System.out.println("C�pia realizada com sucesso!");
		}
		catch (Exception erro)
		{
			System.out.println(erro.getMessage());
		}
	}
}