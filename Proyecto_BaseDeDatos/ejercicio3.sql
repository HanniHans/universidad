-- listado de todos los alumnos que no tengan un email valido
-- Juan José Rios Lopez
-- jrios_lopezz@patito23.com patio24 si es mujer


select nombre, ap_paterno, ap_materno, email, lower(concat(left(nombre,1),replace(ap_paterno, ' ', '_'),right(ap_materno,1),
if(sexo='F', '@patito24.com', '@patito23.com'))) -- lower(concat(left(nombre,1),replace(ap_paterno, ' ', '_'),right(ap_materno,1)))
from alumnos
where locate('@',email)=0;