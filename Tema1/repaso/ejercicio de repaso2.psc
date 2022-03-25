Algoritmo sin_titulo
	//introducir un nº de 3 cifras y que compruebe si el nº es capicuo
	Escribir "vamos a comprobar que numero es capicuo o no"
	Escribir "ingrese numero: "
	Leer num
	c1 = (num - (num MOD 100)) / 100
	r1 = num MOD 100
	c2 = (r1 - (r1 MOD 10)) / 10
	r2 = r1 MOD 10
	Si num = ((r2 * 100) + (c2 * 10) + c1) Entonces
		Escribir "numero capicuo"
	SiNo
		Escribir "numero no capicuo"
	Fin Si
FinAlgoritmo
