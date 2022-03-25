//Crea un programa que reserve espacio para dos vectores de 3
//componentes, pida al usuario sus valores y calcule la suma de ambos vectores (su primera
//componente será x1+y1, la segunda será x2+y2 y así sucesivamente).

Algoritmo ejercicio_04
	
	Definir vector1,vector2,i,suma como numerico
	
	Dimension vector1[3]
	Dimension vector2[3]
	Dimension suma[3]
	
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
	
		Leer vector2[i]
		
	FinPara
	
	//Sumo los dos vectores y los muestro la suma
	Escribir  " La suma de los dos vectores es: "
	para i <- 1 hasta 3 hacer
		suma[i]<-vector1[i]+vector2[i]
		Escribir  suma[i]
		
	FinPara

	
	
FinAlgoritmo
