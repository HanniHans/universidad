#4.	Haz un programa que imprima sólo números pares del 1 al 200 con un ciclo for. Un número es par si su residuo entre 2 resulta 0. En Python se usa la sintaxis n % m para conocer el residuo de alguna división.
#Hannia
for i in range(2,201):
    if(i%2==0):
        print(i,end=' ')
