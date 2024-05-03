package test;

public class StringArrays {

	public static void main(String[] args) {
		String [] diasSemana = {"lunes", "martes", "domingo"};
		for(String dia: diasSemana) {
			System.out.println(dia);
		}
		
		for(int i = 0; i < diasSemana.length; i++) {
			System.out.println(diasSemana[i].toUpperCase());
		}
		
		String [] nombres = new String [3];
		//el new. cuando hago esto se inicializa las variables de tipo string si es de variables se inicializan a 0, real igual, bolean 0, char al caracter 0
		//si son de tipo clase como este caso se inicializan a null.
		nombres [0] = "Juan";
		nombres [1] = "Manu";
		nombres [2] = "Manu";
		 //esto seria el cuarto.
		/**
		for(String nombre: nombres) {
			System.out.println(nombre.toUpperCase()); //el for este lee en la confianza de que está todo lleno. hay 3 objetos que estan null.
		} lo mismo ocupper con el for int lo mismo. 
		 */
		
		//para evitar esto metieron las colecciones de los arraylist que es lo que está en el otro programita.
				

	}

}
