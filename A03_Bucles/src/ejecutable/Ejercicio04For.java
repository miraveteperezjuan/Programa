package ejecutable;

public class Ejercicio04For {
	
	/*
	 * El FOR itera SIEMPRE numeros enteros positivos o negativos. NO ITERA OTRA COSA.
	 * Procesar los números del 1 al 15. Y a sumar los pares.
	 * 
	 * El for está hecho para recorrer un array.
	 */ 
	
	public static void main(String[] args) {
		int sumapares = 0;
		
		for (int i = 1; i <= 10; i++) { //la i se pude pone lo que quieras y lo del 1 es el valor inicial.
			if (i%2 == 0)
				sumapares += i;
			System.out.println ("Suma de pares: " + sumapares);
		}
	}

}
