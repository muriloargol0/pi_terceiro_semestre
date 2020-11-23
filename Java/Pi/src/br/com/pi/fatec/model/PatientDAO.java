package br.com.pi.fatec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.PatientDTO;

public class PatientDAO extends DataObject {	
	
	public PatientDTO dto;
	
	public int create() throws SQLException {
		try {
			//Connection cnn = super.getConnection();
			//PreparedStatement stmt = cnn.prepareStatement("INSERT INTO PACIENTE VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			//stmt.setString(1,this.dto.);
			System.out.println(dto.nome);			
			
		} catch (Exception e) {
			
		}
		return 0;
	}


	public boolean update(String param) throws SQLException {
		SqlCnn cnn = new SqlCnn();
		try {	
			PreparedStatement stmt = cnn.getConnection().prepareStatement("SELECT * FROM PACIENTE WHERE CPF = ?");
			stmt.setString(1, param);
		return false;
	}


	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void teste() {
	
	}


	public void read(String param) throws SQLException {
		// Cria a consulta no banco
		// SELECT * FROM PACIENTE WHERE CPF = param
		// Preenche os campos com o resultado do result set
		SqlCnn cnn = new SqlCnn();
		try {	
			PreparedStatement stmt = cnn.getConnection().prepareStatement("SELECT * FROM PACIENTE WHERE CPF = ?");
			stmt.setString(1, param);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.dto = new PatientDTO();
				dto.setIdPaciente(Integer.parseInt(rs.getString("ID_PACIENTE")));
				dto.setNome(rs.getString("NOME"));
				dto.setStatus(Integer.parseInt(rs.getString("STTS")));
				dto.setRg(rs.getString("RG"));
				dto.setCpf(rs.getString("CPF"));
				dto.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
				dto.setSexo(rs.getString("SEXO"));
				dto.setTipoSanguineo(rs.getString("TIPO_SANGUINEO"));
				dto.setResponsavel(rs.getString("RESPONSAVEL"));
				dto.setEstadoCivil(rs.getString("ESTADO_CIVIL"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setTelefone(rs.getString("TELEFONE"));
				dto.setRua(rs.getString("RUA"));
				dto.setNumero(Integer.parseInt(rs.getString("NUMERO")));
				dto.setBairro(rs.getString("BAIRRO"));
				dto.setCidade(rs.getString("CIDADE"));
				dto.setUf(rs.getString("UF"));
				dto.setCep(rs.getString("CEP"));
				dto.setObservacoes(rs.getString("OBSERVACOES"));
			
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao realizar consulta. Detalhe: " + e.getMessage());
			throw e;			
		}
		finally {
			cnn.closeConnection();
		}
	}
	
	public PatientDTO getDTO() {
		return this.dto;
	}
}
