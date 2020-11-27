package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.view.Diagnosis;

public class DiagnosisDAO extends DataObject {
	
	public DiagnosisDTO dto;
	public Diagnosis view;

	@Override
	public int create() throws SQLException {
		Connection cnn = super.getConnection();

		try {
			PreparedStatement stmt = cnn.prepareStatement("INSERT INTO DIAGNOSTICO (" + 
					"DATA_DIAGNOSTICO" +
			           ",TEMPERATURA" +
			           ",PRESSAO_SANGUINEA" +
			           ",GLICEMIA" +
			           ",COLESTEROL" +
			           ",ANEXO" +
			           ",SINTOMAS" +
			           ",DIAGNOSTICO" +
					") VALUES (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, this.formatarData(dto.dataDiagnostico));
			stmt.setString(2, this.dto.temperatura);
			stmt.setString(3, this.dto.pressaoSanguinea);
			stmt.setString(4, this.dto.glicemia);
			stmt.setString(5, this.dto.colesterol);
			stmt.setString(6, this.dto.anexo);
			stmt.setString(7, this.dto.sintomas);
			stmt.setString(8, this.dto.diagnostico);
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next())
            {
                int last_inserted_id = rs.getInt(1);
                
                return last_inserted_id;
            }
            
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
		
		return 0;
		
	}

	@Override
	public boolean update() throws SQLException {
		Connection cnn = super.getConnection();

		try {
			PreparedStatement stmt = cnn.prepareStatement("UPDATE DIAGNOSTICO SET " + 
					",DATA_DIAGNOSTICO" +
			           ",TEMPERATURA" +
			           ",PRESSAO_SANGUINEA" +
			           ",GLICEMIA" +
			           ",COLESTEROL" +
			           ",ANEXO" + 
			           ",SINTOMAS" +
			           ",DIAGNOSTICO" +
		           " WHERE ID_DIAGNOSTICO = ? "
		           );
			
			stmt.setString(1, this.formatarData(dto.dataDiagnostico));
			stmt.setString(2, this.dto.temperatura);
			stmt.setString(3, this.dto.pressaoSanguinea);
			stmt.setString(4, this.dto.glicemia);
			stmt.setString(5, this.dto.colesterol);
			stmt.setString(6, this.dto.anexo);
			stmt.setString(7, this.dto.sintomas);
			stmt.setString(8, this.dto.diagnostico);
			
			stmt.executeUpdate();
			
			return true;
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}

	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void read(String param) throws SQLException {
		Connection cnn = super.getConnection();
		
		this.dto = new DiagnosisDTO();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT * FROM DIAGNOSTICO D, PACIENTE P WHERE D.ID_DIAGNOSTICO = ? AND D.ID_PACIENTE = P.ID_PACIENTE");
			
			stmt.setString(1, param);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.dto.idDianostico = rs.getInt("ID_DIAGNOSTICO");
				this.dto.idPaciente = rs.getInt("ID_PACIENTE");
				this.dto.idFuncionario = rs.getInt("ID_FUNCIONARIO");
				this.dto.dataDiagnostico = formatarDataRetorno(rs.getString("DATA_DIAGNOSTICO"));
				this.dto.pressaoSanguinea = rs.getString("PRESSAO_SANGUINEA");
				this.dto.temperatura = rs.getString("TEMPERATURA");
				this.dto.glicemia = rs.getString("GLICEMIA");
				this.dto.colesterol = rs.getString("COLESTEROL");
				this.dto.anexo = rs.getString("ANEXO");
				this.dto.sintomas = rs.getString("SINTOMAS");
				this.dto.diagnostico = rs.getString("DIAGNOSTICO");
				this.dto.nome = rs.getString("NOME");
			}
			
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}
	
	public String[] getProntuario(int idPaciente) {
		String[] paciente = new String[3];
		
		try {
			PreparedStatement stmt = super.getConnection().prepareStatement("SELECT ID_PACIENTE, NOME, OBSERVACOES FROM PACIENTE WHERE ID_PACIENTE = ?");
						
			stmt.setInt(1, idPaciente);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				paciente[0] = rs.getString("ID_PACIENTE");
				paciente[1] = rs.getString("NOME");
				paciente[2] = rs.getString("OBSERVACOES");
			}
		} catch (Exception e) {
			System.out.println("Erro ao buscar prontuário: "+ e.toString());
		}
		return paciente;
	}
	
}
