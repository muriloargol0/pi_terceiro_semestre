package br.com.pi.fatec;

import java.sql.SQLException;

import br.com.pi.fatec.controller.PacienteController;
import br.com.pi.fatec.model.IDataObject;
import br.com.pi.fatec.model.TesteDAO;
import br.com.pi.fatec.model.DTO.TesteDTO;

public class Exec {

	public static void main(String[] args) throws SQLException {

		Paciente p = new Paciente();
		p.btnCadastrar();
		
		/* IDataObject<TesteDTO> dao = new TesteDAO<TesteDTO>();
		
		TesteDTO t = new TesteDTO();
		t.id = 1;
		t.descricao = "teste de descri��o";
		
		TesteDTO dto = dao.read();
		System.out.println();
		
		System.out.println(dto.id);
		System.out.println(dto.descricao);
		
		System.out.println();
		dao.create(t);
		*/
	}
}
