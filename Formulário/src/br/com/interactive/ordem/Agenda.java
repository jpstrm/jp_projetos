package br.com.interactive.ordem;

public class Agenda {
	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conect();
		if(bancoDeDados.thisConected()) {
			bancoDeDados.listContacts();
			//bancoDeDados.insertContact("Rafael", "6583-0486");
			//bancoDeDados.editContact("1", "paulo", "9876-5432");
			//bancoDeDados.deleteContact("1");
			bancoDeDados.desconect();
			
		} else {
			System.out.println("N�o foi poss�vel conectar ao banco de dados!");
		}
	}

}
