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
	private JTextField textFieldCPFPaciente;
	private JTextField textFieldPeriodoDe;
	private JTextField textFieldNome;
	private JTextField textFieldPeriodoAte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoricoDiagnostico frame = new HistoricoDiagnostico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HistoricoDiagnostico() {
		setTitle("HIST\u00D3RICO DE DIAGN\u00D3STICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCPFPaciente = new JLabel("CPF do Paciente");
		lblCPFPaciente.setBounds(30, 40, 97, 14);
		contentPane.add(lblCPFPaciente);
		
		textFieldCPFPaciente = new JTextField();
		textFieldCPFPaciente.setBounds(128, 37, 150, 20);
		contentPane.add(textFieldCPFPaciente);
		textFieldCPFPaciente.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(336, 40, 97, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(434, 37, 150, 20);
		contentPane.add(textFieldNome);
		
		JLabel lblPeriodoDe = new JLabel("Per\u00EDodo de:");
		lblPeriodoDe.setBounds(30, 70, 97, 14);
		contentPane.add(lblPeriodoDe);
		
		textFieldPeriodoDe = new JTextField();
		textFieldPeriodoDe.setBounds(128, 67, 150, 20);
		contentPane.add(textFieldPeriodoDe);
		textFieldPeriodoDe.setColumns(10);
		
		JLabel lblPeriodoAte = new JLabel("Per\u00EDodo at\u00E9:");
		lblPeriodoAte.setBounds(336, 70, 97, 14);
		contentPane.add(lblPeriodoAte);
		
		textFieldPeriodoAte = new JTextField();
		textFieldPeriodoAte.setColumns(10);
		textFieldPeriodoAte.setBounds(434, 67, 150, 20);
		contentPane.add(textFieldPeriodoAte);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(604, 22, 132, 35);
		contentPane.add(btnBuscar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(604, 67, 132, 35);
		contentPane.add(btnLimpar);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(30, 132, 65, 14);
		contentPane.add(lblResultados);
		
		List list = new List();
		list.setBounds(50, 152, 684, 280);
		contentPane.add(list);	
	}
}
