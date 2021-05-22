CREATE DATABASE db_pizzarialegal;
USE db_pizzarialegal;

CREATE TABLE tb_categoria(
id_tipo INT NOT NULL AUTO_INCREMENT,
sabor VARCHAR (255),
molho VARCHAR(255),
tipo VARCHAR (255),
PRIMARY KEY (id_tipo)
);

INSERT INTO tb_categoria (sabor, molho, tipo) VALUES
('calabresa','vermelho', 'salgado'),
('bauru','branco', 'salgado'),
('mussarela','vermelho', 'salgado'),
('chocolate','------', 'doce'),
('leite condençado','-----', 'doce');

SELECT * FROM tb_categoria;

CREATE TABLE tb_pizzar(
id_pi INT NOT NULL AUTO_INCREMENT,
tamanho VARCHAR (255),
acom VARCHAR (255),
temperos VARCHAR (255),
preco FLOAT,
fk_categoria INT,
PRIMARY KEY (id_pi),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_tipo) 
);

INSERT INTO tb_pizzar (tamanho, acom, temperos, preco, fk_categoria) VALUES
('grande', 'fanta', 'oregano', 60.0,1),
('grande', 'coca', 'oregano', 60.0,2),
('grande', 'guarana', '------', 60.0, 4),
('medios', 'fanta', 'oregano', 40.0, 3),
('medios', 'coca', '------', 40.0, 5),
('medios', 'guarana', 'oregano', 40.0,1),
('pequena', '----', '-----', 20.0, 4),
('pequena', '----', 'oregano', 20.0, 2);


SELECT * FROM tb_pizzar WHERE preco > 45.0;
SELECT *FROM tb_pizzar WHERE preco BETWEEN 29 AND 60;
SELECT *FROM tb_pizzar WHERE acom LIKE 'c%';
SELECT * FROM tb_categoria INNER JOIN tb_pizzar ON tb_categoria.id_tipo= tb_pizzar.fk_categoria;
SELECT * FROM tb_categoria INNER JOIN tb_pizzar ON tb_categoria.id_tipo= tb_pizzar.fk_categoria WHERE tb_categoria.tipo = 'doce'