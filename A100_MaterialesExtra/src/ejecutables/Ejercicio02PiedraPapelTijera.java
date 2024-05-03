package ejecutables;

public class Ejercicio02PiedraPapelTijera {

	public static void main(String[] args) {
		System.out.println("Genera un piedra, papel o tijera");
		
		switch ((int)(Math.random()*3)) { //mucho cuidado de que todos los metodos y estas cosas tienen que ir entre parentetis.
		case 0:
			System.out.println("Piedra");
		break;
		case 1:
			System.out.println("Tijera");
		break;
		case 2:
			System.out.println("Papel");
		break;
		default:
			
		}
		

	}

}
