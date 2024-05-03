package ejecutable;
import java.util.Scanner;

/*
 * Leer un número detrás de otro mientras que el número leído sea distinto de cero. Al final del
proceso mostrar cuantos números válidos he leído, y cuanto suman las cantidades de los números
introducidos, y cual es la media de los números leídos.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
    int numero = 0, validos = 0, suma = 0, media = 0;
    
    System.out.println ("Introduzca los números:");
	numero = leer.nextInt();
	
	while (numero != 0) { //si numero es diferente de 0 entonces es chachi porque todo funciona
		
		validos++; //esto lo que hace es sumar numeros en uno en uno.
		suma += numero; //esto suma las cantidades que he colocado en el while
		media = suma/validos;
		numero = leer.nextInt(); //Esto es para que cuando salga 0 se salga de la app
	}
	
	System.out.println ("Estadisticas:");
	System.out.println ("Números válidos: " + validos);
	System.out.println ("La suma de los numerines es: " + suma);
	System.out.println ("La media es: " + media);
	leer.close();

	}
}

