package br.com.pi.fatec.controller;

import java.sql.SQLException;

import br.com.pi.fatec.model.DataObject;
import br.com.pi.fatec.model.LoginDAO;
import br.com.pi.fatec.model.DTO.LoginDTO;

public class LoginController {
	
	public boolean doLogin() {
		LoginDAO l = new LoginDAO();
		try {
			System.out.println(l.read().user);
			System.out.println(l.read().password);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
