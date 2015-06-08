package br.com.aulajava2.aulas;

import java.io.File;

//import javax.swing.JOptionPane;

public class Arquivos
{
	public static void main (String[] args)
	{
		File arq = new File("D:\\Dropbox\\Documentos\\cursos\\Curso completo de Java\\Aula de Arquivos.txt");
		
		System.out.println("Nome do aquivo: " + arq.getName());
		System.out.println("Caminho do Arquivo: " + arq.getAbsolutePath());
		System.out.println("O Arquivo existe? " + arq.exists());
		System.out.println("É um diretório? " + arq.isDirectory());
		System.out.println("É um arquivo? " + arq.isFile());
		System.out.println("O Arquivo pode ser lido? " + arq.canRead());
		System.out.println("O Arquivo pode ser escrito? " + arq.canWrite());
		//JOptionPane.showMessageDialog(null, "Caminho do Arquivo: " + arq.getAbsolutePath());
		//JOptionPane.showMessageDialog(null, "Caminho do Arquivo: " + arq.isFile());
	}
}
