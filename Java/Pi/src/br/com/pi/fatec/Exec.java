package br.com.pi.fatec;

import java.sql.SQLException;

import br.com.pi.fatec.controller.PacienteController;
import br.com.pi.fatec.model.TesteDAO;
import br.com.pi.fatec.model.DTO.TesteDTO;
import br.com.pi.fatec.view.Login;

public class Exec {

	public static void main(String[] args) throws SQLException {

		Login login = new Login();
		login.createScreen();
		
		//Paciente p = new Paciente();
		//p.btnCadastrar();
		
		/* IDataObject<TesteDTO> dao = new TesteDAO<TesteDTO>();
		
		TesteDTO t = new TesteDTO();
		t.id = 1;
		t.descricao = "teste de descrição";
		
		TesteDTO dto = dao.read();
		System.out.println();
		
		System.out.println(dto.id);
		System.out.println(dto.descricao);
		
		System.out.println();
		dao.create(t);
		*/
	}
}
