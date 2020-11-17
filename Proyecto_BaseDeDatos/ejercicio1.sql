CREATE TABLE  pais(
	id_pais INT NOT NULL auto_increment PRIMARY KEY,
    pais varchar(100) not null,
    abreviatura varchar(3) not null unique key    
 );
show tables;
show index from pais;
 desc escritor;
 
 create table atleta(
	id_atleta INT NOT NULL auto_increment PRIMARY KEY,
	nombre varchar(50) not null,
    apaterno varchar(50) NOT NULL,
    amaterno varchar(50) not null,
    curp varchar(18) unique key,
    fndc date,
    id_pais int not null,
    FOREIGN KEY (id_pais) REFERENCES pais(id_pais)
 );
 
 insert into pais values (null, 'Mexico','MXN');
 insert into pais values (null, 'Peru','PER');
 insert into pais values (null, 'Estados Unidos','USA');
 insert into pais values (null, 'Canada','CAN');
 insert into pais values (null, 'Argentina','ARG');
 select *from pais;
 
 
 insert into atleta values(null, 'jesus', 'Villareal','Balencia','ZZZZZZZZZZZZZ','1997-05-04', 1);
 insert into atleta values(null, 'maria', 'Villa','Solis','ZZZZZZZZZZZZ1','1995-07-04', 3);
 insert into atleta values(null, 'mariano', 'Holao','Arreguin','efefef','1997-05-05', 4);
 insert into atleta values(null, 'Rodrigo', 'Rosas','Balencia','ZZZZdede','1997-05-04', 1);
 insert into atleta values(null, 'Gabriel', 'Solis','Martinez','fefeefrgrgf','1998-05-07', 2);
 select* from atleta;
 