Algoritmo sin_titulo
	//introducir la fecha de nacimiento y calcular la edad, introducir fecha de nacimiento y fecha actual por teclado
	Definir edad, diact,mesact,a�oact Como Entero
	Definir dinac, mesnac,a�onac Como Entero
	Escribir "vamos a calcular tu edad con tu fecha de nacimiento y la fecha de hoy"
	Escribir "ingresa la fecha de hoy: "
	Escribir "dia"
	Leer diact
	Escribir "mes"
	Leer mesact
	Escribir "a�o"
	Leer a�oact
	Escribir "ahora ingresa tu fecha de nacimiento"
	Escribir "dia nacimiento"
	Leer dinac
	Escribir "mes de nacimiento"
	Leer mesnac
	Escribir "a�o de nacimiento"
	Leer a�onac
	edad<- a�oact-a�onac
	Si mesnac>mesact Entonces
		edad=edad-1
	SiNo
		Si mesnac=mesact Entonces
			Si dinac>diact Entonces
				edad=edad-1
			Fin Si
		Fin Si
	Fin Si
	Escribir "tu edad es: ",edad," a�os"
FinAlgoritmo
