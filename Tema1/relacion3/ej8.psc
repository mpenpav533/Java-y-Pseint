Algoritmo sin_titulo
	Definir bt, at, radio Como Real
	Escribir "dame la base y la altura del triangulo"
	Leer bt , at
	areaT<- (bt*at)/2
	Escribir "dame el radio del circulo"
	Leer radio
	areaC<- PI*radio^2
	Escribir " el area del triangulo es " areaT
	Escribir " el area del circulo es " areaC
	Si areaT>areaC Entonces
		Escribir "el triangulo es mayor que el circulo"
	SiNo
		escribir "el circulo es mayor que el triangulo"
	Fin Si
FinAlgoritmo
