package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCnn {
	private Connection cnn = null;
	
	protected void doConnection() {
		String server = System.getenv("LocalServer");
		String db = "PI"; //System.getenv("PITS");
		String pw = System.getenv("Senha");
		
		String url = "jdbc:sqlserver://" + server + ";databaseName=" + db +
		                       ";user=sa;password=" + pw + ";";
		try {
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection conexao = DriverManager.getConnection(url);
		    
		    this.cnn = conexao;
		    
		} catch (ClassNotFoundException e) {
		    // Erro caso o driver JDBC não foi instalado
		    e.printStackTrace();
		} catch (SQLException e) {
		    // Erro caso haja problemas para se conectar ao banco de dados
		    e.printStackTrace();
		}
	}
	
	protected Connection getConnection() {
		if(this.cnn == null) {
			doConnection();
		}
		
		return this.cnn;
	}
	
	protected void closeConnection() throws SQLException {
		try {
			this.cnn.close();
		} catch (Exception ex) {
			throw new SQLException("Não possível fechar a conexão! Erro: " + ex.getMessage());
		}
	}
}
