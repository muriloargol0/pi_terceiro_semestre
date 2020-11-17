package br.com.pi.fatec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DiagnosisDAO extends DataObject {

	@Override
	public int create() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet read() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getProntuario(int idPaciente) {
		
		String[] prontuario = new String[4];
		
		try {	
			PreparedStatement stmt = super.getConnection().prepareStatement("SELECT * FROM PACIENTE WHERE ID_PACIENTE = ?");
			stmt.setInt(1, idPaciente);
			
			ResultSet rs = stmt.executeQuery();
		
			if(rs.next()) {			
				prontuario[0] = Integer.toString(rs.getInt("ID_PACIENTE"));
				prontuario[1] = rs.getString("NOME");
				prontuario[2] = rs.getString("DATA_NASCIMENTO");
				prontuario[3] = rs.getString("OBSERVACOES");

				System.out.println(prontuario[0]);
			}else {
				System.out.println("Nenhum dado encontrado");
			}
			
			return prontuario;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar dados do Paciente. Detalhe: " + e.getMessage());
		}
		
		return prontuario;
	}
}
