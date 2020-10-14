package br.com.pi.fatec.model.Abstractions;

import java.sql.SQLException;

public interface IDataObject<T> {
	int create(T dto) throws SQLException;
	int update(T dto) throws SQLException;
	boolean delete(int id) throws SQLException;	
	<T> T read() throws SQLException;
}
