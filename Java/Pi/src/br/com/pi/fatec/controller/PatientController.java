package br.com.pi.fatec.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.*;

public class PatientController {
	private PatientDTO dto;

	private PatientDAO pacienteDAO = null;
	
	/***
	 * Verifica se já existe uma instância do DTO, se já existir retorna o já existente
	 * @return classe DTO para transporte de dados
	 */
	public PatientDTO getDto() {
		if(dto == null) {
			dto = new PatientDTO();
		}
		return dto;
	}
	
	/***
	 * Verifica se já existe uma instância do DAO, se já existir retorna o já existente
	 * @return classe DAO para manipulação de dados do banco
	 */
	private PatientDAO getPacienteDAO() {
		if(this.pacienteDAO == null) {
			this.pacienteDAO = new PatientDAO();
		}
		return pacienteDAO;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para persistir os dados no banco
	 * @return Retorna o id do registro cadastrado
	 */
	public int cadastraPaciente() {
		try {
			this.getPacienteDAO().dto = this.getDto();
			
			return this.getPacienteDAO().create();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro de Paciente: " + ex.getMessage());
		}
		
		return 0;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para atualizar os dados no banco
	 */
	public void editarPaciente() {
		try {
			this.getPacienteDAO().dto = this.getDto();
			
			this.getPacienteDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro do Paciente: " + e.getMessage());
		}
	}	
	
	/***
	 * Faz o intermédio entre a tela e o DAO para remover um paciente da base de dados
	 * @param id Número inteiro correspondente ao id do paciente no banco de dados
	 */
	public void deletarPaciente(int id) {
		try {
			this.getPacienteDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro do Paciente: " + e.getMessage());
		}
	}

	/***
	 * Faz o intermédio entre a tela e o DAO para localizar um paciente na base de dados
	 * @param cpf string sem pontos e sem caracteres especiais utilizada para localizar o funcionário
	 */
	public void findPatient(String cpf) {
		try {
			this.getPacienteDAO().read(cpf);
			
			this.dto = this.getPacienteDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Paciente: " + e.getMessage());
		}
	}
}
