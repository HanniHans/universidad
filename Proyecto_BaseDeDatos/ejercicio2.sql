select*from alumnas;

create table alumnas like alumnos;

insert into alumnas
select*from alumnos where sexo='F';

drop table alumnas;