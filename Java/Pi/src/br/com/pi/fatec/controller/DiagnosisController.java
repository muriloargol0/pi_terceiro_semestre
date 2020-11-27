package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.model.DiagnosisDAO;
import br.com.pi.fatec.model.EmployeeDAO;

public class DiagnosisController {
	private DiagnosisDTO dto;
	
	private DiagnosisDAO diagnosticoDAO = null;
	
	/***
	 * Verifica se já existe uma instância do DTO, se já existir retorna o já existente
	 * @return classe DTO para transporte de dados
	 */
	public DiagnosisDTO getDto() {
		if(dto == null) {
			dto = new DiagnosisDTO();
		}
		return dto;
	}
	
	/***
	 * Verifica se já existe uma instância do DAO, se já existir retorna o já existente
	 * @return classe DAO para manipulação de dados do banco
	 */
	private DiagnosisDAO getDiagnosticoDAO() {
		if(this.diagnosticoDAO == null) {
			this.diagnosticoDAO = new DiagnosisDAO();
		}
		return diagnosticoDAO;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para persistir os dados no banco
	 * @return Retorna o id do registro cadastrado
	 */
	public int cadastraDiagnostico() {
		try {		
			this.getDiagnosticoDAO().dto = this.getDto();
			return this.getDiagnosticoDAO().create();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de diagnóstico: " + ex.getMessage());
		}
		return 0;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para atualizar os dados no banco
	 */
	public void editarDiagnostico() {
		try {
			this.getDiagnosticoDAO().dto = this.getDto();
			
			this.getDiagnosticoDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro de Diagnóstico: " + e.getMessage());
		}
	}

	/***
	 * Faz o intermédio entre a View e o DAO para localizar algum diagnóstico no banco
	 * @param idDiagnostico número inteiro correspondente ao id do diagnostico
	 */
	public void findDiagnosis(String idDiagnostico) {
		try {
			this.getDiagnosticoDAO().read(idDiagnostico);
			
			this.dto = this.getDiagnosticoDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Diagnósco: " + e.getMessage());
		}
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para buscar o prontuário, não traz todos os campos
	 * @param idPaciente número inteiro correspondente ao id do paciente
	 * @return retorna um Array de String contendo as informações do paciente
	 */
	public String[] getProntuario(int idPaciente){
		return this.getDiagnosticoDAO().getProntuario(idPaciente);
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para buscar o prontuário completo
	 * @param idPaciente número inteiro correspondente ao id do paciente
	 * @return retorna um Array de String contendo as informações do paciente
	 */
	public String[] getProntuarioMedico(int idPaciente){
		return this.getDiagnosticoDAO().getProntuarioMedico(idPaciente);
	}
}
