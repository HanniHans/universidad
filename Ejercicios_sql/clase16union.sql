

select a.clave_alu, ap_paterno, ap_materno,nombre, count(pago) npagos, ifnull(sum(pago),0) tpago 
from alumnos a
left join pagos p using(clave_alu)
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select * from 
salones s
join cursos c on(s.id_curso=c.id_curso);

select * from 
salones s
join cursos c using(id_curso);

select * from 
salones s
natural join cursos c;

select * from 
salones s
natural left join cursos c;

select *from alumnos;
select*from profesores;

select clave_alu, ap_paterno, ap_materno, nombre, sexo, curp, 'ALUMNO' tipo
from alumnos
UNION
select clave_prof, apellido_p, apellido_m,nombres,sexo,curp, 'PROFESOR' tipo
from profesores
order by 2,3,4;

select*from alumnos
union -- hace un distinct por default
select*from alumnos;

select*from alumnos
union all
select*from alumnos;
-- SUBCONSULTAS
select *from
(select clave_alu, ap_paterno, ap_materno, nombre, sexo, curp, 'ALUMNO' tipo
from alumnos
UNION
select clave_prof, apellido_p, apellido_m,nombres,sexo,curp, 'PROFESOR' tipo
from profesores) x
where sexo='F'
order by 2,3,4;

select*from alumnos where sexo = 'F';

-- inyecciones en db
-- $sexo = 'F'
-- $sexo = '1' or 1=1; left join usuarios
-- select * from alumnos where sexo ='F'
select a.clave_alu, ap_paterno, ap_materno,nombre, count(pago) npagos, ifnull(sum(pago),0) tpago 
from alumnos  a
left join pagos p using(clave_alu)
where sexo=''
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select a.clave_alu, ap_paterno, ap_materno,nombre, count(pago) npagos, ifnull(sum(pago),0) tpago 
from ( select * from alumnos where sexo='') a
left join (select*from pagos where year(fecha_pago)='2017') p using(clave_alu)
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select distinct year(fecha_pago) from pagos;

-- alumnos que no han pagado nada
select clave_alu, ap_paterno, ap_materno,nombre
from alumnos
where clave_alu not in(select distinct clave_alu from pagos);

-- alumnos que han pagado
select clave_alu, ap_paterno, ap_materno,nombre
from alumnos
where clave_alu in(select distinct clave_alu from pagos);
-- gabi
select distinct nombre from alumnos where nombre in (select distinct nombres from profesores);