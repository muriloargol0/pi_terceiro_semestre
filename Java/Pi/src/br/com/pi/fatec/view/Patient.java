package br.com.pi.fatec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.globals.Globals;

import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

public class Patient extends JFrame implements ActionListener {

	Globals g = new Globals();
	PatientController pc;
	private int idPaciente = 0;
	private JPanel contentPane;
	private	JTextField tfNome;
	private JTextField tfRG;
	private JFormattedTextField tfCPF;
	private JFormattedTextField tfDataNascimento;
	private JTextField tfEstadoCivil;
	private JTextField tfEmail;
	private JTextField tfNumero;
	private JTextField tfCidade;
	private JFormattedTextField tfCEP;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JFormattedTextField tfTelefone;
	private JTextField tfUF;
	private JTextField tfObservacoes;
	private JTextField tfSexo;
	private JTextField tfResponsavel;
	private JTextField tfTipoSanguineo;
	private JComboBox cbStatus;
	JButton btnDeletar;
	JButton btnBuscar;
	JButton btnSalvar;
	JButton btnEditar;
		
	/**
	 * Cria a tela de Paciente
	 */
	public Patient() {
		this.pc = new PatientController();
		
		setTitle("PACIENTE");
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
		cbStatus.setToolTipText("");
		cbStatus.setMaximumRowCount(2);
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Inativo", "Ativo"}));
		cbStatus.setBounds(674, 75, 80, 20);
		contentPane.add(cbStatus);
		cbStatus.setSelectedIndex(1);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRG.setBounds(20, 108, 70, 14);
		contentPane.add(lblRG);
		
		tfRG = new JTextField();
		tfRG.setBounds(99, 105, 150, 20);
		contentPane.add(tfRG);
		tfRG.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setBounds(277, 108, 27, 14);
		contentPane.add(lblCPF);
		
		tfCPF = new JFormattedTextField();
		tfCPF.setToolTipText("");
		tfCPF.setText("");
		tfCPF.setColumns(11);
		tfCPF.setBounds(314, 106, 150, 20);
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
//		tfCPF.setBounds(314, 106, 150, 20);
//		contentPane.add(tfCPF);
//		tfCPF.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNascimento.setBounds(490, 108, 104, 14);
		contentPane.add(lblDataNascimento);
		
		tfDataNascimento = new JFormattedTextField();
		tfDataNascimento.setToolTipText("");
		tfDataNascimento.setText("");
		tfDataNascimento.setColumns(8);
		tfDataNascimento.setBounds(604, 106, 150, 20);
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
//		tfDataNascimento.setBounds(604, 106, 150, 20);
//		contentPane.add(tfDataNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setBounds(20, 137, 70, 14);
		contentPane.add(lblSexo);
		
		tfSexo = new JTextField();
		tfSexo.setBounds(99, 135, 125, 20);
		contentPane.add(tfSexo);
		tfSexo.setColumns(10);
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo");
		lblTipoSanguineo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoSanguineo.setBounds(225, 137, 95, 14);
		contentPane.add(lblTipoSanguineo);
		
		tfTipoSanguineo = new JTextField();
		tfTipoSanguineo.setBounds(330, 134, 40, 20);
		contentPane.add(tfTipoSanguineo);
		tfTipoSanguineo.setColumns(10);
		
		JLabel lblResponsavel = new JLabel("Respons\u00E1vel");
		lblResponsavel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResponsavel.setBounds(384, 137, 80, 14);
		contentPane.add(lblResponsavel);
		
		tfResponsavel = new JTextField();
		tfResponsavel.setBounds(474, 135, 280, 20);
		contentPane.add(tfResponsavel);
		tfResponsavel.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstadoCivil.setBounds(20, 168, 70, 14);
		contentPane.add(lblEstadoCivil);
		
		tfEstadoCivil = new JTextField();
		tfEstadoCivil.setBounds(99, 165, 125, 20);
		contentPane.add(tfEstadoCivil);
		tfEstadoCivil.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(225, 168, 37, 14);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(272, 165, 294, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(567, 168, 57, 14);
		contentPane.add(lblTelefone);
		
		tfTelefone = new JFormattedTextField();
		tfTelefone.setToolTipText("");
		tfTelefone.setText("");
		tfTelefone.setColumns(11);
		tfTelefone.setBounds(634, 165, 120, 20);
		contentPane.add(tfTelefone);
		MaskFormatter formaterTelefone = new MaskFormatter();
		
		try {
			formaterTelefone.setMask("(##) #####-####");
			formaterTelefone.install(tfTelefone);
		}catch (ParseException pe) {
			pe.printStackTrace();
		}catch ( Exception ex ) {
			// process remaining Exceptions here
			ex.printStackTrace();
		}
		
//		tfTelefone = new JTextField();
//		tfTelefone.setBounds(634, 165, 120, 20);
//		contentPane.add(tfTelefone);
//		tfTelefone.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(20, 198, 70, 14);
		contentPane.add(lblEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(99, 195, 509, 20);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(618, 198, 46, 14);
		contentPane.add(lblNumero);
		
		tfNumero = new JTextField();
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
		lblUF.setBounds(452, 228, 33, 14);
		contentPane.add(lblUF);
		
		tfUF = new JTextField();
		tfUF.setBounds(495, 225, 57, 20);
		contentPane.add(tfUF);
		tfUF.setColumns(2);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCEP.setBounds(554, 228, 40, 14);
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
		tfObservacoes.setBounds(99, 255, 655, 100);
		contentPane.add(tfObservacoes);
		tfObservacoes.setColumns(10);
		
		btnDeletar = new JButton("DELETAR");
		btnDeletar.setBounds(465, 392, 132, 35);
		btnDeletar.addActionListener(this);
		contentPane.add(btnDeletar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(45, 22, 132, 35);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(185, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(325, 392, 132, 35);
		btnEditar.addActionListener(this);
		contentPane.add(btnEditar);
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.setBounds(45, 392, 132, 35);
		btnNovo.addActionListener(this);
		contentPane.add(btnNovo);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(605, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
				
	}
		
	/***
	 * Limpa os campos da tela
	 */
	private void limparCampos() {
		this.tfNome.setText("");
		this.tfBairro.setText("");
		this.tfCEP.setText("");
		this.tfCidade.setText("");
		this.tfCPF.setText("");
		this.tfDataNascimento.setText("");
		this.tfEmail.setText("");
		this.tfEstadoCivil.setText("");
		this.tfNumero.setText("");
		this.tfObservacoes.setText("");
		this.tfResponsavel.setText("");
		this.tfRG.setText("");
		this.tfEndereco.setText("");
		this.tfSexo.setText("");
		this.tfTelefone.setText("");
		this.tfTipoSanguineo.setText("");
		this.tfUF.setText("");
		this.tfNome.requestFocus();
	}
	
	/***
	 * Preenche o DTO da tela para poder transferir as informações para o controller e depois para o DAO
	 */
	public void preencheDto() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		pc.getDto().bairro = this.tfBairro.getText(); // == null ? "" : this.tfBairro.getText();
		pc.getDto().cep = this.tfCEP.getText();
		pc.getDto().cidade = this.tfCidade.getText();
		pc.getDto().cpf = this.tfCPF.getText();
		pc.getDto().dataCadastro = formatter.format(date);
		pc.getDto().dataNascimento = this.tfDataNascimento.getText();
		pc.getDto().email = this.tfEmail.getText();
		pc.getDto().estadoCivil = this.tfEstadoCivil.getText();
		pc.getDto().nome = this.tfNome.getText();
		pc.getDto().numero = Integer.parseInt(this.tfNumero.getText());
		pc.getDto().observacoes = this.tfObservacoes.getText();
		pc.getDto().responsavel = this.tfResponsavel.getText();
		pc.getDto().rg = this.tfRG.getText();
		pc.getDto().endereco = this.tfEndereco.getText();
		pc.getDto().sexo = this.tfSexo.getText();
		pc.getDto().status = this.cbStatus.getSelectedIndex();
		pc.getDto().telefone = this.tfTelefone.getText();
		pc.getDto().tipoSanguineo = this.tfTipoSanguineo.getText();
		pc.getDto().uf = this.tfUF.getText();
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "NOVO") {
			this.btnSalvar.setEnabled(true);
			this.btnEditar.setEnabled(false);
			this.btnDeletar.setEnabled(false);
			limparCampos();
		}
		
		if(e.getActionCommand() == "SALVAR") {
			if(g.idTipo == 4 || g.idTipo == 2) {				
				this.preencheDto();
				this.idPaciente = pc.cadastraPaciente();
				
				this.btnSalvar.setEnabled(false);
				this.btnSalvar.setEnabled(true);
				this.btnDeletar.setEnabled(true);
				
				JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
			}else {
				JOptionPane.showMessageDialog(this, "Você não tem permissão para fazer essa alteração!");
			}
		}
		
		if(e.getActionCommand() == "EDITAR") {
			if(g.idTipo == 4 || g.idTipo == 2) {
				if(this.idPaciente != 0) {
					this.preencheDto();
					pc.getDto().idPaciente = this.idPaciente;
					pc.editarPaciente();
					
					JOptionPane.showMessageDialog(this, "Registro editado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(this, "Antes de editar, busque um paciente!");
				}
			}else {
				JOptionPane.showMessageDialog(this, "Você não tem permissão para fazer essa alteração!");
			}
		}
		
		if(e.getActionCommand() == "BUSCAR") {
			String scpf = JOptionPane.showInputDialog("Digite o CPF do paciente:");
			
			pc.findPatient(scpf);
			
			this.idPaciente = pc.getDto().idPaciente;
			
			this.tfNome.setText(pc.getDto().nome);
			this.cbStatus.setSelectedIndex(pc.getDto().status);
			this.tfRG.setText(pc.getDto().rg);
			this.tfCPF.setText(pc.getDto().cpf);
			this.tfDataNascimento.setText(pc.getDto().dataNascimento);
			this.tfSexo.setText(pc.getDto().sexo);
			this.tfTipoSanguineo.setText(pc.getDto().tipoSanguineo);
			this.tfResponsavel.setText(pc.getDto().responsavel);
			this.tfEstadoCivil.setText(pc.getDto().estadoCivil);
			this.tfEmail.setText(pc.getDto().email);
			this.tfTelefone.setText(pc.getDto().telefone);
			this.tfEndereco.setText(pc.getDto().endereco);
			this.tfNumero.setText(Integer.toString(pc.getDto().numero));
			this.tfBairro.setText(pc.getDto().bairro);
			this.tfCidade.setText(pc.getDto().cidade);
			this.tfUF.setText(pc.getDto().uf);
			this.tfCEP.setText(pc.getDto().cep);
			this.tfObservacoes.setText(pc.getDto().observacoes);
			
			this.btnEditar.setEnabled(true);
			this.btnSalvar.setEnabled(false);
			this.btnDeletar.setEnabled(true);
		} 
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}
	}
}

