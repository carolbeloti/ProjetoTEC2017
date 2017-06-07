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

create table cidades(
	id serial primary key,
	nome varchar(100) not null,
	id_estado int not null,
    constraint fk_id_estado foreign key (id_estado) references estados (id)
);

create table clientes(
	id serial primary key, 
	nome varchar(100) not null,
	cpf varchar(11) not null,
	endereco varchar(200),
	cep varchar(12),
	bairro varchar(50),
	id_cidade int not null, 
	telefone varchar(20),
    constraint fk_id_cidade foreign key (id_cidade) references cidades (id)
);

create table produtos(
	id serial primary key,
	nome varchar(50) not null,
	valor decimal (9,2)
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
    constraint fk_id_cliente foreign key (id_cliente) references clientes (id),
    constraint fk_id_usuario foreign key (id_usuario) references usuarios (id)
);