delimiter //
drop function if exists promedio_alumno //
create function promedio_alumno (matricula varchar(10), curso varchar(5))
returns decimal (10,2)
reads sql data
deterministic
begin
	declare nmat int;
    declare suma float;
    declare result float;
    select count(e.clave_mat) into nmat
    from evaluaciones e join materias m  using(clave_mat)
    where clave_alu = matricula and id_curso = curso and  promedia=1;
    select sum(calificacion) into suma from evaluaciones
    where clave_alu = matricula and id_curso = curso;
    set result = format(suma/nmat,2);
    return result;
end //
delimiter ;

select * from evaluaciones;

select promedio_alumno('11070116','C012');
select matricula, alumno, curp, promedio_alumno(matricula, 'C012') promedio
from alumnos_datos
order by 4 desc;

select * from alumnos_promedio where promedio is not null;
-- version 2
delimiter //
drop function if exists promedio_alumno //
create function promedio_alumno (matricula varchar(10), curso varchar(5))
returns decimal (10,2)
reads sql data
deterministic
begin
    
    return result;
end //
delimiter ;