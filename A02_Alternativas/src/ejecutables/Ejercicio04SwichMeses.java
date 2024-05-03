package ejecutables;

public class Ejercicio04SwichMeses {
	
	public static void main (String[] args) {
		int mes = 12; //Esto es para mostrar el caso que yo quiero
		
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: //se puede hacer de forma alargada o en cascada y funciona igual.
			System.out.println("Mes de 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Mes de 30 días");
			break;
		case 2:
			System.out.println("Mes de 28-29 días");
			break;
		default:
		    System.out.println("Mes incorrecto");
		}
		
	}
}