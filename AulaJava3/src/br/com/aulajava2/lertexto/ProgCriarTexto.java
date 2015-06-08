package br.com.aulajava2.lertexto;

import java.io.File;

public class ProgCriarTexto
{
	public static void main (String[] args)
	{
		File arquivo = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\saida.txt");
		String texto = "Este texto eu quero que seja passado\npara o arquivo que eu estou criando";
		CriarTexto.escreve(arquivo, texto);
	}

}
