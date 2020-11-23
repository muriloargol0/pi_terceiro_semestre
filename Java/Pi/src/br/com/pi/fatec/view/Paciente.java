package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.pi.fatec.controller.PatientController;

public class Paciente extends JFrame implements ActionListener {

	private PatientController pc;
	
	private JPanel contentPane;
	private	JTextField tfNome;
	private JTextField tfRG;
	private JTextField tfCPF;
	private JTextField tfDataNascimento;
	private JTextField tfIdade;
	private JTextField tfEstadoCivil;
	private JTextField tfEmail;
	private JTextField tfNumero;
	private JTextField tfCidade;
	private JTextField tfCEP;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfTelefone;
	private JTextField tfUF;
	private JTextField tfObservacoes;
	private JTextField tfSexo;
	private JTextField tfResponsavel;
	private JTextField tfTipoSanguineo;
	private JComboBox cbStatus;
		
	/**
	 * Create the frame.
	 */
	public Paciente() {
		setTitle("PACIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuscarPaciente = new JButton("BUSCAR PACIENTE");
		btnBuscarPaciente.setBounds(28, 22, 132, 35);
		contentPane.add(btnBuscarPaciente);
		btnBuscarPaciente.addActionListener(this);
		
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
		cbStatus.setToolTipText("");
		cbStatus.setMaximumRowCount(2);
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Inativo", "Ativo"}));
		cbStatus.setBounds(674, 75, 80, 20);
		contentPane.add(cbStatus);
		cbStatus.setSelectedIndex(1);
		
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
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(30, 137, 46, 14);
		contentPane.add(lblSexo);
		
		tfSexo = new JTextField();
		tfSexo.setBounds(99, 135, 125, 20);
		contentPane.add(tfSexo);
		tfSexo.setColumns(10);
		
		JLabel lblTipoSanguineo = new JLabel("Tipo Sangu\u00EDneo");
		lblTipoSanguineo.setBounds(234, 137, 95, 14);
		contentPane.add(lblTipoSanguineo);
		
		tfTipoSanguineo = new JTextField();
		tfTipoSanguineo.setBounds(330, 134, 40, 20);
		contentPane.add(tfTipoSanguineo);
		tfTipoSanguineo.setColumns(10);
		
		JLabel lblResponsavel = new JLabel("Respons\u00E1vel");
		lblResponsavel.setBounds(384, 137, 80, 14);
		contentPane.add(lblResponsavel);
		
		tfResponsavel = new JTextField();
		tfResponsavel.setBounds(474, 135, 280, 20);
		contentPane.add(tfResponsavel);
		tfResponsavel.setColumns(10);
		
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
		lblTelefone.setBounds(576, 168, 57, 14);
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
		lblBairro.setBounds(30, 228, 57, 14);
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
		lblObservacoes.setBounds(20, 258, 80, 14);
		contentPane.add(lblObservacoes);
		
		tfObservacoes = new JTextField();
		tfObservacoes.setBounds(99, 255, 655, 100);
		contentPane.add(tfObservacoes);
		tfObservacoes.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(242, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.setBounds(99, 392, 132, 35);
		btnNovo.addActionListener(this);
		contentPane.add(btnNovo);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(384, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		setVisible(true);
		setLocationRelativeTo(null);
				
	}
	
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
		this.tfRua.setText("");
		this.tfSexo.setText("");
		this.tfTelefone.setText("");
		this.tfTipoSanguineo.setText("");
		this.tfUF.setText("");
		this.tfNome.requestFocus();
	}
	
	private PatientController getController() {
		if(pc == null) {
			pc = new PatientController();
		}
		
		return pc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "SALVAR") {
			this.getController().setNome(this.tfNome.getText());
			this.getController().setStatus(this.cbStatus.getSelectedIndex());
			this.getController().setRg(this.tfRG.getText());
			this.getController().setCpf(this.tfCPF.getText());
			this.getController().setDataNascimento(this.tfDataNascimento.getText());
			this.getController().setIdade(this.tfIdade.getText());
			this.getController().setSexo(this.tfSexo.getText());
			this.getController().setTipoSanguineo(this.tfTipoSanguineo.getText());
			this.getController().setResponsavel(this.tfResponsavel.getText());
			this.getController().setEstadoCivil(this.tfEstadoCivil.getText());
			this.getController().setEmail(this.tfEmail.getText());
			this.getController().setTelefone(this.tfTelefone.getText());
			this.getController().setRua(this.tfRua.getText());
			this.getController().setNumero(Integer.parseInt(this.tfNumero.getText()));
			this.getController().setBairro(this.tfBairro.getText());
			this.getController().setCidade(this.tfCidade.getText());
			this.getController().setUf(this.tfUF.getText());
			this.getController().setCep(this.tfCEP.getText());
			this.getController().setObservacoes(this.tfObservacoes.getText());

			this.getController().cadastraPaciente();
		}
		
		if(e.getActionCommand() == "NOVO") {
			limparCampos();
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}
		
		if(e.getActionCommand() == "BUSCAR PACIENTE") {
			try {
				String msg = JOptionPane.showInputDialog("Digite o CPF do paciente: ");
				this.getController().findPatient(msg);
				
				this.tfNome.setText(this.getController().getNome());
				//this.cbStatus.setSelectedItem(this.getController().getStatus());
				this.tfRG.setText(this.getController().getRg());
				this.tfCPF.setText(this.getController().getCpf());
				this.tfDataNascimento.setText(this.getController().getDataNascimento());
				this.tfSexo.setText(this.getController().getSexo());
				this.tfTipoSanguineo.setText(this.getController().getTipoSanguineo());
				this.tfResponsavel.setText(this.getController().getResponsavel());
				this.tfEstadoCivil.setText(this.getController().getEstadoCivil());
				this.tfEmail.setText(this.getController().getEmail());
				this.tfTelefone.setText(this.getController().getTelefone());
				this.tfRua.setText(this.getController().getRua());
				this.tfNumero.setText(String.valueOf(this.getController().getNumero()));
				this.tfBairro.setText(this.getController().getBairro());
				this.tfCidade.setText(this.getController().getCidade());
				this.tfUF.setText(this.getController().getUf());
				this.tfCEP.setText(this.getController().getCep());
				this.tfObservacoes.setText(this.getController().getObservacoes());
			} 
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		} 
	}
}

