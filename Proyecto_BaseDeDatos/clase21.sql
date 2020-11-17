-- s
select*from alumnos;

create or replace view salones_argelia as
select observaciones,abreviatura
from (select * from alumnos where concat_ws(' ', ap_paterno, ap_materno, nombre)='BORBOLLA RAMOS ARGELIA') a
join alumno_salon sa using (clave_alu)
join salones s using (id_salon)
join cursos c on (s.id_curso=c.id_curso);

select*from salones_argelia;

select*from alumno_salon where clave_alu ='11030172';