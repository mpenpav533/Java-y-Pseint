Algoritmo sin_titulo
	Escribir "dame tres caracteres"
	Definir n1,n2,n3 Como Caracter
	Leer n1,n2,n3
	Si (n1>n2) y (n1>n3) Entonces
		P=n1
		Si n2>n3 Entonces
			S=n2
			T=n3
		SiNo
			S=n3
			T=n2
		Fin Si
	SiNo
		Si n2>n3 Entonces
			P=n2
			Si n1>n3 Entonces
				S=n1
				T=n3
			SiNo
				S=n3
				T=n1
			Fin Si
		SiNo
			P=n3
			Si n1>n2 Entonces
				S=n1
				T=n2
			SiNo
				S=n2
				T=n1
			Fin Si
		Fin Si
	Fin Si
	Escribir "de mayor a menor es " P "," S "," T
FinAlgoritmo
