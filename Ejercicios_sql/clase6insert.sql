show tables;
-- LMD
select*from cursos;
desc cursos;
insert into cursos values ('C020','SEMESTRE 2020-1', '2020-1','2019-08-01 07:01:20','2019-12-15');

insert into cursos (id_curso, nombre, finicio) values ('C019','SEMESTRE 2019-2', '2019-01-01');

insert into cursos (finicio,abreviatura,ffin,nombre, id_curso) values ('2019-01-01 07:02:00','2019-1','2019-01-01','SEMESTRE 2019-1', 'C018');

insert into cursos (id_curso, nombre, finicio) values 
('C017','SEMESTRE 2018-2', '2019-01-01'),
('C016','SEMESTRE 2018-1', '2019-01-01'),
('C015','SEMESTRE 2017-2', '2019-01-01');

insert into cursos set id_curso='C014', 
nombre='SEMESTRE 2016-1', abreviatura='2016-1', finicio='2016-09-08', ffin='2016-10-08';

create temporary table cursos_tmp like cursos;

select*from cursos_tmp;
desc cursos_tmp;

show create table cursos;

insert into cursos_tmp
select*from cursos;

-- cargar archivo 
load data local infile
'C:\\Users\\hanni\\Documents\\Universidad\\7to Semestre\\BaseDeDatos\\nivel.csv'
into table niveles
fields terminated by ','
enclosed by ''
lines terminated by '\n\r'
ignore 1 lines;

show variables like 'local_infile';
set global local_infile='1'; 
 
