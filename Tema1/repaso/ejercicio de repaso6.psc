Algoritmo kkk
	//Elaborar un pseudocódigo donde se introduzca por teclado un número natural de hasta 2 cifras, si
	//tiene una cifra muestre lo mínimo que le falta para ser un número de 2 cifras; de lo contrario
	//muestre lo mínimo que le falta para ser un número de 3 cifras. Considerar que el usuario introduce
	//números de hasta dos cifras.
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
