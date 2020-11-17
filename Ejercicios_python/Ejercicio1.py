#1.	Haz un programa que pida al usuario por el Shell una letra, imprima si es una vocal o una consonante. Hay que tener en cuenta letras mayúsculas y minúsculas.
letra=input("Escribe una letra: ")
vocalesmi=['a','e','i','o','u']
vocalesMa=['A','E','I','O','U']
consonantemi=['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z']  
consonantema=['B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z']
if (letra in vocalesmi):
    print("Es una vocal miniscula")
elif(letra in consonantemi):
    print("Es una consonante minuscula")
elif(letra in vocalesMa):
    print("Es una vocal mayuscula")
elif(letra in consonantema):
    print("es una consonante mayuscula")
else:
    print("no es una letra")

