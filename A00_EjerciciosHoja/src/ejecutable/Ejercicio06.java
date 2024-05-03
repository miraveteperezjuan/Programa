package ejecutable;

import java.util.Scanner;

// Leemos un número y Escribimos si el número es par o es impar(un número es par si el resto de dividirlo por dos es cero)

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num1 = 0, resto = 0;
		
		System.out.println("Introduzca un número");
		num1 = leer.nextInt();
		
// he hecho otra manera de hacer el ejercicio en menos lineas.
		
		if (resto == num1%2) //y aqui dice que si ese numero con MOD 2 da resto igual a 0 es par.
			System.out.println("Es par");
		else
			System.out.println("Es impar");
		
	}

}
