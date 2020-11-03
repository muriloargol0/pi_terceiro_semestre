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
		RUA VARCHAR(300) NOT NULL,
		NUMERO INT NOT NULL,
		BAIRRO VARCHAR(300) NOT NULL,
		CIDADE VARCHAR(100) NOT NULL,
		ID_TIPO INT NOT NULL,
		UF CHAR(2) NOT NULL,
		OBSERVACOES VARCHAR(MAX),
		DATA_CADASTRO DATETIME NOT NULL,
		CRM VARCHAR(15),
		SITUACAO BIT,
		ESPECIALIDADE VARCHAR(300) NOT NULL,
		COREN VARCHAR(50),
		CATEGORIA VARCHAR(300)
	 )

	 CREATE TABLE PACIENTE(
		ID_PACIENTE INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
		TIPO_SANGUINEO CHAR(2) NOT NULL,
		DATA_CADASTRO DATETIME NOT NULL,
		EMAIL VARCHAR(180) NOT NULL,
		RUA VARCHAR(150) NOT NULL,
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
		ID_RECEITA INT,
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
		('M�dico'),
		('Infermeira'),
		('administrador do sistema')

	INSERT INTO FUNCIONARIO (BAIRRO, CATEGORIA, CEP, CIDADE, COREN, CPF, CRM, DATA_CADASTRO, DATA_NASCIMENTO, ESPECIALIDADE, ESTADO_CIVIL,
		ID_TIPO, NOME, NUMERO, OBSERVACOES, RG, RUA, SENHA, SITUACAO, STTS, UF, USUARIO)
	VALUES
		('Teste', 'Teste', '13348-122', 'Indaiatuba', '1213566', '40718516900', '102015', GETDATE(), '1993-11-01', 'ADM', 'Solteiro', 3, 'ADMIN', 
		333, 'Usu�rio para testar o sistema', '48648136', 'Rua adm', '123', 1, 1, 'SP','adm')
	 COMMIT
END TRY  
BEGIN CATCH  
      ROLLBACK
END CATCH
