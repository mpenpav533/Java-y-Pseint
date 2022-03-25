package ejercicio3;

import java.util.Scanner;

public class acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		// CREAMOS EL OBJETO LIBRO1
		Libro libro1 = new Libro("El Quijote", "Cervantes", 1, 0);

		// CREAMOS EL OBJETO LIBRO2 CON EL CONSTRUCTOR POR DEFECTO
		Libro libro2 = new Libro();

		// ASIGNAMOS LOS DATOS POR TECLADO

		System.out.println("Ingresa un libro.");
		System.out.print("Titulo:");
		String titulo = sn.nextLine();
		System.out.print("Autor:");
		String autor = sn.nextLine();
		System.out.print("Numero de ejemplares:");
		int numEjemplares = sn.nextInt();
		System.out.print("Numero de ejemplares prestados: ");
		int numEjemplaresPrestados = sn.nextInt();

		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setNumEjemplares(numEjemplares);
		libro2.setNumEjemplaresPrestador(numEjemplaresPrestados);

		// MOTRAR LOS DATOS DEL LIBRO1
		System.out.println(libro1);

		// PRESTAMO DEL LIBRO1
		System.out.println("Realiza un prestamo del libro uno.");

		
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado corractemente.");

		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo());

		}

		// DEVOLUCION DEL LIBRO1
		System.out.println("Realiza un devolucion del libro uno.");

		
		
		if (libro1.devolucion()) {
			System.out.println("La devolucion se ha realizado corractemente.");

		} else {
			System.out.println("No tienes ejemplares del libro " + libro1.getTitulo());

		}
		// PRESTAMO DEL LIBRO1
		System.out.println("Realiza un prestamo del libro uno.");

		
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado corractemente.");

		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo());

		}
		// PRESTAMO DEL LIBRO1
		System.out.println("Realiza un prestamo del libro uno.");

		
		if (libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado corractemente.");

		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo());

		}
		
		// MOTRAR LOS DATOS DEL LIBRO1
		System.out.println(libro1);
				
		// MOTRAR LOS DATOS DEL LIBRO2
		System.out.println(libro2);
		
		sn.close();
	}

}
