-- 09-10-2019
-- FUNCIONES
-- Se ejecutan una vez por cada registro

select sysdate(), user(), version(), nombre, length(nombre) from alumnos;
select distinct nombre, length(nombre) from alumnos;
select length(sysdate()), length('Hola Mundo') from alumnos ;
select distinct nombre, length(nombre) 
from alumnos 
where length(nombre) between 10 and 15
order by 2 desc;

select length(nombre) as largo, count(*) nnom 
from alumnos 
group by length(nombre)
order by 2 desc;

select distinct nombre, length(nombre) 
from alumnos 
where length(nombre) <= 5 and sexo = 'F'
order by 2 desc;
-- locate('A', nombre, 4) donde se encuentra A en nombre apartir de la localizacion 4
select distinct nombre, locate('A',nombre), locate('A', nombre, 4)
from alumnos 
order by 1 desc;

select distinct nombre, locate('A',nombre), locate('A', nombre, 4)
from alumnos 
where locate('A',nombre) = 0
order by 1 desc;

select distinct nombre, locate('JOSE',nombre), locate('JOSE', nombre, 4)
from alumnos 
where locate('JOSE',nombre) != 0
order by 1 desc;

-- segundo nombre jose
select distinct nombre, locate('JOSE',nombre), locate('JOSE', nombre, 4)
from alumnos 
where locate('JOSE',nombre) > 1
order by 1 desc;

select distinct nombre,  replace(nombre, 'A', 00), replace(nombre, 'JOSE', 'PEPE')
from alumnos 
where locate('JOSE',nombre) != 0
order by 1 desc;

update alumnos set nombre= replace(nombre, 'JOSE', 'PEPE')
where locate('JOSE',nombre) != 0;

select * from alumnos
order by nombre;

update alumnos set nombre= replace(nombre, 'PEPE', 'JOSE')
where locate('PEPE',nombre) != 0;

select nombre, replace(nombre, 'JOSE', 'PEPE'), 
replace(nombre, 'O', 'Aqui Habia una O'),
replace(nombre,'I',peso),
replace (nombre,'A',sysdate())
from alumnos
where locate('JOSE',nombre) != 0;

-- mid
select distinct nombre, left(nombre,3), right(nombre, 3),
mid(nombre,3), mid(nombre,3,3)
from alumnos
order by 2 desc;

-- listado con dos nombre, separar los nombres
select nombre, left(nombre, locate(' ',nombre)-1) nom1, 
mid(nombre, locate(' ',nombre)+1) nom2
from alumnos order by 2 desc;

select distinct nombre, 
if(locate(' ',nombre) = 0, 
	nombre, 
	left(nombre, locate(' ',nombre)-1)
) nom1, 
if(locate(' ',nombre) != 0, mid(nombre, locate(' ',nombre)+1), '') nom2
from alumnos order by 2 desc;
-- 
select distinct nombre,
if(right(nombre,1) ='O','termina en O', 'no termina en O')
from alumnos;

select distinct nombre, sexo,
if(sexo ='F','Femenino', if(sexo='M','Masculino','No definido'))genero
from alumnos;


select distinct nombre, concat(ap_paterno, ' ', ap_materno, ' ', nombre) nomcom,
concat_ws(' ',nombre, ap_paterno, ap_materno,curp,ciudad,peso,colonia) c2-- exclusivo de mysql 
-- concat_ws pasa el primer parametro en los demás
from alumnos;

select distinct nombre, reverse(nombre), repeat(nombre,4)
from alumnos;