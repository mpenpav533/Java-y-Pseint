//8.8: Dibuja un tri�ngulo creciente de asteriscos, del tama�o que indique el usuario. 
//Por ejemplo, si escoge 4, el resultado deber�a ser:
//****
//***
//**
//*
Algoritmo Ejercicio8_08
	Definir n1, n2, num_asteriscos como entera
	Escribir " Introduce la altura del tri�ngulo"
	Leer num_asteriscos
	
	para n1<-1 hasta num_asteriscos Con Paso 1 Hacer
		
		Para n2<-1 Hasta num_asteriscos Con Paso 1 Hacer
			Escribir Sin Saltar " * "
		Fin Para
		num_asteriscos=num_asteriscos-1
	Escribir ""
fin para

	
FinAlgoritmo
