package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.pi.fatec.controller.EmployeeController;
import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.dto.EmployeeDTO;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Usuario extends JFrame implements ActionListener{

	private int idFuncionario = 0;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCRMCOREN;
	private JTextField tfEspecCateg;
	private JTextField tfRG;
	private JTextField tfCOREN;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfObservacoes;
	private JFormattedTextField tfCPF;
	private JFormattedTextField tfDataNascimento;
	private JTextField tfEstadoCivil;
	private JTextField tfNumero;
	private JTextField tfCidade;
	private JFormattedTextField tfCEP;
	private JTextField tfUF;
	private JTextField tfCategoria;
	private JFormattedTextField tfTelefone;
	private JTextField tfUsuario;
	private JTextField tfSenha;
	private JComboBox cbStatus;
	private JComboBox cbTipo;
	
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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(20, 78, 70, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(99, 75, 509, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(618, 78, 46, 14);
		contentPane.add(lblStatus);
		
		cbStatus = new JComboBox();
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Inativo", "Ativo"}));
		cbStatus.setBounds(674, 75, 80, 20);
		contentPane.add(cbStatus);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRG.setBounds(20, 108, 70, 14);
		contentPane.add(lblRG);
		
		tfRG = new JTextField();
		tfRG.setBounds(99, 105, 105, 20);
		contentPane.add(tfRG);
		tfRG.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setBounds(205, 108, 27, 14);
		contentPane.add(lblCPF);
		
		tfCPF = new JFormattedTextField();
		tfCPF.setToolTipText("");
		tfCPF.setText("");
		tfCPF.setColumns(11);
		tfCPF.setBounds(242, 105, 105, 20);
		contentPane.add(tfCPF);
		MaskFormatter formaterCPF = new MaskFormatter();
		try {
			formaterCPF.setMask("###.###.###-##");
			formaterCPF.install(tfCPF);
			}
			catch (ParseException pe) {
			pe.printStackTrace();
			}
			catch ( Exception ex ) {
			// process remaining Exceptions here
			ex.printStackTrace();
			}
		
//		tfCPF = new JTextField();
//		tfCPF.setBounds(242, 105, 105, 20);
//		contentPane.add(tfCPF);
//		tfCPF.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNascimento.setBounds(351, 108, 105, 14);
		contentPane.add(lblDataNascimento);
		
		tfDataNascimento = new JFormattedTextField();
		tfDataNascimento.setToolTipText("");
		tfDataNascimento.setText("");
		tfDataNascimento.setColumns(8);
		tfDataNascimento.setBounds(466, 105, 100, 20);
		contentPane.add(tfDataNascimento);
		MaskFormatter formaterDataNascimento = new MaskFormatter();
		try {
			formaterDataNascimento.setMask("##/##/####");
			formaterDataNascimento.install(tfDataNascimento);
			}
			catch (ParseException pe) {
			pe.printStackTrace();
			}
			catch ( Exception ex ) {
			// process remaining Exceptions here
			ex.printStackTrace();
			}
		
//		tfDataNascimento = new JTextField();
//		tfDataNascimento.setColumns(10);
//		tfDataNascimento.setBounds(466, 105, 100, 20);
//		contentPane.add(tfDataNascimento);
		
		JLabel lblCRM = new JLabel("CRM");
		lblCRM.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCRM.setBounds(20, 138, 70, 14);
		contentPane.add(lblCRM);
		
		tfCRMCOREN = new JTextField();
		tfCRMCOREN.setBounds(99, 135, 105, 20);
		contentPane.add(tfCRMCOREN);
		tfCRMCOREN.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(561, 108, 33, 14);
		contentPane.add(lblTipo);
		
		cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"M\u00E9dica(o)", "Enfermeira(o)", "Administrador", "Recepcionista(o)"}));
		cbTipo.setBounds(604, 105, 150, 20);
		contentPane.add(cbTipo);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEspecialidade.setBounds(209, 138, 81, 14);
		contentPane.add(lblEspecialidade);
		
		tfEspecCateg = new JTextField();
		tfEspecCateg.setBounds(300, 135, 266, 20);
		contentPane.add(tfEspecCateg);
		tfEspecCateg.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstadoCivil.setBounds(347, 168, 70, 14);
		contentPane.add(lblEstadoCivil);
		
		tfEstadoCivil = new JTextField();
		tfEstadoCivil.setBounds(427, 165, 125, 20);
		contentPane.add(tfEstadoCivil);
		tfEstadoCivil.setColumns(10);
				
		JLabel lblCOREN = new JLabel("COREN");
		lblCOREN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCOREN.setBounds(571, 138, 48, 14);
		contentPane.add(lblCOREN);
		
		tfCOREN = new JTextField();
		tfCOREN.setBounds(629, 135, 125, 20);
		contentPane.add(tfCOREN);
		tfCOREN.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRua.setBounds(20, 198, 70, 14);
		contentPane.add(lblRua);
		
		tfRua = new JTextField();
		tfRua.setBounds(99, 195, 509, 20);
		contentPane.add(tfRua);
		tfRua.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(618, 198, 46, 14);
		contentPane.add(lblNumero);
		
		tfNumero = new JTextField("1");
		tfNumero.setBounds(674, 195, 80, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(20, 228, 70, 14);
		contentPane.add(lblBairro);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(99, 225, 140, 20);
		contentPane.add(tfBairro);
		tfBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setBounds(249, 228, 46, 14);
		contentPane.add(lblCidade);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(305, 225, 140, 20);
		contentPane.add(tfCidade);
		tfCidade.setColumns(10);
		
		JLabel lblUF = new JLabel("UF");
		lblUF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUF.setBounds(455, 228, 33, 14);
		contentPane.add(lblUF);
		
		tfUF = new JTextField();
		tfUF.setBounds(495, 225, 57, 20);
		contentPane.add(tfUF);
		tfUF.setColumns(10);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCEP.setBounds(562, 228, 32, 14);
		contentPane.add(lblCEP);
		
		tfCEP = new JFormattedTextField();
		tfCEP.setToolTipText("");
		tfCEP.setText("");
		tfCEP.setColumns(8);
		tfCEP.setBounds(604, 225, 150, 20);
		contentPane.add(tfCEP);
		MaskFormatter formaterCEP = new MaskFormatter();
		try {
			formaterCEP.setMask("##.###-###");
			formaterCEP.install(tfCEP);
			}
			catch (ParseException pe) {
			pe.printStackTrace();
			}
			catch ( Exception ex ) {
			// process remaining Exceptions here
			ex.printStackTrace();
			}
		
//		tfCEP = new JTextField();
//		tfCEP.setBounds(604, 225, 150, 20);
//		contentPane.add(tfCEP);
//		tfCEP.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacoes.setBounds(0, 258, 90, 14);
		contentPane.add(lblObservacoes);
		
		tfObservacoes = new JTextField();
		tfObservacoes.setHorizontalAlignment(SwingConstants.LEFT);
        tfObservacoes.setBounds(99, 255, 655, 70);
        contentPane.add(tfObservacoes);
        tfObservacoes.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setBounds(20, 168, 70, 14);
		contentPane.add(lblCategoria);
		
		tfCategoria = new JTextField();
		tfCategoria.setBounds(99, 165, 249, 20);
		contentPane.add(tfCategoria);
		tfCategoria.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(542, 168, 66, 14);
		contentPane.add(lblTelefone);
		
		tfTelefone = new JFormattedTextField();
		tfTelefone.setToolTipText("");
		tfTelefone.setText("");
		tfTelefone.setColumns(11);
		tfTelefone.setBounds(618, 165, 136, 20);
		contentPane.add(tfTelefone);
		MaskFormatter formaterTelefone = new MaskFormatter();
		try {
			formaterTelefone.setMask("(##) #####-####");
			formaterTelefone.install(tfTelefone);
			}
			catch (ParseException pe) {
			pe.printStackTrace();
			}
			catch ( Exception ex ) {
			// process remaining Exceptions here
			ex.printStackTrace();
			}
		
//		tfTelefone = new JTextField();
//		tfTelefone.setBounds(618, 165, 136, 20);
//		contentPane.add(tfTelefone);
//		tfTelefone.setColumns(10);

        JLabel lblUsuario = new JLabel("Usu\u00E1rio");
        lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUsuario.setBounds(20, 339, 70, 14);
        contentPane.add(lblUsuario);

        tfUsuario = new JTextField();
        tfUsuario.setBounds(99, 336, 140, 20);
        contentPane.add(tfUsuario);
        tfUsuario.setColumns(10);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
        lblSenha.setBounds(249, 339, 46, 14);
        contentPane.add(lblSenha);

        tfSenha = new JTextField();
        tfSenha.setBounds(304, 336, 125, 20);
        contentPane.add(tfSenha);
        tfSenha.setColumns(10);
        
        JButton btnBuscarUsuario = new JButton("BUSCAR");
		btnBuscarUsuario.setBounds(45, 22, 132, 35);
		contentPane.add(btnBuscarUsuario);
		btnBuscarUsuario.addActionListener(this);
        
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(185, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.setBounds(45, 392, 132, 35);
		btnNovo.addActionListener(this);
		contentPane.add(btnNovo);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(325, 392, 132, 35);
		btnEditar.addActionListener(this);
		contentPane.add(btnEditar);
		
		JButton btnDeletar = new JButton("DELETAR");
		btnDeletar.setBounds(465, 392, 132, 35);
		btnDeletar.addActionListener(this);
		contentPane.add(btnDeletar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(605, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		EmployeeController ec = new EmployeeController();
		
		ec.getDto().bairro = this.tfBairro.getText();
		ec.getDto().categoria = this.tfCategoria.getText();
		ec.getDto().cep = this.tfCEP.getText();
		ec.getDto().cidade = this.tfCidade.getText();
		ec.getDto().coren = this.tfCOREN.getText();
		ec.getDto().cpf = this.tfCPF.getText();
		ec.getDto().crm = this.tfCRMCOREN.getText();
		ec.getDto().dataCadastro = (new Date()).toString();
		ec.getDto().dataNascimento = this.tfDataNascimento.getText();
		ec.getDto().especialidade = this.tfEspecCateg.getText();
		ec.getDto().estadoCivil = this.tfEstadoCivil.getText();
		ec.getDto().idTipo = this.cbTipo.getSelectedIndex();
		ec.getDto().nome = this.tfNome.getText();
		ec.getDto().numero = Integer.parseInt(this.tfNumero.getText());
		ec.getDto().observacoes = this.tfObservacoes.getText();
		ec.getDto().rg = this.tfRG.getText();
		ec.getDto().rua = this.tfRua.getText();
		ec.getDto().senha = this.tfSenha.getText();
		ec.getDto().status = this.cbStatus.getSelectedIndex();
		ec.getDto().telefone = this.tfTelefone.getText();
		ec.getDto().uf = this.tfUF.getText();
		ec.getDto().usuario = this.tfUsuario.getText();
		
		if(e.getActionCommand() == "NOVO") {
			
		}
		
		if(e.getActionCommand() == "SALVAR") {
			ec.cadastraFuncionario();
		}
		
		if(e.getActionCommand() == "EDITAR") {
			ec.getDto().idFuncionario = this.idFuncionario;
			ec.editarFuncionario();
		}
		
		if(e.getActionCommand() == "DELETAR") {
			ec.deletarFuncionario(ec.getDto().idFuncionario);
		}
		
		if(e.getActionCommand() == "BUSCAR") {
			String scpf = JOptionPane.showInputDialog("Digite o CPF para buscar:");
			ec.findEmployee(scpf);
			
			this.idFuncionario = ec.getDto().idFuncionario;
			this.tfBairro.setText(ec.getDto().bairro);
			this.tfCategoria.setText(ec.getDto().categoria);
			this.tfCEP.setText(ec.getDto().cep);
			this.tfCidade.setText(ec.getDto().cidade);
			this.tfCOREN.setText(ec.getDto().coren);
			this.tfCPF.setText(ec.getDto().cpf);
			this.tfCRMCOREN.setText(ec.getDto().crm);
			this.tfDataNascimento.setText(ec.getDto().dataNascimento);
			this.tfEspecCateg.setText(ec.getDto().especialidade);
			this.tfEstadoCivil.setText(ec.getDto().estadoCivil);
			this.tfNome.setText(ec.getDto().nome);
			this.tfNumero.setText(Integer.toString(ec.getDto().numero));
			this.tfObservacoes.setText(ec.getDto().observacoes);
			this.tfRG.setText(ec.getDto().rg);
			this.tfRua.setText(ec.getDto().rua);
			this.tfSenha.setText(ec.getDto().senha);
			this.tfTelefone.setText(ec.getDto().telefone);
			this.tfUF.setText(ec.getDto().uf);
			this.tfUsuario.setText(ec.getDto().usuario);
			this.cbStatus.setSelectedIndex(ec.getDto().status);
			this.cbTipo.setSelectedIndex(ec.getDto().idTipo - 1);
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}		
	}
}
