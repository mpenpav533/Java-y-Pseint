//Crea una función CantidadDeDivisores, que reciba un número entero 
//y devuelva la cantidad de divisores (por ejemplo, para el número 16, 
//sus divisores son 1, 2, 4, 8, 16, por lo que la respuesta debería ser 5).
Algoritmo Ejercicio_02
	Escribir " Introduce un número"
	Leer numero
	Escribir " La cantidad de divisores de ",numero, " es ", Divisores(numero)
	
FinAlgoritmo

SubAlgoritmo resultado <- Divisores ( num )
    cantidadDivisores <- 0
    Para cont <- 1 Hasta num Hacer
        Si num % cont = 0 Entonces
            cantidadDivisores <- cantidadDivisores + 1
        FinSi
    FinPara
	resultado=cantidadDivisores
    
FinSubAlgoritmo

