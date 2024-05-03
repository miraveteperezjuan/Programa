package modelo.javabean;

public class Administrativo extends Persona {

	private String tareas;
	
	public Administrativo() {
		super();
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	//Método propio que nos indica que el administrativo x va a hacer la tarea pertinente
	public String gestionarMatricula() {
		return "El administrativo" + nombre + "va a gestionar una matrícula"; 
	}
	
	// Este método es una herencia de la clase persona. Indica que el administrativo va a hacer sus respectivas tareas
	public String trabajar() {
		return "El administrativo" + nombre + "va a realizar estas tareas:" + tareas;
	}
	
	
}
