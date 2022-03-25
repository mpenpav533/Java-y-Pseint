//Crea un programa que pida una frase al usuario y diga cuántas palabras contiene 
//(pista: puedes contar los espacios, prestando atención en que no estén repetidos).
	
Algoritmo Ejercicio05
Definir frase como caracter
	Definir i,cont como numerico
	
	Escribir "Dame un frase"
	Leer frase
	
	cont <- 1
	
	para i <- 1 hasta Longitud(frase) Hacer
		
		si subcadena(frase,i,i) == " " & Subcadena(frase,i+1,i+1) <> " "   Entonces
			
			cont <- cont + 1
		
		FinSi
		
		
		
	FinPara 
	
	Escribir " Cantidad de palabras: ",cont
	
FinAlgoritmo
