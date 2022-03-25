//Pprepara un programa que calcule el determinante de una matriz de 3x3.

Algoritmo ejercicio_10
	
	Definir datos,i,j,n,det1,det2,suma como numerico
	

	Dimension datos[3,3]
	
	Escribir "Introduzca los datos de una matriz 3x3 "
	Escribir "-------------------------------------- "
	
	//Introducir los datos
	
	para i <- 1 hasta 3 hacer
		para j <- 1 hasta 3 hacer
			Escribir "Introduzca la componente de la fila ",i," y la columna ",j
			Leer datos[i,j] 
		FinPara
	FinPara
	
	//mostrar
	
	Escribir "La matriz introducida es: "
	Escribir "------------------------- "
	para i <- 1 hasta 3 Hacer
		para j <- 1  hasta 3 Hacer
			Escribir Sin Saltar datos[i,j], " "
		FinPara
		Escribir ""
	FinPara
	
	det1<-datos[1,1]*datos[2,2]*datos[3,3]+datos[1,2]*datos[2,3]*datos[3,1]+datos[3,2]*datos[2,1]*datos[1,3]
	det2<-datos[3,1]*datos[2,2]*datos[1,3]+datos[1,2]*datos[2,1]*datos[3,3]+datos[3,2]*datos[2,3]*datos[1,1]
	suma<-det1-det2
	

	
	Escribir "El determinante de tu matriz 3x3 es: ", suma

FinAlgoritmo
