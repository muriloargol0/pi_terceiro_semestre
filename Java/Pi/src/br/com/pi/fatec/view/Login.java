package br.com.pi.fatec.view;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import br.com.pi.fatec.controller.LoginController;


public class Login extends JFrame implements ActionListener{
	LoginController login;
	
    private LoginController getLoginController() {
    	if(login == null) {
    		login = new LoginController();
    	}
    	
    	return login;
    }
	
	public void createScreen() {
		Container screen = getContentPane();
		setLayout(null);
		
		//Define os r�tulos dos bot�es
        JLabel lblUser = new JLabel("Usu�rio");
        JLabel lblPassword = new JLabel("Senha");
        //Posiciona os labels na tela
        lblUser.setBounds(100, 15, 100, 20);
        lblPassword.setBounds(100, 50, 100, 20);
        
        JTextField txtUser = new JTextField();
        JPasswordField txtPassword = new JPasswordField();
        txtUser.setBounds(160, 15, 150, 20);
        txtPassword.setBounds(160, 50, 150, 20);
        
        JButton btnEnter = new JButton("Entrar");
        btnEnter.setVisible(true);
        btnEnter.setBounds(100, 80, 210, 40);
        btnEnter.addActionListener(this);
        
        JButton btnClose = new JButton("Sair");
        btnClose.setVisible(true);
        btnClose.setBounds(100, 130, 210, 40);
        btnClose.addActionListener(this);
        
        //Adiciona os r�tulos e os campos de textos com m�scaras na tela
        screen.add(lblUser);
        screen.add(lblPassword);
        screen.add(txtUser);
        screen.add(txtPassword);
        screen.add(btnEnter);
        screen.add(btnClose);
        
        this.setSize(430, 220);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
	}
	
	public void btnEnterClick() {
		getLoginController().doLogin();
	}
	
	public void btnCloseClick() {
		JOptionPane.showMessageDialog(null, "Fechou");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Entrar") {
			this.btnEnterClick();
		}
		
		if(e.getActionCommand() == "Sair") {
			this.btnCloseClick();
		}
	}
}