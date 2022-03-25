//7.1: Crea un programa que pida al usuario un código de usuario 
//y una contraseña. Deberá repetirse hasta que el código sea "1"
//y la contraseña sea "1234".

Algoritmo Ejercicio7_1
	Definir clave, codigo Como Entero
	Repetir
		Escribir " Introduce tu codigo de usuario"
		Leer codigo
		Escribir " Dime tu contraseña"
		Leer clave
		si clave<>1234 y codigo<>1
			Escribir "Contraseña y codigo de usuario incorrectos"
		FinSi
		
	Hasta Que clave=1234 y codigo=1
	Escribir " ¡Bienvenido al sistema! "
	
	FinAlgoritmo
