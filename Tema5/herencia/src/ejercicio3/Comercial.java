package ejercicio3;

public class Comercial extends Empleado {
	private double comision;

	public Comercial() {

	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);

		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nComision -> " + comision;
	}

	public void plus() {
		if (getEdad() > 30 && getComision() > 200) {
			
			double PlusFinal = getPlus()+getSalario();
			
			setSalario(PlusFinal);
		}
	}
}
