Algoritmo sin_titulo
	//introducir la fecha de nacimiento y calcular la edad, introducir fecha de nacimiento y fecha actual por teclado
	Definir edad, diact,mesact,añoact Como Entero
	Definir dinac, mesnac,añonac Como Entero
	Escribir "vamos a calcular tu edad con tu fecha de nacimiento y la fecha de hoy"
	Escribir "ingresa la fecha de hoy: "
	Escribir "dia"
	Leer diact
	Escribir "mes"
	Leer mesact
	Escribir "año"
	Leer añoact
	Escribir "ahora ingresa tu fecha de nacimiento"
	Escribir "dia nacimiento"
	Leer dinac
	Escribir "mes de nacimiento"
	Leer mesnac
	Escribir "año de nacimiento"
	Leer añonac
	edad<- añoact-añonac
	Si mesnac>mesact Entonces
		edad=edad-1
	SiNo
		Si mesnac=mesact Entonces
			Si dinac>diact Entonces
				edad=edad-1
			Fin Si
		Fin Si
	Fin Si
	Escribir "tu edad es: ",edad," años"
FinAlgoritmo
