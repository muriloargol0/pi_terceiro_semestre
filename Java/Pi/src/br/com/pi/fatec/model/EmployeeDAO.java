package br.com.pi.fatec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.pi.fatec.dto.EmployeeDTO;
import br.com.pi.fatec.view.Usuario;

public class EmployeeDAO extends DataObject {
	
	public EmployeeDTO dto;
	public Usuario view;
	
	public int create() throws SQLException {
		Connection cnn = super.getConnection();

		try {
			PreparedStatement stmt = cnn.prepareStatement("INSERT INTO FUNCIONARIO (" + 
					",SENHA" +
			           ",STTS" +
			           ",NOME" +
			           ",DATA_NASCIMENTO" +
			           ",RG" +
			           ",CPF" +
			           ",ESTADO_CIVIL" +
			           ",CEP" + 
			           ",RUA" + 
			           ",NUMERO" +
			           ",BAIRRO" +
			           ",CIDADE" +
			           ",ID_TIPO" +
			           ",UF" +
			           ",OBSERVACOES" + 
			           ",DATA_CADASTRO" +
			           ",CRM" + 
			           ",ESPECIALIDADE" +
			           ",COREN" +
			           ",CATEGORIA" +
			           ",TELEFONE" +
					
					") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, this.dto.senha);
			stmt.setInt(2, this.dto.status);
			stmt.setString(3, this.dto.nome);
			stmt.setString(4, this.formatarData(dto.dataNascimento));
			stmt.setString(5, this.dto.rg);
			stmt.setString(6, this.dto.cpf);
			stmt.setString(7, this.dto.estadoCivil);
			stmt.setString(8, this.dto.cep);
			stmt.setString(9, this.dto.rua);
			stmt.setInt(10, this.dto.numero);
			stmt.setString(11, this.dto.bairro);
			stmt.setString(12, this.dto.cidade);
			stmt.setInt(13, this.dto.idTipo + 1);
			stmt.setString(14, this.dto.uf);
			stmt.setString(15, this.dto.observacoes);
			stmt.setString(16, this.dto.dataCadastro);
			stmt.setString(17, this.dto.crm);
			stmt.setString(18, this.dto.especialidade);
			stmt.setString(19, this.dto.coren);
			stmt.setString(20, this.dto.categoria);
			stmt.setString(21, this.dto.telefone);
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next())
            {
                int last_inserted_id = rs.getInt(1);
                
                return last_inserted_id;
            }
            
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
		
		return 0;
		
	}


	public boolean update() throws SQLException{
		Connection cnn = super.getConnection();

		try {
			PreparedStatement stmt = cnn.prepareStatement("UPDATE FUNCIONARIO SET " + 
				   ",SENHA = ?" +
		           ",STTS = ?" +
		           ",NOME = ?" +
		           ",DATA_NASCIMENTO = ?" +
		           ",RG = ?" +
		           ",CPF = ?" +
		           ",ESTADO_CIVIL = ?" +
		           ",CEP = ?" + 
		           ",RUA = ? " + 
		           ",NUMERO = ?" +
		           ",BAIRRO = ?" +
		           ",CIDADE = ?" +
		           ",ID_TIPO = ?" +
		           ",UF = ?" +
		           ",OBSERVACOES = ?" + 
		           ",DATA_CADASTRO = ?" +
		           ",CRM = ?" + 
		           ",ESPECIALIDADE = ?" +
		           ",COREN = ?" +
		           ",CATEGORIA = ?" +
		           ",TELEFONE = ?" + 
		           " WHERE ID_FUNCIONARIO = ? "
		           );
			
			stmt.setString(1, this.dto.senha);
			stmt.setInt(2, this.dto.status);
			stmt.setString(3, this.dto.nome);
			stmt.setString(4, this.formatarData(dto.dataNascimento));
			stmt.setString(5, this.dto.rg);
			stmt.setString(6, this.dto.cpf);
			stmt.setString(7, this.dto.estadoCivil);
			stmt.setString(8, this.dto.cep);
			stmt.setString(9, this.dto.rua);
			stmt.setInt(10, this.dto.numero);
			stmt.setString(11, this.dto.bairro);
			stmt.setString(12, this.dto.cidade);
			stmt.setInt(13, this.dto.idTipo);
			stmt.setString(14, this.dto.uf);
			stmt.setString(15, this.dto.observacoes);
			stmt.setString(16, this.dto.dataCadastro);
			stmt.setString(17, this.dto.crm);
			stmt.setString(18, this.dto.especialidade);
			stmt.setString(19, this.dto.coren);
			stmt.setString(20, this.dto.categoria);
			stmt.setString(21, this.dto.telefone);
			stmt.setInt(22, this.dto.idFuncionario);
			
			stmt.executeUpdate();
			
			return true;
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}


	public boolean delete(int id) throws SQLException {
		Connection cnn = super.getConnection();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("DELETE FROM FUNCIONARIO WHERE ID_FUNCIONARIO = ?");
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}

	public void read(String param) throws SQLException {
		Connection cnn = super.getConnection();
		
		this.dto = new EmployeeDTO();
		
		try {
			PreparedStatement stmt = cnn.prepareStatement("SELECT TOP 1 * FROM FUNCIONARIO WHERE CPF = ?");
			
			stmt.setString(1, param);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.dto.idFuncionario = rs.getInt("ID_FUNCIONARIO");
				this.dto.senha = rs.getString("SENHA");
				this.dto.status = rs.getInt("STTS");
				this.dto.nome = rs.getString("NOME");
				this.dto.dataNascimento = formatarDataRetorno(rs.getString("DATA_NASCIMENTO"));
				this.dto.rg = rs.getString("RG");
				this.dto.cpf = rs.getString("CPF");
				this.dto.estadoCivil = rs.getString("ESTADO_CIVIL");
				this.dto.cep = rs.getString("CEP");
				this.dto.rua = rs.getString("RUA");
				this.dto.numero = rs.getInt("NUMERO");
				this.dto.bairro = rs.getString("BAIRRO");
				this.dto.cidade = rs.getString("CIDADE");
				this.dto.idTipo = rs.getInt("ID_TIPO");
				this.dto.uf = rs.getString("UF");
				this.dto.observacoes = rs.getString("OBSERVACOES");
				this.dto.dataCadastro = rs.getString("DATA_CADASTRO");
				this.dto.crm = rs.getString("CRM");
				this.dto.especialidade = rs.getString("ESPECIALIDADE");
				this.dto.coren = rs.getString("COREN");
				this.dto.categoria = rs.getString("CATEGORIA");
				this.dto.telefone = rs.getString("TELEFONE");	
				this.dto.usuario = rs.getString("USUARIO");
			}
			
		} catch (Exception e) {
			throw new SQLException(e.toString());
		} finally {
			super.closeConnection();
		}
	}

}
