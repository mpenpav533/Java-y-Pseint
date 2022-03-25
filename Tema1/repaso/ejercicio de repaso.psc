Algoritmo sin_titulo
	//introducir una fecha y mostar el nº de dias transcurridos desde el inicio de este año ( supones que todos los meses tienen 30 dias)
	Definir total Como Entero
	Escribir "vamos a calcular cuantos dias han transcurrido desde el inicio de este año"
	Escribir "dime la fecha de hoy"
	Escribir "el dia:"
	Leer dia
	Escribir "el mes:"
	Leer mes
	total<- (((Mes - 1) * 30) + Dia)
	Escribir "han transcurrido: ", total, " dias en total"
FinAlgoritmo
