package ejercicio1;

public class Cuenta {
	private String NombreCliente;
	private String NumCuenta;
	private double TipoInteres;
	private double Saldo;

	// Constructor con todos los parametros
	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		super();
		this.NombreCliente = nombreCliente;
		this.NumCuenta = numCuenta;
		this.TipoInteres = tipoInteres;
		this.Saldo = saldo;
	}

	// Constructor por defecto
	public Cuenta() {

	}

	//CONSTRUCTOR DE COPIA
	public Cuenta(Cuenta copia) {
		NombreCliente = copia.NombreCliente;
		NumCuenta = copia.NumCuenta;
		Saldo = copia.Saldo;
		TipoInteres = copia.TipoInteres;
	}

	// getter
	public String getNombre_Cliente() {
		return this.NombreCliente;
	}

	// setter
	public void setNombre_Cliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	// getter
	public String getNum_Cuenta() {
		return NumCuenta;
	}

	// setter
	public void setNum_Cuenta(String numCuenta) {
		NumCuenta = numCuenta;
	}

	// getter
	public double getTipo_Interes() {
		return TipoInteres;
	}

	// setter
	public void setTipo_Interes(double tipoInteres) {
		TipoInteres = tipoInteres;
	}

	// getter
	public double getSaldo() {
		return Saldo;
	}

	// setter
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	// METODO INGRESO
	public boolean ingreso(double cantidad) {
		if (cantidad >= 0) {
			Saldo = Saldo + cantidad;
			return true;
		} else {
			return false;
		}
	}

	//METODO REINTEGRO
	public boolean reintegro(double cantidad) {
		if (Saldo > cantidad) {
			if (cantidad >= 0) {
				Saldo = Saldo - cantidad;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	//METODO TRANFERENCIA
	public boolean transferencia(Cuenta cuentaDestino, double importe) {
		if (Saldo > importe) {
			if (importe >= 0) {
				reintegro(importe);
				cuentaDestino.ingreso(importe);
				return true;
			}
		}
		return false;

	}
}
