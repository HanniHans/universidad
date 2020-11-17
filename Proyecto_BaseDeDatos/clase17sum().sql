
select abreviatura,sexo,count(*) as nsex
from cursos c join alumno_salon sa on (c.id_curso=sa.id_curso)
join  alumnos a on(sa.clave_alu=a.clave_alu)
group by abreviatura, sexo;

select e.clave_mat, nombre, abreviatura, id_salon
from materias m
join evaluaciones e on (m.clave_mat=e.clave_mat)
where id_salon=148
group by e.clave_mat, nombre, abreviatura, id_salon;


select * from evaluaciones where id_salon=148;

select ciudad,
sum(if(anios between 1.0 and 1.9999,1,0)) as '1',
sum(if(anios between 2.0 and 2.9999,1,0)) as '2',
sum(if(anios between 3.0 and 3.9999,1,0)) as '3'
from
(select clave_alu, datediff(now(), fecha_pago)/365 as anios 
	from pagos) x
join alumnos a on(x.clave_alu=a.clave_alu)
group by ciudad
order by 1;


select e.clave_alu, concat_ws(' ', ap_paterno,ap_materno,nombre)alumno,
sum(case when clave_mat = '30001' then calificacion else 0 end)'ESPAÑOL',
sum(case when clave_mat = '30002' then calificacion else 0 end)'MAT',
sum(case when clave_mat = '30021' then calificacion else 0 end)'FISICA',
sum(case when clave_mat = '30022' then calificacion else 0 end)'QUIMICA',
sum(case when clave_mat = '30033' then calificacion else 0 end)'ING',
sum(case when clave_mat = '30199' then calificacion else 0 end)'COMPU'
from
(select*from evaluaciones where id_salon=148) e
join alumnos a on(a.clave_alu=e.clave_alu)
GROUP BY e.clave_alu
order by 2;

select count(*) from evaluaciones;
-- Tablas pivote
select curso,
sum(if(sexo='M', nsex,0)) as 'MASCULINO',
sum(if(sexo='F', nsex,0)) as 'FEMININO',
sum(if(sexo='', nsex,0)) as 'NODEFINIDO'
from 
(select abreviatura curso,sexo,count(*) as nsex
from cursos c join alumno_salon sa on (c.id_curso=sa.id_curso)
join  alumnos a on(sa.clave_alu=a.clave_alu)
group by abreviatura, sexo) x
group by curso;