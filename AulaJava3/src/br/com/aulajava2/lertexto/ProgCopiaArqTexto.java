package br.com.aulajava2.lertexto;

import java.io.File;

public class ProgCopiaArqTexto
{
	public static void main(String[] args)
	{
		File entrada = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\saida.txt");
		File saida = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\C�pia do Curso Java.txt");
		String s = LerTexto.ler(entrada);
		CriarTexto.escreve(saida, s);
	}
}