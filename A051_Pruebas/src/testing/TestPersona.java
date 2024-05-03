package testing;

import javabeens.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona(); //Creamos una instnacia llamada p1
		Persona p2 = new Persona();
		
		p1.setApellidos("Miravete Pérez");
		p1.setNombre("Juan");
		p1.setIdPersona(100);
		
		p2.setApellidos("Del Corral");
		p2.setNombre("Manuel");
		p2.setIdPersona(200);
		
		System.out.println(p1.getIdPersona()); //for autocomplete this case, use ctrl + space.
		System.out.println(p1.getApellidos());
		System.out.println(p1.getNombre());
		
		System.out.println(p2.toString()); //Esto es para imprimirlo todo de golpe.
		
	
		

	}

}
