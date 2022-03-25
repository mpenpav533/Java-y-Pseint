import java.util.Scanner;

public class Ejercicio3 {

	static int max = 50;
	static Vehiculos[] vehiculo = new Vehiculos[max];
	static int posicion = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);

		String marca, matricula, fecha = null, descripcion, nombre, dni;
		double precio;
		int km, opcion;

		do {
			System.out.println("\n1. Nuevo Vehículo." + "\n2. Listar vehículos." + "\n3. Buscar vehículos."
					+ "\n4. Modificar kms de vehículo." + "\n5. Salir.");
			System.out.print("Selecciona una opción: ");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				sn.nextLine();
				System.out.print("Marca: ");
				marca = sn.nextLine();

				System.out.print("Matricula: ");
				matricula = sn.nextLine();

				System.out.print("Numero de Kilometros: ");
				km = sn.nextInt();

				sn.nextLine();
				System.out.print("Fecha de matriculacion: ");
				fecha = sn.nextLine();
				int fecha1 = Integer.parseInt(fecha);

				System.out.print("Descripcion: ");
				descripcion = sn.nextLine();

				System.out.print("Precio: ");
				precio = sn.nextDouble();

				sn.nextLine();
				System.out.print("Nombre del propietario: ");
				nombre = sn.nextLine();

				System.out.print("Dni del propietario: ");
				dni = sn.nextLine();

				insertarVehiculo(marca, matricula, km, fecha, descripcion, precio, nombre, dni);
				if (insertarVehiculo(marca, matricula, km, fecha, descripcion, precio, nombre, dni) == 0) {
					System.out.println("El vehiculo ha sido insertado correctamente.");

				} else if (insertarVehiculo(marca, matricula, km, fecha, descripcion, precio, nombre, dni) == -1) {
					System.out.println("El concesionario esta lleno");
				} else if (insertarVehiculo(marca, matricula, km, fecha, descripcion, precio, nombre, dni) == -2) {
					System.out.println("La matricula ya existe");
				}

				break;
			case 2:
				System.out.println("\nListado");
				System.out.println("===========");
				listarVehiculo();
				break;
			case 3:
				System.out.println("Busqueda de vehiculo.");
				System.out.print("Matricula: ");
				matricula = sn.nextLine();
				if (buscarVehiculo(matricula) != null) {
					System.out.println(buscarVehiculo(matricula));
				} else {
					System.out.println("No se ha encontrado el vehiculo.");
				}
				break;
			case 4:
				System.out.println("Modificar los kms de vehiculo.");
				System.out.print("Matricula: ");
				matricula = sn.nextLine();

				System.out.print("Numero de Kilometros: ");
				km = sn.nextInt();
				if(actualizaKms(matricula, km)) {
					System.out.println("Se ha modificado correctamente");
				}else {
					System.out.println("No se ha modificado");
				}
			}
		} while (opcion != 5);

	}

	public static int insertarVehiculo(String marca, String matricula, int km, String fecha, String descripcion,
			double precio, String nombre, String dni) {
		int conce = 0;
		if (vehiculo[posicion].getMatricula().equals(matricula)) {
			conce = -2;

		} else {
			do {
				posicion++;
			} while (vehiculo[posicion].getMatricula().equals(matricula));
			if (posicion == max) {
				conce = -1;
			} else {
				vehiculo[posicion].setMarca(marca);
				vehiculo[posicion].setMatricula(matricula);
				vehiculo[posicion].setNumKm(km);
				vehiculo[posicion].setDescripcion(descripcion);
				vehiculo[posicion].setDniPropietario(dni);
				vehiculo[posicion].setFechaMatriculacion(fecha);
				vehiculo[posicion].setPrecio(precio);
				vehiculo[posicion].setNombrePropietario(nombre);
			}
		}

		return conce;

	}

	public static void listarVehiculo() {
		for (int i = 0; i < posicion; i++) {
			System.out.println("Vehiculo " + i);
			System.out.println("Marca: " + vehiculo[i].getMarca() + "\nMatricula:" + vehiculo[i].getMatricula()
					+ "\nNumero de Kilometros:" + vehiculo[i].getNumKm() + "\nFecha de matriculacion:"
					+ vehiculo[i].getFechaMatriculacion() + "\nDescripcion:" + vehiculo[i].getDescripcion()
					+ "\nPrecio: " + vehiculo[i].getPrecio() + "\nNombre Propietario: "
					+ vehiculo[i].getNombrePropietario() + "\nDni propietario: " + vehiculo[i].getDniPropietario());

		}
	}

	public static String buscarVehiculo(String matricula) {
		String transporte = null;
		int busqueda = -1;
		do {
			busqueda++;
		} while (!((vehiculo[busqueda].getMatricula()).equals(matricula)));
		if (busqueda == max) {
			return transporte;
		} else {
			transporte = "Marca: " + vehiculo[busqueda].getMarca() + "\nMatricula:" + vehiculo[busqueda].getMatricula()
					+ "\nNumero de Kilometros:" + vehiculo[busqueda].getNumKm() + "\nFecha de matriculacion:"
					+ vehiculo[busqueda].getFechaMatriculacion() + "\nDescripcion:"
					+ vehiculo[busqueda].getDescripcion() + "\nPrecio: " + vehiculo[busqueda].getPrecio()
					+ "\nNombre Propietario: " + vehiculo[busqueda].getNombrePropietario() + "\nDni propietario: "
					+ vehiculo[busqueda].getDniPropietario();
		}

		return transporte;

	}

	public static boolean actualizaKms(String matricula, int kms) {
		boolean actualiza=false;
		int busqueda = -1;
		do {
			busqueda++;
		} while (!((vehiculo[busqueda].getMatricula()).equals(matricula)));

		vehiculo[busqueda].setNumKm(kms);
		if(vehiculo[busqueda].getNumKm()==kms) {
			actualiza=true;
		}
		return actualiza;

	}
}
