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
	
	private int idPaciente;
	
	private JPanel contentPane;
	private JTextField textFieldProntuario;
	private JTextField textFieldIdade;
	private JTextField textFieldPaciente;
	private JTextField textFieldObservacoes;
	private JTextField textFieldData;
	private JTextField textFieldPressao;
	private JLabel lblAnexar;
	private JLabel lblGlicemia;
	private JButton btnAnexar;
	private JTextField textFieldGlicemia;
	private JTextField textFieldColesterol;
	private JTextField textFieldTemperatura;
	private JLabel lblTemperatura;
	private JLabel lblColesterol;
	private JLabel lblSintomas;
	private JTextField textFieldSintomas;
	private JTextField textFieldDiagnostico;
	private JLabel lblDiagnostico;
	private JButton btnSalvar;
	private JButton btnEditar;
	private JButton btnGerarReceita;
	private JButton btnFechar;

	/**
	 * Create the frame.
	 */
	public Diagnostico() {
		setTitle("DIAGN\u00D3STICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProntuario = new JLabel("Prontu\u00E1rio");
		lblProntuario.setBounds(30, 50, 60, 14);
		contentPane.add(lblProntuario);
		
		textFieldProntuario = new JTextField();
		textFieldProntuario.setBounds(100, 47, 132, 20);
		contentPane.add(textFieldProntuario);
		textFieldProntuario.setColumns(10);
		textFieldProntuario.addKeyListener(this);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setBounds(242, 50, 60, 14);
		contentPane.add(lblPaciente);
		
		textFieldPaciente = new JTextField();
		textFieldPaciente.setColumns(10);
		textFieldPaciente.setBounds(326, 47, 428, 20);
		contentPane.add(textFieldPaciente);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(30, 75, 46, 14);
		contentPane.add(lblIdade);	
		
		textFieldIdade = new JTextField();
		textFieldIdade.setColumns(10);
		textFieldIdade.setBounds(100, 72, 132, 20);
		contentPane.add(textFieldIdade);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setBounds(242, 75, 84, 14);
		contentPane.add(lblObservacoes);
		
		textFieldObservacoes = new JTextField();
		textFieldObservacoes.setColumns(10);
		textFieldObservacoes.setBounds(326, 72, 428, 20);
		contentPane.add(textFieldObservacoes);
		
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
		lblData.setBounds(30, 146, 46, 14);
		contentPane.add(lblData);
		
		textFieldData = new JTextField();
		textFieldData.setBounds(100, 143, 132, 20);
		contentPane.add(textFieldData);
		textFieldData.setColumns(10);
		
		lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(272, 146, 84, 14);
		contentPane.add(lblTemperatura);
		
		textFieldTemperatura = new JTextField();
		textFieldTemperatura.setBounds(366, 143, 142, 20);
		contentPane.add(textFieldTemperatura);
		textFieldTemperatura.setColumns(10);
		
		lblColesterol = new JLabel("Colesterol");
		lblColesterol.setBounds(549, 146, 60, 14);
		contentPane.add(lblColesterol);
		
		textFieldColesterol = new JTextField();
		textFieldColesterol.setBounds(622, 143, 132, 20);
		contentPane.add(textFieldColesterol);
		textFieldColesterol.setColumns(10);
		
		JLabel lblPressão = new JLabel("Press\u00E3o");
		lblPressão.setBounds(30, 171, 60, 14);
		contentPane.add(lblPressão);
				
		textFieldPressao = new JTextField();
		textFieldPressao.setBounds(100, 168, 132, 20);
		contentPane.add(textFieldPressao);
		textFieldPressao.setColumns(10);
		
		lblGlicemia = new JLabel("Glicemia");
		lblGlicemia.setBounds(272, 171, 84, 14);
		contentPane.add(lblGlicemia);
		
		textFieldGlicemia = new JTextField();
		textFieldGlicemia.setBounds(366, 168, 142, 20);
		contentPane.add(textFieldGlicemia);
		textFieldGlicemia.setColumns(10);
		
		lblAnexar = new JLabel("Anexar");
		lblAnexar.setBounds(549, 171, 46, 14);
		contentPane.add(lblAnexar);
				
		btnAnexar = new JButton("Anexar");
		btnAnexar.setBounds(622, 167, 133, 23);
		btnAnexar.addActionListener(this);
		contentPane.add(btnAnexar);
		
		lblSintomas = new JLabel("Sintomas");
		lblSintomas.setBounds(30, 196, 60, 14);
		contentPane.add(lblSintomas);
		
		textFieldSintomas = new JTextField();
		textFieldSintomas.setBounds(100, 196, 656, 75);
		contentPane.add(textFieldSintomas);
		textFieldSintomas.setColumns(10);
		
		lblDiagnostico = new JLabel("Diagn\u00F3stico");
		lblDiagnostico.setBounds(30, 282, 71, 14);
		contentPane.add(lblDiagnostico);
		
		textFieldDiagnostico = new JTextField();
		textFieldDiagnostico.setColumns(10);
		textFieldDiagnostico.setBounds(100, 282, 656, 75);
		contentPane.add(textFieldDiagnostico);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(100, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(242, 392, 132, 35);
		btnEditar.addActionListener(this);
		contentPane.add(btnEditar);
		
		btnGerarReceita = new JButton("GERAR RECEITA");
		btnGerarReceita.setBounds(384, 392, 132, 35);
		btnGerarReceita.addActionListener(this);
		contentPane.add(btnGerarReceita);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(526, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Anexar") {
			
		}
		
		if(e.getActionCommand() == "SALVAR") {
			DiagnosisController dc = new DiagnosisController();
			
			//dc.setAnexo();
			dc.setColesterol(this.textFieldColesterol.getText());
			dc.setDataDiagnostico(this.textFieldData.getText());
			dc.setDiagnostico(this.textFieldDiagnostico.getText());
			dc.setGlicemia(textFieldGlicemia.getText());
			dc.setIdFuncionario(1); // Alterar para o id do funcionário logado
			dc.setIdPaciente(1); // Alterar para buscar o id paciente
			
			
			
		}
		
		if(e.getActionCommand() == "EDITAR") {
			String diag = JOptionPane.showInputDialog("Digite o id do diagnóstico: ");
		}
		
		if(e.getActionCommand() == "GERAR RECEITA") {
			
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
			try {
				int idPac = Integer.parseInt(this.textFieldProntuario.getText());
				
				System.out.println(idPac);
				
				DiagnosisController dc = new DiagnosisController();
				
				String[] pacienteDados = dc.getProntuario(idPac);
				
				System.out.println("aqui " + pacienteDados[0]);
				
				//this.idPaciente = Integer.parseInt(pacienteDados[0]);
				
				this.textFieldPaciente.setText(pacienteDados[1]);
				this.textFieldIdade.setText(pacienteDados[2]);
				this.textFieldObservacoes.setText(pacienteDados[3]);
				
			} catch (Exception e2) {
				this.textFieldPaciente.setText("");
				this.textFieldPaciente.requestFocus();
				JOptionPane.showMessageDialog(this, "O id do paciente precisa ser um número inteiro!");
			}
		}
		//textFieldPaciente.setText(textFieldProntuario.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
