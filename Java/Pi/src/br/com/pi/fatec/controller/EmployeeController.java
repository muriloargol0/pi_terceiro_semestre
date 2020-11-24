package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.EmployeeDAO;

public class EmployeeController {
	private EmployeeDTO dto;
		
	private EmployeeDAO funcionarioDAO = null;
	
	public EmployeeDTO getDto() {
		if(dto == null) {
			dto = new EmployeeDTO();
		}
		
		return dto;
	}

	private EmployeeDAO getFuncionarioDAO() {
		if(this.funcionarioDAO == null) {
			this.funcionarioDAO = new EmployeeDAO();
		}
		return funcionarioDAO;
	}
	
	public void cadastraFuncionario() {
		try {		
			this.getFuncionarioDAO().dto = this.getDto();
			
			this.getFuncionarioDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Funcionário: " + ex.getMessage());
		}
	}
	
	public void editarFuncionario() {
		try {
			this.getFuncionarioDAO().dto = this.getDto();
			
			this.getFuncionarioDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro do Funcionário: " + e.getMessage());
		}
	}
	
	public void deletarFuncionario(int id) {
		try {
			this.getFuncionarioDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro do Funcionário: " + e.getMessage());
		}
	}

	public void findEmployee(String cpf) {
		try {
			this.getFuncionarioDAO().read(cpf);
			
			this.dto = this.getFuncionarioDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Funcionário: " + e.getMessage());
		}
	}
}
