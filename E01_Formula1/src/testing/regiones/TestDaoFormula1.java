package testing.regiones;

import modelo.dao.F1DaoImpList;
import modelo.javabeans.Formula1;

public class TestDaoFormula1 {
	
	private static F1DaoImpList rdao;
	
	static {
		rdao = new F1DaoImpList(); //si no se pone esto no funciona nada.
	}
	
	public static void main(String[] args) {
		        //buscarTodos();
				//buscarUno();
				//delete();
				//delete2();
				//update();
				//alta();
				//contiene();
	}
	
	public static void alta() {
		Formula1 f4 = new Formula1(5, "Madrid", "España", 44, true, "Ayuso");
		System.out.println(rdao.alta(f4));
		buscarTodos();
	}
	
	public static void delete() {
		System.out.println(rdao.delete(2));
		buscarTodos();
	}
	
	public static void delete2() {
		Formula1 formula1 = rdao.buscarUno(3);
		System.out.println(rdao.delete(formula1));
		buscarTodos();
				
	}
	
	public static void update() {
		Formula1 formula1 = rdao.buscarUno(1);
		if (formula1 != null) {
			formula1.setLastWinner("Alonso");
			System.out.println(rdao.update(formula1));
		}else
			System.out.println("No se ha encontrado");
		buscarTodos();
	}
	
	public static void buscarUno() {
		Formula1 formula1 = rdao.buscarUno(2);
		if (formula1 != null)
			System.out.println(formula1);
		else
			System.out.println("No existe");
	}
	
	public static void buscarTodos() {
		for (Formula1 formula1 : rdao.buscarTodos())
		System.out.println(formula1);
	}
	
}
