package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCnn {
	private Connection cnn = null;
	
	/***
	 * Realiza a conex�o com a base de dados
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
		    // Erro caso o driver JDBC n�o foi instalado
		    e.printStackTrace();
		} catch (SQLException e) {
		    // Erro caso haja problemas para se conectar ao banco de dados
		    e.printStackTrace();
		}
	}
	
	/***
	 * Verifica se j� existe uma conex�o aberta, se n�o existir ele abre uma conex�o.
	 * @return retorna a conex�o aberta
	 */
	protected Connection getConnection() {
		if(this.cnn == null) {
			doConnection();
		}
		
		return this.cnn;
	}
	
	/***
	 * Fecha a conex�o com a base de dados
	 * @throws SQLException Se algo der errado durante a execu��o do m�todo uma exce��o ser� lan�ada
	 */
	protected void closeConnection() throws SQLException {
		try {
			this.cnn.close();
			this.cnn = null;
			
		} catch (Exception ex) {
			throw new SQLException("N�o poss�vel fechar a conex�o! Erro: " + ex.getMessage());
		}
	}
}
