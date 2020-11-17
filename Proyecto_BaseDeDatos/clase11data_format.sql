-- FUNCIONES DE FECHAS
select fedita from alumnos;

select sysdate(), date_format(sysdate(),'Estamos en el año %Y y el corto es %y dia: %j'); -- %Y: año en 4 digitos, %y: año en 2 digitos

select sysdate(), date_format(sysdate(),'%Y-%m-%d') fecha,
date_format(sysdate(), '%H:%i:%s') hora,
date_format(sysdate(),'Semana no. %u') semana, 
date_format(sysdate(), 'Dia %j de 365') dia,
date_format(sysdate(), 'Año %y Dia %D Mes %b') des,
date_format(sysdate(), 'Hoy es %W');

select fedita, date_format(fedita,'%Y-%m-%d') fecha,
date_format(fedita,'%T') h24,
date_format(fedita,'%r') h12,
date_format(fedita,'%p') AMPM
from alumnos;

select (date_format(fedita,'%Y'))anio, count(*)nalu
from alumnos
group by anio
having nalu<=150
order by anio;

select * from alumnos 
where date_format(fedita,'%Y') ='0000';

update alumnos set fedita= sysdate() where date_format(fedita,'%Y')='0000';

select * from alumnos 
where date_format(fedita,'%Y%m%d') ='20180218';

select date_format(fedita,'%Y%m%d') fecha, count(*) nalu
from alumnos 
where sexo='M' and date_format(fedita,'%y')='16'
group by fecha
order by fecha;

select fedita,date_format(fedita,'%Y') anio,
date_format(fedita,'%M') nommes,
date_format(fedita,'%m') mes,
date_format(fedita,'%d') dias,
date_format(fedita,'%W') diasem,
date_format(fedita,'%u') semana,
date_format(fedita,'%j') diaanio,
date_format(fedita,'%b') mes3,
date_format(fedita,'%a') dia3
from alumnos;


select *from alumnos;

select fedita, date_format(fedita,'%m') from alumnos
where date_format(fedita,'%m')>= 6 and date_format(fedita,'%Y')= '2017'
order by fedita;

select fedita, date_format(fedita,'%m') from alumnos
where date_format(fedita,'%Y')= '2017' and
date_format(fedita,'%b') in('JAN', 'AUG', 'NOV')
order by fedita;

select * from alumnos
where date_format(fedita,'%Y')= '2017' and
date_format(fedita,'%e') between 5 and 10;

select nombre from alumnos
where nombre between 'cesar' and 'martha'
order by 1;

select distinct date_format(fedita, '%W') diasemana,
date_format(fedita,'%a') dia3
from alumnos;
