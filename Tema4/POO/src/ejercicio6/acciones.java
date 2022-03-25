package ejercicio6;

import java.util.Scanner;

public class acciones {
	final static int max_empleados = 20;
	static Empleado[] empleados = new Empleado[max_empleados];
	static int indice = 0;
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double importe;
		Empleado e;
		leerEmpleado();

		if (numeroDeEmpleados() > 0) {

			// mostrar empleados
			System.out.println("\n\nEmpleados introducidos: ");
			muestraEmpleado();

			importe = leerImporteHorasExtras();

			// asignar el atributo estático pagoPorHoraExtra
			Empleado.setImporteHoraExtra(importe);

			// calcular el empleado que más cobra
			e = empleadoQueMasCobra();
			System.out.println("\n\nEmpleado que más cobra:");
			System.out.println(e);
			System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

			// calcular el empleado que menos cobra
			e = empleadoQueMenosCobra();
			System.out.println("\n\nEmpleado que menos cobra:");
			System.out.println(e);
			System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

			// calcular el empleado que más cobra por horas extra
			e = empleadoQueMasCobraPorHorasExtras();
			System.out.println("\n\nEmpleado que más cobra por horas extras:");
			System.out.println(e);
			System.out.printf("Total horas extras: %.2f €", e.complementoHorasExtras());

			// calcular el empleado que menos cobra por horas extra
			e = empleadoQueMenosCobraPorHorasExtras();
			System.out.println("\n\nEmpleado que menos cobra por horas extras:");
			System.out.println(e);
			System.out.printf("Total horas extras: %.2f €", e.complementoHorasExtras());

			// ordenar por salario de menor a mayor
			ordenarPorSalario();
			System.out.println("\n\nEmpleados ordenados por salario:");
			System.out.println("");
			mostrarEmpleadosYSalarios();

		}
	}

	public static void leerEmpleado() {
		Empleado e;
		String nif;
		String nombre;
		double sueldoBase;
		double horaExtraMes;
		double tipoIrpf;
		boolean casado;
		int numHijos;
		int num;
		do {
			System.out.print("Cuantos empleados son:");
			num = sn.nextInt();
		} while (num < 0 || num > max_empleados);

		for (int i = 1; i <= num; i++) {
			sn.nextLine();
			System.out.println("Empleado " + i);
			System.out.print("Nif: ");
			nif = sn.nextLine();
			System.out.print("Nombre: ");
			nombre = sn.nextLine();
			System.out.print("Sueldo Base: ");
			sueldoBase = sn.nextDouble();
			System.out.print("Horas extra: ");
			horaExtraMes = sn.nextInt();
			System.out.print("Tipo de IRPF: ");
			tipoIrpf = sn.nextDouble();
			System.out.print("Casado (S/N): ");
			String Casado = sn.next();
			if (Casado.equalsIgnoreCase("S")) {
				casado = true;
			} else {
				casado = false;
			}
			System.out.print("Número de hijos: ");
			numHijos = sn.nextInt();

			e = new Empleado(nif);

			e.setNombre(nombre);
			e.setNif(nif);
			e.setSueldoBase(sueldoBase);
			e.setHoraExtraMes(horaExtraMes);
			e.setTipoIrpf(tipoIrpf);
			e.setCasado(casado);
			e.setNumHijos(numHijos);

			empleados[indice] = e;
			indice++;

		}

	}

	public static void muestraEmpleado() {
		for (int i = 0; i < indice; i++) {
			System.out.println(empleados[i]);
		}
	}

	// método para pedir el importe de la hora extra
	public static double leerImporteHorasExtras() {
		double importe;
		System.out.print("Introduce el importe a pagar por cada hora extra: ");
		importe = sn.nextDouble();
		return importe;
	}

	// método que devuelve el número total de empleados
	public static int numeroDeEmpleados() {
		return indice;
	}

	// método que devuelve el empleado que más cobra
	public static Empleado empleadoQueMasCobra() {
		Empleado mayor = empleados[0];
		for (int i = 1; i < indice; i++) {
			if (empleados[i].calcularSueldo() > mayor.calcularSueldo()) {
				mayor = empleados[i];
			}
		}
		return mayor;
	}

	// método que devuelve el empleado que menos cobra
	public static Empleado empleadoQueMenosCobra() {
		Empleado menor = empleados[0];
		for (int i = 1; i < indice; i++) {
			if (empleados[i].calcularSueldo() < menor.calcularSueldo()) {
				menor = empleados[i];
			}
		}
		return menor;
	}

	// método que devuelve el empleado que más cobra por horas extra
	public static Empleado empleadoQueMasCobraPorHorasExtras() {
		Empleado mayor = empleados[0];
		for (int i = 1; i < indice; i++) {
			if (empleados[i].complementoHorasExtras() > mayor.complementoHorasExtras()) {
				mayor = empleados[i];
			}
		}
		return mayor;
	}

	// método que devuelve el empleado que menos cobra por horas extra
	public static Empleado empleadoQueMenosCobraPorHorasExtras() {
		Empleado menor = empleados[0];
		for (int i = 1; i < indice; i++) {
			if (empleados[i].complementoHorasExtras() < menor.complementoHorasExtras()) {
				menor = empleados[i];
			}
		}
		return menor;
	}

	// método para ordenar todos los empleados por su salario de menor a mayor
	public static void ordenarPorSalario() {

		int i, j;
		Empleado aux;
		for (i = 0; i < indice - 1; i++) {
			for (j = 0; j < indice - i - 1; j++) {
				if (empleados[j + 1].calcularSueldo() < empleados[j].calcularSueldo()) {
					aux = empleados[j + 1];
					empleados[j + 1] = empleados[j];
					empleados[j] = aux;
				}
			}
		}
	}

	// método para mostrar los datos de cada empleado junto con su sueldo
	public static void mostrarEmpleadosYSalarios() {
		for (int i = 0; i < indice; i++) {
			System.out.println(empleados[i]);
			System.out.printf("Sueldo: %.2f € %n", empleados[i].calcularSueldo());
		}
	}
}
