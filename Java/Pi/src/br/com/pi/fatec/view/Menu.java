package br.com.pi.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDiagnostico = new JButton("DIAGNÓSTICO");
		btnDiagnostico.setBounds(76, 82, 210, 70);
		contentPane.add(btnDiagnostico);
		
		JButton btnPaciente = new JButton("PACIENTE");
		btnPaciente.setBounds(335, 82, 210, 70);
		contentPane.add(btnPaciente);
		
		JButton btnReceita = new JButton("RECEITA");
		btnReceita.setBounds(76, 201, 210, 70);
		contentPane.add(btnReceita);
		
		JButton btnUsuario = new JButton("USUÁRIO");
		btnUsuario.setBounds(335, 201, 210, 70);
		contentPane.add(btnUsuario);
	}
}
