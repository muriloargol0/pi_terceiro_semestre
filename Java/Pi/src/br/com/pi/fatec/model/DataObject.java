package br.com.pi.fatec.model;

import java.sql.Connection;


public abstract class DataObject extends SqlCnn {
	
	public boolean delete(int id) {
		return false;
	}	
}
