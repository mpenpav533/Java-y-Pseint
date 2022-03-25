//7.3: Prepara un programa que divida dos números que introduzca el usuario. 
//Si el segundo número es cero, se le deberá avisar y volver a pedir 
//tantas veces como sea necesario, hasta que introduzca un número 
//distinto de cero, momento en que se calculará y mostrará el resultado de la división.
Algoritmo Ejercicio7_3
	Definir n1, n2 Como Entero
	Escribir "Introduzca el dividendo"
	Leer n1
	Escribir " Introduzca el divisor"
	Leer n2
	Mientras n2=0 Hacer
		Escribir "El número introducido es 0 y no se puede dividir por 0"
		Escribir " Introduzca el divisor"
		Leer n2
		
	Fin Mientras
	Escribir " El resultado de la división es : ", n1/n2

	
FinAlgoritmo
