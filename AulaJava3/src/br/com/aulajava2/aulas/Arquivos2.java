package br.com.aulajava2.aulas;

import java.io.File;

public class Arquivos2
{
	public static void main (String[] args)
	{
		System.out.println("Separador de Path: " + File.pathSeparator);
		System.out.println("Separador de Diretório: " + File.separator);
		File discos[] = File.listRoots();
		
		for (int cont=0; cont < discos.length; cont++)
		{
			System.out.println("Disco " + cont + "; " + discos[cont]);
		}
		System.out.println("Disco length: " + discos.length);
	}
}