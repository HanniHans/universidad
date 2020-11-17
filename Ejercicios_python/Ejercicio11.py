def quitaComentarios(archivoEnt, archivoSal):
    archivo = open(archivoEnt, 'r')
    texto = []
    cad = ""
    for linea in archivo:
        for c in linea:
            texto.append(c)
    archivo.close()
    estado = 'z'
    for c in texto:
        if estado == 'z' and c == '/':
            estado = 'a'
        elif estado == 'z' and c != '/':
            cad = cad + c
        elif estado == 'a' and c == '*':
            estado = 'b'
        elif estado == 'a' and c == '/':
            estado = 'd'
        elif estado == 'b' and c == '*':
            estado = 'c'
        elif estado == 'c' and c == '/':
            estado = 'z'
        elif estado == 'c' and c != '/':
            estado = 'b'
        elif estado == 'd' and c == '\n':
            estado = 'z'
            cad = cad + '\n'
    archivo = open(archivoSal, 'w')
    archivo.write(cad)
    archivo.close()
