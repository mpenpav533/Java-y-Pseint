package ejercicio5;

public class Fecha {
	private int dia, mes, a�o;

	public Fecha() {
		super();

	}

	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	// METODO FECHA CORRECTA
	public boolean fechaCorrecta() {
		boolean diaCrt, mesCrt, a�oCrt;
		a�oCrt = a�o > 0;
		mesCrt = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCrt = dia >= 1 && dia <= 29;
			} else {
				diaCrt = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCrt = dia >= 1 && dia <= 30;
			break;
		default:
			diaCrt = dia >= 1 && dia <= 31;
		}
		return diaCrt && mesCrt && a�oCrt;
	}

	// METODO A�O BISIESTO
	private boolean esBisiesto() {
		return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);
	}

	// METODO DIA SIGUIENTE
	public void diaSiguiente(Fecha fe) {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				a�o++;
			}
		}
	}

	@Override
	public String toString() {
		String fechaFinal;
		if (dia < 10 && mes < 10) {
			fechaFinal = "0" + dia + "-" + "0" + mes + "-" + a�o;
		} else if (dia < 10 && mes >= 10) {
			fechaFinal = "0" + dia + "-" + mes + "-" + a�o;
		} else if (dia >= 10 && mes < 10) {
			fechaFinal = dia + "-" + "0" + mes +"-"+ a�o;
		} else {
			fechaFinal = dia + "-" + mes + "-" + a�o;
		}
		return fechaFinal;
	}

}
