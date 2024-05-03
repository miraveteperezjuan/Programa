package modelo.dao;

import java.util.ArrayList;

import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao {
	
	private List<Persona> personas; //Actuamos con Listas en vez de con ArrayList.
	
	public Instituto() { //Constructor que hace que recorra el array con todos los datos que hemos introducido.
		personas = new ArrayList<Persona>();
		cargarDatos();
	}
	
	private void cargarDatos() { //Cargamos los datos. Hacemos los objetos y con el add lo agregamos a cargar los datos.
		
		Persona prof1 = new Profesor("1774562M", " Antonio López ", "Huesca" , "684532147", "Ciudadanía");
		Persona prof2 = new Profesor("9874121E", " Yago Mateo", "Jaca" , "987451239", "Geografía");
		Persona prof3 = new Profesor("7895412W", " Daniel Bueno ", " Tauste " , "658741257", "Historia");
		Persona prof4 = new Profesor("1278965H", " Julián Alarcón ", "Zaragoza" , "326874158", "Lengua");
		
		personas.add(prof1);
		personas.add(prof2);
		personas.add(prof3);
		personas.add(prof4);
		
		
		Persona al1 = new Alumno("1236789E", " Rircado Morales ", "Zaragoza", "789541234", " Segundo ESO");
		Persona al2 = new Alumno("9876543F", "María López ", "Madrid", "654321987", " Tercero ESO");
		Persona al3 = new Alumno("4567891G", " Juan Pérez ", "Barcelona", "987654321", " Primero ESO");
		Persona al4 = new Alumno("2345678H", " Ana Martínez ", "Valencia", "123456789", " Cuarto ESO");

		personas.add(al1);
		personas.add(al2);
		personas.add(al3);
		personas.add(al4);
		
		Persona ad1 = new Administrativo("1781459P", " Pablo Zarías ", "Zuera", "748535698", "cobrar y recepcionar avisos");
		Persona ad2 = new Administrativo("8742147F", " Lorena Puertas ", "Huesca", "978412258", "gestion de archivos y mecanografiar partes");
		Persona ad3 = new Administrativo("9862314D", " Mateo David ", "Almudevar", "325789456", "dar de alta y baja las solicitudes");
		Persona ad4 = new Administrativo("1774125W", " Óscar Molina ", "Sabiñánigo", "258746985", "subir notas a la web y recibir sugerencias por parte del alumnado");
		
		personas.add(ad1);
		personas.add(ad2);
		personas.add(ad3);
		personas.add(ad4);
	}

	@Override
	public boolean alta(Persona persona) { //damos de alta a una persona. Si contiene algo de ella, no podemos, en el otro caso la agregamos a cargarDatos.
		if (personas.contains(persona))
			return false;
		else
			return personas.add(persona);
	}
	

	@Override
	public boolean eliminar(Persona persona) { //eliminar a la persona
		return personas.remove(persona);
	}

	
	@Override
	public Persona buscarUna(String nif) {
	    for (Persona aux : personas) { //recorremos el for en busca de esa persona.
	        if (aux.getNif().equals(nif)) {
	            return aux; // Si encontramos la persona con el NIF dado, la devolvemos
	        }
	    }
	    return null; // Si no se encuentra ninguna persona con el NIF dado, devolvemos null
	}
	
	@Override
	public List<Persona> buscartodas() {
		int ad = 0, pro = 0, al = 0; //inicializamos las variables poniendolas a 0.
        
		//Ejemplo de instanceof cogido de A10_Herencia_Animales_Abstractos
		for (Persona per: personas) { //Eecorro elemento elemento la colección y yo de cada uno veré todo. Estos son los polimorficos.
            if (per instanceof Administrativo) //instanciamos la clase administrativo y lo verificamos
                ad++; //Sumamos cada administrador que recorre el for
            else if (per instanceof Profesor) 
                pro++; //Sumamos cada profesor que recorre el for
            else if (per  instanceof Alumno) 
                al++; //Sumamos cada alumno que recorre el for
        }
		
			//Sacamos por pantalla el contador. Cuando esté en el text.
		 	System.out.println("Administrativos: " + ad);
	        System.out.println("Profesores: " + pro);
	        System.out.println("Alumnos: " + al);
	   
	        return personas;
	}

	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
	    List<Persona> aux = new ArrayList<>();
	    
	    for (Persona per: personas) {
	        if (tipoPersona.equals("Profesor")) { //Comenta si es la persona es igual a profesor 
	        } else if (tipoPersona.equals("Alumno")) { //Comenta si es la persona es igual a alumno
	            aux.add(per); 
	        } else if (tipoPersona.equals("Administrativo")) { //Comenta si es la persona es igual
	            aux.add(per);
	        }
	    }
	    
	    return aux;
	}
}
