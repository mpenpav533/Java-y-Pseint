package ejercicio1;

public class Oficial extends Operario {
	public Oficial(String nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" -> Oficial";
	}
}
