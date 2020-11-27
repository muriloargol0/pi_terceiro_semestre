package br.com.pi.fatec.controller;

import java.sql.SQLException;

import br.com.pi.fatec.model.DataObject;
import br.com.pi.fatec.model.LoginDAO;

public class LoginController {
	
	/***
	 * Faz o intermédio entre a tela e a classe DAO para realização do login
	 * @param user nome de usuário
	 * @param pw senha
	 * @return O retorno é um valor booleano (verdadeiro ou falso)
	 */
	public boolean doLogin(String user, char[] pw) {
		LoginDAO l = new LoginDAO();
		
		try {
			return l.doLogin(user, pw);
			
		} catch (Exception e) {
			return false;
		}
	}
}
