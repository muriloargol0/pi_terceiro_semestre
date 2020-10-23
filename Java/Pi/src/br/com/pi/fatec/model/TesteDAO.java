package br.com.pi.fatec.model;

import java.sql.SQLException;

import br.com.pi.fatec.model.DTO.TesteDTO;

public class TesteDAO extends DataObject  {

	public int create(TesteDTO dto) throws SQLException {
		return 0;
	}

	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public TesteDTO read() throws SQLException {
		TesteDTO t = new TesteDTO();
		//Faz a consulta e preenche os dados
		t.id = 1;
		t.descricao = "Teste do read";
		
		return t;
	}

	public int update(TesteDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
