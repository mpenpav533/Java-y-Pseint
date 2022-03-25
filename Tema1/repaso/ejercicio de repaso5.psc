Algoritmo sin_titulo
	//Introducir un número de tres cifras y muestra la unidad, decena y la centena
	Escribir "vamos a mostrar la centena, decena y unidad de un numero"
    Escribir "dime numero de 3 cifras : "
    Leer Num
    cen = (num - (num MOD 100))/100
    res = num MOD 100
    dec = (res - (res MOD 10))/10
    uni = res MOD 10
    Escribir "Centena : ", cen
    Escribir "Decena : ", dec
    Escribir "Unidad : ", uni
FinAlgoritmo
