package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Formula1;

public class F1DaoImpList implements Formula1Dao {
	
	private ArrayList<Formula1> list;
	
	public F1DaoImpList() {
		list = new ArrayList<Formula1>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		list.add(new Formula1(1, "Bahrein", "Bahrein" , 66, true, "Sainz"));
		list.add(new Formula1(2, "Abu Dabi", "Abu Dabi" , 54, true, "Stroll"));
		list.add(new Formula1(3, "Valencia", "España" , 87, false, "Alonso"));
		list.add(new Formula1(4, "Sao Paulo", "Brasil" , 74, true, "Hamilton"));
	}

	@Override
	public boolean alta(Formula1 Formula1) {
		if (list.contains(Formula1))
			return false;
		else 
			return list.add(Formula1);
	}

	@Override
	public boolean delete(int Id) {
		Formula1 formula1 = buscarUno(Id); //llamo a buscar uno para que le salga el delete al otro.
		if (formula1 != null)
			return delete(formula1); //este es el metodo de delete de abajo que se combina
		else
			return false;
	}

	@Override
	public boolean delete(Formula1 Id) {
		return list.remove(Id);
	}

	@Override
	public boolean update(Formula1 Formula1) {
		int pos = list.indexOf(Formula1);
		if (pos != -1) {
			list.set(pos, Formula1);
		return true;
		}else
			return false;
	}

	@Override
	public Formula1 buscarUno(int Id) {
		Formula1 formula1 = new Formula1();
		formula1.setId(Id);
		int pos = list.indexOf(formula1);
		if (pos != -1)
			return list.get(pos);
		else
			return null;
	}

	@Override
	public ArrayList<Formula1> buscarTodos() {
		// TODO Auto-generated method stub
		return list;
	}
}
