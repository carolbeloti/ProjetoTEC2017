       
create table usuarios(      
	id serial primary key,
	nome varchar(50) not null,
	login varchar(20) not null,
	senha varchar(20) not null
);

create table estados(
	id serial primary key,
	nome varchar(50) not null,
	sigla varchar(2) not null
);


CREATE TABLE cidades (
    id serial primary key,
    nome character varying,
    codigo_ibge integer,
    estado_id integer,
    populacao_2010 integer,
    densidade_demo numeric,
    gentilico character varying(250),
    area numeric
);

create table cliente(
	id serial primary key, 
	nome varchar(100) not null,
	cpf varchar(11) not null,
	rua varchar(200),
	cep varchar(12),
	bairro varchar(50),
	id_cidade int not null, 
	telefone varchar(20),
    constraint fk_id_cidade foreign key (id_cidade) references cidades (id)
);

create table produtos( 
	id serial primary key,
	nome varchar(50) not null,
	valor decimal
);

create table vendas(
	id serial primary key, 
	id_produto int not null, 
	id_cliente int not null, 
	id_usuario int not null,
	valor_mao_de_obra decimal(9,2),
	valor_total decimal(9,2),
	data_inicio date,
	data_entrega date,
    constraint fk_id_produto foreign key (id_produto) references produtos (id),
    constraint fk_id_cliente foreign key (id_cliente) references cliente (id),
    constraint fk_id_usuario foreign key (id_usuario) references usuarios (id)
);