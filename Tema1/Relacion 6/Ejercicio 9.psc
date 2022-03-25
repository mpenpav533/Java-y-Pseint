//Si has estudiado álgebra matricial, haz un programa que calcule el determinante de una matriz de
//2x2, a partir de datos que introduzca el usuario.

Algoritmo ejercicio_pagina_matricesEn0_9
	
	Definir matriz, i,j,n, calc1, calc2 como numerico
	Dimension matriz[2,2]
	
	Escribir "Introduce la matriz 2x2"
	Escribir " --------------------------"
	
	//Introducir los numeros matriz 2x2
	para i <- 1 hasta 2 hacer
		para j <- 1 hasta 2 Hacer
			Escribir "Introduzca la componente de la fila ",i," y la columna ",j
			Leer matriz[i,j]
		FinPara
	FinPara
	
	Escribir " La matriz introducida es: "
	Escribir " --------------------------"
	
	//Mostrar matriz 2x2
	para i <- 1 hasta 2 hacer
		para j <- 1 hasta 2 hacer 
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
	//calcular det
	calc1 <- 1
	calc2 <- 1
	
	para i <- 1 hasta 2 Hacer
		para j <- 1 hasta 2 Hacer
			si i == j entonces
				calc1 <- calc1 * matriz[i,j]
			SiNo
				calc2 <- calc2 * matriz[i,j]
			FinSi
		FinPara
	FinPara
	
	Escribir "El determinante de la matriz es: ", calc1 - calc2
FinAlgoritmo
