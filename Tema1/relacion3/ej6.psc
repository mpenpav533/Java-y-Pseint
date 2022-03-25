Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "dame un numero del 0 al 9999"
	Leer num
	Si num>=1000 Entonces
		Escribir "tiene cuatro cifras"
	SiNo
		Si num>=100 Entonces
			Escribir "tiene tres cifras"
		SiNo
			Si num>=10 Entonces
				Escribir "tiene dos cifras"
			SiNo
				Escribir "tiene una cifra"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
