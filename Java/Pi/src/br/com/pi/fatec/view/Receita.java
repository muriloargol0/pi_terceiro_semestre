package br.com.pi.fatec.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.pi.fatec.controller.DiagnosisController;
import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.controller.PrescriptionController;

public class Receita extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfProntuario;
	private JTextField tfIdade;
	private JTextField tfPaciente;
	private JTextField tfObservacoes;
	private JTextField tfData;
	private JTextField tfPrescricao;
	private JTextField tfObservacao;
	private JButton btnSalvar;
	private JButton btnImprimir;
	private JButton btnFechar;
	
	/**
	 * Create the frame.
	 */
	public Receita() {
		setTitle("RECEITA");
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
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaciente.setBounds(256, 50, 60, 14);
		contentPane.add(lblPaciente);
		
		tfPaciente = new JTextField();
		tfPaciente.setColumns(10);
		tfPaciente.setBounds(326, 47, 428, 20);
		contentPane.add(tfPaciente);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(44, 75, 46, 14);
		contentPane.add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(100, 72, 132, 20);
		contentPane.add(tfIdade);
		
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
		lblData.setBounds(20, 146, 70, 14);
		contentPane.add(lblData);
		
		tfData = new JTextField();
		tfData.setBounds(100, 143, 132, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);
		
		JLabel lblPrescricao = new JLabel("Prescrição");
		lblPrescricao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrescricao.setBounds(20, 174, 70, 14);
		contentPane.add(lblPrescricao);
		
		tfPrescricao = new JTextField();
		tfPrescricao.setBounds(100, 174, 656, 75);
		contentPane.add(tfPrescricao);
		tfPrescricao.setColumns(10);
		
		JLabel lblObservacao = new JLabel("Observação");
		lblObservacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacao.setBounds(0, 260, 90, 14);
		contentPane.add(lblObservacao);		
		
		tfObservacao = new JTextField();
		tfObservacao.setColumns(10);
		tfObservacao.setBounds(100, 260, 656, 75);
		contentPane.add(tfObservacao);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(100, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setBounds(242, 392, 132, 35);
		btnImprimir.addActionListener(this);
		contentPane.add(btnImprimir);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(384, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "SALVAR") {
			PrescriptionController pc = new PrescriptionController();
			
			pc.setDataReceita(this.tfData.getText());
			pc.setPrescricao(this.tfPrescricao.getText());
			pc.setObservacao(this.tfObservacao.getText());
		}
		
		if(e.getActionCommand() == "IMPRIMIR") {
			
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}		
	}

}
