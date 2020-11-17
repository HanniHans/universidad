select fedita, year(fedita) anio, month(fedita) mes,
day(fedita) dia, hour(fedita) hora, minute(fedita) minuto,
second(fedita) seg
from alumnos;

select fedita, dayname(fedita), dayofmonth(fedita),
dayofweek(fedita), dayofyear(fedita), weekday(fedita),
weekofyear(fedita), week(fedita)
from alumnos;

select*from pagos;

select year(fecha_pago)anio, month(fecha_pago)mes, count(*) npagos, 
format((pago),2)pago, format(avg(pago),2)ppago
from pagos
group by anio, mes
order by 1 desc,2;

select sysdate(), date_add(sysdate(),interval -1 hour)tjtime, 
date_add(sysdate(),interval 1 hour)fltime;

select fecha_pago, 
date_add(fecha_pago, interval 3 month) ma3meses,
date_add(fecha_pago, interval 3 quarter) mas1trimestre,
date_add(fecha_pago, interval 10 year) mas10anios,
date_add(fecha_pago, interval 30 week) mas30semanas,
date_add(fecha_pago, interval 17 day)mas17dias
from pagos;

select date_add('2018-12-31 23:59:59', interval 1 second),
date_add('2018-12-31 23:59:59', interval -1 second),
date_add('2018-12-31 23:59:59', interval 1 second),
date_add('2018-12-31 23:59:59', interval -1 second);

select date_add(sysdate(), interval 15 year),
date_format(
	date_add(sysdate(), interval 15 year),'%W')diamas15anios;
    
select sysdate(), md5(sysdate()),sha1(sysdate());

select sysdate(), md5(concat(user(),sysdate())) t1, 
md5(concat(user(),date_add(sysdate(), interval 30 minute)))t2;

