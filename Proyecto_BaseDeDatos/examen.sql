-- ROSALES TLATENCHI HANNIA

-- 1crear tabla alumno_cobro
create table alumno_cobros(
	clave_alu varchar(20) not null,
    fecha datetime not null,
    concepto varchar(50) not null,
    importe float not null
);

-- 2insert

insert into alumno_cobros
select clave_alu, max(fecha_pago), extract(year from fecha_pago), sum(pago) from pagos
group by clave_alu
order by 1;

select*from alumno_cobros;
-- 3actualizar el campo sexo de los alumnos que tengan un valor blanco en base al CURP, solo si hay un CURP valido
update alumnos set sexo = mid(curp,11,1)
where length(curp)=18;

-- 4listar la hora actual dek sistema y la fecha del sistema mas tres meses y seis horas
select
date_add(date_add(sysdate(), interval 3 month), interval 6 hour);

-- 5listar las personas (alumnos y profesores)que hayan nacido en un año terminado en 5,
-- mostrar nombre completo en un solo campo
select *from
(select clave_alu, concat_ws(' ',ap_paterno, ap_materno, nombre), curp, 'ALUMNO' tipo
from alumnos
UNION
select clave_prof, concat_ws(' ', apellido_p, apellido_m,nombres),curp, 'PROFESOR' tipo
from profesores) x
where mid(curp,6,1)=5
order by 2,3,4;

-- 6 listar la estrutura de la tabla alumnos sin usar desc
show columns from alumnos;

-- 7 listar las materias de los alumnos de primero de secundaria, usando una consulta anidada
select nombre from (select*from materias where id_nivel=3 and id_grado=1) x;

-- 8 listar los profesores y los grupos en los que dan clase 
select*from salones;
select g.clave_prof,p.nombres , s.observaciones grupo from profesor_grupo g
left join salones s using(id_salon)
left join profesores p using(clave_prof);

-- 9 crear una vista que liste  el promedio 
select *from cursos;

create view  promedio as
select e.clave_alu, concat_ws(' ',ap_paterno, ap_materno, nombre) nombre, id_curso clave, avg(calificacion) promedio from evaluaciones e
join alumnos a on (e.clave_alu=a.clave_alu) 
group by clave_alu
order by 1;

select*from promedio;

-- a la tabla creada en el punto uno agregarle un indice unico para los campos clave_alu y
-- concepto y llamar UQ_alumno_concepto
alter table alumno_cobros add unique index uq_clave(clave_alu);
alter table alumno_cobros add unique index uq_alumno_concepto(concepto);

show index from alumno_cobros;

