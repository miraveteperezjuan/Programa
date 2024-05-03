package ejecutable;

import java.util.Scanner;

public class PruebaString4Swich {
	
	public static void main(String[] args) {
		String opcion = "";
		Scanner leer = new Scanner (System.in);
		opcion = leer.next();
		
		if (opcion.equals("sumar")) //esto tambien vale para los while y demas.
			System.out.println ("Sumando");
		else if (opcion.equals("restar"))
				System.out.println ("Restando");
		
		// Swich para campos de tipo char y string.
		
		switch(opcion){ //lo que hace es poner por dentro. el opcion lleva por dentro el equals.
			case "sumar":
				System.out.println ("Sumando");
				break;
			case "restar":
				System.out.println ("Restando");
				break;
			case "multi":
				System.out.println ("Multi");
				break;
			case "dividir":
				System.out.println ("Dividiendo");
				break;
			default:
			System.out.println ("Opción errorea");
		}
		
		leer.close();
		
	}

}
