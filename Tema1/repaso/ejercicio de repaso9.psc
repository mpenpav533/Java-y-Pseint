Algoritmo sin_titulo
	// Introducir un número de cualquier cifra y mostrar la suma de sus cifras.
	Escribir "Ingrese Número : "
    Leer Num
    sw = 0
    Cont = 1
	
    Si Num < 10 Entonces
        Escribir Num
    SiNo
		
		//Captura número divisor
		Mientras sw = 0 Hacer			
			Si Num > (Cont * 10) Entonces
				Cont = Cont * 10
			SiNo
				sw = 1
			Fin Si				
		Fin Mientras	
		
		//Descompone número
		Mientras Num > 10			
			R = Num MOD Cont
			D = (Num - R)/ Cont			
			Suma = Suma + D
			Num = R
			Cont = Cont / 10
		FinMientras		
        Escribir Suma + R		
    Fin Si
FinAlgoritmo
