package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.model.DiagnosisDAO;
import br.com.pi.fatec.model.EmployeeDAO;

public class DiagnosisController {
	private DiagnosisDTO dto;
	
	private DiagnosisDAO diagnosticoDAO = null;
	
	public DiagnosisDTO getDto() {
		if(dto == null) {
			dto = new DiagnosisDTO();
		}
		return dto;
	}
	
	private DiagnosisDAO getDiagnosticoDAO() {
		if(this.diagnosticoDAO == null) {
			this.diagnosticoDAO = new DiagnosisDAO();
		}
		return diagnosticoDAO;
	}
	
	public void cadastraDiagnostico() {
		try {		
			this.getDiagnosticoDAO().dto = this.getDto();
			
			this.getDiagnosticoDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de diagnóstico: " + ex.getMessage());
		}
	}
	
	public void editarDiagnostico() {
		try {
			this.getDiagnosticoDAO().dto = this.getDto();
			
			this.getDiagnosticoDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro de Diagnóstico: " + e.getMessage());
		}
	}
	
	public void deletarDiagnostico(int id) {
		try {
			this.getDiagnosticoDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro do Diagnóstico: " + e.getMessage());
		}
	}

	public void findDiagnosis(String idDiagnostico) {
		try {
			this.getDiagnosticoDAO().read(idDiagnostico);
			
			this.dto = this.getDiagnosticoDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Diagnósco: " + e.getMessage());
		}
	}
	
	public String[] getProntuario(int idPaciente){
		return this.getDiagnosticoDAO().getProntuario(idPaciente);
	}
}
