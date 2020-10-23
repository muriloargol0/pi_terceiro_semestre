package br.com.pi.fatec.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.model.*;
import br.com.pi.fatec.model.DTO.PatientDTO;

public class PatientController {
	private PatientDAO pacienteDAO = null;

	public void cadastraPaciente(PatientDTO dto) {
		try {
			if(pacienteDAO == null) {
				pacienteDAO = new PatientDAO();
			}
			
			pacienteDAO.create(dto);
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Paciente" + ex.getMessage());
		}
	}
}
