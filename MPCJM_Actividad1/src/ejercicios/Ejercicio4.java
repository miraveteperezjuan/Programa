package ejercicios;
import java.util.Scanner;

/*
 * @author: Juan Manuel Miravete Pérez del Corral - DAM
 * @version: 1.0
 * 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner (System.in);
		int mayores = 0, menores = 0, suma = 0;
		double media = 0;
	
		int [] edades = new int [10];
		
		System.out.print("Introduce la edad de 10 personas:");
		
		for (int i = 0; i < edades.length; i++) {
			suma += edades [i];
			if (edades [i] >= 18) {
				mayores++;
			}else
				menores++;
		}
		
		media = suma/edades.length;
		
		System.out.println("Resultados:");
		System.out.println("Número de mayores de edad: " + mayores);
	    System.out.println("Número de menores de edad: " + menores);
	    System.out.println("Media de edades: " + media);
		leer.close();

	}
}