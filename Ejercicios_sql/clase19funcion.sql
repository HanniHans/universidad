-- FUNCIONES
delimiter //
drop function if exists saludo //
create function saludo (str varchar(50))
returns varchar(80)
deterministic
begin
declare result  varchar(80) default '';
	set result = concat('BUENOS DIAS ',str);
    return result;
end //
delimiter ;

show function status;

show function status like 'saludo';
show create function saludo;

select saludo('patito23');

select saludo(nombre) from alumnos;

delimiter //
drop function if exists operacion //
create function operacion (val1 decimal(10,2), val2 decimal(10,2), op int)
returns decimal(10,2)
deterministic
begin
declare result  decimal(10,2) default 0;
	case op
		when 1 then set result = val1 + val2;
        when 2 then set result = val1 - val2;
        when 3 then set result = val1 * val2;
        when 4 then set result = val1 / val2;
        else set result = null;
	end case;
    return result;
end //
delimiter ;

select operacion(10,4,1) suma, operacion(10,4,2) resta, operacion(10,4,3) multiplicacion, 
operacion(10,4,4) division, operacion(10,4,5) nada;   

select clave_alu, pago, operacion(pago,1.16,4) pagosiniva, 
operacion(pago,operacion(pago,1.16,4),2)iva
from pagos;

delimiter //
drop function if exists mes_esp //
create function mes_esp(val1 date)
returns varchar(20)
deterministic
begin
declare result  varchar(20) default '';
	case month(val1)
		when 1 then set result = 'Enero';
        when 2 then set result = 'Febrero';
        when 3 then set result = 'Marzo';
        when 4 then set result = 'Abril';
        when 5 then set result = 'Mayo';
        when 6 then set result = 'Junio';
        when 7 then set result = 'Julio';
        when 8 then set result = 'Agosto';
        when 9 then set result = 'Septiembre';
        when 10 then set result = 'Octubre';
        when 11 then set result = 'Noviembre';
        when 12 then set result = 'Diciembre';
        else set result = null;
	end case;
    return result;
end //
delimiter ;

select year(fecha_pago), mes_esp(fecha_pago), sum(pago) tpago, count(pago) npago
from pagos
where fecha_pago > 0
group by year(fecha_pago), mes_esp(fecha_pago)
order by 1;