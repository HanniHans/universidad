-- LMD Setencia de seleccion o consultas
use colegio_1709;
show tables;

select 10/10, 'hola',sysdate(), version(),user();

SELECT table_name, table_schema, engine 
from information_schema.tables
WHERE table_schema='colegio_1709';

select*from alumnos;
select distinct sexo, ciudad from alumnos;
select distinct clave_alu from alumnos;
select distinct nombre from alumnos;
select distinct sexo, ciudad from alumnos order by sexo, ciudad;
select distinct sexo, ciudad from alumnos order by ciudad, sexo;
select* from alumnos order by 3,4,5;
select* from alumnos order by 3 desc,4 asc,5 desc;
-- select, from, where, gruop, order,
select nombre, ap_paterno, ap_materno, curp from alumnos where sexo='F'
order by 2 desc, 3 asc, 1;

select nombre, ap_paterno, ap_materno, curp, sexo
from alumnos where sexo<>'F'
order by 2 desc, 3 asc, 1;

select nombre, ap_paterno, ap_materno, curp, sexo
from alumnos where sexo='F' and curp=''
order by 2 desc, 3 asc, 1;
select nombre, ap_paterno, ap_materno, curp, sexo
from alumnos where not (sexo='F' and curp='')
order by 2 desc, 3 asc, 1;

select * from alumnos 
limit 5, 15; -- los primeros 5 apartir del registro 15

select*from alumnos 
where peso is not null and sexo='F' and peso > '0.0'
order by peso limit 10;
