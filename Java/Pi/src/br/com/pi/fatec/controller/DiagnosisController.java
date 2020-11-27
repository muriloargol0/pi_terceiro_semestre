package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.model.DiagnosisDAO;
import br.com.pi.fatec.model.EmployeeDAO;

public class DiagnosisController {
	private DiagnosisDTO dto;
	
	private DiagnosisDAO diagnosticoDAO = null;
	
	/***
	 * Verifica se j� existe uma inst�ncia do DTO, se j� existir retorna o j� existente
	 * @return classe DTO para transporte de dados
	 */
	public DiagnosisDTO getDto() {
		if(dto == null) {
			dto = new DiagnosisDTO();
		}
		return dto;
	}
	
	/***
	 * Verifica se j� existe uma inst�ncia do DAO, se j� existir retorna o j� existente
	 * @return classe DAO para manipula��o de dados do banco
	 */
	private DiagnosisDAO getDiagnosticoDAO() {
		if(this.diagnosticoDAO == null) {
			this.diagnosticoDAO = new DiagnosisDAO();
		}
		return diagnosticoDAO;
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para persistir os dados no banco
	 * @return Retorna o id do registro cadastrado
	 */
	public int cadastraDiagnostico() {
		try {		
			this.getDiagnosticoDAO().dto = this.getDto();
			return this.getDiagnosticoDAO().create();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de diagn�stico: " + ex.getMessage());
		}
		return 0;
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para atualizar os dados no banco
	 */
	public void editarDiagnostico() {
		try {
			this.getDiagnosticoDAO().dto = this.getDto();
			
			this.getDiagnosticoDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro de Diagn�stico: " + e.getMessage());
		}
	}

	/***
	 * Faz o interm�dio entre a View e o DAO para localizar algum diagn�stico no banco
	 * @param idDiagnostico n�mero inteiro correspondente ao id do diagnostico
	 */
	public void findDiagnosis(String idDiagnostico) {
		try {
			this.getDiagnosticoDAO().read(idDiagnostico);
			
			this.dto = this.getDiagnosticoDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Diagn�sco: " + e.getMessage());
		}
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para buscar o prontu�rio, n�o traz todos os campos
	 * @param idPaciente n�mero inteiro correspondente ao id do paciente
	 * @return retorna um Array de String contendo as informa��es do paciente
	 */
	public String[] getProntuario(int idPaciente){
		return this.getDiagnosticoDAO().getProntuario(idPaciente);
	}
	
	/***
	 * Faz o interm�dio entre a View e o DAO para buscar o prontu�rio completo
	 * @param idPaciente n�mero inteiro correspondente ao id do paciente
	 * @return retorna um Array de String contendo as informa��es do paciente
	 */
	public String[] getProntuarioMedico(int idPaciente){
		return this.getDiagnosticoDAO().getProntuarioMedico(idPaciente);
	}
}
