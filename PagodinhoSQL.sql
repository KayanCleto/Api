CREATE database PAGODINHO;

USE PAGODINHO;

CREATE table Matilha
(
	id int not null auto_increment,
    nome varchar(50),
    codlobo varchar(50),
    idade int,
    CONSTRAINT PRIMARY KEY (id)
)

