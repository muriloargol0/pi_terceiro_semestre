package br.com.pi.fatec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.pi.fatec.globals.*;
import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.LoginDTO;

import br.com.pi.fatec.view.Login;


public class LoginDAO {

	public boolean doLogin(String user, char[] pw) {
		try {
			SqlCnn cnn = new SqlCnn();
						
			PreparedStatement stmt = cnn.getConnection().prepareStatement("SELECT USUARIO, SENHA, ID_TIPO, ID_FUNCIONARIO, NOME FROM FUNCIONARIO WHERE USUARIO = ?");
			stmt.setString(1, user);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				String username = rs.getString("USUARIO");
				String password = rs.getString("SENHA");
								
				if(user.equals(username) && password.equals(String.valueOf(pw))) {
					
					Globals g = new Globals();
					g.nome = rs.getString("NOME");
					g.idTipo = rs.getInt("ID_TIPO");
					g.idFuncionario = rs.getInt("ID_FUNCIONARIO");
					
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
