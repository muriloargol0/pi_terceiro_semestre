package br.com.pi.fatec.controller;

public class PrescriptionController {
	private int idReceita;
	private String dataReceita;
	private String prescricao;
	private int idDiagnostico;
	private String observacao;
	
	
	public int getIdReceita() {
		return idReceita;
	}
	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}
	public String getDataReceita() {
		return dataReceita;
	}
	public void setDataReceita(String dataReceita) {
		this.dataReceita = dataReceita;
	}
	public String getPrescricao() {
		return prescricao;
	}
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	public int getIdDiagnostico() {
		return idDiagnostico;
	}
	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
