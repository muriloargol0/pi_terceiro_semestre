package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCRMCOREN;
	private JTextField textFieldEspecCateg;
	private JTextField textFieldRG;
	private JTextField textFieldTelefone;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textFieldObservacoes;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNascimento;
	private JTextField textFieldIdade;
	private JTextField textFieldEstadoCivil;
	private JTextField textFieldEmail;
	private JTextField textFieldNumero;
	private JTextField textFieldCidade;
	private JTextField textFieldCEP;
	private JTextField textFieldUF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setTitle("USU\u00C1RIOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuscarUsuario = new JButton("BUSCAR USU\u00C1RIO");
		btnBuscarUsuario.setBounds(28, 22, 132, 35);
		contentPane.add(btnBuscarUsuario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(30, 78, 70, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(99, 75, 509, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(629, 78, 46, 14);
		contentPane.add(lblStatus);
		
		JComboBox comboBoxStatus = new JComboBox();
		comboBoxStatus.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBoxStatus.setBounds(674, 75, 80, 20);
		contentPane.add(comboBoxStatus);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(30, 108, 70, 14);
		contentPane.add(lblRG);
		
		textFieldRG = new JTextField();
		textFieldRG.setBounds(99, 105, 125, 20);
		contentPane.add(textFieldRG);
		textFieldRG.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(237, 108, 27, 14);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(272, 105, 115, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setBounds(399, 108, 86, 14);
		contentPane.add(lblDataNascimento);
		
		textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setColumns(10);
		textFieldDataNascimento.setBounds(495, 105, 113, 20);
		contentPane.add(textFieldDataNascimento);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(629, 108, 46, 14);
		contentPane.add(lblIdade);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(674, 105, 80, 20);
		contentPane.add(textFieldIdade);
		textFieldIdade.setColumns(10);		
		
		JLabel lblCRMCOREN = new JLabel("CRM/COREN");
		lblCRMCOREN.setBounds(30, 138, 70, 14);
		contentPane.add(lblCRMCOREN);
		
		textFieldCRMCOREN = new JTextField();
		textFieldCRMCOREN.setBounds(99, 135, 125, 20);
		contentPane.add(textFieldCRMCOREN);
		textFieldCRMCOREN.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(234, 138, 48, 14);
		contentPane.add(lblTipo);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setBounds(272, 135, 115, 20);
		contentPane.add(comboBoxTipo);
		
		JLabel lblEspecCateg = new JLabel("Espec./Categ.");
		lblEspecCateg.setBounds(399, 138, 70, 14);
		contentPane.add(lblEspecCateg);
		
		textFieldEspecCateg = new JTextField();
		textFieldEspecCateg.setBounds(495, 135, 259, 20);
		contentPane.add(textFieldEspecCateg);
		textFieldEspecCateg.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(30, 168, 70, 14);
		contentPane.add(lblEstadoCivil);
		
		textFieldEstadoCivil = new JTextField();
		textFieldEstadoCivil.setBounds(99, 165, 125, 20);
		contentPane.add(textFieldEstadoCivil);
		textFieldEstadoCivil.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(234, 168, 46, 14);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(272, 165, 294, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
				
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(576, 168, 48, 14);
		contentPane.add(lblTelefone);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(634, 165, 120, 20);
		contentPane.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(30, 198, 70, 14);
		contentPane.add(lblRua);
		
		textFieldRua = new JTextField();
		textFieldRua.setBounds(99, 195, 509, 20);
		contentPane.add(textFieldRua);
		textFieldRua.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(618, 198, 46, 14);
		contentPane.add(lblNumero);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(674, 195, 80, 20);
		contentPane.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(30, 228, 33, 14);
		contentPane.add(lblBairro);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(99, 225, 140, 20);
		contentPane.add(textFieldBairro);
		textFieldBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(249, 228, 46, 14);
		contentPane.add(lblCidade);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(305, 225, 140, 20);
		contentPane.add(textFieldCidade);
		textFieldCidade.setColumns(10);
		
		JLabel lblUF = new JLabel("UF");
		lblUF.setBounds(455, 228, 33, 14);
		contentPane.add(lblUF);
		
		textFieldUF = new JTextField();
		textFieldUF.setBounds(495, 225, 57, 20);
		contentPane.add(textFieldUF);
		textFieldUF.setColumns(10);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(563, 228, 40, 14);
		contentPane.add(lblCEP);
		
		textFieldCEP = new JTextField();
		textFieldCEP.setBounds(604, 225, 150, 20);
		contentPane.add(textFieldCEP);
		textFieldCEP.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setBounds(30, 258, 70, 14);
		contentPane.add(lblObservacoes);
		
		textFieldObservacoes = new JTextField();
		textFieldObservacoes.setBounds(99, 255, 655, 100);
		contentPane.add(textFieldObservacoes);
		textFieldObservacoes.setColumns(10);		
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(100, 392, 132, 35);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(242, 392, 132, 35);
		contentPane.add(btnEditar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(384, 392, 132, 35);
		contentPane.add(btnFechar);
		
		
	}
}
