cont = 1
limit = 2
cadena = "%s\t%s\t%s\t%s\t%s\n" % ("Nombre", "Nota 1", "Nota 2", "Nota 3", "Promedio")
while (cont <= limit):
	nombre = input("Ingrese el nombre del estudiante \n")
	nota1 = float(input("Ingrese la nota 1 \n"))
	nota2 = float(input("Ingrese la nota 2 \n"))
	nota3 = float(input("Ingrese la nota 3 \n"))
	promedio = float(nota1 + nota2 + nota3) / 3
	cadena = "%s%s\t%.2f\t%.2f\t%.2f\t%.2f\n" % (cadena, nombre, nota1, nota2, nota3, promedio)
	cont = cont + 1
print ("Reporte de Notas\n")
print (cadena)
