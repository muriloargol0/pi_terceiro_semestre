package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.SQLException;


public abstract class DataObject extends SqlCnn {
	
	public int create() throws SQLException {
		return 0;
	}


	public boolean update() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
}
