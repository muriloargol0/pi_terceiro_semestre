package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO extends DataObject {	
	public int create() throws SQLException {
		try {
			Connection cnn = super.getConnection();
			PreparedStatement stmt = cnn.prepareStatement("INSERT INTO PACIENTE VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1,this.get)
			
			
		} catch (Exception e) {
			
		}
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
	
	public void teste() {
	
	}


	public ResultSet read() {
		// TODO Auto-generated method stub
		return null;
	}
}
