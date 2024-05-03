package testing;

import modelo.dao.AgendaContactosImplList;
import modelo.javabean.Contacto;

public class TestAgenda {

	public static void main(String[] args) {
		AgendaContactosImplList miagenda = new AgendaContactosImplList();
		
		System.out.println(miagenda.getNombreAgenda());
		for (Contacto con: miagenda.getLista()) 
			System.out.println(con);
		
		Contacto con1 = miagenda.buscarUno("Juan");
		
		if (con1 != null)
			System.out.println(con1);
		else
			System.out.println("Este contacto no existe");
		
	}

}
