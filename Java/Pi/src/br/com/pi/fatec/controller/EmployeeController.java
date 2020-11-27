package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.EmployeeDAO;

public class EmployeeController {
	private EmployeeDTO dto;
		
	private EmployeeDAO funcionarioDAO = null;
	
	/***
	 * Verifica se já existe uma instância do DTO, se já existir retorna o já existente
	 * @return classe DTO para transporte de dados
	 */
	public EmployeeDTO getDto() {
		if(dto == null) {
			dto = new EmployeeDTO();
		}
		
		return dto;
	}

	/***
	 * Verifica se já existe uma instância do DAO, se já existir retorna o já existente
	 * @return classe DAO para manipulação de dados do banco
	 */
	private EmployeeDAO getFuncionarioDAO() {
		if(this.funcionarioDAO == null) {
			this.funcionarioDAO = new EmployeeDAO();
		}
		return funcionarioDAO;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para persistir os dados no banco
	 * @return Retorna o id do registro cadastrado
	 */
	public int cadastraFuncionario() {
		try {		
			this.getFuncionarioDAO().dto = this.getDto();
			return this.getFuncionarioDAO().create();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Funcionário: " + ex.getMessage());
		}
		return 0;
	}
	
	/***
	 * Faz o intermédio entre a View e o DAO para atualizar os dados no banco
	 */
	public void editarFuncionario() {
		try {
			this.getFuncionarioDAO().dto = this.getDto();
			
			this.getFuncionarioDAO().update();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar o registro do Funcionário: " + e.getMessage());
		}
	}
	
	/***
	 * Faz o intermédio entre a tela e o DAO para remover um funcionário da base de dados
	 * @param id Número inteiro correspondente ao id do funcionário no banco de dados
	 */
	public void deletarFuncionario(int id) {
		try {
			this.getFuncionarioDAO().delete(id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o registro do Funcionário: " + e.getMessage());
		}
	}

	/***
	 * Faz o intermédio entre a tela e o DAO para buscar um funcionário
	 * @param cpf string sem pontos e sem caracteres especiais utilizada para localizar o funcionário
	 */
	public void findEmployee(String cpf) {
		try {
			this.getFuncionarioDAO().read(cpf);
			
			this.dto = this.getFuncionarioDAO().dto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do Funcionário: " + e.getMessage());
		}
	}
}
