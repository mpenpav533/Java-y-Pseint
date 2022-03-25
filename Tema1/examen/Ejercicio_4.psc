Algoritmo sin_titulo
	Definir x,z Como Entero
	Escribir "Introduce la coordenada de un punto en el plano."
	Leer x , z
	Escribir "Coordenadas: " x, " , ", z
	Si x<>0 y z<>0 Entonces
		Si x>0 y z>0 Entonces
			Escribir "Las coordenadas se ubican en el primer cuadrante."
		SiNo
			Si x<0 y z>0 Entonces
				Escribir "Las coordenadas se ubican en el segundo cuadrante."
			SiNo
				Si x<0 y z<0 Entonces
					Escribir "Las coordenadas se ubican en el tercer cuadrante."
				SiNo
					Escribir "Las coordenadas se ubican en el cuarto cuadrante."
				Fin Si
			Fin Si
		Fin Si
	SiNo
		Escribir "Tienen que ser distintos de cero"
	Fin Si
	
	
	
FinAlgoritmo
