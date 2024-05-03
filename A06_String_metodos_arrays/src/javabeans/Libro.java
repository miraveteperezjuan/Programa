package javabeans;

import java.util.Objects;

public class Libro {

	private long isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private int paginas;
	
	public Libro(long isbn, String titulo, String autor, String editorial, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.paginas = paginas;
	}

	public Libro() {
		super();
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", paginas=" + paginas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn); //un metodo hash es un metodo que tiene un algoritmo que opera sobre el contenido de una variable o de mas variables
		//y que devuelve un numero. opera con los valores del objeto y si dos objetos tienen lo mismo da el mimso numero y el metodo hash si es distinto es que son iguales.
		//hash 
	}

	@Override
	//ESTO NOS DICE QUE DOS LIBROS SON IGUALES SI TIENEN EL MISMO ISBN.
	//esto es el hash code.
	public boolean equals(Object obj) { //equals es un metodo de instancia, es decir, yo necesito un obj de la clase libro para invocar a esto.
		//en este metodo puedo cualquier cualquier objeto como un string, scaner o cualquier clase.
		if (this == obj) //this invoca a equals. 
			return true; //true los dos somos iguales
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //si yo soy un libro y libro2 tambien es un libro si son los dos de tipo libro pero si tu eres libro y tu string faslse
			//si no somos de la misma clase doy false.
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}
	
	//si mi variable apunta al objeto puedo utilizarlo y si no no.
	
	
	
	
	
	
}
