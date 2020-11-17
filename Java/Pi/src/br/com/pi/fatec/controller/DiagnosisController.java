package br.com.pi.fatec.controller;

import br.com.pi.fatec.model.DiagnosisDAO;

public class DiagnosisController {
	private int idDianostico;
	private String diagnostico;
	private String sintomas;
	private String anexo;
	private int idPaciente;
	private String temperatura;
	private int idFuncionario;
	private String dataDiagnostico;
	private String pressaoSanguinea;
	private String glicemia;
	private String colesterol;
	
	public int getIdDianostico() {
		return idDianostico;
	}
	public void setIdDianostico(int idDianostico) {
		this.idDianostico = idDianostico;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getDataDiagnostico() {
		return dataDiagnostico;
	}
	public void setDataDiagnostico(String dataDiagnostico) {
		this.dataDiagnostico = dataDiagnostico;
	}
	public String getPressaoSanguinea() {
		return pressaoSanguinea;
	}
	public void setPressaoSanguinea(String pressaoSanguinea) {
		this.pressaoSanguinea = pressaoSanguinea;
	}
	public String getGlicemia() {
		return glicemia;
	}
	public void setGlicemia(String glicemia) {
		this.glicemia = glicemia;
	}
	public String getColesterol() {
		return colesterol;
	}
	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}
	
	public String[] getProntuario(int idPaciente) {
		DiagnosisDAO d = new DiagnosisDAO();
		
		System.out.println("Controller " + idPaciente);
		return d.getProntuario(idPaciente);
	}
}
