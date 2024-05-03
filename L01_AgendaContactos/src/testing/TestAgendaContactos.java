package testing;

import modelo.dao.AgendaContactosImplList;
import modelo.javabean.Contacto;

public class TestAgendaContactos {
	
	private static AgendaContactosImplList adao;
	
	static{
		adao = new AgendaContactosImplList();
	}
	

	public static void main(String[] args) {
		//buscarTodos();
		//buscarUna();
		//delete();
		//delete2();
		//update();
		//alta();
		//contiene();
		//telefono();
		//email();
		//tresCar();
	}
	
	public static void buscarTodos() {
		for (Contacto con: adao.getLista())
			System.out.println(con);
	}
	
	public static void telefono() {
		System.out.println(adao.buscarTelefono("3235467"));
	}
	
	public static void email() {
		System.out.println(adao.buscarEmail("jaun@eefr.es"));
	}
	
	public static void tresCar() {
		for (Contacto con: adao.buscarPorTresPrimeros("ca"))
			System.out.println(con);
		System.out.println("Terminado");
	}

	public static void alta() {
		Contacto con = new Contacto("Dario", "Perez", "665632", "unir@eefr.es", "Unión S.L");
		System.out.println(adao.altaContacto(con));
		buscarTodos();
	}
	
	public static void update() {
		Contacto con = adao.buscarUno("Piggel");
		if (con != null) {
		con.setApellidos("Guti");
		con.setEmail("cerdo@hotmail.es");
		System.out.println(adao.cambiarContacto(con));
		buscarTodos();
		}else
			System.out.println("Contacto no existe");
	}
	
	public static void delete() {
		System.out.println(adao.eliminarContacto("Piggel"));
		System.out.println(adao.eliminarContacto("Perico"));
		System.out.println(adao.eliminarContacto(adao.buscarUno("Manuel")));
		buscarTodos();
}
}
