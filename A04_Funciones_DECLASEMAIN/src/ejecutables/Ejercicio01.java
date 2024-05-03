package ejecutables;

public class Ejercicio01 {

	public static void main(String[] args) {
	double [] salarios = {19_999,20_001,39_789,48_988,71_001}; //esto es el array que es todo lo que va a recoger.
	
	for (double salario: salarios) {
		System.out.println(salario + " - " + tiposalario(salario));
		}
		//tiposalario(20_000); //Este numero va a caer debajo en esa variable

	}
	
	public static String tiposalario(double salario) { //si no se devuelve nada seria void. Si no string.
		//Luego el nombre dle metodo y luego el parametro y si no tiene seria parentesis parentesis
		
		//los rangos no entran en los swich
		
		String literal = null; //null apunta que no va a ningun sitio, mucho mejor que poner la doble comilla
		
		if (salario < 20_000)
			literal = "Salario bajo";
		else if (salario >= 20_000 && salario <= 40_000)
			literal = "Salario medio";
		else if (salario > 40_000 && salario <= 70_000)
			literal = "Salario alto";
		else
			literal = "Salario muy alto";
		
		return literal;
		
	}
}
