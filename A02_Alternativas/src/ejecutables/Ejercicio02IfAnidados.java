package ejecutables;

import java.util.Scanner;

public class Ejercicio02IfAnidados {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe dos números:");
		
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		if (num1 > num2)
			System.out.println("Num1 es mayor que Num2");
		//num2++; para incrementarlo en uno
		else if (num1 < num2) //Esto es para meter otra variable. Es otra rama y si va entre parentesis es como el sino si.
		    System.out.println("Num2 es mayor que Num1");
		//num1 += 7; para incrementarlo en siete por ejemplo
		else
			System.out.println("Son iguales");
		//num1++; y si quiero que estas sentencias que estan en anotacion las quiero las tendré que meter entre llaves.
		leer.close();
	}
}

//source. format con click derecho se pone todo bonito