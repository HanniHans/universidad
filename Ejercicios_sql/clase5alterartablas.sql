use test;
-- Estructuras de las tablas
show tables;
desc poema;
rename table escrito to poema;
select*from poema;



ALTER TABLE poema ADD column abstract varchar(300) null;

AlTER TABLE poema modify titulo varchar(150) null,
CHANGE abstract resumen varchar(200);

ALTER TABLE poema ADD anio int null first, 
add mes int after anio;

alter table poema modify mes int after titulo;

show index from poema;



select *from poema;

alter table poema add index in_titulo (titulo);

alter table poema add unique index uq_titulo(titulo);
INSERT INTO poema values (2019, NULL, 1, 'DIAS DE GUARDAR32','XXXXXXX', null);

alter table poema drop column mes,
drop anio,
add column dia int default 1;

alter table poema modify column dia int first,
add index in_dia(dia),
drop resumen,
add column critica text null;

alter table poema auto_increment =500;
-- Quitamos Pk
alter table poema modify id_poema int not null,
drop primary key;
-- Agregamos PK
alter table poema modify id_poema int not null auto_increment,
add primary key(id_poema);

delete from poema;
truncate table poema;
select*from poema;

drop table poema;