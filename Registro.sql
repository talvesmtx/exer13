CREATE DATABASE registros;
USE registros;
CREATE TABLE esporte(
    nome_e VARCHAR(40) not null  PRIMARY KEY
);
CREATE TABLE pessoas(
	id_p_number INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome_p VARCHAR(40),
    idade INT,
    sexo VARCHAR(2),
    endereço VARCHAR(60),
    vegetarian BOOLEAN,
    fk_nome_e VARCHAR(30) NOT NULL,    
    FOREIGN KEY (fk_nome_e) REFERENCES esporte (nome_e)
);

DROP DATABASE registros; 
select * from pessoas;


















