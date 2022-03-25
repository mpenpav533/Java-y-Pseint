package ejercicio1;

public class Directivo extends Empleado {
	
	public Directivo(String nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" -> Directivo";
	}
}
