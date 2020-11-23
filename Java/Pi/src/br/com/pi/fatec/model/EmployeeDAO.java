package br.com.pi.fatec.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.view.Usuario;

public class EmployeeDAO extends DataObject {
	
	public EmployeeDTO dto;
	public Usuario view;
	
	public int create() {
		super.getConnection();
		return 0;
		
	}


	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean delete() {
		return false;
	}

	public void read(String param) {
		this.dto = new EmployeeDTO();
		dto.nome = view.;
		dto.cidade = "";
		
		this.dto = dto;
	}
	
	public EmployeeDTO getDTO() {
		return this.dto;
	}

}
