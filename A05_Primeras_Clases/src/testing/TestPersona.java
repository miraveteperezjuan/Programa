package testing;

import java.util.Scanner;
import javabeans.Persona;

public class TestPersona {

	public static void main(String[] args) { //Esta tiene main porque es para ejecutar.
		//Scanner leer = new Scanner (System.in);
		// los metodos de objetc cualquier clase que haga se heredaran de objet. si yo heredo de una clase, heredo sus atributos y métodos.
		
		Persona p1 = new Persona(); //EN EL MOMENOT QUE METEMOS UN CONTRUCTOR DESAPARECE.
		
		p1.setApellidos("Perez Miravete");
		p1.setComplementoSalario(3_000);
		p1.setIdPersona(300);
		p1.setNombre("Juan");
		p1.setGenero('h');
		p1.setSalario(45_000);
		
		System.out.println(p1.getIdPersona());
		System.out.println(p1.getApellidos());
		System.out.println(p1.nombreCompleto());
		System.out.println(p1.salarioBruMensual(14));
		System.out.println(p1.salarioBruto());
		System.out.println(p1.literalgenero());
		
		Persona p2 = new Persona(200, "Elmo", "Perez Bienzobas", 12000,12000, 'h');
		System.out.println(p2.getIdPersona());
		System.out.println(p2.getApellidos());
		System.out.println(p2.nombreCompleto());
		System.out.println(p2.salarioBruMensual(14));
		System.out.println(p2.salarioBruto());
		System.out.println(p2.literalgenero());//persona() es un metodo. CUALQUIE COSA QUE TERMINE ENTRE PARENTESIS ES UN METODO. EN ESTE CASO ESPECIAL. SIEMPRE VA ASOCIADO AL NEW.
		// A esto se le llama METODO CONSTRUCTOR PORQUE PERMITE A JAVA CREAR UN OBJETO. SI LA CLASE NO TIENE ESTE METODO JAVA TE ASIGNA EL CONSTRUCTUROS IN PARAMENTROS QUE ES CREAR UNA ESTRUCTURA EN MEMORIA
		//CON LOS MISMOS CAMPOS QUE LOS ATRIBUTOS Y LOS VALORES POR DEFECTO.
		
		
		System.out.println(p1.toString()); //esto es para reflejarlo todo de golpe
		System.out.println(p2.toString());
		
		//como se ha puesto privado en la otra, ahora nosotros no tenemos acceso a los datos. Solo veremos los metodos.
		//yo.apellidos= "pérez";
		//yo.complementoSalario = 2345;
		//yo.genero ='h';
		//yo.idPersona = 123;
		//yo.nombre = "juan";
		//yo.salario = 34_000;
		
		
		//set es para meter los datos y get es para que me de lo que tengo hay dentro.
		//El metodo en los java beans se crea con set y las demas palabras en mayusculas.
	}

}
