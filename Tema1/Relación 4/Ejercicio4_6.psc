//Prepara un programa que pida al usuario tres números y 
//diga cuál es el mayor de los tres.
Algoritmo Ejercicio4_6
	Definir n1 Como Real
	Definir n2 Como Real
	Definir n3 Como Real
	
	Escribir "Introduce el primer número"
	Leer n1
	Escribir "Introduce el segundo número"
	Leer n2
	Escribir "Introduce el segundo número"
	Leer n3
	Si n1>=n2 y n1>=n3 Entonces
		Escribir "El número ", n1, " es el mayor de los tres números"
	SiNo
		Si n2>=n1 y n2>=n3 Entonces
			Escribir "El número ", n2, " es el mayor de los tres números"
		SiNo
			Escribir "El número ", n3, " es el mayor de los tres números"
		Fin Si
	Fin Si
	
FinAlgoritmo
