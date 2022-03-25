//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" 
//según si el número que se indique como parámetro es par o no lo es.
Algoritmo Ejercicio_06
	Definir num Como Entero
	Escribir " Introduce un número"
	Leer num
	Si EsPar(num) Entonces
		Escribir " Es par"
	SiNo
		Escribir " Es impar"
		
	FinSi
	
FinAlgoritmo
SubAlgoritmo resultado <- EsPar (n )
    Si (n%2=0) Entonces
		resultado=Verdadero
	SiNo
		resultado=Falso
		
	FinSi
    
FinSubAlgoritmo
