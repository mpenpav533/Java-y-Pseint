//12.1: Crea un procedimiento EscribirCentrado, que reciba como parámetro un texto 
//y lo escriba centrado en pantalla (suponiendo una anchura de 80 columnas; 
//pista: deberás escribir 40 - longitud/2 espacios antes del texto).

Algoritmo Ejercicio_01
	EscribirCentrado("María")
	
FinAlgoritmo
Subproceso EscribirCentrado(texto)
    
    Para x <- 1 Hasta 40-Longitud(texto)/2 Hacer
        Escribir Sin Saltar " "
    FinPara
	Escribir texto
	Escribir ""    
FinSubproceso