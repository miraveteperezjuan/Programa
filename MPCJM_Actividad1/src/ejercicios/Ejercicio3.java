package ejercicios;
import java.util.Scanner;

/*
 * @author: Juan Manuel Miravete Pérez del Corral - DAM
 * @version: 1.0
 * 
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		double radio = 0, altura = 0, resultado = 0;
		char opcion;
		
		System.out.println("Introduce el radio:");
		radio = leer.nextDouble();
		
		System.out.println("Introduce la altura:");
		altura = leer.nextDouble();
		
		System.out.println("Pulsa la letra 'a' si quieres calcular el área o pulsa 'v' si quieres calcular el volumen:");
		opcion = leer.next().charAt(0);
		
		resultado = calculoCilindro(radio, altura, opcion);
		
		  if (opcion == 'a') {
	            System.out.println("El área del cilindro es de: " + resultado);
	        } else if (opcion == 'v') { //tambien se podria hacer con el opcion.equals("v")
	            System.out.println("El volumen del cilindro es de: " + resultado);
	        } else {
	            System.out.println("Opción no válida.");
	        
		leer.close();
	}
	}
	public static double calculoCilindro(double radio, double altura, char opcion) {
		double resultado = 0;
		
		if (opcion == 'a') {
            resultado = 2 * Math.PI * radio * (radio + altura);
        } else if (opcion == 'v') {
            resultado = Math.PI * Math.pow(radio, 2) * altura;
        }
		
		return resultado;
	
	      }	
	}
