package testing;

import repaso.Fuerza;

public class TestFuerza {

	public static void main(String[] args) {
		Fuerza f1 = new Fuerza ();
		
		f1.setMasa(1000);
		f1.setAceleracion(90);
		
		System.out.println(f1);
		System.out.println("La fuerza de f1 es: " + f1.fuerzaEjercida()); //esto es el metodo que hemos metido nosotros.

		Fuerza f2 = new Fuerza(200,3);
		System.out.println(f2.getAceleracion());
		System.out.println(f2.fuerzaEjercida());
		
	}

}
