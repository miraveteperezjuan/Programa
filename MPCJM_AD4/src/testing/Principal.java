package testing;

import modelo.javabean.Profesor;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;

public class Principal {

	public static void main(String[] args) {
		
		//Hacemos nuevos objetos de tipo Persona.
		//En herencia a los elementos del padre se le llama poliformico.
		
		Persona prof1 = new Profesor("1774562M", " Antonio López ", "Huesca" , "684532147", "Ciudadanía");
		Persona prof2 = new Profesor("9874121E", " Yago Mateo", "Jaca" , "987451239", "Geografía");
		Persona prof3 = new Profesor("7895412W", " Daniel Bueno ", " Tauste " , "658741257", "Historia");
		Persona prof4 = new Profesor("1278965H", " Julián Alarcón ", "Zaragoza" , "326874158", "Lengua");
		
		System.out.println(prof1.toString());		
		System.out.println(((Profesor)prof1).trabajar());
		
		Persona al1 = new Alumno("1236789E", " Rircado Morales ", "Zaragoza", "789541234", " Segundo ESO");
		Persona al2 = new Alumno("9876543F", "María López ", "Madrid", "654321987", " Tercero ESO");
		Persona al3 = new Alumno("4567891G", " Juan Pérez ", "Barcelona", "987654321", " Primero ESO");
		Persona al4 = new Alumno("2345678H", " Ana Martínez ", "Valencia", "123456789", " Cuarto ESO");

		System.out.println(al1.toString());
		System.out.println(((Alumno)al1).trabajar());
		
		Persona ad1 = new Administrativo("1781459P", " Pablo Zarías ", "Zuera", "748535698", "cobrar y recepcionar avisos");
		Persona ad2 = new Administrativo("8742147F", " Lorena Puertas ", "Huesca", "978412258", "gestion de archivos y mecanografiar partes");
		Persona ad3 = new Administrativo("9862314D", " Mateo David ", "Almudevar", "325789456", "dar de alta y baja las solicitudes");
		Persona ad4 = new Administrativo("1774125W", " Óscar Molina ", "Sabiñánigo", "258746985", "subir notas a la web y recibir sugerencias por parte del alumnado");
		
		System.out.println(ad1.toString()); //toString con toda la información disponible
		System.out.println(((Administrativo)ad1).trabajar()); //Llamamos al método trabajar del Admin1.
		
		System.out.println(al2.llamar(prof4)); //Metodo llamar de Persona. Al2 está llamando a el profesor número 4
		
		System.out.println(((Profesor)prof1).ponerNotas()); //Metodo propio de que el profesor 1 va a poner las notas. Buscamos en la herencia de profesor.
		System.out.println(((Alumno)al1).hacerExamen()) ;//Metodo propio de que el alumno 1 va a hacer el examen. Buscamos en la herencia de Alumno
		System.out.println(((Administrativo)ad1).gestionarMatricula()); //Método propio que el admin 1 va a gestionar matricula. Buscamos en la herencia de Admin.
		
		//Estos últimos tres métodos no los podemos localizar si no se busca dentro, ya que al ser personas, solo tenemos disponibles los de personas al principio.
	}

}
