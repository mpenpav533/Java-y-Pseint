//Crea un programa que pida dos número enteros al usuario y diga si alguno de ellos es múltiplo del otro. 
//Crea una función EsMultiplo que te ayude a que el proceso principal sea legible.
Algoritmo Ejercicio_03
	Definir n1, n2 Como Entero
	Escribir " Introduce el primer número"
	Leer n1
	Escribir " Introduce el segundo número"
	Leer n2
	Si EsMultiplo(n1,n2) Entonces
		Escribir " Alguno de ellos es múltiplo"
	FinSi
	
FinAlgoritmo
SubAlgoritmo resultado <- EsMultiplo ( num1,num2 )
    Si (num1%num2)=0 o (um2%num1)=0 Entonces
		resultado=Verdadero
		
	FinSi
    
FinSubAlgoritmo
