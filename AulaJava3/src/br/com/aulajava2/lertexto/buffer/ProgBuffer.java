package br.com.aulajava2.lertexto.buffer;

import java.io.File;

public class ProgBuffer
{
	public static void main(String[] args)
	{
		File entrada = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\Escrevendo a partir do teclado.txt");
		File saida = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\CópiaSaidaBuffer.txt");
		String texto = LendoBuffer.ler(entrada);
		CriaTextoBuffer.escreve(saida, texto);
		
	}
}
