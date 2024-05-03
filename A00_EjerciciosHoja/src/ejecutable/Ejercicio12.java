package ejecutable;

import java.util.Scanner;

/*
 * Leer consecutivamente dos números cada vez, hasta que los dos sean -1. Comparar los dos
números leídos e informar cada vez si son iguales, mayor o menor (el primero respecto al
segundo). Al final del proceso informar cuantas veces los números eran iguales, cuantas veces el
primero era mayor del segundo y cuantas veces el primero era menor del segundo número leído.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int num1 = 0, num2 = 0, igual = 0, menor = 0, mayor = 0; 
		
		System.out.println ("Introduzca los números:");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		while (true) {
			num1 = leer.nextInt();
			num2 = leer.nextInt();
		
		if (num1 == -1 && num2 == -1) { //si numero uno y numero dos son -1 pa fuera
                break;
            }
		
		if (num1 == num2)
			igual++;
		else if (num1 > num2)
			mayor++;
		else 
			menor++;
			
		}
		System.out.println ("Han salido iguales: " + igual);
		System.out.println ("Número uno ha sido " + mayor + " mayor");
		System.out.println ("Número uno ha sido " + menor + " menor");
		leer.close();
	}

}
