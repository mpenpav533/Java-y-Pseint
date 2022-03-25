//prepara un programa que reserve espacio para dos vectores de
//3 componentes, pida al usuario sus valores y 
//calcule su producto escalar (x1·y1+ x2·y2+x3·y3).

Algoritmo ejercicio_05
	
	Definir vector1,vector2,i,producto como numerico
	
	Dimension vector1[3]
	Dimension vector2[3]
	
	
	//Introduce el primer vector
	Escribir "Introduce el primer vector"
	Escribir "---------------------------"
		para i <- 1 hasta 3 hacer
		Leer vector1[i] 
	FinPara

		
	//Introduce el segundo vector
	Escribir  "Introduce el segundo vector"
	Escribir "---------------------------"
	para i <- 1 hasta 3 hacer
		leer vector2[i] 
	FinPara
	
		//Calculo el producto escalar
	producto<-0
	
	para i <- 1 hasta 3 hacer
		producto<-producto+(vector1[i]*vector2[i])
		
	FinPara
	Escribir " El producto escalar de los dos vectores es: ", producto
	
	
FinAlgoritmo
