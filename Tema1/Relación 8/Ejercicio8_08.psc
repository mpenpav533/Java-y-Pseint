//8.8: Dibuja un triángulo creciente de asteriscos, del tamaño que indique el usuario. 
//Por ejemplo, si escoge 4, el resultado debería ser:
//****
//***
//**
//*
Algoritmo Ejercicio8_08
	Definir n1, n2, num_asteriscos como entera
	Escribir " Introduce la altura del triángulo"
	Leer num_asteriscos
	
	para n1<-1 hasta num_asteriscos Con Paso 1 Hacer
		
		Para n2<-1 Hasta num_asteriscos Con Paso 1 Hacer
			Escribir Sin Saltar " * "
		Fin Para
		num_asteriscos=num_asteriscos-1
	Escribir ""
fin para

	
FinAlgoritmo
