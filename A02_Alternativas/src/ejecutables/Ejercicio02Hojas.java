package ejecutables;
// TA MAL
import java.util.Scanner;

public class Ejercicio02Hojas {

	public static void main(String[] args) {
		int hora = 0, minuto = 0, segundo = 0;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("¿Qué hora es?");
		hora = leer.nextInt();
		if (hora > 24) {
			System.out.println("No has introducido bien la hora");
		return;
		}
		System.out.println("¿Qué minuto es?");
		minuto = leer.nextInt();
		
		if (minuto > 60) {
			System.out.println("No has introducido bien los minutos");
		return;
		}
		
		System.out.println("¿Qué segundo es?");
		segundo = leer.nextInt();
		
		if (segundo > 60) {
			System.out.println("No has introd1ucido bien los segundos");
		return;
		}
		
		int siguientehora = (hora + 1) % 24;
		int siguientemin = (minuto + 1) % 60;
		int siguienteseg = (segundo + 1) % 60;
		
		if (hora == 23)
			System.out.println("Son las: " + siguientehora + ":" + minuto + ":" + segundo);
		else if (minuto == 59)
			System.out.println("Son las: " + hora + ":" + siguientemin + ":" + segundo);
		else
			System.out.println("Son las: " + hora + ":" + minuto + ":" + siguienteseg);
		
	}

}
