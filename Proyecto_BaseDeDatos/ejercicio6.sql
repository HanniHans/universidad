

-- create view 
select*from salones;
select*from salones_datos;

create or replace view salones_datos as
select b.nombre grado, n.nombre nivel,observaciones salon, tipo_grupo, c.abreviatura curso
from salones a  
left join grados b on(a.id_grado=b.id_grado)
left join niveles n on(a.id_nivel=n.id_nivel)
left join cursos c on(a.id_curso=c.id_curso);