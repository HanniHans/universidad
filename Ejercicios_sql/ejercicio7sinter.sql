delimiter //
drop function if exists alumno_aprobado //
create function alumno_aprobado (matricula varchar(10), curso varchar(5))
-- returns decimal (10,2)
returns varchar(60)
reads sql data
deterministic
begin
    declare result float;
    declare estado varchar;
    select avg(calificacion) into result
    from evaluaciones e join materias m  using(clave_mat)
    where clave_alu = matricula and id_curso = curso and  promedia=1;
    if result
    return result;
    
end //
delimiter ;
select alumno_aprobado('11070116','C012');

select matricula, alumno, curp, alumno_aprobado(matricula, 'C012') promedio
from alumnos_datos
order by 4 desc;

select avg(calificacion) 
from evaluaciones e join materias m  using(clave_mat)
where clave_alu = matricula and id_curso = curso and  promedia=1;