//Haz un programa que pida al usuario 5 datos, los guarde en una matriz y 
//luego muestre su media (la
//suma de los 5 datos, dividida entre 5).

Algoritmo ejercicio_02
	
	Definir suma,i como numerico
	
	Dimension datos[5]
	
	Escribir "Introduce 5 numeros para calcular su media."
	
	para i <- 1 hasta 5 hacer
		
		Escribir "Introduce el número ", i
		Leer datos[i] 
		
	FinPara
	
	suma <- 0
	
	para i <- 1 hasta 5 hacer
		suma <- suma + datos[i]
	FinPara
	
	Escribir "La media es: ", suma/5
	
FinAlgoritmo
