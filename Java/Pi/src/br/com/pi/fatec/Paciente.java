package br.com.pi.fatec;

import br.com.pi.fatec.controller.PatientController;

public class Paciente {
	private PatientController pacienteController = null;
	
	public Paciente(){
		if(pacienteController == null) {
			pacienteController = new PatientController();
		}
	}
	
	public void btnCadastrar() {		
		pacienteController.cadastraPaciente();
	}
}
