select count(*) from alumnos;
select count(*) from alumno_salon;
select count(*) from salones;
select count(*) from cursos;
select *from cursos;

-- producto cartesiano
select count(*) from
alumnos a, alumno_salon b;

select count(*) from
alumnos a, alumno_salon b, cursos c, salones s;

-- JOIN
select * from
alumnos a, alumno_salon b
where a.clave_alu = b.clave_alu;

select a.clave_alu, ap_paterno, ap_materno, nombre, curp, b.* from
alumnos a, alumno_salon b
where a.clave_alu = b.clave_alu
order by 1;

select a.clave_alu, ap_paterno, ap_materno, a.nombre, curp,s.observaciones salones, b.*, s.*, c.*
from
alumnos a, alumno_salon b, salones s, cursos c
where a.clave_alu = b.clave_alu
and b.id_salon= s.id_salon
and b.id_curso=c.id_curso
order by 1;

select a.clave_alu, ap_paterno, ap_materno, nombre, curp, b.* from
alumnos a, alumno_salon b
where a.clave_alu = b.clave_alu
order by 1;

select a.clave_alu, ap_paterno, ap_materno, a.nombre, curp,s.observaciones salones, c.abreviatura curso
from
alumnos a, alumno_salon b, salones s, cursos c
where a.clave_alu = b.clave_alu
and b.id_salon= s.id_salon
and b.id_curso=c.id_curso
order by 1;

EXPLAIN
select a.clave_alu, ap_paterno, ap_materno, a.nombre, curp,s.observaciones salones, c.abreviatura curso
from
alumnos a, alumno_salon b, salones s, cursos c
where a.clave_alu = b.clave_alu
and b.id_salon= s.id_salon
and b.id_curso=c.id_curso
order by 1;

select a.clave_alu, ap_paterno, ap_materno, a.nombre, curp,s.observaciones salones, c.abreviatura curso
from
alumnos a, alumno_salon b, salones s, cursos c
where a.clave_alu = b.clave_alu
and b.id_salon= s.id_salon
and b.id_curso=c.id_curso
and b.activo =1
order by 1;