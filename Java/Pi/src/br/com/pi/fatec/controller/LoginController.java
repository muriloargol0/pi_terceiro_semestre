package br.com.pi.fatec.controller;

import java.sql.SQLException;

import br.com.pi.fatec.model.DataObject;
import br.com.pi.fatec.model.LoginDAO;
import br.com.pi.fatec.model.DTO.LoginDTO;

public class LoginController {
	
	public boolean doLogin(String user, char[] pw) {
		LoginDAO l = new LoginDAO();
		
		try {
			return l.doLogin(user, pw);
			
		} catch (Exception e) {
			return false;
		}
	}
}
