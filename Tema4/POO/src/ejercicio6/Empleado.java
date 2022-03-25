package ejercicio6;

public class Empleado {
	private String nif;
	private String nombre;
	private double sueldoBase;
	private double horaExtraMes;
	private double tipoIrpf;
	private boolean casado;
	private int numHijos;
	private static double importeHoraExtra;

	public Empleado() {
		super();
	}

	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getHoraExtraMes() {
		return horaExtraMes;
	}

	public void setHoraExtraMes(double horaExtraMes) {
		this.horaExtraMes = horaExtraMes;
	}

	public double getTipoIrpf() {
		return tipoIrpf;
	}

	public void setTipoIrpf(double tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	public double complementoHorasExtras() {
		double complemento = importeHoraExtra * horaExtraMes;
		return complemento;
	}

	public double sueldoBruto() {
		double bruto = sueldoBase + complementoHorasExtras();
		return bruto;
	}

	public double calcularRetencionIrpf() {
		double tipo = tipoIrpf;
		if (casado == true) {
			tipo = tipo - 2; // 2 puntos menos si está casado
		}
		tipo = tipo - numHijos; // un punto menos por cada hijo
		if (tipo < 0) {
			tipo = 0;
		}
		return sueldoBruto() * tipo / 100;
	}

	public double calcularSueldo() {
		return sueldoBruto() - calcularRetencionIrpf();
	}

	@Override
	public String toString() {
		String Casado;
		if (casado == true) {
			Casado = "Si";
		} else {
			Casado = "No";
		}
		return nif + nombre + "\n Sueldo Base:" + sueldoBase + "\n Horas Extras:" + horaExtraMes + "\n Tipo Irpf:"
				+ tipoIrpf + "\n Casado=" + Casado + "\n Numero de Hijos:" + numHijos;
	}

}
