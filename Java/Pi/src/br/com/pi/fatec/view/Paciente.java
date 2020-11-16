package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Paciente extends JFrame {

	private JPanel contentPane;
	private	JTextField textFieldNome;
	private JTextField textFieldRG;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNascimento;
	private JTextField textFieldIdade;
	private JTextField textFieldEstadoCivil;
	private JTextField textFieldEmail;
	private JTextField textFieldNumero;
	private JTextField textFieldCidade;
	private JTextField textFieldCEP;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textFieldTelefone;
	private JTextField textFieldUF;
	private JTextField textFieldObservacoes;
	private JTextField textFieldSexo;
	private JTextField textFieldResponsavel;
	private JTextField textFieldTipoSanguineo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paciente frame = new Paciente();
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
	public Paciente() {
		setTitle("PACIENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuscarPaciente = new JButton("BUSCAR PACIENTE");
		btnBuscarPaciente.setBounds(28, 22, 132, 35);
		contentPane.add(btnBuscarPaciente);
		
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
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(30, 137, 46, 14);
		contentPane.add(lblSexo);
		
		textFieldSexo = new JTextField();
		textFieldSexo.setBounds(99, 135, 125, 20);
		contentPane.add(textFieldSexo);
		textFieldSexo.setColumns(10);
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo");
		lblTipoSanguineo.setBounds(234, 137, 86, 14);
		contentPane.add(lblTipoSanguineo);
		
		textFieldTipoSanguineo = new JTextField();
		textFieldTipoSanguineo.setBounds(315, 135, 72, 20);
		contentPane.add(textFieldTipoSanguineo);
		textFieldTipoSanguineo.setColumns(10);
		
		JLabel lblResponsavel = new JLabel("Respons\u00E1vel");
		lblResponsavel.setBounds(399, 137, 70, 14);
		contentPane.add(lblResponsavel);
		
		textFieldResponsavel = new JTextField();
		textFieldResponsavel.setBounds(479, 135, 275, 20);
		contentPane.add(textFieldResponsavel);
		textFieldResponsavel.setColumns(10);
		
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
