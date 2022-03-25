Algoritmo sin_titulo
	Definir nota Como Real
	Escribir "Dame la nota"
	Leer nota
	Si nota>=0 y nota<5 Entonces
		Escribir "el alumno tiene ", nota, " es insuficiente"
	SiNo
		Si nota>=5 y nota<6 Entonces
			Escribir "el alumno tiene ", nota," es suficiente"
		SiNo
			Si nota>=6 y nota<7 Entonces
				Escribir "el alumno tiene " , nota, " es bien"
			SiNo
				Si nota>=7 y nota<9 Entonces
					Escribir "el alumno tiene ", nota," el notable"
				SiNo
					Si nota>=9 y nota<=10 Entonces
						Escribir " el alumno tiene ", nota, " es sobresaliente"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
