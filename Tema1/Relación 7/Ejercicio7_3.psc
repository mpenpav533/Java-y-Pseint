//7.3: Prepara un programa que divida dos n�meros que introduzca el usuario. 
//Si el segundo n�mero es cero, se le deber� avisar y volver a pedir 
//tantas veces como sea necesario, hasta que introduzca un n�mero 
//distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.
Algoritmo Ejercicio7_3
	Definir n1, n2 Como Entero
	Escribir "Introduzca el dividendo"
	Leer n1
	Escribir " Introduzca el divisor"
	Leer n2
	Mientras n2=0 Hacer
		Escribir "El n�mero introducido es 0 y no se puede dividir por 0"
		Escribir " Introduzca el divisor"
		Leer n2
		
	Fin Mientras
	Escribir " El resultado de la divisi�n es : ", n1/n2

	
FinAlgoritmo
