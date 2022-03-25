//7.2: Haz un programa que permita calcular la suma de pares de números.
//Pedirá dos números al usuario y mostrará su suma, 
//volviendo a repetir hasta que ambos números introducidos sean 0. 
//Esta vez deberás usar "Repetir", por lo que tu solución no será igual que la del ejercicio 6.2, que empleaba "Mientras"
Algoritmo Ejercicio7_2
	Definir n1, n2 Como Entero
	
	Repetir
		Escribir " Introduce dos números"
		Leer n1, n2
		si n1<>0 o n2<>0
			Escribir " La suma es : " n1+n2
		FinSi
	Hasta Que n1==0 y n2==0
	
	
FinAlgoritmo
