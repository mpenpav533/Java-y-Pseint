//7.1: Crea un programa que pida al usuario un c�digo de usuario 
//y una contrase�a. Deber� repetirse hasta que el c�digo sea "1"
//y la contrase�a sea "1234".

Algoritmo Ejercicio7_1
	Definir clave, codigo Como Entero
	Repetir
		Escribir " Introduce tu codigo de usuario"
		Leer codigo
		Escribir " Dime tu contrase�a"
		Leer clave
		si clave<>1234 y codigo<>1
			Escribir "Contrase�a y codigo de usuario incorrectos"
		FinSi
		
	Hasta Que clave=1234 y codigo=1
	Escribir " �Bienvenido al sistema! "
	
	FinAlgoritmo
