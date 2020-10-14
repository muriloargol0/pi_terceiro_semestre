package br.com.pi.fatec.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.pi.fatec.model.*;
import br.com.pi.fatec.model.DTO.PacienteDTO;

public class PacienteController {
	private DataObject<PacienteDTO> pacienteDAO = null;

	public void cadastraPaciente(PacienteDTO dto) {
		try {
			if(pacienteDAO == null) {
				pacienteDAO = new PacienteDAO<PacienteDTO>();
			}
			
			pacienteDAO.create(dto);
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao criar o registro do Paciente" + ex.getMessage());
		}
	}
}
