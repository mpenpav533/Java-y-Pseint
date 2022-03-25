Algoritmo sin_titulo
	//realiza un programa que realice la siguiente serie:
	//999999999
	//88888888
	//7777777
	//666666
	//55555
	//4444
	//333
	//22
	//1
	Escribir "vamos a realizar una serie de varios numeros:"
	Para x <- 1 Hasta 9 Con Paso 1  Hacer
        serie = ""
        Para s <- 1 Hasta 10 - x Con Paso 1  Hacer
            serie = serie + " "	+ ConvertirATexto(10 - x)
        Fin Para
        Escribir serie
    Fin Para	
FinAlgoritmo
