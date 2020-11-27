package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import br.com.pi.fatec.globals.Globals;

public class Menu extends JFrame implements ActionListener {

	Globals g = new Globals();
	private JPanel contentPane;
	
	/**
	 * Cria a tela de Menu
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDiagnostico = new JButton("DIAGNÓSTICO");
		btnDiagnostico.setBounds(76, 82, 210, 70);
		btnDiagnostico.addActionListener(this);
		contentPane.add(btnDiagnostico);
		
		JButton btnPaciente = new JButton("PACIENTE");
		btnPaciente.setBounds(335, 82, 210, 70);
		btnPaciente.addActionListener(this);
		contentPane.add(btnPaciente);
		
		JButton btnReceita = new JButton("RECEITA");
		btnReceita.setBounds(76, 201, 210, 70);
		btnReceita.addActionListener(this);
		contentPane.add(btnReceita);
		
		JButton btnUsuario = new JButton("USUÁRIO");
		btnUsuario.setBounds(335, 201, 210, 70);
		btnUsuario.addActionListener(this);
		contentPane.add(btnUsuario);
		
		setVisible(true);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "DIAGNÓSTICO") {
			if(g.idTipo == 1 || g.idTipo == 2) {
				Diagnosis diagnostico = new Diagnosis();
			}
			else {
				JOptionPane.showMessageDialog(this, "Apenas médicos e enfermeiras fazem diagnósticos!");
			}
		}
		
		if(e.getActionCommand() == "PACIENTE") {
			if(g.idTipo == 2 || g.idTipo == 4) {
				Patient paciente = new Patient();
			}
			else {
				JOptionPane.showMessageDialog(this, "Apenas enfermeiras e recepcionistas conseguem cadastrar pacientes!");
			}
		}
		
		
		if(e.getActionCommand() == "RECEITA") {
			Prescription receita = new Prescription(null);
		}
		
		if(e.getActionCommand() == "USUÁRIO") {
			if(g.idTipo == 3) {
				Employee usuario = new Employee();
			}
			else {
				JOptionPane.showMessageDialog(this, "Apenas administradores conseguem cadastrar usuários!");
			}
		}
	}
}
