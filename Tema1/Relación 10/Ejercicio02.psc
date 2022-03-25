//Haz un programa que calcule raíces cuadradas: el usuario introducirá un número
//y se le mostrará su raíz cuadrada. 
//Se repetirá hasta que introduzca el número 0 (para el que no se deberá mostrar su raíz). 
//Si introduce un valor negativo, se deberá mostrar un aviso en vez de intentar calcular su raíz.
		

Algoritmo Ejercicio02
	Definir x Como Real
		Repetir
			Escribir "Introduce un número para calcular su raíz y 0 para salir de la aplicación "
			Leer x
			Si x > 0 Entonces
				Escribir "La raiz de ",x," es ", RAIZ(x)
			SiNo
				Si x == 0 Entonces
					Escribir "Fin de la ejecución"
				SiNo
					Escribir "No se puede hacer la raíz de un nº negativo"
				Fin Si

			Fin Si
			Escribir""
			
		Mientras Que x != 0
FinAlgoritmo
