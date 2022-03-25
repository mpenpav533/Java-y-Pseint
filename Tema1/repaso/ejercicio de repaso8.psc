Algoritmo sin_titulo
	//Hacer un programa que permita almacenar los nombres y notas de 5 alumnos, las notas deben
	//estar entre 0 y 10. Mostrar el alumno con la mayor nota media.
	notamayor = 0
    Para num <-1 Hasta 5 Con Paso 1  Hacer
		
        Escribir "Ingrese Nombre ", num , " : "
        Leer NOMBRE
        Escribir "Ingrese Promedio ", num , " : "
        Leer PROMEDIO
		
        Si PROMEDIO >= 0 Y PROMEDIO <= 20 Entonces
            Si notamayor < PROMEDIO Entonces
                notamayor = PROMEDIO				
                nom = NOMBRE
            Fin Si		
        SiNo
            CONT = CONT - 1
        Fin Si		
		
    Fin Para
	
    Escribir "ALUMNO   : ", nom	
    Escribir "PROMEDIO : ", notamayor
FinAlgoritmo
