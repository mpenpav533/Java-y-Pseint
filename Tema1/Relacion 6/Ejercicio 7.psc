//Crea un programa que prepare un array con 10 datos prefijados, luego pregunte al usuario qué dato
//desea buscar, avise si ese dato no aparece, y que en caso contrario diga cuántas veces se ha
//encontrado

Algoritmo ejercicio_07
	
	Definir i, datos, n, cont como entero

	Dimension datos[10]
	datos[1]<-0
	datos[2]<-1
	datos[3]<-2
	datos[4]<-3
	datos[5]<-4
	datos[6]<-5
	datos[7]<-6
	datos[8]<-6
	datos[9]<-8
	datos[10]<-9
		
	Escribir "¿Que dato deseas buscar? "
	Leer n
	cont<-0
	
	para i<-1 hasta 10 con paso 1 hacer
		
		Si datos[i]==n Entonces
			cont<-cont+1
		Fin Si
		
	FinPara
	
	Si cont>0 Entonces
		Escribir " EL dato se ha encontrado ", cont, " veces"
	SiNo
		Escribir " El dato no se ha encontrado"
	Fin Si
	
	
	
FinAlgoritmo
