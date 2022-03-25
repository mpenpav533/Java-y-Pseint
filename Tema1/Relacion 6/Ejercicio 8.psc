//Crea un programa que pida al usuario dos bloques de 10 números cada uno (usando un array de dos
//dimensiones). Después deberá mostrar el mayor dato que se ha introducido en cada uno de esos dos
//bloques.


Algoritmo ejercicio_08
	
	Definir datos, i,j, mayor1, mayor2 como numerico
	
	Dimension datos[2,10]
	
	para i <- 1 hasta 2 Hacer
		Escribir "Introduce los numeros del bloque ", i 
		para j <- 1 hasta 10 Hacer
			Escribir " Introduce  la componente ", j
			Leer datos[i,j] 
		FinPara
	FinPara
	
	//mostrar datos
	para i <- 1 hasta 2 Hacer
		Escribir "Los datos del bloque ", i ," son: " Sin Saltar
		para j <- 1 Hasta 10 Hacer
			Escribir sin saltar datos[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
	//inicio los valores mayores
	mayor1<-datos[0,0]
	mayor2<-datos[1,0]
	
	//calculo los mayores
	
	para i <- 1 hasta 2 hacer
		para j <- 1 hasta 10 Hacer
			si i == 1 entonces
				si datos[i,j] > mayor1 Entonces
					mayor1 <- datos[i,j]
				FinSi
			SiNo
				si datos[i,j] > mayor2 Entonces
					mayor2 <- datos[i,j]
				FinSi
			FinSi
		FinPara
	FinPara

	
	Escribir "El mayor del bloque 1 es: ", mayor1
	Escribir "El mayor del bloque 2 es: ", mayor2
	
FinAlgoritmo
