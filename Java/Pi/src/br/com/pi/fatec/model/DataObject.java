package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class DataObject extends SqlCnn {
	/***
	 * Persiste as informa��es no banco de dados
	 * @return Retorna o id do registro rec�m persistido 
	 * @throws SQLException caso acontece�a algum problema durante a execu��o do m�todo uma exce��o ser� laran�ada
	 */
	public abstract int create() throws SQLException;

	/***
	 * Atualiza as informa��es no banco de dados
	 * @return Retorna um valor booleano 
	 * @throws SQLException caso acontece�a algum problema durante a execu��o do m�todo uma exce��o ser� laran�ada
	 */
	public abstract boolean update() throws SQLException;

	/***
	 * Deleta as informa��es do banco de dados
	 * @param id n�mero identificador do registro no banco de dados
	 * @return Retorna um valor booleano para identificarmos se o registro foi deletado 
	 * @throws SQLException caso acontece�a algum problema durante a execu��o do m�todo uma exce��o ser� laran�ada
	 */
	public abstract boolean delete(int id) throws SQLException;
	
	/***
	 * Localiza um registro no banco de dados e preenche o dto do escopo global da classe
	 * @param param Par�metro utilizado para encontrar o registro na base
	 * @throws SQLException caso acontece�a algum problema durante a execu��o do m�todo uma exce��o ser� laran�ada
	 */
	public abstract void read(String param) throws SQLException;
	
	/***
	 * Formata a data que vem do banco para poder ficar apresent�vel na tela
	 * @param data uma string correspondente a data do banco de dados
	 * @return
	 */
	public String formatarDataRetorno(String data) {
		String dia, mes, ano;
		
		ano = data.substring(0, 4);
		mes = data.substring(5, 7);
		dia = data.substring(8, 10);
		
		return dia+mes+ano;
	}
	
	/***
	 * Formata a data para ser persistida no banco de dados
	 * @param data
	 * @return
	 */
	public String formatarData(String data) {
		String dia, mes, ano;
		
		ano = data.substring(6, 10);
		mes = data.substring(3, 5);
		dia = data.substring(0, 2);
		
		return ano+"-"+mes+"-"+dia;
	}
}
