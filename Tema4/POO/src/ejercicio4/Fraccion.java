package ejercicio4;

public class Fraccion {
	private int num;
	private int dem;

	// CONSTRUCTOR SIN PARAMETROS
	public Fraccion() {
		super();
		this.num = 0;
		this.dem = 1;
	}

	// CONSTRUCTOR CON UN PARAMETRO
	public Fraccion(int num) {
		this.num = num;
		this.dem = 1;
	}

	// CONSTRUCTOR CON DOS PARAMETROS
	public Fraccion(int num, int dem) {
		super();
		this.num = num;
		if (dem == 0) {
			dem = 1;
		}
		this.dem = dem;
	}

	// GETTERS Y SETTERS
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}

	//METODO HALLAR EL MAXIMO COMUN DIVISOR
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(dem);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	// METODO SIMPLIFICAR
	private void simplificar() {
		int n = mcd(); 
        num = num / n;
        dem = dem / n;
		
	}
	
	//METODO SUMAR FRACCIONES
	public Fraccion suma(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.dem + this.dem * f.num;
        aux.dem = this.dem * f.dem;
        aux.simplificar();                                                    
        return aux;
    }
	
	 //METODO RESTAR FRACCIONES
    public Fraccion resta(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.dem - this.dem * f.num;
        aux.dem = this.dem * f.dem;
        aux.simplificar(); 
        return aux;
    }
   
    //METODO MULTIPLICAR FRACCIONES
    public Fraccion multiplica(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.num;
        aux.dem = this.dem * f.dem;
        aux.simplificar(); 
        return aux;
    }

    //METODO DIVIDIR FRACCIONES
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.dem;
        aux.dem = this.dem * f.num;
        aux.simplificar(); 
        return aux;
    }
    
    @Override
    public String toString() {
        simplificar();
        return num + "/" + dem;
    }    
}
