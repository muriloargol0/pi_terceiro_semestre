package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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


	public void read(String param) {
		// Cria a consulta no banco
		// SELECT * FORM PACIENTE WHERE CPF = param
		// Preenche os campos com o resultado do result set
		
		this.dto = new PatientDTO();
		dto.nome = "PACIENTE 01";
		dto.cidade = "Indaiatuba";
		
		this.dto = dto;
		
	}
	
	public PatientDTO getDTO() {
		return this.dto;
	}
}
