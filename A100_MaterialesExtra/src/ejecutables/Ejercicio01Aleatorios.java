package ejecutables;

public class Ejercicio01Aleatorios {
	
	public static void main(String[] args) {
		
		System.out.println("Dame 10 números aleatorios:\n"); //lo del n este es un salto de linea.
		
		for (int i = 1; i < 20; i++) {
			System.out.println((int)(Math.random()* 10) + 1); //10 numeros aleatorios enteros que sean del 1 al 10
		}// se pone el +1 por el tema de que siempre ira de 1 a 9.
		
	}

}
