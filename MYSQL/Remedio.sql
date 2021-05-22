CREATE DATABASE tb_farmacia_do_bem; 
USE tb_farmacia_do_bem;

CREATE TABLE tb_categoria(
id_sude INT NOT NULL AUTO_INCREMENT,
saude VARCHAR (255),
pele VARCHAR (255),
supremento VARCHAR (255),
PRIMARY KEY (id_sude) 
);

INSERT INTO tb_categoria ( saude, pele, supremento) VALUES 
('benegripe','pomada','calcio'),
('para dor de cabeca','crema','vitaminaD'),
('dor no corpo','hidratante','vitaminaB'),
('febre','cicatrecure','vitaminaC');
SELECT * FROM tb_categoria;

CREATE TABLE tb_produto (
id_fac INT NOT NULL AUTO_INCREMENT,
nome VARCHAR (255),
data_ven DATE,
taja VARCHAR (255),
preco FLOAT,
fk_categoria INT, 
PRIMARY KEY (id_fac),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_sude)
);

INSERT INTO tb_produto (nome, data_ven,taja, preco, fk_categoria) VALUES
('cura gripe', '2022-03-15','-----','3.0',1 ),
('-dor','2021-02-21','vermelho','10.0','2'),
('forte cura', '2023-03-15','preta','60.0','3 '),
('cura febre', '2023-04-20','vermelha','50.0',4 ),
('vitaminas compretas', '2021-11-30','-----','3.0',3 );

SELECT * FROM tb_produto WHERE preco > 50.0;	
SELECT *FROM tb_produto WHERE nome LIKE 'c%';
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id_sude= tb_produto.fk_categoria;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 And 50;
SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id_sude= tb_produto.fk_categoria WHERE tb_produto.taja = 'vermelho'