Algoritmo sin_titulo
	// Introducir un número entero de dos cifras y mostrar su valor en letras
	Escribir "dime un numero de hasta dos cifras "
	Leer Num
	Si Num > 0 Y Num < 100 Entonces
		Si Num > 10 Y Num < 16 Entonces
			Segun Num Hacer
				11: Escribir "ONCE"
				12: Escribir "DOCE"
				13: Escribir "TRECE"
				14: Escribir "CATORCE"
				15: Escribir "QUINCE"
			Fin Segun
		SiNo
			DEC = (Num - (Num MOD 10))/10
			UNI = Num MOD 10
			Segun DEC Hacer
				1: DECENA = "DIEZ"
				2: DECENA = "VEINTE"
				3: DECENA = "TREINTA"
				4: DECENA = "CUARENTA"
				5: DECENA = "CINCUENTA"
				6: DECENA = "SESENTA"
				7: DECENA = "SETENTA"
				8: DECENA = "OCHENTA"
				9: DECENA = "NOVENTA"
			Fin Segun
			Si UNI <> 0 Entonces
				Segun UNI Hacer
					1: UNIDAD = "UNO"
					2: UNIDAD = "DOS"
					3: UNIDAD = "TRES"
					4: UNIDAD = "CUATRO"
					5: UNIDAD = "CINCO"
					6: UNIDAD = "SEIS"
					7: UNIDAD = "SIETE"
					8: UNIDAD = "OCHO"
					9: UNIDAD = "NUEVE"
				Fin Segun
				Si DEC = 1 Entonces
					DECENA = "DIECI"
				FinSi
				Si DEC = 2 Entonces
					DECENA = "VENTI"
				FinSi
				Si DEC > 2 Y DEC < 10 Entonces
					Escribir DECENA " Y " UNIDAD
				SiNo
					Escribir DECENA "" UNIDAD
				FinSi
			SiNo
				Escribir DECENA
			Fin Si
		Fin Si
	SiNo
		Escribir "NÚMERO INCORRECTO !!!..."
	Fin Si
FinAlgoritmo
