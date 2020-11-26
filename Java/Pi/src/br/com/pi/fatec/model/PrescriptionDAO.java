package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.PrescriptionDTO;
import br.com.pi.fatec.view.Receita;

public class PrescriptionDAO extends DataObject{
	
	public PrescriptionDTO dto;
	public Receita view;
	
	public int create() throws SQLException {
		Connection cnn = super.getConnection();

		try {
			PreparedStatement stmt = cnn.prepareStatement("INSERT INTO RECEITA (" + 
					",DATA_RECEITA" +
			           ",PRESCRICAO" +
			           ",ID_DIAGNOSTICO" +
			           ",OBSERVACAO" +
					") VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, this.formatarData(dto.dataReceita));
			stmt.setString(2, this.dto.prescricao);
			stmt.setInt(3, this.dto.idDiagnostico);
			stmt.setString(4, this.dto.observacao);
			
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
			PreparedStatement stmt = cnn.prepareStatement("UPDATE RECEITA SET " + 
					",DATA_RECEITA" +
			           ",PRESCRICAO" +
			           ",ID_DIAGNOSTICO" +
			           ",OBSERVACAO" +
		           " WHERE ID_RECEITA = ? "
		           );
			
			stmt.setString(1, this.formatarData(dto.dataReceita));
			stmt.setString(2, this.dto.prescricao);
			stmt.setInt(3, this.dto.idDiagnostico);
			stmt.setString(4, this.dto.observacao);
			
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
		
		this.dto = new PrescriptionDTO();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT * FROM RECEITA WHERE ID_RECEITA = ?");
			
			stmt.setString(1, param);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.dto.idReceita = rs.getInt("ID_RECEITA");
				this.dto.idDiagnostico = rs.getInt("ID_DIAGNOSTICO");
				this.dto.prescricao = rs.getString("PRESCRICAO");
				this.dto.dataReceita = formatarDataRetorno(rs.getString("DATA_RECEITA"));
				this.dto.observacao = rs.getString("OBSERVACAO");
			}
			
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}
}
