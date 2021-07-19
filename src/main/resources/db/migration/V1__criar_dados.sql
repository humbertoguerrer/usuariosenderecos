create table endereco
(
    id          bigint       not null primary key auto_increment,
    bairro      varchar(255) not null,
    cep         varchar(255) not null,
    complemento varchar(255) not null,
    localidade  varchar(255) not null,
    logradouro  varchar(255) not null,
    numero      varchar(255) not null,
    uf          varchar(255) not null
);

insert into endereco
values (1, 'Jardim Europa', '17017-558', 'Casa', 'Amparo', 'Rua Milo de Almeida Sabino', '850', 'Sao Paulo'),
       (2, 'Jardim Bela Vista', '55095-558', 'Casa', 'Pratania', 'Rua Jorge de Sales', '54', 'Sao Paulo'),
       (3, 'Jardim Vila Nova', '15015-245', 'Casa', 'Piratininga', 'Rua da Gloria', '214', 'Sao Paulo'),
       (4, 'Jardim Vila Sao Basilio', '15015-874', 'Casa', 'Itatinga', 'Rua da Vitoria', '524', 'Sao Paulo');

create table usuario
(
    id              bigint       not null primary key auto_increment,
    cpf             varchar(255) not null,
    data_nascimento datetime(6) not null,
    email           varchar(255) not null,
    nome            varchar(255) not null,
    unique key (cpf),
    unique key (email)
);

insert into usuario
values (1, '508.609.570-04', '1977-10-01 00:00:00.000000', 'juarez.cirino@gmail.com', 'Juarez Cirino'),
       (2, '869.960.200-69', '2002-04-26 00:00:00.000000', 'maria.almeira@gmail.com', 'Maria de Almeida');

create table usuario_enderecos
(
    usuario_id  bigint not null primary key,
    endereco_id bigint not null
);

insert into usuario_enderecos
values (1, 1),
       (2, 2);