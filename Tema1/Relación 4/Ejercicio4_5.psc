//Crea un programa que pida al usuario dos números
//y muestre su división si el segundo no es cero, 
//o un mensaje de aviso en caso contrario.
Algoritmo Ejercicio4_5
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduce el primer número"
	Leer n1
	Escribir "Introduce el segundo número"
	Leer n2
	Si n2==0 Entonces
		Escribir "El segundo número introducido es cero, no se puede realizar la división"
	SiNo
		Escribir "El resultado de dividir ",n1," entre ",n2," es :",n1/n2
	Fin Si
FinAlgoritmo
