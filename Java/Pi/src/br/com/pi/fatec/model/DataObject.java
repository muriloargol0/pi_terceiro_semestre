package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class DataObject extends SqlCnn {
	
	public abstract int create() throws SQLException;


	public abstract boolean update() throws SQLException;


	public abstract boolean delete();
	
	public abstract void read(String param);
}
