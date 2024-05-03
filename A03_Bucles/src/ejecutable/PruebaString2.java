package ejecutable;

import java.util.Scanner;


public class PruebaString2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = null;
		nombre = leer.next(); //si solo tecleo una palabra next. nextline todo lo que he tecleado hasta final de linea
		//el contenido de una clase como Sting..y si yo quiero hacer algo con esa variable se lo digo a java y hago lo que tenga que hacer.
		//los string son inmutables, hago una operacion con string y me devuelve otro string.
		
		if (nombre == "juan")
		System.out.println ("Son iguales");
		else
		System.out.println ("Son distintos");
		
		System.out.println (nombre.toUpperCase());
		System.out.println (nombre);
	
	}

}