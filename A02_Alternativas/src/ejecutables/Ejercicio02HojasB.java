package ejecutables;

import java.util.Scanner;

public class Ejercicio02HojasB {

		public static void main(String[] args) {
			
			Scanner leer = new Scanner(System.in);

	        // Solicitar la entrada del usuario
	        System.out.print("Ingrese la hora (0 a 23): ");
	        int horas = leer.nextInt();

	        System.out.print("Ingrese los minutos (0 a 59): ");
	        int minutos = leer.nextInt();

	        System.out.print("Ingrese los segundos (0 a 59): ");
	        int segundos = leer.nextInt();

	        // Validar la entrada del usuario
	        if (horas > 23 || minutos > 59 || segundos > 59) {
	            System.out.println("Entrada inválida");
	            return;
	        }
	        
	        if (segundos < 59) {
	            segundos++;
	        } else {
	            segundos = 0; //SI SEGUNDOS ES MAYOR A 59 ENTONCES SERA 0.

	            if (minutos < 59) {
	                minutos++;
	            } else {
	                minutos = 0;

	                if (horas < 23) {
	                    horas++;
	                } else {
	                    horas = 0; // Volver a medianoche si la hora es 23:59:59
	                }
	            }
	        }
	        System.out.println("Siguiente hora: " + String.format("%02d:%02d:%02d", horas, minutos, segundos));
	    }

}
