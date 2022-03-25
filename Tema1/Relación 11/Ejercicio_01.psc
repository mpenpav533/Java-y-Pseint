//Crea un programa que pida su nombre al usuario y lo escriba al revés 
//(de la última letra a la primera: a partir de "Nacho" escribiría "ohcaN").
Algoritmo Ejercicio_01
	Escribir "Introduce tu nombre"
	Leer nombre
	
	Para i=Longitud(nombre) hasta 1 Hacer
		Escribir Sin saltar Subcadena(nombre,i,i)
	FinPara
	Escribir""
	
FinAlgoritmo
