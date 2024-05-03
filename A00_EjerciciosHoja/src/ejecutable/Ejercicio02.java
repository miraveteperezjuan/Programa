package ejecutable;

import java.util.Scanner;

public class Ejercicio02 {
	
	/*
	 * Leemos dos números enteros, correspondientes a los lados de un rectángulo y calculamos:
a. El perímetro
b. El área
c. Y la hipotenusa
	 */

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		double num1 = 0, num2 = 0;
		
		System.out.println("Introduzca el primer número");
		num1 = leer.nextDouble();
		
		System.out.println("Introduzca el segundo número");
		num2 = leer.nextDouble();
		
		System.out.println("El perimetro es: " + num1*2 + num2*2);
		System.out.println("El área es: " + num1*num2);
		System.out.println("El perímetro es: " + num1*num1 + num2*num2); //no me se la operacion par que engañarnos.
		
		
	}

}
