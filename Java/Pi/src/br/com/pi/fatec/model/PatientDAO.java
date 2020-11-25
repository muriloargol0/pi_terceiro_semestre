package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.view.Paciente;

public class PatientDAO extends DataObject {	
	
	public PatientDTO dto;
	public Paciente view;
	
	public int create() throws SQLException {
		Connection cnn = super.getConnection();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("INSERT INTO PACIENTE (" + 
					",TIPO_SANGUINEO"+
					",DATA_CADASTRO" + 
					",EMAIL" + 
					",RUA" + 
					",DATA_NASCIMENTO" + 
					",CPF" + 
					",CEP" + 
					",BAIRRO" + 
					",CIDADE" + 
					",NUMERO" + 
					",UF" + 
					",STTS" + 
					",NOME" + 
					",ESTADO_CIVIL" + 
					",RG" + 
					",TELEFONE" + 
					",OBSERVACOES" + 
					",SEXO" + 
					",RESPONSAVEL" + 
					",ANEXO" +
					") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, this.dto.tipoSanguineo);
			stmt.setString(2, this.dto.dataCadastro);
			stmt.setString(3, this.dto.email);
			stmt.setString(4, this.dto.rua);
			stmt.setString(5, this.formatarData(dto.dataNascimento));
			stmt.setString(6, this.dto.cpf);
			stmt.setString(7, this.dto.cep);
			stmt.setString(8, this.dto.bairro);
			stmt.setString(9, this.dto.cidade);
			stmt.setInt(10, this.dto.numero);
			stmt.setString(11, this.dto.uf);
			stmt.setInt(12, this.dto.status);
			stmt.setString(13, this.dto.nome);
			stmt.setString(14, this.dto.estadoCivil);
			stmt.setString(15, this.dto.rg);
			stmt.setString(16, this.dto.telefone);
			stmt.setString(17, this.dto.observacoes);
			stmt.setString(18, this.dto.sexo);
			stmt.setString(19, this.dto.responsavel);
			stmt.setString(20, this.dto.anexo);
			
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


	public boolean update() throws SQLException {
		Connection cnn = super.getConnection();
			
		try {
			PreparedStatement stmt = cnn.prepareStatement("UPDATE PACIENTE SET" + 
					",TIPO_SANGUINEO = ?"+
					",DATA_CADASTRO = ?" + 
					",EMAIL = ?" + 
					",RUA = ?" + 
					",DATA_NASCIMENTO = ?" + 
					",CPF = ?" + 
					",CEP = ?" + 
					",BAIRRO = ?" + 
					",CIDADE = ?" + 
					",NUMERO = ?" + 
					",UF = ?" + 
					",STTS = ?" + 
					",NOME = ?" + 
					",ESTADO_CIVIL = ?" + 
					",RG = ?" + 
					",TELEFONE = ?" + 
					",OBSERVACOES = ?" + 
					",SEXO = ?" + 
					",RESPONSAVEL = ?" + 
					//",ANEXO = ?" +
					"WHERE ID_PACIENTE = ? "
					);
			
			stmt.setString(1, this.dto.tipoSanguineo);
			stmt.setString(2, this.dto.dataCadastro);
			stmt.setString(3, this.dto.email);
			stmt.setString(4, this.dto.rua);
			stmt.setString(5, this.formatarData(dto.dataNascimento));
			stmt.setString(6, this.dto.cpf);
			stmt.setString(7, this.dto.cep);
			stmt.setString(8, this.dto.bairro);
			stmt.setString(9, this.dto.cidade);
			stmt.setInt(10, this.dto.numero);
			stmt.setString(11, this.dto.uf);
			stmt.setInt(12, this.dto.status);
			stmt.setString(13, this.dto.nome);
			stmt.setString(14, this.dto.estadoCivil);
			stmt.setString(15, this.dto.rg);
			stmt.setString(16, this.dto.telefone);
			stmt.setString(17, this.dto.observacoes);
			stmt.setString(18, this.dto.sexo);
			stmt.setString(19, this.dto.responsavel);
			//stmt.setString(20, this.dto.anexo);
			
			stmt.executeUpdate();
			
			return true;
		} catch (Exception e) {
			throw new SQLException(e.toString());			
		} finally {
			super.closeConnection();
		}
	}


	public boolean delete(int id) throws SQLException {
		Connection cnn = super.getConnection();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("DELETE FROM PACIENTE WHERE ID_PACIENTE = ?");
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			return true;
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
		
	}

	public void read(String param) throws SQLException {
		
		Connection cnn = super.getConnection();
		
		this.dto = new PatientDTO();
		
		try {	
			PreparedStatement stmt = cnn.prepareStatement("SELECT * FROM PACIENTE WHERE CPF = ?");
			
			stmt.setString(1, param);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.dto.idPaciente = rs.getInt("ID_PACIENTE");	
				this.dto.nome = rs.getString("NOME");
				this.dto.status = rs.getInt("STTS");
				this.dto.rg = rs.getString("RG");
				this.dto.cpf = rs.getString("CPF");
				this.dto.dataNascimento = formatarDataRetorno(rs.getString("DATA_NASCIMENTO"));
				this.dto.sexo = rs.getString("SEXO");
				this.dto.tipoSanguineo = rs.getString("TIPO_SANGUINEO");
				this.dto.responsavel = rs.getString("RESPONSAVEL");
				this.dto.estadoCivil = rs.getString("ESTADO_CIVIL");
				this.dto.email = rs.getString("EMAIL");
				this.dto.telefone = rs.getString("TELEFONE");
				this.dto.rua = rs.getString("RUA");
				this.dto.numero = rs.getInt("NUMERO");
				this.dto.bairro = rs.getString("BAIRRO");
				this.dto.cidade = rs.getString("CIDADE");
				this.dto.uf = rs.getString("UF");
				this.dto.cep = rs.getString("CEP");
				this.dto.observacoes = rs.getString("OBSERVACOES");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao realizar consulta. Detalhe: " + e.getMessage());
			throw new SQLException(e.toString());			
		}
		finally {
			super.closeConnection();
		}
	}
}
