//Crea un programa que pida un número al usuario un número de mes 
//(por ejemplo, el 4) y diga
//cuántos días tiene (por ejemplo, 30). Debes usar una matriz.//

Algoritmo ejercicio_01
	
	Definir mes,n como entero
	
	Dimension mes[12]
	mes[1]<-31  //Enero
	mes[2]<-29  //Febrero
	mes[3]<-31  //Marzo
	mes[4]<-30	//Abril
	mes[5]<-31	//Mayo
	mes[6]<-30	//Junio
	mes[7]<-31	//Julio
	mes[8]<-31	//Agosto
	mes[9]<-30	//Septiembre
	mes[10]<-31	//Octubre
	mes[11]<-30	//Noviembre
	mes[12]<-31	//Diciembre
	
	
	
	
	Escribir "Introduce el número de un mes"
	Leer n
	
	Escribir "El mes ", n, " tiene ", mes[n], " dias"
	
FinAlgoritmo
