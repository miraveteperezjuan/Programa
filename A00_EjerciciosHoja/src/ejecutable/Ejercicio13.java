package ejecutable;

/*
 * Leer números del 100 a 1. Escribir cada número leído. Al final del proceso decir cuántos números
he leído, cuantos son múltiplos de dos y cuantos son múltiplos de 3.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int leidos = 0, multi2 = 0, multi3 = 0;
		
		for (int i = 100; i >= 1; i--) { //la i se pude pone lo que quieras y lo del 1 es el valor inicial.
			System.out.println (i); //para que la cadena de numeros salga
			leidos++; //suma de uno en uno los numeros leidos
			
			if (i%2 == 0) { //calcular multi2
				multi2++;
			}
			if (i%3 == 0) { //calcular multi3
				multi3++;
			}
		}
		
		System.out.println ("Numeros leidos: " + leidos);
		System.out.println ("Son múltiplos de 2: " + multi2);
		System.out.println ("Son múltiplos de 3: " + multi3);
		
	}

}
