delimiter //
drop trigger if exists bi_cursos //
create trigger bi_cursos
before insert on cursos
for each row
begin
	if(left(new.nombre, 5) <> 'curso') then
    set new.nombre = upper(concat('CURSO', new.nombre));
    end if;
    set new.abreviatura = upper(new.abreviatura);
    
end //
delimiter ;

select*from cursos;


select trigger_name, event_manipulation, event_object_table, action_statement, trigger_schema
from information_schema.triggers
where trigger_schema = 'colegio_1709';

insert into cursos values
('C100','escolar 2019-2020', 'cur19-20', '2019-08-01', '2019-01-01'),
('C200','curso escolar 2020-2021', 'cur20-21', '2020-08-01', '2021-01-01');

-- v2 bi_cursos valida fecha final
delimiter //
drop trigger if exists bi_cursos //
create trigger bi_cursos
before insert on cursos
for each row
begin
	if(left(new.nombre, 5) <> 'curso') then
    set new.nombre = upper(concat('CURSO', new.nombre));
    end if;
    set new.abreviatura = upper(new.abreviatura);
    if(new.ffin <= new.finicio) then
    signal sqlstate'45000'
    set message_text= 'Fecha final fuera de rango';
    end if;
end //
delimiter ;

select*from cursos;
insert into cursos values
('C300','escolar 2021-2022', 'cur21-22', '2019-08-01', '2019-01-01'),
('C400','curso escolar 2022-2023', 'cur22-23', '2020-08-01', '2021-01-01');

insert into cursos values
('C300','escolar 2021-2022', 'cur21-22', '2019-08-01', '2019-10-01'),
('C400','curso escolar 2022-2023', 'cur22-23', '2020-08-01', '2021-01-01');

drop table if exists bitacora;
create table bitacora(
id int not null auto_increment primary key,
fecha datetime not null,
usuario varchar(50) not null,
tabla varchar(50)not null,
accion text null
);
select*from bitacora;

delimiter //
drop trigger if exists ad_cursos //
create trigger ad_cursos
after delete on cursos
for each row
begin
    insert into bitacora values(null,sysdate(), user(), 'cursos',
    concat_ws('|', 'eliminacion del curso',old.id_curso,old.nombre,old.abreviatura, old.finicio,
    old.ffin));
end //
delimiter ;
select*from cursos;
delete from cursos where id_curso >='C300';
select*from bitacora;

delimiter //
drop trigger if exists bu_cursos //
create trigger bu_cursos
before update on cursos
for each row
begin
	if(new.ffin <= old.finicio) then
		set new.ffin = date_add(old.finicio, interval 1 year);
    end if;
    insert into bitacora values(null,sysdate(), user(), 'cursos',
    concat_ws('|', 'actuzalizacion del curso',old.id_curso,new.id_curso,old.nombre,new.id_curso,
    old.abreviatura,new.id_curso, old.finicio,new.finicio,
    old.ffin, new.ffin));
end //
delimiter ;

select*from bitacora;
select*from cursos;
update cursos set ffin = '2019-07-01' where id_curso >= 'C100';