package ejercicio3;

public class Repartidor extends Empleado {
	private String zona;

	public Repartidor() {

	}

	public Repartidor( String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nZona -> " + zona;
	}


	public  void plus() {
		if(getEdad()<25 && getZona().equalsIgnoreCase("zona 3")) {
			double plus=getPlus()+getSalario();
			
			setSalario(plus);
		}
	}
}
