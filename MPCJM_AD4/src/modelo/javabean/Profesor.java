package modelo.javabean;

public class Profesor extends Persona {
	
	private String competencias;
	
	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	// Devuelve un método que representa que el profesor va a coregir los examenes
	public String ponerNotas() {
		return "El profesor" + nombre + "va a corregir los exámenes";
	}
	// Devuelve un método que el profesor va a trabajar.  Este método es una herencia de la clase persona.
	public String trabajar() {
		return "El profesor" + nombre + "va a impartir su clase";
	}
	
}
