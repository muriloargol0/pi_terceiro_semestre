package br.com.pi.fatec.model;

import java.sql.SQLException;

import br.com.pi.fatec.model.DTO.PatientDTO;

public class PatientDAO extends DataObject {

	public int create(PatientDTO dto) throws SQLException {
		PatientDTO pDTO = dto;
		System.out.println("\n " + pDTO.nome + " - " + pDTO.email + " " + pDTO.campo);
		return 0;
	}


	public int update(Object dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void teste() {
	
	}
}
