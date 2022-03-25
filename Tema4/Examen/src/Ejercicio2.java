import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		String marca, matricula, fecha = null, descripcion, nombre, dni;
		double precio;
		int km, opcion;

		Vehiculos vehiculo1 = new Vehiculos();
		
		do {
			System.out.println("\n1. Nuevo Vehículo." + "\n2. Ver matrícula." + "\n3. Ver número de Kilómetros."
					+ "\n4. Actualizar Kilómetros." + "\n5. Ver años de antigüedad." + "\n6. Mostrar propietario"
					+ "\n7. Mostrar descripción." + "\n8. Mostrar precio." + "\n9. Salir.");
			System.out.print("Selecciona una opción: ");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				
				sn.nextLine();
				System.out.print("Marca: ");
				marca = sn.nextLine();
				vehiculo1.setMarca(marca);

				System.out.print("Matricula: ");
				matricula = sn.nextLine();
				if(validMatricula(matricula)) {
					vehiculo1.setMatricula(matricula);
				}else {
					System.out.println("Lo siento la matricula introducida no es correcta.\nVuelve a introducirla.");
					matricula = sn.nextLine();
					while(!validMatricula(matricula)) {
						System.out.println("Lo siento la matricula introducida no es correcta.\nVuelve a introducirla.");
						matricula = sn.nextLine();
					}
					vehiculo1.setMatricula(matricula);
				}
				
				
				System.out.print("Numero de Kilometros: ");
				km = sn.nextInt();

				if (km >= 0) {
					vehiculo1.setNumKm(km);
				}

				sn.nextLine();
				System.out.print("Fecha de matriculacion: ");
				fecha = sn.nextLine();
				int fecha1 = Integer.parseInt(fecha);
				if (fecha1 <= 2022) {
					vehiculo1.setFechaMatriculacion(fecha);
				}

				System.out.print("Descripcion: ");
				descripcion = sn.nextLine();
				vehiculo1.setDescripcion(descripcion);

				
				System.out.print("Precio: ");
				precio = sn.nextDouble();
				vehiculo1.setPrecio(precio);

				sn.nextLine();
				System.out.print("Nombre del propietario: ");
				nombre = sn.nextLine();
				vehiculo1.setNombrePropietario(nombre);

				System.out.print("Dni del propietario: ");
				dni = sn.nextLine();
				if(validDni(dni)) {
					
					vehiculo1.setDniPropietario(dni);
				}else {
					System.out.println("Lo siento el dni introducido no es correcto.\nVuelve a introducirlo.");
					dni = sn.nextLine();
					while(!validDni(dni)) {
						System.out.println("Lo siento el dni introducido no es correcto.\nVuelve a introducirlo.");
						dni = sn.nextLine();
					}
				}
				
				break;
			case 2:
				System.out.print("Matricula: ");
				System.out.println(vehiculo1.getMatricula());
				
				break;
			case 3:
				System.out.println("Numero de kilometros: " + vehiculo1.getNumKm());
				break;
			case 4:
				System.out.println("Inserte el nuevo numero de kilometros del vehiculo.");
				int num = sn.nextInt();
				if (num < vehiculo1.getNumKm()) {

					vehiculo1.setNumKm(num);

				} else if (num > vehiculo1.getNumKm()) {
					System.out.println("El numero introducido es menor.");
				}
				break;
			case 5:
				System.out.println(vehiculo1.getAnios(fecha));
				break;
			case 6:
				System.out.println(
						"Nombre:" + vehiculo1.getNombrePropietario() + "\nDni: " + vehiculo1.getDniPropietario());
				break;

			case 7:
				System.out.println("Descripcion: " + vehiculo1.getDescripcion());
				System.out.println("Numero de matricula: " + vehiculo1.getMatricula());
				System.out.println("Numero de kilometros: " + vehiculo1.getNumKm());

				break;
			case 8:
				System.out.println("Precio: " + vehiculo1.getPrecio());
			}
		} while (opcion != 9);
	}
public static boolean validDni(String dni) {
		
		boolean valido=false;
		char caracter;
		int contD=0, contL=0;
		
		for(int i=0; i <dni.length();i++) {
			caracter=dni.charAt(i);
			if(caracter=='1'||caracter=='2'||caracter=='3'||caracter=='4'||caracter=='5'||caracter=='6'||caracter=='7'||caracter=='8'||caracter=='9'||caracter=='0') {
				contD++;
			}else {
				contL++;
			}
		}
		if(contD==8 &&contL==1) {
			return valido=true;
		}
		return valido;
	}
public static boolean validMatricula(String matricula) {
		
		boolean valido=false;
		
		int contD=0, contL=0;
		
		for(int i=0; i <matricula.length();i++) {
			
			if(matricula.charAt(i)=='1'||matricula.charAt(i)=='2'||matricula.charAt(i)=='3'||matricula.charAt(i)=='4'||matricula.charAt(i)=='5'||matricula.charAt(i)=='6'||matricula.charAt(i)=='7'||matricula.charAt(i)=='8'||matricula.charAt(i)=='9'||matricula.charAt(i)=='0') {
				contD++;
			}else {
				contL++;
			}
			;
		}
		if(contD==5 &&contL==3) {
			return valido=true;
		}
		return valido;
	}

}
