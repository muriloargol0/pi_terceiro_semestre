package br.com.pi.fatec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class LoginDAO {

	public boolean doLogin(String user, char[] pw) {
		try {
			SqlCnn cnn = new SqlCnn();
			
			cnn.getConnection();
			PreparedStatement stmt = cnn.getConnection().prepareStatement("SELECT USUARIO, SENHA FROM FUNCIONARIO WHERE USUARIO = ?");
			stmt.setString(1, user);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				String username = rs.getString("USUARIO");
				String password = rs.getString("SENHA");
				
				if(user.equals(username) && password.equals(String.valueOf(pw))) {
					return true;
				}

				
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao executar o login. Detalhe: " + e.getMessage());
		}
		
		return false;
	}

}
