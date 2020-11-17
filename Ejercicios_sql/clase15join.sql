
select a.clave_alu, ap_paterno, ap_materno, count(*) npagos, sum(pago) tpago
from alumnos a, pagos p
where a.clave_alu=p.clave_alu
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select a.clave_alu, ap_paterno, ap_materno, count(*) npagos, sum(pago) tpago
from alumnos a
join pagos p on (a.clave_alu=p.clave_alu)
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select a.clave_alu, ap_paterno, ap_materno,nombre, count(pago) npagos, ifnull(sum(pago),0) tpago 
-- cuando usemos left o rigth count no debe tener comodin 
from alumnos a
left join pagos p on (a.clave_alu=p.clave_alu)
where p.clave_alu is null
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select a.clave_alu, ap_paterno, ap_materno,nombre, count(pago) npagos, ifnull(sum(pago),0) tpago 
from alumnos a
right join pagos p on (a.clave_alu=p.clave_alu)
where p.clave_alu is null
group by a.clave_alu, ap_paterno, ap_materno,nombre;

select * from pagos where clave_alu = '11040246';

select '99040246', sucursal, ref_numerica, ref_alfanumerica, pago, fecha_pago, origen, fecha_op, id_curso, id
from pagos where clave_alu = '11040246';

insert into pagos
select '99040246', sucursal, ref_numerica, ref_alfanumerica, pago, fecha_pago, origen, fecha_op, id_curso, null
from pagos where clave_alu = '11040246';

select * 
from alumnos a
right join pagos p on (a.clave_alu=p.clave_alu)
where a.clave_alu is null;

