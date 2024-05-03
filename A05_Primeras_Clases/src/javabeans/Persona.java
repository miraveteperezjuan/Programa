package javabeans;

//lo uncio que hacer a mano son los metodos exactos y el tema de los privates. y fin.

public class Persona {
//El private es para hacer los datos privados.
	private int idPersona;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementoSalario;
	private char genero;
	
	//EL CONTRUCTOR VACIO ES OBLIGATORIO. EL CONTRUCTOR SIN PARAMETROS ES CREAR UNA ESTRUCTURA DE DATOS CON LOS VALORES POR DEFECTO.
	//SE CREA UNA ESTRUCTURA DE DATOS, PORQUE LUEGO DE ESO EL CREAR UN OBJETO SIN NADA, HAY ALGUIEN QUE LE VA A METER VALOR CON LOS SETTER.
	
	
	//public Persona (int idPersona, String nombre, String apellidos) {
		//this.idPersona = idPersona;
		//this.nombre = nombre;
		//this.apellidos = apellidos;
	//}
	
	
	//public Persona () { //el obligatorio para javabeen es este. Java tiene un monton de tecnologia entorno a los JavaBeen.
	//}
	
	public Persona(int idPersona, String nombre, String apellidos, double salario, double complementoSalario,
			char genero) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.complementoSalario = complementoSalario;
		this.genero = genero;
	}
	
	public Persona() { //ESTE CONTRUCTOR SIEMPRE ES OBLIGATORIO TENERLO.
		super();
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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

	public String getApellidos() {
		return apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setNombre(String pNombre){
		this.nombre = pNombre; //el this en este caso se es en la otra clase el p1. This es el que invoca en este caso es el p1. es como poner this = p1.
	}
	
	public String getNombre() { //no recibe nada porque es la variable del nombre
		return nombre; //voy a tu variable y te devuelvo lo del nombre.
	}
	//set es para meter para asignar un valor a la estructura. Sirve para asignar la primera vez y asignar. Por eso no devuelve nada. 
	// get 
	public void setGenero(char pGenero) {
		genero = pGenero;
	}
	
	public void setApellidos(String pApellidos) {
		apellidos = pApellidos;
	} //Este metodo no se puede ejecutar si no apunta a una variable. Java nacesita saber con que estructura está trabajando.
	
	public double salarioBruto() {
		return salario + complementoSalario;
	}

	//metodos propos de la clase.
	public double salarioBruMensual(int meses) {
		return salarioBruto () / meses;
	}
	
	public String nombreCompleto() {
		return apellidos + ", " + nombre;
	}
	
	public String literalgenero() { //METODOS PROPIOS PARA TRABAJAR CON LOS DATOS DEL OBJETO.
		
		String literal = null;
		
		switch(genero) {
		case 'M': case 'm':
			literal = "Mujer";
			break;
		case 'H': case 'h':
			literal = "Hombre";
			break;
		}
		
		return literal; 		
	}

	@Override //CUANDO HEREDO HEREDO SUS METODOS Y ATRIBUTOS.
	//EL OVER ES UNA QUE GARANTIZA QUE ESTE METODO NO ES TUYO Y ES PARA VER QUE ESTE ES UN PATRON PUBLICO QUE EL DE MI PADRE.
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
				+ salario + ", complementoSalario=" + complementoSalario + ", genero=" + genero + "]";
	}
	
	
	
}
