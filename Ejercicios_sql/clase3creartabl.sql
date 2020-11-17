select sysdate(), version(), connection_id();
select current_date(), current_time();
select 20/3, (4*3) + 26;
select 'hola mundo';
show databases;
create database if not exists test;
 drop database test;
 show variables like 'datadir';
 use test;
 
 create table escritor(
	id_escritor INT NOT NULL auto_increment, 
    nombre varchar(30) NOT NULL,
    apellidos varchar(50) NOT NULL,
    direccion varchar(100) NULL,
    alias varchar(30) NULL DEFAULT 'NA',
    primary key(id_escritor)
 );
 
 show tables;
 
 show columns from escritor;
 desc escritor; 
 
 show indexes from escrito;
 
CREATE TABLE  escrito(
	id_escrito INT NOT NULL auto_increment PRIMARY KEY,
    id_escritor INT NOT NULL,
    titulo varchar(100) NOT NULL,
    contenido text NULL,
    FOREIGN KEY (id_escritor) REFERENCES escritor(id_escritor)
    ON DELETE cascade
    ON UPDATE cascade
    
 );
 

INSERT INTO escritor VALUES 
(NULL, 'CARLOS', 'MONSIVAIS','CDMX','MONSI'),
(NULL, 'GABRIELA', 'MISTRAL','CDMX','GABY'),
(NULL, 'GABRIEL', 'GARCIA MARQUEZ','ARACATACA','GABO');
 
SELECT *FROM escrito;
INSERT INTO escrito VALUES
(NULL,100,'Dias de gaurdar', 'ZZZZZZZ'); 

INSERT INTO escrito VALUES
(NULL,1,'Dias de gaurdar', 'ZZZZZZZ'),
(NULL,3,'Cien años de soledad', 'ZZZZZZZ'),
(NULL,3,'El amor en tiempos de colera', 'ZZZZZZZ'),
(NULL,3,'Memorias de mis...', 'ZZZZZZZ'),
(NULL,2,'Poemas de GM', 'ZZZZZZZ'); 
 
UPDATE escritor SET id_escritor = 200 where id_escritor=2;

DELETE FROM escritor WHERE id_escritor= 200; 
