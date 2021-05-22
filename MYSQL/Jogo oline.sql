CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe (
id_classe INT NOT NULL AUTO_INCREMENT,
equipamento VARCHAR (255),
habilidade VARCHAR (255),
classe VARCHAR (255),
PRIMARY KEY (id_classe)
);

INSERT INTO tb_classe (equipamento, habilidade,classe) VALUES
('espada e escudo', 'força', 'guerreiro'),
('feitiçaria','inteligencia','mago'),
('arco e flecha','suporte','arqueiro'),
('machado','resistencia','barbaro'),
('katana', 'agilidade','ninja');

SELECT * FROM tb_classe;

CREATE TABLE tb_personangem (
id_populacao INT NOT NULL AUTO_INCREMENT,
nome VARCHAR (255),
raca VARCHAR (255),
ataque FLOAT,
defesa FLOAT,
mana FLOAT,
fk_classe INT,
PRIMARY KEY (id_populacao),
FOREIGN KEY (fk_classe) REFERENCES tb_classe (id_classe) 
);

SELECT * FROM tb_personangem;

INSERT INTO tb_personangem (nome, raca, ataque , defesa, mana, fk_classe) VALUES
('Tokunbo','humano','3000.0','1500.0','1800.0', 1),
('Dros', 'anao','1500.0','2000.0','5000.0', 2),
('Car','ogro','4000.0','1000.0','1000.0', 4),
('And', 'elfo', 2000.0,1800.0,'3000.0', 3),
('Sor','bruxo', 1000.0,1000.0,4000.0, 2),
('Parita','Necromanse','1500.0','2000.0','3500.0',2),
('lizar','repitil', '3500.0', '1500.0', '1000.0', 4);

SELECT * FROM tb_personangem WHERE ataque > 2000;
SELECT * FROM tb_personangem WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personangem WHERE nome LIKE 'c%';
SELECT * FROM tb_classe INNER JOIN tb_personangem ON tb_classe.id_classe= tb_personangem.fk_classe;

SELECT * FROM tb_classe INNER JOIN tb_personangem ON tb_classe.id_classe= tb_personangem.fk_classe WHERE tb_classe.classe = 'arqueiro'








