package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import java.awt.List;

public class HistoricoDiagnostico extends JFrame {

	private JPanel contentPane;
	private JTextField tfCPFPaciente;
	private JTextField tfPeriodoDe;
	private JTextField tfNome;
	private JTextField tfPeriodoAte;

	/**
	 * Create the frame.
	 */
	public HistoricoDiagnostico() {
		setTitle("HIST\u00D3RICO DE DIAGN\u00D3STICO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCPFPaciente = new JLabel("CPF do Paciente");
		lblCPFPaciente.setBounds(30, 40, 97, 14);
		contentPane.add(lblCPFPaciente);
		
		tfCPFPaciente = new JTextField();
		tfCPFPaciente.setBounds(128, 37, 150, 20);
		contentPane.add(tfCPFPaciente);
		tfCPFPaciente.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(336, 40, 97, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(434, 37, 150, 20);
		contentPane.add(tfNome);
		
		JLabel lblPeriodoDe = new JLabel("Per\u00EDodo de:");
		lblPeriodoDe.setBounds(30, 70, 97, 14);
		contentPane.add(lblPeriodoDe);
		
		tfPeriodoDe = new JTextField();
		tfPeriodoDe.setBounds(128, 67, 150, 20);
		contentPane.add(tfPeriodoDe);
		tfPeriodoDe.setColumns(10);
		
		JLabel lblPeriodoAte = new JLabel("Per\u00EDodo at\u00E9:");
		lblPeriodoAte.setBounds(336, 70, 97, 14);
		contentPane.add(lblPeriodoAte);
		
		tfPeriodoAte = new JTextField();
		tfPeriodoAte.setColumns(10);
		tfPeriodoAte.setBounds(434, 67, 150, 20);
		contentPane.add(tfPeriodoAte);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(604, 22, 132, 35);
		contentPane.add(btnBuscar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(604, 67, 132, 35);
		contentPane.add(btnLimpar);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(30, 132, 65, 14);
		contentPane.add(lblResultados);
		
		List listHistorico = new List();
		listHistorico.setBounds(50, 152, 684, 280);
		contentPane.add(listHistorico);	
	}
}
