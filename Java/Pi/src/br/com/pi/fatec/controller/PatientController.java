package br.com.pi.fatec.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.*;

public class PatientController {
	private PatientDTO dto;
	private int idPaciente;
	private String tipoSanguineo;
	private String dataCadastro;
	private String email;
	private String rua;
	private String idade;
	private String cpf;
	private String cep;
	private String bairro;
	private String uf;
	private int status;
	private String nome;
	private String estadoCivil;
	private String cidade;
	private String rg;
	private String observacoes;
	private String telefone;
	private int numero;
	private String sexo;
	private String anexo;
	private String responsavel;
	private String dataNascimento;
	
	private PatientDAO pacienteDAO = null;
	
	public PatientController() {
		dto = new PatientDTO();
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	
	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public PatientDAO getPacienteDAO() {
		if(this.pacienteDAO == null) {
			this.pacienteDAO = new PatientDAO();
		}
		return pacienteDAO;
	}
	
	private void fillDTO() {
		dto.anexo = this.getAnexo();
		dto.bairro = this.getBairro();
		dto.cep = this.getCep();
		dto.cidade = this.getCidade();
		dto.cpf = this.getCpf();
		dto.dataCadastro = this.getDataCadastro();
		dto.dataNascimento = this.getDataNascimento();
		dto.email = this.getEmail();
		dto.estadoCivil = this.getEstadoCivil();
		dto.idade = this.getIdade();
		dto.idPaciente = this.getIdPaciente();
		dto.nome = this.getNome();
		dto.numero = this.getNumero();
		dto.observacoes = this.getObservacoes();
		dto.responsavel = this.getResponsavel();
		dto.rg = this.getRg();
		dto.rua = this.getRua();
		dto.sexo = this.getSexo();
		dto.status = this.getStatus();
		dto.telefone = this.getTelefone();
		dto.tipoSanguineo = this.getTipoSanguineo();
		dto.uf = this.getUf();
	}

	
	public void cadastraPaciente() {
		try {
			this.fillDTO();
			
			this.getPacienteDAO().dto = dto;
			
			this.getPacienteDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Paciente: " + ex.getMessage());
		}
	}
	
	public void findPatient(String nome) throws SQLException {
		// Faz a busca e preenche o DTO
		this.getPacienteDAO().read(nome);
		
		PatientDTO dto = this.getPacienteDAO().dto;
		this.setNome(dto.getNome());
		this.setStatus(dto.getStatus());
		this.setRg(dto.getRg());
		this.setCpf(dto.getCpf());
		this.setDataNascimento(dto.getDataNascimento());
		this.setSexo(dto.getSexo());
		this.setTipoSanguineo(dto.getTipoSanguineo());
		this.setResponsavel(dto.getResponsavel());
		this.setEstadoCivil(dto.getEstadoCivil());
		this.setEmail(dto.getEmail());
		this.setTelefone(dto.getTelefone());
		this.setRua(dto.getRua());
		this.setNumero(dto.getNumero());
		this.setBairro(dto.getBairro());
		this.setCidade(dto.getCidade());
		this.setUf(dto.getUf());
		this.setCep(dto.getCep());
		this.setObservacoes(dto.getObservacoes());
		
	}
}
