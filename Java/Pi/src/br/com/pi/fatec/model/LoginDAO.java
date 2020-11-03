package br.com.pi.fatec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.pi.fatec.model.DTO.LoginDTO;

public class LoginDAO extends DataObject {

	public int create(LoginDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(LoginDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoginDTO read() throws SQLException {
		LoginDTO l = new LoginDTO();
		
		super.getConnection();
		PreparedStatement stmt = this.getConnection().prepareStatement("SELECT USUARIO, SENHA FROM FUNCIONARIO");
		ResultSet rs = stmt.executeQuery();

		rs.next();
		
		l.user = rs.getString("USUARIO");
		l.password = rs.getString("SENHA");
		
		return l;
	}

}
