package br.com.pi.fatec;

import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.model.DTO.PatientDTO;

public class Paciente {
	private PatientController pacienteController = null;
	
	public Paciente(){
		if(pacienteController == null) {
			pacienteController = new PatientController();
		}
	}
	
	public void btnCadastrar() {
		PatientDTO dto = new PatientDTO();
		
		dto.nome = "Murilo";
		dto.email = "email@email.com";
		
		pacienteController.cadastraPaciente(dto);
	}
}
