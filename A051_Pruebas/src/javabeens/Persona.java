package javabeens;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementoSalario;
	private char genero;
	
	public Persona() { 
		super();
		// Esto es para generar un constructor. Super permite heredar atributos y metodos de la clase padre.
	}
	
	public Persona(int idPersona, String nombre, String apellidos, double salario, double complementoSalario,
			char genero) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.complementoSalario = complementoSalario;
		this.genero = genero;
		//esto es un constructor que toma todos los paramentros, aunque no es muy recomendado por el tema que dentro de nuestra clase se pueden añadir o quitar atributos.
		
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComplementoSalario() {
		return complementoSalario;
	}
	public void setComplementoSalario(double complementoSalario) {
		this.complementoSalario = complementoSalario;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}

		
	@Override
	public String toString() {
		return "Juan [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
				+ salario + ", complementoSalario=" + complementoSalario + ", genero=" + genero + "]";
	}
	

}
