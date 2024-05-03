package ejecutable;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Leemos por consola dos números enteros y calculamos y mostramos por la consola:
a. La suma
b. La resta
c. El producto
d. La división
e. El resto de su división
	 */
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num1 = 0, num2 = 0;
		
		System.out.println("Introduzca el primer número");
		num1 = leer.nextInt();
		
		System.out.println("Introduzca el segundo número");
		num2 = leer.nextInt();
		
		String opcion = null;
		System.out.println("¿Qué quieres operar?");
		opcion = leer.next();
		
		int suma = num1 + num2;
		int restar = num1 - num2;
		int multi = num1 * num2;
		double dividir = num1 / num2;
		int resto = num1 % num2;
		
		
		switch(opcion){ //lo que hace es poner por dentro. el opcion lleva por dentro el equals.
		case "sumar":
			System.out.println ("La suma es: " + suma);
			break;
		case "restar":
			System.out.println ("La resta es: " + restar);
			break;
		case "multiplicar": 
			System.out.println ("La multi es: " + multi);
			break;
		case "dividir":
			System.out.println ("La división es: " + dividir);
			break;
		case "resto":
			System.out.println ("El resto es de la división es: " + resto);
			break;
		default:
		System.out.println ("Opción errorea");
	}
		leer.close();
	}

}
