//Crea un procedimiento EscribirEspaciado, que reciba como parámetro un texto y 
//lo escriba con un espacio adicional tras cada letra. 
//Por ejemplo, "Hola, tú" se escribiría "H o l a , t ú ".

Algoritmo Ejercicio_04
	Definir cadena Como Caracter
	Escribir " Introduce un texto"
	Leer cadena
	EscribirEspaciado(cadena)
	
FinAlgoritmo
Subproceso EscribirEspaciado(texto)
    
    Para x <- 1 Hasta Longitud(texto) Hacer
        Escribir Sin Saltar Subcadena(texto,x,x), " "
    FinPara
	Escribir ""    
FinSubproceso
