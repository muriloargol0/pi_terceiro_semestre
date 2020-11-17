package br.com.pi.fatec.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO extends DataObject {
	
	public int create() {
		super.getConnection();
		return 0;
		
	}


	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean delete() {
		return false;
	}

	public ResultSet read() {
		return null;
		// TODO Auto-generated method stub
	}

}
