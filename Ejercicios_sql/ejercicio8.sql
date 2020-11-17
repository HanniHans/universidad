delimiter //
DROP FUNCTION IF EXISTS promedio_alumno //
CREATE FUNCTION promedio_alumno(matricula varchar (10), curso varchar(5))
RETURNS varchar(10)-- va a regresar el tipo de dato
reads sql data
DETERMINISTIC
BEGIN
    declare result float;
    declare estado varchar(10);
    select avg(calificacion) INTO result 
    from evaluaciones e 
    JOIN materias m 
    using(clave_mat)
    where clave_alu = matricula AND id_curso = curso AND promedia = 1;
    if result <=5 then 
		set estado = 'REPROBADO'; 
    else if result >= 6 then set estado = 'APROBADO';
    else set estado = 'NP';
    end if;
    end if;
	RETURN estado; -- regresa el dato
END //
delimiter ;

select * from evaluaciones;
select promedio_alumno('11070116', 'C012');
create or replace view alumnos_promedio as
select matricula, alumno, curp, promedio_alumno(matricula, 'C012') estadocali
from alumnos_datos
order by 4 DESC;
select * from alumnos_promedio where estadocali is not null;