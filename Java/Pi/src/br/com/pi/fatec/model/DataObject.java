package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class DataObject extends SqlCnn {
	
	public abstract int create() throws SQLException;


	public abstract boolean update() throws SQLException;


	public abstract boolean delete(int id) throws SQLException;
	
	public abstract void read(String param) throws SQLException;
	
	public String formatarDataRetorno(String data) {
		String dia, mes, ano;
		
		ano = data.substring(0, 4);
		mes = data.substring(5, 7);
		dia = data.substring(8, 9);
		
		return dia+mes+ano;
	}
	
	public String formatarData(String data) {
		String dia, mes, ano;
		
		ano = data.substring(6, 9);
		mes = data.substring(3, 4);
		dia = data.substring(0, 1);
		
		return ano+"-"+mes+"-"+dia;
	}
}
