package br.com.pi.fatec.model;

import java.sql.SQLException;

import br.com.pi.fatec.model.DTO.TesteDTO;

public class TesteDAO<T> extends DataObject<T>  {

	@Override
	public int create(T dto) throws SQLException {
		if(dto instanceof TesteDTO) {
			System.out.println(((TesteDTO) dto).id);
			System.out.println(((TesteDTO) dto).descricao);
		}
		return 0;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T read() throws SQLException {
		TesteDTO t = new TesteDTO();
		//Faz a consulta e preenche os dados
		t.id = 1;
		t.descricao = "Teste do read";
		
		return (T) t;
	}

	@Override
	public int update(T dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
