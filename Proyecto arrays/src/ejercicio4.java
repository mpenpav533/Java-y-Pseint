/*Define tres arrays de 20 n�meros enteros cada una, con nombres numero, cuadrado y cubo.
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se
deben almacenar los cubos de los valores que hay en numero. A continuaci�n, muestra el
contenido de los tres arrays dispuesto en tres columnas.*/
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero=new int[20];
		int[] cuadrado=new int[20];
		int[] cubo=new int[20];
		int i;
		int j;
		int k;
		 for(i=0;i<=19;i++) {
			 numero[i]=(int)(Math.random()*100);
			
			 
		 }
		 for(j=0;j<=19;j++) {
			 cuadrado[j]=numero[j]*numero[j];
			 
		 }
		for(k=0;k<=19;k++) {
			cubo[k]=cuadrado[k]*numero[k];
		}
		for(int p=0;p<=19;p++) {
			System.out.println(numero[p]+" "+cuadrado[p]+" "+cubo[p]);
		}

	}

}
