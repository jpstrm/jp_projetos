package br.com.aulajava2.lertexto;

import java.io.File;

public class ProgLerTexto {
	
	public static void main (String[] args)
	{
		File arquivo = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\Aula de Arquivos.txt");
		String s = LerTexto.ler(arquivo);
		System.out.println(s);
	}
}
