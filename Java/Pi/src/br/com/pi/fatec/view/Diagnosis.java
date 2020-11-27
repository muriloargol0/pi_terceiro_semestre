package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.pi.fatec.controller.DiagnosisController;
import br.com.pi.fatec.globals.Globals;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Diagnosis extends JFrame implements ActionListener, KeyListener {
	
	private int idDiagnostico = 0;
	Globals g = new Globals();
	DiagnosisController dc;
	private JPanel contentPane;
	private JTextField tfPaciente;
	private JTextField tfNome;
	private JTextField tfObservacoes;
	private JFormattedTextField tfData;
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
	private int idPaciente;
	private int idFuncionario;
	private JTextField tfIdDiagnostico;
	
	/**
	 * Cria a tela de Diagnóstico
	 */
	public Diagnosis() {
		
		dc = new DiagnosisController();
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		setTitle("DIAGN\u00D3STICO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaciente.setBounds(42, 50, 60, 14);
		contentPane.add(lblPaciente);
		
		tfPaciente = new JTextField();
		tfPaciente.setBounds(112, 47, 120, 20);
		contentPane.add(tfPaciente);
		tfPaciente.setColumns(10);
		tfPaciente.addKeyListener(this);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(243, 50, 40, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(293, 47, 444, 20);
		contentPane.add(tfNome);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacoes.setBounds(199, 74, 84, 17);
		contentPane.add(lblObservacoes);
		
		tfObservacoes = new JTextField();
		tfObservacoes.setColumns(10);
		tfObservacoes.setBounds(293, 72, 444, 20);
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
		
		tfData = new JFormattedTextField(formatter.format(date));
		tfData.setBounds(100, 143, 132, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);
		MaskFormatter formaterData = new MaskFormatter();
		try {
			formaterData.setMask("##/##/####");
			formaterData.install(tfData);
		}catch (ParseException pe) {
			pe.printStackTrace();
		}catch ( Exception ex ) {
			ex.printStackTrace();
		}
		
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
		lblPressão.setBounds(30, 171, 60, 17);
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
		lblSintomas.setBounds(30, 196, 60, 20);
		contentPane.add(lblSintomas);
		
		tfSintomas = new JTextField();
		tfSintomas.setHorizontalAlignment(SwingConstants.LEFT);
		tfSintomas.setBounds(100, 196, 656, 75);
		contentPane.add(tfSintomas);
		tfSintomas.setColumns(10);
		
		lblDiagnostico = new JLabel("Diagn\u00F3stico");
		lblDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiagnostico.setBounds(19, 282, 71, 20);
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
		btnGerarReceita.setEnabled(false);
		contentPane.add(btnGerarReceita);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(605, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		JLabel lblidDiagnostico = new JLabel("Diagn\u00F3sitco");
		lblidDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidDiagnostico.setBounds(30, 75, 72, 14);
		contentPane.add(lblidDiagnostico);
		
		tfIdDiagnostico = new JTextField();
		tfIdDiagnostico.setBounds(112, 72, 86, 20);
		contentPane.add(tfIdDiagnostico);
		tfIdDiagnostico.setColumns(10);
		tfIdDiagnostico.setEnabled(false);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
		if(g.idTipo == 2) {
			tfSintomas.setEnabled(false);
			tfDiagnostico.setEnabled(false);
			btnGerarReceita.setEnabled(false);
			btnEditar.setEnabled(false);
		}
		if(g.idTipo == 1) {
			btnSalvar.setEnabled(false);
			tfData.setEnabled(false);
		}
		
	}
	
	/***
	 * Preenche o DTO da tela para poder transferir as informações para o controller e depois para o DAO
	 */
	public void preencherDto() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		dc.getDto().idDianostico = Integer.parseInt(this.tfIdDiagnostico.getText());
		dc.getDto().anexo = this.btnAnexar.getText();
		dc.getDto().colesterol = this.tfColesterol.getText();
		dc.getDto().dataDiagnostico = formatter.format(date);
		dc.getDto().diagnostico = this.tfDiagnostico.getText() == null ? "" : this.tfDiagnostico.getText();
		dc.getDto().glicemia = this.tfGlicemia.getText();
		dc.getDto().idPaciente = Integer.parseInt(this.tfPaciente.getText());
		dc.getDto().nome = this.tfNome.getText();
		dc.getDto().observacoes = this.tfObservacoes.getText();
		dc.getDto().pressaoSanguinea = this.tfPressao.getText();
		dc.getDto().sintomas = this.tfSintomas.getText() == null ? "" : this.tfSintomas.getText();
		dc.getDto().temperatura = this.tfTemperatura.getText();
		dc.getDto().idFuncionario = g.idFuncionario;
	}

	/***
	 * Método que contém a definição do que será feito quando um evento for disparado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Anexar") {
			
		}
		
		if(e.getActionCommand() == "BUSCAR") {
			String sdiag = JOptionPane.showInputDialog("Digite o número do diagnóstico:");
			
			dc.findDiagnosis(sdiag);
			
			this.idFuncionario = dc.getDto().idFuncionario;
			this.idPaciente = dc.getDto().idPaciente;
			this.tfIdDiagnostico.setText(Integer.toString(dc.getDto().idDianostico));
			this.tfColesterol.setText(dc.getDto().colesterol);
			this.tfData.setText(dc.getDto().dataDiagnostico);
			this.tfDiagnostico.setText(dc.getDto().diagnostico);
			this.tfGlicemia.setText(dc.getDto().glicemia);
			this.tfObservacoes.setText(dc.getDto().observacoes);
			this.tfNome.setText(dc.getDto().nome);
			this.tfPressao.setText(dc.getDto().pressaoSanguinea);
			this.tfPaciente.setText(Integer.toString(dc.getDto().idPaciente));
			this.tfSintomas.setText(dc.getDto().sintomas);
			this.tfTemperatura.setText(dc.getDto().temperatura);
			//anexo?
			
			this.btnEditar.setEnabled(true);
			this.btnSalvar.setEnabled(false);
		}
		
		if(e.getActionCommand() == "SALVAR") {
			this.preencherDto();
			System.out.println(dc.getDto().idFuncionario);
			
			this.idDiagnostico = dc.cadastraDiagnostico();
			
			JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
			
			this.btnSalvar.setEnabled(false);
			this.btnGerarReceita.setEnabled(true);
		}
		
		if(e.getActionCommand() == "EDITAR") {
			if(this.tfIdDiagnostico.getText() != "") {
				if(this.idFuncionario == g.idFuncionario) {
					this.preencherDto();
					dc.getDto().idDianostico = Integer.parseInt(this.tfIdDiagnostico.getText());
					dc.editarDiagnostico();
					
					JOptionPane.showMessageDialog(this, "Diagnóstico editado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(this, "Só o médico que fez o diagnóstico pode alterá-lo!");
				}
			}else {
				JOptionPane.showMessageDialog(this, "Antes de editar, busque um diagnóstico!");
			}
		}
		
		this.btnGerarReceita.setEnabled(true);
		
		if(e.getActionCommand() == "GERAR RECEITA") {
			if(g.idTipo == 1) {
				this.preencherDto();
				Prescription receita = new Prescription(this.dc.getDto());
			}else {
				JOptionPane.showMessageDialog(this, "Só médicos podem gerar receita!");
			}
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
		if(e.getKeyCode() == 10) {
			if(g.idTipo == 2) {
				try {
					int idPac = Integer.parseInt(this.tfPaciente.getText());
								
					String[] pacienteDados = dc.getProntuario(idPac);
					
					this.idPaciente = pacienteDados[0] == null ? 0 : Integer.parseInt(pacienteDados[0]);
					
					this.tfNome.setText(pacienteDados[1]);
					this.tfPaciente.setText(pacienteDados[0]);
					this.tfObservacoes.setText(pacienteDados[2]);
					
				} catch (Exception e2) {
					this.tfNome.setText("");
					this.tfNome.requestFocus();
					JOptionPane.showMessageDialog(this, "O id do paciente precisa ser um número inteiro!" +e2.toString());
				}
			}
				
			if(g.idTipo == 1) {	
				this.idFuncionario = g.idFuncionario;
				try {
					int idPac = Integer.parseInt(this.tfPaciente.getText());
								
					String[] pacienteDados = dc.getProntuarioMedico(idPac);
					
					this.idPaciente = pacienteDados[0] == null ? 0 : Integer.parseInt(pacienteDados[0]);
					
					this.tfNome.setText(pacienteDados[1]);
					this.tfPaciente.setText(pacienteDados[0]);
					this.tfObservacoes.setText(pacienteDados[2]);
					this.tfData.setText(pacienteDados[3]);
					this.tfColesterol.setText(pacienteDados[7]);
					this.tfGlicemia.setText(pacienteDados[6]);
					this.tfPressao.setText(pacienteDados[4]);
					this.tfTemperatura.setText(pacienteDados[5]);
					this.tfIdDiagnostico.setText(pacienteDados[8]);
					this.tfSintomas.setText(pacienteDados[9]);
					this.tfDiagnostico.setText(pacienteDados[10]);
					
					if(this.idPaciente > 0) {
						this.btnGerarReceita.setEnabled(true);
					}

				} catch (Exception e2) {
					this.tfNome.setText("");
					this.tfIdDiagnostico.setText("");
					this.tfNome.requestFocus();
					JOptionPane.showMessageDialog(this, "O id do paciente precisa ser um número inteiro!" +e2.toString());
				}
			}
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
