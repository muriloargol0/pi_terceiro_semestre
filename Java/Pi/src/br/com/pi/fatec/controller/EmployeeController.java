package br.com.pi.fatec.controller;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.dto.PatientDTO;
import br.com.pi.fatec.model.EmployeeDAO;

public class EmployeeController {
	private EmployeeDTO dto;
	private int idFuncionario;
	private String usuario; 
	private String senha;
	private int status; //alterado de boolean stts para int status
	private String nome;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String estadoCivil;
	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private int idTipo;
	private String uf;
	private String observacoes;
	private String dataCadastro;
	private String crm;
	private String situacao;
	private String especialidade;
	private String coren;
	private String categoria;
	private String telefone;
	
	private EmployeeDAO funcionarioDAO = null;
	
	public EmployeeController() {
		dto = new EmployeeDTO();
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getStatus() {
		return status;
	}
	public void setStts(int status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCoren() {
		return coren;
	}
	public void setCoren(String coren) {
		this.coren = coren;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public EmployeeDAO getFuncionarioDAO() {
		if(this.funcionarioDAO == null) {
			this.funcionarioDAO = new EmployeeDAO();
		}
		return funcionarioDAO;
	}
	
	private void fillDTO() {
		dto.bairro = this.getBairro();
		dto.categoria = this.getCategoria();
		dto.cep = this.getCep();
		dto.cidade = this.getCidade();
		dto.coren = this.getCoren();
		dto.cpf = this.getCpf();
		dto.crm = this.getCrm();
		dto.dataCadastro = this.getDataCadastro();
		dto.dataNascimento = this.getDataNascimento();
		dto.especialidade = this.getEspecialidade();
		dto.estadoCivil = this.getEstadoCivil();
		dto.idFuncionario = this.getIdFuncionario();
		dto.idTipo = this.getIdTipo();
		dto.nome = this.getNome();
		dto.numero = this.getNumero();
		dto.observacoes = this.getObservacoes();
		dto.rg = this.getRg();
		dto.rua = this.getRua();
		dto.senha = this.getSenha();
		dto.situacao = this.getSituacao();
		dto.status = this.getStatus();
		dto.uf = this.getUf();
		dto.usuario = this.getUsuario();
		dto.telefone = this.getTelefone();
	}
	
	public void cadastraFuncionario() {
		try {
			this.fillDTO();
			
			this.getFuncionarioDAO().dto = dto;
			
			this.getFuncionarioDAO().create();
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Funcionário: " + ex.getMessage());
		}
	}
	
	public void findEmployee(String nome) {
		// Faz a busca e preenche o DTO
		this.getFuncionarioDAO().read(nome);
		
		EmployeeDTO dto = this.getFuncionarioDAO().dto;
		
		this.setNome(dto.nome);
		this.setCidade(dto.cidade);
		
	}
}
