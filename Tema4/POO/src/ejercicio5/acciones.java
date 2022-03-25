package ejercicio5;

import java.util.Scanner;

public class acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int d, m, a;

		System.out.println("Introduce una fecha:");

		System.out.print("Dia: ");
		d = sn.nextInt();

		System.out.print("Mes: ");
		m = sn.nextInt();

		System.out.print("Año: ");
		a = sn.nextInt();

		Fecha fecha = new Fecha(d, m, a);

		if (fecha.fechaCorrecta()) {
			System.out.print("Fecha introducida: ");
			System.out.println(fecha);

			System.out.println("Mostramos los siguientes 10 dias.");

			for (int i = 0; i < 10; i++) {
				fecha.diaSiguiente(fecha);
				System.out.println(fecha);
			}
		} else {
			System.out.print("La fecha intrducida no es valida.");
		}

		for (int i = 0; i < 10; i++) {

		}
		sn.close();
	}

}
