Algoritmo sin_titulo
	Escribir "vamos a jugar a piedra,papel o tijeras"
	Definir a,b Como Entero
	a = 0
	b = 0
		Escribir "Jugador 1"
		Escribir "1 = piedra"
		Escribir "2 = papel"
		Escribir "3 tijeras"
		leer a
		si a > 0 y a < 4 Entonces
			Escribir "Jugador 2"
			Escribir "1 = piedra"
			Escribir "2 = papel"
			Escribir "3 tijeras"
			leer b
			si b > 0 y b < 4 Entonces
				si a == 1 y b == 3 Entonces
					Escribir "El ganador es el jugador 1"
				SiNo
					si a == 2 y b == 1 Entonces
						Escribir "El ganador es el jugador 1"
					SiNo
						si a == 3 y b == 2 Entonces
							Escribir "El ganador es el jugador 1"
						FinSi
					FinSi
				FinSi
				
				si b == 1 y a == 3 Entonces
					Escribir "El ganador es el jugador 2"
				SiNo
					si b == 2 y a == 1 Entonces
						Escribir "El ganador es el jugador 2"
					SiNo
						si b == 3 y a == 2 Entonces
							Escribir "El ganador es el jugador 2"
						FinSi
					FinSi
				FinSi
				
				si a == b Entonces
					Escribir "El juego se empata"
				FinSi
			SiNo
				Escribir "Ingresa una opcion correcta"
			FinSi
		SiNo
			Escribir "Ingresa una opcion correcta"
		FinSi
FinAlgoritmo
