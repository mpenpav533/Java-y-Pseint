//Haz un programa que pida al usuario dos números 
//y diga cuántos de ellos son positivos.//
Algoritmo Ejercicio4_4
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduce el primer número"
	Leer n1
	Escribir "Introduce el segundo número"
	Leer n2
	
	
	Si n1==0 y n2==0 Entonces
		Escribir "Los dos números son cero"
	SiNo
		Si n1==0 o n2==0 Entonces
			Escribir "Hay un número que es cero"
		SiNo
			Si n1>0 y n2>0 Entonces
				Escribir "Los dos números son positivos"
			SiNo
				Si n1>0 o n2>0 Entonces
					Escribir "Hay un número positivo"
				
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
