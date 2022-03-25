Algoritmo sin_titulo
	Definir ctp , cpc , port Como real
	Escribir Sin Saltar "Cantidad total de preguntas: "
	Leer ctp
	Escribir Sin Saltar "Cantidad de preguntas correctas: "
	Leer cpc
	port=(cpc*100)/ctp
	Si port>=90 Entonces
		Escribir "Nivel máximo: ", port , "%"
	SiNo
		Si port>=75 y port<90 Entonces
			Escribir "Nivel Medio: " , port , "%"
		SiNo
			Si port>=50 y port<75 Entonces
				Escribir "Nivel regular: ", port , "%"
			SiNo
				Escribir "Fuera de nivel: " , port , "%"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
