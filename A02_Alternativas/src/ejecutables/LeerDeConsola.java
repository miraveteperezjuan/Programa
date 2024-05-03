package ejecutables;

import java.util.Scanner;

public class LeerDeConsola {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = null;
		int numero = leer.nextInt(); //con esto hace que te lean un numero y hace que baje abajo. Lo mismo con bolean, double, caracter...
		double real = leer.nextDouble();
		nombre = leer.next();
	
		
		System.out.println("El número leido es: " + numero);
		System.out.println("El número leido es: " + real);
		System.out.println("Su nombre es: " + nombre);
		
		leer.close();
	}

}