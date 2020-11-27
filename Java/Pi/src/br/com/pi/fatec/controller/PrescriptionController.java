package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.PrescriptionDTO;
import br.com.pi.fatec.model.DiagnosisDAO;
import br.com.pi.fatec.model.PrescriptionDAO;

public class PrescriptionController {
	private PrescriptionDTO dto;
	
	private PrescriptionDAO receitaDAO = null;
	
	/***
	 * Verifica se j� existe uma inst�ncia do DTO, se j� existir retorna o j� existente
	 * @return classe DTO para transporte de dados
	 */
	public PrescriptionDTO getDto() {
		if(dto == null) {
			dto = new PrescriptionDTO();
		}
		return dto;
	}
	
	/***
	 * Verifica se j� existe uma inst�ncia do DAO, se j� existir retorna o j� existente
	 * @return classe DAO para manipula��o de dados do banco
	 */
	private PrescriptionDAO getReceitaDAO() {
		if(this.receitaDAO == null) {
			this.receitaDAO = new PrescriptionDAO();
		}
		return receitaDAO;
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para persistir os dados no banco
	 * @return Retorna o id do registro cadastrado
	 */
	public int cadastraReceita() {
		try {		
			this.getReceitaDAO().dto = this.getDto();
			
			this.getReceitaDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de receita: " + ex.getMessage());
		}
		return 0;
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para atualizar os dados no banco
	 */
	public void editarReceita() {
		try {
			this.getReceitaDAO().dto = this.getDto();
			
			this.getReceitaDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro de receita: " + e.getMessage());
		}
	}
	
	/***
	 * Faz o interm�dio entre a tela e o DAO para localizar uma receita pelo id do diagn�stico
	 * @param idDiagnosis n�mero inteiro correspondente ao id diagn�stico no banco de dados
	 * @return retorna o DTO preenchido com os dados da Receita que pertence ao diagn�stico de origem
	 */
	public PrescriptionDTO findPrescriptionByDiagnosis(int idDiagnosis) {
		PrescriptionDTO pdto = new PrescriptionDTO();
		
		try {
			pdto = this.getReceitaDAO().getPrescriptionByDiagnosis(idDiagnosis);			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar receita pelo diagn�stico: " + e.getMessage());
		}
		
		return pdto;
	}

	/***
	 * Faz o interm�dio entre a tela e o DAO para localizar uma receita no banco de dados 
	 * @param idReceita n�mero inteiro correspondente ao id da receita no banco de dados
	 */
	public void findPrescription(String idReceita) {
		try {
			this.getReceitaDAO().read(idReceita);
			
			this.dto = this.getReceitaDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro de receita: " + e.getMessage());
		}
	}
}
