package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.pi.fatec.controller.DiagnosisController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Diagnostico extends JFrame implements ActionListener, KeyListener {
	
	private int idDiagnostico = 0;
	
	private JPanel contentPane;
	private JTextField tfProntuario;
	private JTextField tfidDiagnostico;
	private JTextField tfPaciente;
	private JTextField tfObservacoes;
	private JTextField tfData;
	private JTextField tfPressao;
	private JLabel lblAnexar;
	private JLabel lblGlicemia;
	private JButton btnAnexar;
	private JTextField tfGlicemia;
	private JTextField tfColesterol;
	private JTextField tfTemperatura;
	private JLabel lblTemperatura;
	private JLabel lblColesterol;
	private JLabel lblSintomas;
	private JTextField tfSintomas;
	private JTextField tfDiagnostico;
	private JLabel lblDiagnostico;
	private JButton btnSalvar;
	private JButton btnBuscar;
	private JButton btnGerarReceita;
	private JButton btnFechar;
	private JButton btnEditar;

	/**
	 * Create the frame.
	 */
	public Diagnostico() {
		setTitle("DIAGN\u00D3STICO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProntuario = new JLabel("Prontu\u00E1rio");
		lblProntuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProntuario.setBounds(30, 50, 60, 14);
		contentPane.add(lblProntuario);
		
		tfProntuario = new JTextField();
		tfProntuario.setBounds(100, 47, 132, 20);
		contentPane.add(tfProntuario);
		tfProntuario.setColumns(10);
		tfProntuario.addKeyListener(this);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaciente.setBounds(256, 50, 60, 14);
		contentPane.add(lblPaciente);
		
		tfPaciente = new JTextField();
		tfPaciente.setColumns(10);
		tfPaciente.setBounds(326, 47, 428, 20);
		contentPane.add(tfPaciente);
		
		JLabel lblidDiagnostico = new JLabel("Id Diagnostico");
		lblidDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidDiagnostico.setBounds(20, 75, 70, 14);
		contentPane.add(lblidDiagnostico);	
		
		tfidDiagnostico = new JTextField();
		tfidDiagnostico.setColumns(10);
		tfidDiagnostico.setBounds(100, 72, 132, 20);
		contentPane.add(tfidDiagnostico);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacoes.setBounds(232, 75, 84, 14);
		contentPane.add(lblObservacoes);
		
		tfObservacoes = new JTextField();
		tfObservacoes.setColumns(10);
		tfObservacoes.setBounds(326, 72, 428, 20);
		contentPane.add(tfObservacoes);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.BLACK);
		separator.setBounds(20, 30, 744, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(20, 104, 744, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(19, 31, 1, 75);
		contentPane.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(764, 31, 1, 75);
		contentPane.add(separator_2_1);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setBounds(44, 146, 46, 14);
		contentPane.add(lblData);
		
		tfData = new JTextField();
		tfData.setBounds(100, 143, 132, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);
		
		lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTemperatura.setBounds(272, 146, 84, 14);
		contentPane.add(lblTemperatura);
		
		tfTemperatura = new JTextField();
		tfTemperatura.setBounds(366, 143, 142, 20);
		contentPane.add(tfTemperatura);
		tfTemperatura.setColumns(10);
		
		lblColesterol = new JLabel("Colesterol");
		lblColesterol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblColesterol.setBounds(552, 146, 60, 14);
		contentPane.add(lblColesterol);
		
		tfColesterol = new JTextField();
		tfColesterol.setBounds(622, 143, 132, 20);
		contentPane.add(tfColesterol);
		tfColesterol.setColumns(10);
		
		JLabel lblPressão = new JLabel("Press\u00E3o");
		lblPressão.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPressão.setBounds(30, 171, 60, 14);
		contentPane.add(lblPressão);
				
		tfPressao = new JTextField();
		tfPressao.setBounds(100, 168, 132, 20);
		contentPane.add(tfPressao);
		tfPressao.setColumns(10);
		
		lblGlicemia = new JLabel("Glicemia");
		lblGlicemia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGlicemia.setBounds(272, 171, 84, 14);
		contentPane.add(lblGlicemia);
		
		tfGlicemia = new JTextField();
		tfGlicemia.setBounds(366, 168, 142, 20);
		contentPane.add(tfGlicemia);
		tfGlicemia.setColumns(10);
		
		lblAnexar = new JLabel("Anexar");
		lblAnexar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnexar.setBounds(566, 171, 46, 14);
		contentPane.add(lblAnexar);
				
		btnAnexar = new JButton("Anexar");
		btnAnexar.setBounds(622, 167, 133, 23);
		btnAnexar.addActionListener(this);
		contentPane.add(btnAnexar);
		
		lblSintomas = new JLabel("Sintomas");
		lblSintomas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSintomas.setBounds(30, 196, 60, 14);
		contentPane.add(lblSintomas);
		
		tfSintomas = new JTextField();
		tfSintomas.setHorizontalAlignment(SwingConstants.LEFT);
		tfSintomas.setBounds(100, 196, 656, 75);
		contentPane.add(tfSintomas);
		tfSintomas.setColumns(10);
		
		lblDiagnostico = new JLabel("Diagn\u00F3stico");
		lblDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiagnostico.setBounds(19, 282, 71, 14);
		contentPane.add(lblDiagnostico);
		
		tfDiagnostico = new JTextField();
		tfDiagnostico.setHorizontalAlignment(SwingConstants.LEFT);
		tfDiagnostico.setColumns(10);
		tfDiagnostico.setBounds(100, 282, 656, 75);
		contentPane.add(tfDiagnostico);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(185, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(465, 392, 132, 35);
		btnEditar.addActionListener(this);
		contentPane.add(btnEditar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(45, 392, 132, 35);
		btnBuscar.addActionListener(this);
		contentPane.add(btnBuscar);
		
		btnGerarReceita = new JButton("GERAR RECEITA");
		btnGerarReceita.setBounds(325, 392, 132, 35);
		btnGerarReceita.addActionListener(this);
		contentPane.add(btnGerarReceita);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(605, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		DiagnosisController dc = new DiagnosisController();
		
		dc.getDto().anexo = this.btnAnexar.getText();
		dc.getDto().colesterol = this.tfColesterol.getText();
		dc.getDto().dataDiagnostico = this.tfData.getText();
		dc.getDto().diagnostico = this.tfDiagnostico.getText();
		dc.getDto().glicemia = this.tfGlicemia.getText();
		dc.getDto().idDianostico = Integer.parseInt(this.tfidDiagnostico.getText());
		dc.getDto().idPaciente = Integer.parseInt(this.tfProntuario.getText());
		dc.getDto().nome = this.tfPaciente.getText();
		dc.getDto().observacoes = this.tfObservacoes.getText();
		dc.getDto().pressaoSanguinea = this.tfPressao.getText();
		dc.getDto().sintomas = this.tfSintomas.getText();
		dc.getDto().temperatura = this.tfTemperatura.getText();
		//Colocar a "assinatura do médico"?
		
		if(e.getActionCommand() == "Anexar") {
			
		}
		
		if(e.getActionCommand() == "BUSCAR") {
			
		}
		
		if(e.getActionCommand() == "SALVAR") {
			dc.cadastraDiagnostico();
		}
		
		if(e.getActionCommand() == "EDITAR") {
			dc.getDto().idDianostico = this.idDiagnostico;
			dc.editarDiagnostico();
		}
		
		if(e.getActionCommand() == "GERAR RECEITA") {
			Receita receita = new Receita();
			
		}	
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		if(e.getKeyCode() == 10) {
//			try {
//				int idPac = Integer.parseInt(this.tfProntuario.getText());
//				
//				System.out.println(idPac);
//				
//				DiagnosisController dc = new DiagnosisController();
//				
//				String[] pacienteDados = dc.getProntuario(idPac);
//				
//				System.out.println("aqui " + pacienteDados[0]);
//				
//				this.idPaciente = Integer.parseInt(pacienteDados[0]);
//				
//				this.tfPaciente.setText(pacienteDados[1]);
//				this.tfidDiagnostico.setText(pacienteDados[2]);
//				this.tfObservacoes.setText(pacienteDados[3]);
//				
//			} catch (Exception e2) {
//				this.tfPaciente.setText("");
//				this.tfPaciente.requestFocus();
//				JOptionPane.showMessageDialog(this, "O id do paciente precisa ser um número inteiro!");
//			}
//		}
//		textFieldPaciente.setText(textFieldProntuario.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
