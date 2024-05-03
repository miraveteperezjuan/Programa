package testing;

import java.util.List;

import modelo.dao.Instituto;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;

public class TestInstitutoDao {
	
	private static Instituto idao; 
	
	static { //esto es un constructor para lo estático. Sirve para arrancar lo estático
		idao = new Instituto();
	}
		
	public static void main (String[] args) { //Esto sirve para probar todos los métodos propios que hemos creado.
		//alta();
		//buscarTodos();
		//buscarUna();
		//eliminar();
		//alta();
		//PersonasTipo();
	}
	
	
	public static void alta() {
		Persona al5 = new Alumno("7898412Q", "Julián Muñóz", "Alcobendas", "685478965", "Primero ESO");
		System.out.println(idao.alta(al5)); //Aceptamos la inclusión de la nueva persona.
		buscarTodos(); //Buscamos a todos con la nueva persona ya incluida
				
	}
	
	public static void buscarTodos() {
		for (Persona persona: idao.buscartodas()) //Recorremos el for para imprimir a todas las personas.
			System.out.println(persona);
   
	}
	
	public static void buscarUna() {
		Persona persona = idao.buscarUna("1781459P"); //Lo buscamos a través de su NIF. 
		if (persona != null) //Si es distinto a null la imprimimos
			System.out.println(persona);
		else
			System.out.println("No existe");
	}
	
	public static void eliminar() {
		Persona persona = idao.buscarUna("8742147F"); //Buscamos a la persona por su NIF
		System.out.println(idao.eliminar(persona)); //Eliminamos a dicha persona.
		buscarTodos(); //Buscamos a todos para ver si se ha procedido de forma correcta al borrado
	}
	
	public static void PersonasTipo() {		
		List<Persona> per = idao.buscarPersonasPorTipo("Profesor"); //Buscamos en la lista a las personas que son profesores
		for (Persona persona: per) { //lo recorremos con un for y lo imprimimos.
			System.out.println(persona);
		}
	}
		
}
