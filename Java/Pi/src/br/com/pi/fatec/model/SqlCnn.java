package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCnn {
	private Connection cnn = null;
	
	/***
	 * Realiza a conexão com a base de dados
	 */
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
	
	/***
	 * Verifica se já existe uma conexão aberta, se não existir ele abre uma conexão.
	 * @return retorna a conexão aberta
	 */
	protected Connection getConnection() {
		if(this.cnn == null) {
			doConnection();
		}
		
		return this.cnn;
	}
	
	/***
	 * Fecha a conexão com a base de dados
	 * @throws SQLException Se algo der errado durante a execução do método uma exceção será lançada
	 */
	protected void closeConnection() throws SQLException {
		try {
			this.cnn.close();
			this.cnn = null;
			
		} catch (Exception ex) {
			throw new SQLException("Não possível fechar a conexão! Erro: " + ex.getMessage());
		}
	}
}
