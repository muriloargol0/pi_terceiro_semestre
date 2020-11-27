package br.com.pi.fatec.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.pi.fatec.controller.DiagnosisController;
import br.com.pi.fatec.controller.PatientController;
import br.com.pi.fatec.controller.PrescriptionController;
import br.com.pi.fatec.dto.DiagnosisDTO;
import br.com.pi.fatec.dto.ReportDTO;
import br.com.pi.fatec.globals.Globals;
import br.com.pi.fatec.report.Relatorio;

public class Prescription extends JFrame implements ActionListener{

	PrescriptionController pc;
	Globals g = new Globals();
	private JPanel contentPane;
	private JTextField tfProntuario;
	private JTextField tfPaciente;
	private JTextField tfObservacoes;
	private JTextField tfData;
	private JTextField tfPrescricao;
	private JTextField tfObservacao;
	private JButton btnSalvar;
	private JButton btnImprimir;
	private JButton btnFechar;
	private JTextField tfidDiagnostico;
	
	private List<ReportDTO> lista = new ArrayList<ReportDTO>();
	
	/**
	 * Create the frame.
	 */
	public Prescription(DiagnosisDTO diagnosisDTO) {
		if(diagnosisDTO == null) {
			diagnosisDTO = new DiagnosisDTO();
		}
		pc = new PrescriptionController();
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
		
		tfProntuario = new JTextField((diagnosisDTO.idPaciente == 0 ? "" : diagnosisDTO.idPaciente).toString());//traz os valores da tela diagnostico
		tfProntuario.setBounds(112, 47, 120, 20);
		contentPane.add(tfProntuario);
		tfProntuario.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(243, 50, 40, 14);
		contentPane.add(lblNome);
		
		tfPaciente = new JTextField(diagnosisDTO.nome);
		tfPaciente.setColumns(10);
		tfPaciente.setBounds(293, 47, 444, 20);
		contentPane.add(tfPaciente);
		
		JLabel lblidDiagnostico = new JLabel("Diagn\u00F3stico");
		lblidDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidDiagnostico.setBounds(32, 75, 70, 14);
		contentPane.add(lblidDiagnostico);
		
		tfidDiagnostico = new JTextField(diagnosisDTO.idDianostico);
		tfidDiagnostico.setBounds(112, 72, 86, 20);
		contentPane.add(tfidDiagnostico);
		tfidDiagnostico.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacoes.setBounds(199, 75, 84, 14);
		contentPane.add(lblObservacoes);		
		
		tfObservacoes = new JTextField(diagnosisDTO.observacoes);
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
	
	public void preencheReceita() {
		
	}
	
	public void preencherDto() {
		pc.getDto().dataReceita = this.tfData.getText();
		pc.getDto().prescricao = this.tfPrescricao.getText();
		pc.getDto().observacao = this.tfObservacao.getText();
		pc.getDto().idDiagnostico = Integer.parseInt(this.tfidDiagnostico.getText());
	}
	
	ReportDTO r = new ReportDTO();
	
	public void preencherRelatorio() {
		r.nomeMedico = g.nome;
		r.nomePaciente = this.tfPaciente.getText();
		r.dataReceita = this.tfData.getText();
		r.prescricao = this.tfPrescricao.getText();
		r.observacao = this.tfObservacao.getText();	
		lista.add(r);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "SALVAR") {
			if(tfidDiagnostico != null) {
				this.preencherDto();
				pc.cadastraReceita();
			}else {
				JOptionPane.showMessageDialog(this, "Não é possível criar uma receita sem um diagnóstico.");
			}			
		}
		
		if(e.getActionCommand() == "IMPRIMIR") {
			//if(idReceita != null)
				this.preencherRelatorio();
							
				Relatorio Receita = new Relatorio();
				
				try {
					Receita.gerarRelatorio(lista);
				} catch (Exception e2) {
					
				}
			
		}
		
		if(e.getActionCommand() == "FECHAR") {
			this.dispose();
		}		
	}
}
