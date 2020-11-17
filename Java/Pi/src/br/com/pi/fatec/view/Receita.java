package br.com.pi.fatec.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Receita extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldProntuario;
	private JTextField textFieldIdade;
	private JTextField textFieldPaciente;
	private JTextField textFieldObservacoes;
	private JTextField textFieldData;
	private JTextField textFieldPrescricao;
	private JTextField textFieldObservacao;
	private JButton btnSalvar;
	private JButton btnImprimir;
	private JButton btnFechar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receita frame = new Receita();
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
	public Receita() {
		setTitle("RECEITA");
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
		
		JLabel lblPrescricao = new JLabel("Prescri��o");
		lblPrescricao.setBounds(30, 174, 70, 14);
		contentPane.add(lblPrescricao);
		
		textFieldPrescricao = new JTextField();
		textFieldPrescricao.setBounds(100, 174, 656, 75);
		contentPane.add(textFieldPrescricao);
		textFieldPrescricao.setColumns(10);
		
		JLabel lblObservacao = new JLabel("Observa��o");
		lblObservacao.setBounds(30, 260, 70, 14);
		contentPane.add(lblObservacao);		
		
		textFieldObservacao = new JTextField();
		textFieldObservacao.setColumns(10);
		textFieldObservacao.setBounds(100, 260, 656, 75);
		contentPane.add(textFieldObservacao);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(100, 392, 132, 35);
		contentPane.add(btnSalvar);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setBounds(242, 392, 132, 35);
		contentPane.add(btnImprimir);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(384, 392, 132, 35);
		contentPane.add(btnFechar);
		
	}

}