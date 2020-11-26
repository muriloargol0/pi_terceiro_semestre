/*
	GRUPO:

	CAIO ROSSI
	JULIANA CUNHA
	MURILO ARGOLO

*/

DROP DATABASE PI

CREATE DATABASE PI

USE PI

BEGIN TRY  
     BEGIN TRAN

	 CREATE TABLE TIPO(
	   ID_TIPO INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	   DESCRICAO VARCHAR(100) NOT NULL
	 )

	 CREATE TABLE FUNCIONARIO(
		ID_FUNCIONARIO INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
		USUARIO VARCHAR(50) NOT NULL,
		SENHA VARCHAR(15) NOT NULL,
		STTS BIT NOT NULL,
		NOME VARCHAR(200) NOT NULL,
		DATA_NASCIMENTO DATE NOT NULL,
		RG VARCHAR(12) NOT NULL,
		CPF VARCHAR(15) NOT NULL,
		ESTADO_CIVIL VARCHAR(15) NOT NULL,
		CEP VARCHAR(10) NOT NULL,
		ENDERECO VARCHAR(300) NOT NULL,
		NUMERO INT NOT NULL,
		BAIRRO VARCHAR(300) NOT NULL,
		CIDADE VARCHAR(100) NOT NULL,
		ID_TIPO INT NOT NULL,
		UF CHAR(2) NOT NULL,
		OBSERVACOES VARCHAR(MAX),
		DATA_CADASTRO DATETIME NOT NULL,
		CRM VARCHAR(15),
		ESPECIALIDADE VARCHAR(300),
		COREN VARCHAR(50),
		CATEGORIA VARCHAR(300),
		TELEFONE VARCHAR(100) NOT NULL
	 )

	 CREATE TABLE PACIENTE(
		ID_PACIENTE INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
		TIPO_SANGUINEO CHAR(3) NOT NULL,
		DATA_CADASTRO DATETIME NOT NULL,
		EMAIL VARCHAR(180) NOT NULL,
		ENDERECO VARCHAR(150) NOT NULL,
		DATA_NASCIMENTO DATE NOT NULL,
		CPF VARCHAR(15) NOT NULL,
		CEP VARCHAR(10) NOT NULL,
		BAIRRO VARCHAR(300) NOT NULL,
		CIDADE VARCHAR(100) NOT NULL,
		NUMERO INT NOT NULL,
		UF CHAR(2) NOT NULL,
		STTS BIT NOT NULL,
		NOME VARCHAR(200) NOT NULL,
		ESTADO_CIVIL VARCHAR(15) NOT NULL,
		RG VARCHAR(12) NOT NULL,
		TELEFONE VARCHAR(100) NOT NULL,
		OBSERVACOES VARCHAR(MAX),
		SEXO VARCHAR(15) NOT NULL,
		RESPONSAVEL VARCHAR(100),
		ANEXO VARCHAR(400) 
	 )

	 CREATE TABLE DIAGNOSTICO(
		ID_DIAGNOSTICO INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
		ID_PACIENTE INT NOT NULL,
		ID_FUNCIONARIO INT NOT NULL,
		DIAGNOSTICO VARCHAR(MAX) NOT NULL,
		SINTOMAS VARCHAR(MAX) NOT NULL,
		ANEXO VARCHAR(400),
		TEMPERATURA VARCHAR(20),
		DATA_DIAGNOSTICO DATETIME NOT NULL,
		PRESSAO_SAGUINEA VARCHAR(100),
		GLICEMIA VARCHAR(100),
		COLESTEROL VARCHAR(100)
	 )

	 CREATE TABLE RECEITA(
		ID_RECEITA INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
		DATA_RECEITA DATETIME NOT NULL,
		PRESCRICAO VARCHAR(MAX) NOT NULL,
		ID_DIAGNOSTICO INT NOT NULL,
		OBSERVACAO VARCHAR(MAX)
	 )

	 ALTER TABLE FUNCIONARIO WITH CHECK ADD FOREIGN KEY(ID_TIPO)
		REFERENCES TIPO (ID_TIPO)

	ALTER TABLE DIAGNOSTICO WITH CHECK ADD FOREIGN KEY(ID_PACIENTE)
		REFERENCES PACIENTE (ID_PACIENTE)

	ALTER TABLE DIAGNOSTICO WITH CHECK ADD FOREIGN KEY(ID_FUNCIONARIO)
		REFERENCES FUNCIONARIO (ID_FUNCIONARIO)

	ALTER TABLE RECEITA WITH CHECK ADD FOREIGN KEY(ID_DIAGNOSTICO)
		REFERENCES DIAGNOSTICO (ID_DIAGNOSTICO)

	INSERT INTO TIPO (DESCRICAO) VALUES 
		('M�dica(o)'),
		('Enfermeira(o)'),
		('Administrador do sistema'),
		('Recepcionista(o)')

	INSERT INTO FUNCIONARIO (BAIRRO, CATEGORIA, CEP, CIDADE, COREN, CPF, CRM, DATA_CADASTRO, DATA_NASCIMENTO, ESPECIALIDADE, ESTADO_CIVIL,
		ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, ENDERECO, SENHA, STTS, TELEFONE, UF, USUARIO)
	VALUES
		('Teste', 'Teste', '13348122', 'Indaiatuba', '1213566', '40718516900', '102015', GETDATE(), '1993-11-01', 'ADM', 'Solteiro', 3, 'ADMIN', 
		333, 'Usu�rio para testar o sistema', '48648136', 'Rua adm', '123', 1, '19997550405', 'SP','adm')

	INSERT INTO FUNCIONARIO (BAIRRO, CATEGORIA, CEP, CIDADE, COREN, CPF, DATA_CADASTRO, DATA_NASCIMENTO, ESTADO_CIVIL,
			ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, ENDERECO, SENHA, STTS, TELEFONE, UF, USUARIO)
		VALUES
			('Jardim Paulista', 'Enfermeiro', '13348123', 'Indaiatuba', '1214566', '12255566699', GETDATE(), '1992-12-02', 'Casado', 2, 'Jo�o Roberto', 
			445, 'Usu�rio para testar o sistema', '578222236', 'Rua Cinco', '123', 1,'19997550215', 'SP','e1')	

	INSERT INTO FUNCIONARIO (BAIRRO, CATEGORIA, CEP, CIDADE, COREN, CPF, DATA_CADASTRO, DATA_NASCIMENTO, ESTADO_CIVIL,
			ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, ENDERECO, SENHA, STTS, TELEFONE, UF, USUARIO)
		VALUES
			('Jardim Paulista', 'Enfermeiro', '13778123', 'Salto', '1214566', '12254466677', GETDATE(), '1992-05-02', 'Casado', 2, 'J�lia Abin', 
			475, 'Usu�rio para testar o sistema', '54534536', 'Rua Cinco', '123', 1,'11997511215', 'SP','e2')	

	INSERT INTO FUNCIONARIO (BAIRRO, CEP, CIDADE, CPF, DATA_CADASTRO, DATA_NASCIMENTO, ESTADO_CIVIL,
			ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, ENDERECO, SENHA, STTS, TELEFONE, UF, USUARIO)
		VALUES
			('Jardim Elizabeth', '13768123', 'Salto', '12245611199', GETDATE(), '19920512', 'Solteira', 4, 'Ana Carolina', 
			70, 'Recepcionista para testar o sistema', '545124536', 'Rua Brasil', '123', 1,'11997513315', 'SP','r1')

	INSERT INTO FUNCIONARIO (BAIRRO, CEP, CIDADE, CPF, DATA_CADASTRO, DATA_NASCIMENTO, ESTADO_CIVIL,
			ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, ENDERECO, SENHA, STTS, TELEFONE, UF, USUARIO, ESPECIALIDADE, CRM)
		VALUES
			('Jardim Paulista', '13348123', 'Indaiatuba', '12278965489', GETDATE(), '1984-01-02', 'Casado', 1, 'Roberto Augusto', 
			45, 'Usu�rio para testar o sistema', '578222236', 'Rua Cinco', '123', 1,'19997550215', 'SP','m1', 'Neurologista', '125462548')

	INSERT INTO PACIENTE (TIPO_SANGUINEO, DATA_CADASTRO, EMAIL, ENDERECO, DATA_NASCIMENTO, CPF, CEP, BAIRRO, CIDADE, NUMERO, UF, STTS, NOME, ESTADO_CIVIL, RG, TELEFONE, SEXO)
		VALUES 
			('A+', GETDATE(), 'gustavo@gmail.com', 'rua dois', '1990-04-03', '35035035022', '13326008', 'Bairro Arco �ris', 'Salto', 124, 'SP', 1, 'Gustavo Almeida', 'Solteiro', '465428785', '1198756-0455', 'Masculino')

	INSERT INTO PACIENTE (TIPO_SANGUINEO, DATA_CADASTRO, EMAIL, ENDERECO, DATA_NASCIMENTO, CPF, CEP, BAIRRO, CIDADE, NUMERO, UF, STTS, NOME, ESTADO_CIVIL, RG, TELEFONE, SEXO)
		VALUES 
			('A-', GETDATE(), 'maria@gmail.com', 'rua um', '1985-04-03', '34034034033', '12126008', 'Chapada', 'Itu', 321, 'SP', 1, 'Maria Mariana', 'Casada', '123428785', '11980060455', 'Feminino')

	INSERT INTO PACIENTE (TIPO_SANGUINEO, DATA_CADASTRO, EMAIL, ENDERECO, DATA_NASCIMENTO, CPF, CEP, BAIRRO, CIDADE, NUMERO, UF, STTS, NOME, ESTADO_CIVIL, RG, TELEFONE, SEXO)
		VALUES 
			('AB-', GETDATE(), 'renato@gmail.com', 'rua seis', '1975-07-03', '00205034033', '12111008', 'Bairro Novo', 'Itu', 41, 'SP', 1, 'Renato Rosa', 'Casado', '123428785', '11910160455', 'Masculino')

	INSERT INTO PACIENTE (TIPO_SANGUINEO, DATA_CADASTRO, EMAIL, ENDERECO, DATA_NASCIMENTO, CPF, CEP, BAIRRO, CIDADE, NUMERO, UF, STTS, NOME, ESTADO_CIVIL, RG, TELEFONE, SEXO)
		VALUES 
			('O-', GETDATE(), 'cassia@gmail.com', 'rua Jos� Alencar', '1982-01-01', '34015917410', '12001007', 'Vila Martins', 'Salto', 784, 'SP', 1, 'C�ssia Silva', 'Separada', '123428785', '11941060455', 'Feminino')

	 COMMIT
END TRY  
BEGIN CATCH  
      ROLLBACK
END CATCH

