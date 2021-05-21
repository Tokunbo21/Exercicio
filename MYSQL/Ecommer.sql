CREATE DATABASE db_ecommer;
USE db_ecommer;
CREATE TABLE tb_produto (
id_mercadoria INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
tipo VARCHAR(255),
cor VARCHAR(255),

preco FLOAT,
PRIMARY KEY (id_mercadoria)
);
 SELECT * FROM tb_produto;

INSERT INTO tb_produto(nome, tipo, cor, preco) VALUES
('laranja', 'fruta','laranja', '300.0'),
('arroz','cereal','branco','600.0'),
('uva','fruta','verde','400.0'),
('feijao','cereal','preto','550.0'),
('batata','cereal','marrom','200.0'),
('maça','fruta','vermelha','100.0'),
('tomate','vegetal','vermelho','520.0');

SELECT * FROM tb_produto;

SELECT * FROM tb_produto WHERE preco >500;
SELECT * FROM tb_produto WHERE preco <500;
UPDATE tb_produto SET preco =300 WHERE id_mercadoria = 1



