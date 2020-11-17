-- cuantos pagos tienen por mes
select*from pagos;
select fecha_pago, extract(year from fecha_pago) ani, extract(month from fecha_pago) mes, pago from pagos
order by mes;
select distinct 
extract(year from fecha_pago) anio,
-- sum(pago),
sum(if(extract(month from fecha_pago)=1, pago,0)) as 'ENE', 
sum(if(extract(month from fecha_pago)=2, pago,0)) as 'FEB', 
sum(if(extract(month from fecha_pago)=3, pago,0)) as 'MAR', 
sum(if(extract(month from fecha_pago)=4, pago,0)) as 'ABR', 
sum(if(extract(month from fecha_pago)=5, pago,0)) as 'MAY', 
sum(if(extract(month from fecha_pago)=6, pago,0)) as 'JUN', 
sum(if(extract(month from fecha_pago)=7, pago,0)) as 'JUL', 
sum(if(extract(month from fecha_pago)=8, pago,0)) as 'AGO', 
sum(if(extract(month from fecha_pago)=9, pago,0)) as 'SEP', 
sum(if(extract(month from fecha_pago)=10, pago,0)) as 'OCT', 
sum(if(extract(month from fecha_pago)=11, pago,0)) as 'NOV', 
sum(if(extract(month from fecha_pago)=12, pago,0)) as 'DIC' 



from pagos
group by anio;
