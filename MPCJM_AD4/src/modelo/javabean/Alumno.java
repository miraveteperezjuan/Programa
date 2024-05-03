package modelo.javabean;

public class Alumno extends Persona {
	
	private String curso;
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	// Devuelve un método que representa que el alumno va a hacer el examen
	public String hacerExamen() {
		return "El alumno" + nombre + "va a hacer su examen";
	}
	
	// Devuelve un método que representa que el alumno estudia en x curso. Este método es una herencia de la clase persona.
	public String trabajar() {
		return "El alumno" + nombre + "va a estudiar para el curso" + curso;
	}
	
	
	

}
