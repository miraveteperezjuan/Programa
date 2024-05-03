package modelo.javabean;

public class Gato extends Animal{ //lo extiendo de animal
	
	private int vidas;
	
	public Gato() {
		super();
	}
	
	public Gato(String especie, int patas, String nombre, int vidas) { //metemos todo lo del padre y heredamos tambien el que tenemos aqui.
		//por eso es importante ponerlo en protected para que herede todo y sea superchachi.
		super(especie, patas, nombre); //aqui pongo todo lo que no es mio
		this.vidas = vidas; //y aqui lo que es mio
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Gato [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + ", vidas=" + vidas + "]";
	}

	//source constructor using fields
	
	/*public Gato(String especie, int patas, String nombre, int vidas) {
		super(especie, patas, nombre);
		this.vidas = vidas;
		*/
	
	//cuando yo compare dos gatos, invocaran al equals de mi padre. no hace falta hacer ni equals ni el hash.
	
	public void perderVidas(int vidas) { //esto es el metodo propio
		this.vidas -= vidas; //igual + menos para hacer que el gato pues pierda vidas.
	}
	//el gato redescribe metodos

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Soy un gato y me llamo " + nombre + "y digo miau";
	}

	@Override
	public String medioLocomocion() {
		return "Corro que lo flipas y me subo";
	}

	@Override
	public String nombrecillo() {
		return "Me llamo Felix";
	}

	
	}
