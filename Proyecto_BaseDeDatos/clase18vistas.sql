-- VISTAS
-- 
show tables;

create or replace view estudiantes as select * from alumnos;

select*from estudiantes;

desc estudiantes;

show create view estudiantes;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` 
SQL SECURITY DEFINER VIEW `estudiantes` AS select `alumnos`.`clave_alu` AS `clave_alu`,
`alumnos`.`clave_admin` AS `clave_admin`,`alumnos`.`ap_paterno` AS `ap_paterno`,
`alumnos`.`ap_materno` AS `ap_materno`,`alumnos`.`nombre` AS `nombre`,`alumnos`.`sexo` AS `sexo`,
`alumnos`.`curp` AS `curp`,`alumnos`.`peso` AS `peso`,`alumnos`.`estatura` AS `estatura`,
`alumnos`.`direccion` AS `direccion`,`alumnos`.`colonia` AS `colonia`,`alumnos`.`cp` AS `cp`,
`alumnos`.`ciudad` AS `ciudad`,`alumnos`.`id_estado` AS `id_estado`,`alumnos`.`delegacion` AS `delegacion`,
`alumnos`.`telefono` AS `telefono`,`alumnos`.`celular` AS `celular`,`alumnos`.`email` AS `email`,
`alumnos`.`status_alu` AS `status_alu`,`alumnos`.`fedita` AS `fedita` from `alumnos`;


select e.clave_alu, nombre, ap_paterno,ap_materno, sum(pagos) tpagos
from estudiantes e natural join pagos p
group by e.clave_alu;

-- drop view alumnos_datos;
create view alumnos_datos as
select clave_alu matricula, concat_ws(' ', ap_paterno, ap_materno, nombre) as alumno,
if(sexo='M', 'MASCULINO',if(sexo='F','FEMENINO','ND')) AS sexo, curp, ciudad
from alumnos;

select * from alumnos_datos;

select matricula, alumno, sum(pago) tpagos
from alumnos_datos a left join pagos p on (matricula = clave_alu)
group by matricula;

create or replace view hombres as
select * from alumnos where sexo='M';

select * from hombres;

select h.clave_alu, nombre, ap_paterno, ap_materno, sum(pago) tpagos
from hombres h natural left join pagos p
group by h.clave_alu;

select*from hombres;

update alumnos set sexo = 'X' where sexo='M';
update alumnos set sexo = 'M' where sexo='X';

create or replace view alumnos_pagos as
select e.clave_alu, nombre, ap_paterno, ap_materno, sum(pago) tpagos
from estudiantes e natural left join pagos p
group by e.clave_alu;

select * from alumnos_pagos;

drop view estudiantes;

