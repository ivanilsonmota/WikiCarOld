create table carro (
	id_carro integer default nextval('id_carro_seq'),
	marca varchar(50) not null, 
	modelo varchar(50) not null,
	vendas_inter integer,
	vendas_nac integer,
	qnt_km_rodados numeric(10,2),
	ano_lanc integer,
	preco_atual numeric(10,2),
	preco_lanc numeric(10,2),
	primary key (id_carro)
);



insert into carro values (nextval(), "
