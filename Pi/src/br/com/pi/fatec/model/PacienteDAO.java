package br.com.pi.fatec.model;

import java.sql.SQLException;

import br.com.pi.fatec.model.DTO.PacienteDTO;

public class PacienteDAO<T> extends DataObject<T> {

	@Override
	public int create(T dto) throws SQLException {
		PacienteDTO pDTO = ((PacienteDTO) dto);
		System.out.println("\n " + pDTO.nome + " - " + pDTO.email + " " + pDTO.campo);
		return 0;
	}

	@Override
	public int update(Object dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object read() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void teste() {
	
	}
}
