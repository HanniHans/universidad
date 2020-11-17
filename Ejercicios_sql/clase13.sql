select distinct fecha_pago, now(),
datediff(now(), fecha_pago) as nodias,
format(datediff(now(), fecha_pago)/365,2) as noanios,
format(datediff(now(), fecha_pago)*24,2) as noanios
from pagos
order by 1;

select distinct fecha_pago, last_day(fecha_pago)
from pagos;

select last_day(now()),last_day('2003-02-05'),
last_day('2004-02-05'), last_day('2003-02-35');

select*from pagos
where day(last_day(fecha_pago))=31;

select distinct fecha_pago,
extract(day from fecha_pago) dia,
extract(month from fecha_pago) mes,
extract(year from fecha_pago) anio,
extract(week from fecha_pago) semana,
extract(quarter from fecha_pago) trimestre
from pagos;

select from_days(780500); -- dia que es desde que inicio el calendario

select from_days(780500), to_days('2136-12-08');

select distinct fecha_pago, to_days(fecha_pago)
from pagos;

select distinct fecha_pago, datediff(now(),fecha_pago) dif,
from_days(datediff(now(),fecha_pago)) valordiff,
year(from_days(datediff(now(),fecha_pago))) anios,
month(from_days(datediff(now(),fecha_pago))) mes,
day(from_days(datediff(now(),fecha_pago))) dia
from pagos;

set @mifecha ='1998-09-15';

select distinct 
concat('Tu edad es',
	year(from_days(datediff(now(),@mifecha))), ' años ',
	month(from_days(datediff(now(),@mifecha))), ' meses ',
	day(from_days(datediff(now(),@mifecha))), ' dias '
) edad;

set @fecha = '1997-06-15';

select distinct datediff(@mifecha, @fecha) dis;


set @ffecha ='1995-11-07';

select distinct
if(month(from_days(datediff(now(),@ffecha)))>=12,
	concat('Tu edad es',
		year(from_days(datediff(now(),@ffecha)))+1, ' años ',
		month(from_days(datediff(now(),@ffecha)))-12, ' meses ',
		day(from_days(datediff(now(),@ffecha))), ' dias '
	),
	concat('Tu edad es',
		year(from_days(datediff(now(),@ffecha))), ' años ',
		month(from_days(datediff(now(),@ffecha))), ' meses ',
		day(from_days(datediff(now(),@ffecha))), ' dias '
	)
)fecha;