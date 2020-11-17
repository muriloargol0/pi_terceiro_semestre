package br.com.pi.fatec;

import java.sql.SQLException;

import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.view.Login;
import br.com.pi.fatec.view.Menu;


public class Exec {

	public static void main(String[] args) throws SQLException {

		Login login = new Login();
		
		//Menu menu = new Menu();
		//menu.setVisible(true);
		
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
