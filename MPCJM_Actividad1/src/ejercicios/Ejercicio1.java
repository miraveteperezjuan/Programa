package ejercicios;
import java.util.Scanner;

/*
 * @author: Juan Manuel Miravete Pérez del Corral - DAM
 * @version: 1.0
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int numero = 0, media = 0, pares= 0, impares = 0, ceros = 0, suma = 0;
		
		System.out.println("Introduce todos los números que quieras. Si introducces uno negativo, el programa se parará.");
		numero = leer.nextInt();
		
		 while (numero >= 0) {
	            if (numero % 2 == 0 && numero != 0) {
	                    pares++;
	                    suma += numero;
	            }else if (numero == 0) {
	                    	ceros++;
	                    }else {
	    	                impares++;
	    	            } 
	            numero = leer.nextInt();
	        }
		 
		media = suma/pares;

		System.out.println ("Estadisticas:");
		System.out.println ("La media de la suma de todos los números pares, sin contar el cero es de: " + media);
		System.out.println ("El número de impares introduccidos: " + impares);
		System.out.println ("El número de ceros es: " + ceros);
		leer.close();
	}
}