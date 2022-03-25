Algoritmo sin_titulo
	Definir num, cont_neg,cont_cero,suma_neg,suma_pos Como Entero
	Para x=1 Hasta 10 Con Paso 1 Hacer
		Escribir "dime un numero"
		Leer num
		Si num==0 Entonces
			cont_cero=cont_cero+1
		SiNo
			Si num>0 Entonces
				suma_pos=suma_pos+num
			SiNo
				suma_neg=suma_neg+num
				cont_neg=cont_neg+1
			Fin Si
		Fin Si
	Fin Para
	
	Escribir "la suma de los positivos es: " suma_pos
	Si cont_neg<>0 Entonces
		Escribir "la media de los numeros negativos es: ", suma_neg/cont_neg
	SiNo
		Escribir "no se ha introducido ningun numero negativo"
	Fin Si
	Escribir "la cantidad de ceros es: " , cont_cero
FinAlgoritmo
