package ejercicio5;

public class Fecha {
	private int dia, mes, año;

	public Fecha() {
		super();

	}

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// METODO FECHA CORRECTA
	public boolean fechaCorrecta() {
		boolean diaCrt, mesCrt, añoCrt;
		añoCrt = año > 0;
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
		return diaCrt && mesCrt && añoCrt;
	}

	// METODO AÑO BISIESTO
	private boolean esBisiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	// METODO DIA SIGUIENTE
	public void diaSiguiente(Fecha fe) {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;
			}
		}
	}

	@Override
	public String toString() {
		String fechaFinal;
		if (dia < 10 && mes < 10) {
			fechaFinal = "0" + dia + "-" + "0" + mes + "-" + año;
		} else if (dia < 10 && mes >= 10) {
			fechaFinal = "0" + dia + "-" + mes + "-" + año;
		} else if (dia >= 10 && mes < 10) {
			fechaFinal = dia + "-" + "0" + mes +"-"+ año;
		} else {
			fechaFinal = dia + "-" + mes + "-" + año;
		}
		return fechaFinal;
	}

}
