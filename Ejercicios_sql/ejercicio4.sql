-- Número de salones que no tienen inscrito ningún alumno
-- Lista de salones que no tengan ningún alumno inscrito o(bservaciones)
select*from salones;
select*from alumno_salon;

select s.id_salon, observaciones, tipo_grupo
from salones s
left join alumno_salon a on (s.id_salon=a.id_salon)
where a.id_salon is null;

select s.id_salon, observaciones, tipo_grupo,s.id_nivel,id_grado,s.id_curso, n.nombre nivel
from salones s
left join alumno_salon a on (s.id_salon=a.id_salon)
join niveles n on(s.id_nivel=n.id_nivel)
where a.id_salon is null and tipo_grupo='PRINCIPAL'
and n.nombre='BACHILLERATO';

select s.id_salon, observaciones salon, tipo_grupo, n.nombre nivel, g.nombre grado,
c.abreviatura
from salones s
left join alumno_salon a on (s.id_salon=a.id_salon)
join niveles n on(s.id_nivel=n.id_nivel)
join grados g on(s.id_grado=g.id_grado)
join cursos c on(s.id_curso=c.id_curso)
where a.id_salon is null and tipo_grupo='PRINCIPAL'
and n.nombre='BACHILLERATO'
and g.nombre='6o';


