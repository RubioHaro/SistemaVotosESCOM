create database encuestas;
use encuestas;

drop table if exists Usuario;
create table Usuario (
    boleta int not null,
    nombre varchar(100) not null,
    email varchar(50) not null,
    sexo varchar(1) not null,
    password varchar(100) not null,
    primary key (idUsuario)
);

drop table if exists Usuario;
create table Usuario (
    idEncuesta int not null auto_increment,
    nombre varchar(100) not null,
    descripcion varchar(300) not null,
    estado varchar(50) not null,
    fechaInicio date not null,
    fechaFin date not null,
    primary key (idEncuesta)
);