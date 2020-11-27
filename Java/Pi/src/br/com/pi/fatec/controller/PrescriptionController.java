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
	 * Verifica se já existe uma instância do DTO, se já existir retorna o já existente
	 * @return classe DTO para transporte de dados
	 */
	public PrescriptionDTO getDto() {
		if(dto == null) {
			dto = new PrescriptionDTO();
		}
		return dto;
	}
	
	/***
	 * Verifica se já existe uma instância do DAO, se já existir retorna o já existente
	 * @return classe DAO para manipulação de dados do banco
	 */
	private PrescriptionDAO getReceitaDAO() {
		if(this.receitaDAO == null) {
			this.receitaDAO = new PrescriptionDAO();
		}
		return receitaDAO;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para persistir os dados no banco
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
	 * Faz o intermédio entre a View e o DAO para atualizar os dados no banco
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
	 * Faz o intermédio entre a tela e o DAO para localizar uma receita pelo id do diagnóstico
	 * @param idDiagnosis número inteiro correspondente ao id diagnóstico no banco de dados
	 * @return retorna o DTO preenchido com os dados da Receita que pertence ao diagnóstico de origem
	 */
	public PrescriptionDTO findPrescriptionByDiagnosis(int idDiagnosis) {
		PrescriptionDTO pdto = new PrescriptionDTO();
		
		try {
			pdto = this.getReceitaDAO().getPrescriptionByDiagnosis(idDiagnosis);			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar receita pelo diagnóstico: " + e.getMessage());
		}
		
		return pdto;
	}

	/***
	 * Faz o intermédio entre a tela e o DAO para localizar uma receita no banco de dados 
	 * @param idReceita número inteiro correspondente ao id da receita no banco de dados
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
