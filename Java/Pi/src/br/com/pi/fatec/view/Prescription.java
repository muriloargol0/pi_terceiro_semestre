package br.com.pi.fatec.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.pi.fatec.controller.DiagnosisController;
import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.controller.PrescriptionController;
import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.PrescriptionDTO;
import br.com.pi.fatec.dto.ReportDTO;
import br.com.pi.fatec.globals.Globals;
import br.com.pi.fatec.report.Relatorio;

public class Prescription extends JFrame implements ActionListener{

	PrescriptionController pc;
	Globals g = new Globals();
	private JPanel contentPane;
	private JTextField tfIdPaciente;
	private JTextField tfNome;
	private JTextField tfObservacoes;
	private JFormattedTextField tfData;
	private JTextField tfPrescricao;
	private JTextField tfObservacao;
	private JButton btnSalvar;
	private JButton btnImprimir;
	private JButton btnFechar;
	private JButton btnBuscar;
	private JTextField tfIdDiagnostico;
	private int idReceita;
	private int idDiagnostico;
	
	private List<ReportDTO> lista = new ArrayList<ReportDTO>();
	
	/**
	 * Create the frame.
	 */
	public Prescription(DiagnosisDTO diagnosisDTO) {
		pc = new PrescriptionController();
		
		if(diagnosisDTO == null) {
			diagnosisDTO = new DiagnosisDTO();
		}else {
			this.idDiagnostico = diagnosisDTO.idDianostico;
		}
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		setTitle("RECEITA");
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
		
		tfIdPaciente = new JTextField((diagnosisDTO.idPaciente == 0 ? "" : diagnosisDTO.idPaciente).toString());
		tfIdPaciente.setBounds(112, 47, 120, 20);
		contentPane.add(tfIdPaciente);
		tfIdPaciente.setColumns(10);
		tfIdPaciente.setEnabled(false);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(243, 50, 40, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField(diagnosisDTO.nome);
		tfNome.setColumns(10);
		tfNome.setBounds(293, 47, 444, 20);
		contentPane.add(tfNome);
		tfNome.setEnabled(false);
		
		JLabel lblidDiagnostico = new JLabel("Diagn\u00F3stico");
		lblidDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidDiagnostico.setBounds(32, 75, 70, 14);
		contentPane.add(lblidDiagnostico);
		
		tfIdDiagnostico = new JTextField(Integer.toString(diagnosisDTO.idDianostico));
		tfIdDiagnostico.setEnabled(false);
		tfIdDiagnostico.setBounds(112, 72, 86, 20);
		contentPane.add(tfIdDiagnostico);
		tfIdDiagnostico.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacoes.setBounds(199, 75, 84, 14);
		contentPane.add(lblObservacoes);		
		
		tfObservacoes = new JTextField(diagnosisDTO.observacoes);
		tfObservacoes.setEnabled(false);
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
		lblData.setBounds(20, 146, 70, 14);
		contentPane.add(lblData);
		
		tfData = new JFormattedTextField(formatter.format(date));
		tfData.setEnabled(false);
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
		btnSalvar.setBounds(185, 392, 132, 35);
		btnSalvar.addActionListener(this);
		contentPane.add(btnSalvar);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setBounds(325, 392, 132, 35);
		btnImprimir.addActionListener(this);
		contentPane.add(btnImprimir);
		
		btnFechar = new JButton("FECHAR");
		btnFechar.setBounds(465, 392, 132, 35);
		btnFechar.addActionListener(this);
		contentPane.add(btnFechar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(45, 392, 132, 35);
		btnBuscar.addActionListener(this);
		contentPane.add(btnBuscar);
		
		if(g.idTipo != 1) {
			JOptionPane.showMessageDialog(this, "Apenas médicos conseguem alterar receitas!");
			this.tfPrescricao.setEditable(false);
			this.tfObservacao.setEnabled(false);
		}
		
		setVisible(true);
		setLocationRelativeTo(null);
		
		if(diagnosisDTO.idDianostico > 0) {
			this.preencheReceita(diagnosisDTO.idDianostico);
		}
				
	}
	
	public void preencheReceita(int idDiagnostico) {
		try {
			PrescriptionDTO pdto = new PrescriptionDTO();
			
			pdto = this. pc.findPrescriptionByDiagnosis(idDiagnostico);
			
			if(pdto.idReceita > 0) {
				this.idReceita = pdto.idReceita;
				
				this.tfData.setText(pdto.dataReceita);
				this.tfIdDiagnostico.setText(Integer.toString(pdto.idDiagnostico));
				this.tfIdPaciente.setText(Integer.toString(pdto.idPaciente));
				this.tfNome.setText(pdto.nome);
				this.tfObservacao.setText(pdto.observacao);
				this.tfObservacoes.setText(pdto.observacoes);
				this.tfPrescricao.setText(pdto.prescricao);
			}

		} catch (Exception e2) {
			this.tfNome.setText("");
			this.tfIdDiagnostico.setText("");
			this.tfNome.requestFocus();
			JOptionPane.showMessageDialog(this, "O id do paciente precisa ser um número inteiro!" + e2.toString());
		}
		
		
	}
	
	/***
	 * Preenche o DTO da tela para poder transferir as informações para o controller e depois para o DAO
	 */
	public void preencherDto() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		//pc.getDto().idDiagnostico = this.idDiagnostico;
		pc.getDto().idReceita = this.idReceita;
		pc.getDto().dataReceita = formatter.format(date);
		pc.getDto().prescricao = this.tfPrescricao.getText();
		pc.getDto().observacao = this.tfObservacao.getText();
		pc.getDto().idDiagnostico = Integer.parseInt(this.tfIdDiagnostico.getText());
	}
	
	ReportDTO r = new ReportDTO();
	
	public void preencherRelatorio() {
		r.nomeMedico = g.nome;
		r.nomePaciente = this.tfNome.getText();
		r.dataReceita = this.tfData.getText();
		r.prescricao = this.tfPrescricao.getText();
		r.observacao = this.tfObservacao.getText();	
		lista.add(r);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "SALVAR") {
			if(this.idReceita == 0) {
				if(tfIdDiagnostico != null) {
					this.preencherDto();
					pc.cadastraReceita();
					
					JOptionPane.showMessageDialog(this, "Receita salva com sucesso!");
				}else {
					JOptionPane.showMessageDialog(this, "Não é possível criar uma receita sem um diagnóstico.");
				}
			}else{
				this.preencherDto();
				pc.editarReceita();
				
				JOptionPane.showMessageDialog(this, "Receita editada com sucesso!");
			}
		}
		
		if(e.getActionCommand() == "BUSCAR") {
			String srec = JOptionPane.showInputDialog("Digite o número da receita:");
			
			pc.findPrescription(srec);
			
			this.tfData.setText(pc.getDto().dataReceita);
			this.tfIdDiagnostico.setText(Integer.toString(pc.getDto().idDiagnostico));
			this.tfObservacao.setText(pc.getDto().observacao);
			this.tfObservacoes.setText(pc.getDto().observacoes);
			this.tfNome.setText(pc.getDto().nome);
			this.tfPrescricao.setText(pc.getDto().prescricao);
			this.tfIdPaciente.setText(Integer.toString(pc.getDto().idPaciente));
		}
		
		if(e.getActionCommand() == "IMPRIMIR") {
			//if(idReceita != null)
				this.preencherRelatorio();
							
				Relatorio Receita = new Relatorio();
				
				try {
					Receita.gerarRelatorio(lista);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, e2.toString());
				}
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}		
	}
}
