Algoritmo kkk
	//Elaborar un pseudoc�digo donde se introduzca por teclado un n�mero natural de hasta 2 cifras, si
	//tiene una cifra muestre lo m�nimo que le falta para ser un n�mero de 2 cifras; de lo contrario
	//muestre lo m�nimo que le falta para ser un n�mero de 3 cifras. Considerar que el usuario introduce
	//n�meros de hasta dos cifras.
	Escribir "dime un numero "
    Leer num
    Si num > 99 Entonces
        Escribir "error, el numero es mas de dos cifras"
    SiNo		
        Si num < 10 Entonces
            Escribir "le falta ", 10-num ," para 2 cifras"
        SiNo
            Escribir "le falta ", 100-num ," para 3 cifras"
        FinSi		
    FinSi
FinAlgoritmo
