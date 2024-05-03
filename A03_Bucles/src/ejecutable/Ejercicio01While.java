package ejecutable;

import java.util.Scanner;

/*
 * contar y sumar los números introduccido por teclado hasta sacar un número negativo.
 * 
 * Para acumular en java sería llevar el mas al principio el igual con el y que los suma se queda en uno. En el psein es suma=suma + numeroleido.
 * Para el tema del cuantos es cuantos++ para sumar uno. o tambien se puede poner cuantos+ =1 o cuantos = cuantos + 1 pero es la forma mas informal.
 * 
 * Si yo quiero ingresar dinero seria saldo+= cantidad y si quiero sacar sería saldo-= cantidad.
 * para disminuir o aumentar en 1 en 1 sería ++ o -- y si quiero hacer aumento en 2 seria cuantos =2
 * 
 */

public class Ejercicio01While {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int numeroleido = 0, suma = 0, cuantos = 0;
		
		System.out.println ("Introduzca los números:");
		numeroleido = leer.nextInt();
		
		while (numeroleido >= 0) {
			// tratamiento del numeroleido
			suma += numeroleido; // ESTO ES PARA SUMAR
			cuantos++;
			
			numeroleido = leer.nextInt();
		}
		
		
		System.out.println ("Estadisticas");
		System.out.println ("Suma de numerosleidos: " + suma);
		System.out.println ("Numeros Procesados: " + cuantos);
		
	}

}
