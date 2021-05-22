CREATE DATABASE db_RH;
USE db_RH;
CREATE TABLE tb_funcionarios(
id_usuario INT NOT NULL AUTO_INCREMENT,
nome VARCHAR (255),
sobrenome VARCHAR(255),
saldo FLOAT NULL,
email VARCHAR (255),
data_inicio DATE,
PRIMARY KEY (id_usuario)
);

SELECT * FROM tb_funcionarios;

INSERT INTO tb_funcionarios (nome, sobrenome, saldo, email, data_inicio) VALUES
  ('Pamela', 'Silva', '3000', 'psilva@hotmail', '2020-05-02'),
  ('Tokunbo', 'Tofade', '6000', 'tofadet@hotmail', '2020-06-14'),
 ('Wallace', 'Paixao', '5000', 'pwall@gmail', '2020-01-18'),
 ('fernando', 'Rodriges', '1300', 'fernado@gmail', '2020-09-30'),
 ('Aline', 'Fernanda', '1300', 'fernanda@hotmail', '2020-09-30');
 
SELECT * FROM tb_funcionarios WHERE salario > 2000.0;

SELECT * FROM tb_funcionarios WHERE salario < 2000.0;

UPDATE tb_funcionarios SET salario = 6000.0 WHERE id_usuario = 2

Exercicio do dia 20/05
