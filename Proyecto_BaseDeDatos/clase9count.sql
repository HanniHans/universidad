USE colegio_1709;
select*from alumnos;
/*Funciones de agregacion
SUM COUNT MAX MIN AVG
*/
select sexo from alumnos group by sexo;

select sexo, ciudad from alumnos group by sexo,ciudad;
select sexo genero, count(*) as nalu 
from alumnos
group by sexo;

select ciudad, count(*) as nalu 
from alumnos
group by ciudad;

select ciudad, count(*) as nalu 
from alumnos
where sexo = 'F' and curp <> ''
group by ciudad
having count(*)>1
order by 2 desc
limit 3;

select count(*) from alumnos;
select count(*) from alumnos where sexo= 'F';
select count(*) c, sum(peso) s, max(peso) mx, min(peso)mn, avg(peso) from alumnos;
select sexo, count(*) contar, sum(peso) sumar, max(peso) maximo, min(peso)minimo, avg(peso) promedio 
from alumnos
group by sexo
having avg(peso)<=40;

select *from pagos;
select clave_alu, sum(pago), count(pago), 
format(avg(pago),2)
from pagos
group by clave_alu
having sum(pago)>= 30000 and count(pago)<=5;

select*from pagos 
where clave_alu= '11070367';

select year(fecha_pago), month(fecha_pago),count(*), sum(pago) 
from pagos 
where month(fecha_pago)>=7
group by year(fecha_pago), month(fecha_pago)
order by 1,2;

-- las colonias que tengan mas de 3 hombres
select*from alumnos;


 select colonia, count(*)
 from alumnos
 where sexo= 'M' and ciudad='queretaro'
 group by colonia
 having count(colonia)>=3
 order by colonia;
