use colegio_1709;
show tables;
select*from  cursos;
update cursos set abreviatura = '2017-2', ffin = sysdate()
where id_curso = 'C015';

update cursos set nombre = lower(nombre);

update cursos set nombre = upper(nombre);

update cursos set abreviatura = case 
	when id_curso = 'C020' then  'S2020-1'
	when id_curso = 'C017' then  'S2018-2'
	when id_curso = 'C015' then  'S2017-2'
	else abreviatura
	end
where id_curso in('C020','C017','C015');

delete from cursos where nombre like '%2018%';
delete from cursos where nombre like '%3018%';
-- delete from cursos;
select*from cursos;

