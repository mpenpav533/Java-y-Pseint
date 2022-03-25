package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comercial C1=new Comercial("Marta", 26, 1500, 290);
		Comercial C2=new Comercial("Antonio", 24, 950, 150);
		Comercial C3=new Comercial("Ana", 35, 1900, 450);
		Comercial C4=new Comercial("Paco", 46, 2500, 750);
		Repartidor R1=new Repartidor("Alberto", 24, 950, "Zona 1");
		Repartidor R2=new Repartidor("Inma", 22, 1000, "Zona 2");
		Repartidor R3=new Repartidor("Carla", 23, 1050, "Zona 3");
		Repartidor R4=new Repartidor("Jose", 21, 950, "Zona 3");
		
		C1.plus();
		C2.plus();
		C3.plus();
		C4.plus();
		R1.plus();
		R2.plus();
		R3.plus();
		R4.plus();
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
		System.out.println(C4);
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		System.out.println(R4);
		
	}

}
