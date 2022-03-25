//Crea un programa que pida su nombre al usuario y diga qué vocales contiene (en orden y sin repetir:
//por ejemplo, para "Aurora" deberá responder "aou").

Algoritmo Ejercicio04
	
	Definir nom, letra como caracter
	Definir conta, conte,conti,conto,contu,i como numerico
	Escribir "Dime tu nombre"
	Leer nom
	nom<-minusculas(nom)
	Para i<-1 Hasta longitud(nom) Hacer
		letra<-subcadena(nom,i,i)
	
		Segun letra Hacer
		"a":
			conta<-conta+1
		"e":
			conte<-conte+1
		"i":
			conti<-conti+1
		"o":
			conto<-conto+1
		"u":
			contu<-contu+1
		Fin Segun
	Fin Para
	
	Escribir "Las vocales en orden y sin repetir son:"
	
	Si conta>0 Entonces
		Escribir Sin Saltar "a"
	FinSi
	Si conte>0 Entonces
		Escribir Sin Saltar "e"
	FinSi
	Si conti>0 Entonces
		Escribir Sin Saltar "i"
	FinSi
	Si conto>0 Entonces
		Escribir Sin Saltar "o"
	FinSi
	Si contu>0 Entonces
		Escribir Sin Saltar "u"
	FinSi
	
	Escribir ""
	
FinAlgoritmo
