package ejecutables;

public class Ejercicio03AlternativaMultiple {

	public static void main(String[] args) {
		int opcion =4; // Esto es para mostrar la opcion que yo quiero
		
		switch(opcion) {
		case 1:
			System.out.println("UNO");
			break; //esta palabra es que una vez que se cumple se para. En la última opción no hce falta poner nada
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		default:
			System.out.println("No has introducido un número correcto");
		}

	}

}
