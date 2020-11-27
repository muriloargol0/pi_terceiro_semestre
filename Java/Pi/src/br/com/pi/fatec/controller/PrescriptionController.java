package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.PrescriptionDTO;
import br.com.pi.fatec.model.DiagnosisDAO;
import br.com.pi.fatec.model.PrescriptionDAO;

public class PrescriptionController {
	private PrescriptionDTO dto;
	
	private PrescriptionDAO receitaDAO = null;
	
	public PrescriptionDTO getDto() {
		if(dto == null) {
			dto = new PrescriptionDTO();
		}
		return dto;
	}
	
	private PrescriptionDAO getReceitaDAO() {
		if(this.receitaDAO == null) {
			this.receitaDAO = new PrescriptionDAO();
		}
		return receitaDAO;
	}
	
	public int cadastraReceita() {
		try {		
			this.getReceitaDAO().dto = this.getDto();
			
			this.getReceitaDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de receita: " + ex.getMessage());
		}
		return 0;
	}
	
	public void editarReceita() {
		try {
			this.getReceitaDAO().dto = this.getDto();
			
			this.getReceitaDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro de receita: " + e.getMessage());
		}
	}
	
	public void deletarReceita(int id) {
		try {
			this.getReceitaDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro de receita: " + e.getMessage());
		}
	}

	public void findPrescription(String idReceita) {
		try {
			this.getReceitaDAO().read(idReceita);
			
			this.dto = this.getReceitaDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro de receita: " + e.getMessage());
		}
	}
}
