package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AgendaContactosImplList implements GestionAgendaDao{ //implementar es poner contenido al metodo.
	// se le da a añadir metodos no implementados cuando este rojo por encima.
	
	private String nombreAgenda;
	private ArrayList<Contacto> lista;
	
	public AgendaContactosImplList() {
		nombreAgenda= "Agenda Personal";
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}
	
	public AgendaContactosImplList(String nombreAgenda) {
		this.nombreAgenda= nombreAgenda; //this es mi atributo. nombre agenda sin nada es el que llega.
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}
	
	private void cargarDatos() { //el void no devuelve nada
		lista.add(new Contacto("Juan", "Miravete", "1111111", "t3e@eefr.es", "YS S.L"));
		lista.add(new Contacto("Manuel", "Del Corral", "3235467", "barbads@eefr.es", "Playas S.L"));
		lista.add(new Contacto("Piggel", "Perez", "323232", "jaun@eefr.es", "Sociedad S.L"));
	}

	public String getNombreAgenda() {
		return nombreAgenda;
	}

	public void setNombreAgenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}

	public ArrayList<Contacto> getLista() { //esto solo es el get de la lista. se entra por dentro jeje
		return lista;
	}

	@Override //son override porque los que yo rescribo de mi padre son override que es la misma cabecera que la de mi padre y de mi interface.
	public boolean altaContacto(Contacto contacto) {
		if (lista.contains(contacto)) 
			return false;
		else 
			return lista.add(contacto);
	}

	@Override
	public boolean eliminarContacto(String nombre) {
		Contacto contacto = buscarUno(nombre); 
		if (contacto != null) {
			return eliminarContacto(contacto);
		}else
			return false;
	}
	
	@Override
	public boolean eliminarContacto(Contacto contacto) {
		return lista.remove(contacto);
	}

	@Override
	public boolean cambiarContacto(Contacto contacto) {
		int pos = lista.indexOf(contacto);
		if (pos != -1) {
			lista.set(pos, contacto);
			return true;
		} else
			return false;
	}

	@Override
	public Contacto buscarUno(String nombre) {
		for (Contacto con: lista) {
			if (con.getNombre().equals(nombre))
				return con;
		}
		return null;
	}

	@Override
	public Contacto buscarTelefono(String telefono) {
		for (Contacto con: lista) {
			if(con.getTelefono().equals(telefono))
				return con;
		} 
		return null; //si lo encuentro lo devuelvo y sino lo llevo a nulo
	}

	@Override
	public Contacto buscarEmail(String email) {
		for (Contacto ema: lista) {
			if(ema.getEmail().equals(email))
				return ema;
	}
		return null;
	}	

	@Override
	public ArrayList<Contacto> buscarPorTresPrimeros(String cadena) {
		ArrayList<Contacto> aux = new ArrayList<Contacto>();
		
		if(cadena.length() < 3)
			return aux;
		
		for (Contacto con: lista) {
			if (con.getNombre().substring(0,3).equalsIgnoreCase(cadena.substring(0, 3))) //el substring le mete a los caracteres
				 aux.add(con);
		}
		
		return aux;
	}
	
}
