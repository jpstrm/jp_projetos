package br.com.interactive.ordem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	public void conect() {
		String servidor = "jdbc:mysql://localhost:3306/agenda";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
				Class.forName(driver);
				this.connection = DriverManager.getConnection(servidor, usuario, senha);
				this.statement = this.connection.createStatement();		
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean thisConected() {
		if(this.connection != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void listContacts() {
		try {
				String query = "SELECT * FROM contato ORDER BY nome;";
				this.resultset = this.statement.executeQuery(query);
				while(this.resultset.next()) {
					System.out.println("ID: " + this.resultset.getString("id") + " - Nome: " + this.resultset.getString("nome")
							+ " - Telefone: " + this.resultset.getString("telefone"));
				}
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void insertContact(String nome, String telefone) {
		try {
				String query = "INSERT INTO contato(nome, telefone) VALUES('" + nome + " ', '" + telefone + "');";
				this.statement.executeUpdate(query);
				System.out.println("Dados inseridos com sucesso.");
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void editContact(String id, String nome, String telefone) {
		try {
				String query = "UPDATE contato SET nome = '" + nome + "', telefone = '" + telefone + "' WHERE id = " + id + ";";
				this.statement.executeUpdate(query);
				System.out.println("Dados editados com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void deleteContact(String id) {
		try {
				String query = "DELETE FROM contato WHERE id = " + id + ";";
				this.statement.executeUpdate(query);
				System.out.println("Dados deletados com sucesso.");
		} catch (Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void desconect() {
		try {
				this.connection.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
