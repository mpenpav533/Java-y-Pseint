Algoritmo sin_titulo
	Definir sueldo, anti, aumento Como Real
	Escribir Sin Saltar "el sueldo del operario es: "
	Leer sueldo
	Escribir Sin Saltar "Los años de antigüedad es: "
	Leer anti
	Si sueldo<500 y anti>=10 Entonces
		aumento=sueldo*0.2
		sueldo=sueldo+aumento
		Escribir sueldo
	SiNo
		Si sueldo<500 y anti<10 Entonces
			aumento=sueldo*0.05
			sueldo=sueldo+aumento
			Escribir sueldo
		SiNo
			Escribir sueldo
		Fin Si
	Fin Si
FinAlgoritmo
