package br.com.pi.fatec.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.*;

public class PatientController {
	private PatientDTO dto;

	private PatientDAO pacienteDAO = null;
	
	public PatientDTO getDto() {
		if(dto == null) {
			dto = new PatientDTO();
		}
		return dto;
	}
	
	private PatientDAO getPacienteDAO() {
		if(this.pacienteDAO == null) {
			this.pacienteDAO = new PatientDAO();
		}
		return pacienteDAO;
	}
	
	public int cadastraPaciente() {
		try {
			this.getPacienteDAO().dto = this.getDto();
			
			return this.getPacienteDAO().create();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de Paciente: " + ex.getMessage());
		}
		
		return 0;
	}
	
	public void editarPaciente() {
		try {
			this.getPacienteDAO().dto = this.getDto();
			
			this.getPacienteDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro do Paciente: " + e.getMessage());
		}
	}	
	
	public void deletarPaciente(int id) {
		try {
			this.getPacienteDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro do Paciente: " + e.getMessage());
		}
	}

	public void findPatient(String cpf) {
		try {
			this.getPacienteDAO().read(cpf);
			
			this.dto = this.getPacienteDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Paciente: " + e.getMessage());
		}
	}
}
