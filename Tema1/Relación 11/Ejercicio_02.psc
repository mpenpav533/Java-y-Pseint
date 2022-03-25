//Crea un programa que pida su nombre al usuario y lo escriba 
//alternando letras mayúsculas y minúsculas 
//(por ejemplo, "nAcho" se mostraría como "NaChO".

Algoritmo Ejercicio_02
	Escribir "Introduce tu nombre"
	Leer nombre
	
	Para i=1 hasta Longitud(nombre) Hacer
		c=Subcadena(nombre,i,i)
		si i%2=0 Entonces
			Escribir Sin saltar Minusculas(c)
		SiNo
			Escribir Sin Saltar Mayúsculas(c)
		FinSi
		
	FinPara
	Escribir""
	
FinAlgoritmo
