package ejecutable;

import java.util.Scanner;

public class Ejercicio03WhileRaro {

	/*
	 * Esto es de la gente que hace C++
	 * Evitar hacer con tomas que esto es muy de pro.
	 */
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int numeroleido = 0, suma = 0, cuantos = 0;
		
		System.out.println ("Introduzca los números:");

		while(true) { //este true significa que el while siempre dará verdadero. 
			//Esto siempre entrará. Mientras esto sea verdadero..esto es para hacer un bucle sin fin.
			numeroleido = leer.nextInt();
			if (numeroleido < 0)
				break; //sale completamente del bucle, Nos hecha fuera.
			
			cuantos++;
			suma+= numeroleido;
		}
	
		System.out.println ("Estadisticas");
		System.out.println ("Suma de numerosleidos: " + suma);
		System.out.println ("Numeros Procesados: " + cuantos);
	}

}
