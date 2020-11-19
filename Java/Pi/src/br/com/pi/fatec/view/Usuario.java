package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.pi.fatec.controller.EmployeeController;
import br.com.pi.fatec.controller.PatientController;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Usuario extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCRMCOREN;
	private JTextField tfEspecCateg;
	private JTextField tfRG;
	private JTextField tfTelefone;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfObservacoes;
	private JTextField tfCPF;
	private JTextField tfDataNascimento;
	private JTextField tfIdade;
	private JTextField tfEstadoCivil;
	private JTextField tfEmail;
	private JTextField tfNumero;
	private JTextField tfCidade;
	private JTextField tfCEP;
	private JTextField tfUF;

	/**
	 * Create the frame.
	 */
	public Usuario() {
		setTitle("USU\u00C1RIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		tfNome = new JTextField();
		tfNome.setBounds(99, 75, 509, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(629, 78, 46, 14);
		contentPane.add(lblStatus);
		
		JComboBox cbStatus = new JComboBox();
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		cbStatus.setBounds(674, 75, 80, 20);
		contentPane.add(cbStatus);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(30, 108, 70, 14);
		contentPane.add(lblRG);
		
		tfRG = new JTextField();
		tfRG.setBounds(99, 105, 125, 20);
		contentPane.add(tfRG);
		tfRG.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(237, 108, 27, 14);
		contentPane.add(lblCPF);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(272, 105, 115, 20);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setBounds(399, 108, 86, 14);
		contentPane.add(lblDataNascimento);
		
		tfDataNascimento = new JTextField();
		tfDataNascimento.setColumns(10);
		tfDataNascimento.setBounds(495, 105, 113, 20);
		contentPane.add(tfDataNascimento);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(629, 108, 46, 14);
		contentPane.add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(674, 105, 80, 20);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);		
		
		JLabel lblCRMCOREN = new JLabel("CRM/COREN");
		lblCRMCOREN.setBounds(30, 138, 70, 14);
		contentPane.add(lblCRMCOREN);
		
		tfCRMCOREN = new JTextField();
		tfCRMCOREN.setBounds(99, 135, 125, 20);
		contentPane.add(tfCRMCOREN);
		tfCRMCOREN.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(234, 138, 48, 14);
		contentPane.add(lblTipo);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setBounds(272, 135, 115, 20);
		contentPane.add(cbTipo);
		
		JLabel lblEspecCateg = new JLabel("Espec./Categ.");
		lblEspecCateg.setBounds(399, 138, 70, 14);
		contentPane.add(lblEspecCateg);
		
		tfEspecCateg = new JTextField();
		tfEspecCateg.setBounds(495, 135, 259, 20);
		contentPane.add(tfEspecCateg);
		tfEspecCateg.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(30, 168, 70, 14);
		contentPane.add(lblEstadoCivil);
		
		tfEstadoCivil = new JTextField();
		tfEstadoCivil.setBounds(99, 165, 125, 20);
		contentPane.add(tfEstadoCivil);
		tfEstadoCivil.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(234, 168, 46, 14);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(272, 165, 294, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
				
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(576, 168, 48, 14);
		contentPane.add(lblTelefone);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(634, 165, 120, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(30, 198, 70, 14);
		contentPane.add(lblRua);
		
		tfRua = new JTextField();
		tfRua.setBounds(99, 195, 509, 20);
		contentPane.add(tfRua);
		tfRua.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(618, 198, 46, 14);
		contentPane.add(lblNumero);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(674, 195, 80, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(30, 228, 33, 14);
		contentPane.add(lblBairro);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(99, 225, 140, 20);
		contentPane.add(tfBairro);
		tfBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(249, 228, 46, 14);
		contentPane.add(lblCidade);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(305, 225, 140, 20);
		contentPane.add(tfCidade);
		tfCidade.setColumns(10);
		
		JLabel lblUF = new JLabel("UF");
		lblUF.setBounds(455, 228, 33, 14);
		contentPane.add(lblUF);
		
		tfUF = new JTextField();
		tfUF.setBounds(495, 225, 57, 20);
		contentPane.add(tfUF);
		tfUF.setColumns(10);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(563, 228, 40, 14);
		contentPane.add(lblCEP);
		
		tfCEP = new JTextField();
		tfCEP.setBounds(604, 225, 150, 20);
		contentPane.add(tfCEP);
		tfCEP.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setBounds(30, 258, 70, 14);
		contentPane.add(lblObservacoes);
		
		tfObservacoes = new JTextField();
		tfObservacoes.setBounds(99, 255, 655, 100);
		contentPane.add(tfObservacoes);
		tfObservacoes.setColumns(10);		
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(100, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(242, 392, 132, 35);
		btnEditar.addActionListener(this);
		contentPane.add(btnEditar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(384, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "SALVAR") {
			EmployeeController ec = new EmployeeController();
			
			ec.setNome(this.tfNome.getText());
			//ec.setStts(this);
			ec.setRg(this.tfRG.getText());
			ec.setCpf(this.tfCPF.getText());
			ec.setDataNascimento(this.tfDataNascimento.getText());
			//ec.setIdade????
			//ec.setCoren(???????);
			//ec.setCrm(?????????);
			//ec.setEspec/categoria
			ec.setEstadoCivil(this.tfEstadoCivil.getText());
			//ec.setEmail????
			//ec.setTelefone??
			ec.setRua(this.tfRua.getText());
			ec.setNumero(Integer.parseInt(this.tfNumero.getText()));
			ec.setBairro(this.tfBairro.getText());
			ec.setCidade(this.tfCidade.getText());
			//ec.setUf(this.tfUF.getText()); char
			ec.setCep(this.tfCEP.getText());
			ec.setObservacoes(this.tfObservacoes.getText());
		}
		
		if(e.getActionCommand() == "EDITAR") {
			
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}		
	}
}
