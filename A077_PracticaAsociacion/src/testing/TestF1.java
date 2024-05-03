package testing;

import javabeans.Categorias;
import javabeans.Circuito;
import javabeans.Equipos;
import javabeans.País;
import javabeans.Pilotos;
import javabeans.Region;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestF1 {

	public static void main(String[] args) {
		
		Region r1 = new Region(1, "Europa");
		Region r2 = new Region(2, "América");
		Region r3 = new Region(3, "Arabia");
		Region r4 = new Region(3, "Asia");
		
		País p1 = new País(1, "Italia", r1);
		País p2 = new País(2, "España", r1);
		País p3 = new País(3, "Francia", r1);
		País p4 = new País(4, "Abu Dabi", r3);
		País p5 = new País(5, "Qatar", r3);
		País p6 = new País(6, "Brasil", r2);
		País p7 = new País(7, "Estados Unidos", r2);
		País p8 = new País(8, "Japón", r2);
		País p9 = new País(3, "Bélgica", r1);
		
		Circuito c1 = new Circuito(1, "Monza", 66, "F1" + " LMS", p1);
		Circuito c2 = new Circuito(2, "Aragón", 54, "LMS", p2);
		Circuito c3 = new Circuito(3, "Sao Paulo", 52, "F1", p6);
		Circuito c4 = new Circuito(4, "Spa-Francorchamps", 70, "F1" + "LMS", p9);
		Circuito c5 = new Circuito(5, "Catalunya", 65, "F1", p2);
		Circuito c6 = new Circuito(6, "Le Mans", 254, "LMS", p3);
		Circuito c7 = new Circuito(7, "Suzuka", 53, "F1", p8);
		Circuito c8 = new Circuito(8, "COTA", 1000, "LMS", p7);
		
		List<Circuito> circuitosCategoria1 = new ArrayList<>();
		circuitosCategoria1.add(c1);
		circuitosCategoria1.add(c4);
		circuitosCategoria1.add(c5);
		circuitosCategoria1.add(c7);
		
		List<Circuito> circuitosCategoria2 = new ArrayList<>();
		circuitosCategoria1.add(c1);
		circuitosCategoria1.add(c2);
		circuitosCategoria1.add(c4);
		circuitosCategoria1.add(c6);
		circuitosCategoria2.add(c8);
		
		Categorias ca1 = new Categorias(1, "F1", circuitosCategoria1);
		Categorias ca2 = new Categorias(1, "LMS", circuitosCategoria2);
		
		// Primero creamos los objetos Pilotos
		Pilotos pi1 = new Pilotos("Fernando", "Alonso", 42, 3, equipoAstonMartin);
		Pilotos pi2 = new Pilotos("Lewis", "Hamilton", 37, 7, equipoMercedes);
		Pilotos pi3 = new Pilotos("Max", "Verstappen", 24, 1, equipoRedBull);
		Pilotos pi4 = new Pilotos("Sebastian", "Vettel", 34, 4, equipoAstonMartin);
		Pilotos pi5 = new Pilotos("Daniel", "Ricciardo", 32, 0, equipoMcLaren);
		Pilotos pi6 = new Pilotos("Charles", "Leclerc", 24, 0, equipoFerrari);
		Pilotos pi7 = new Pilotos("Valtteri", "Bottas", 32, 9, equipoMercedes);
		Pilotos pi8 = new Pilotos("Lando", "Norris", 22, 0, equipoMcLaren);

		// Luego creamos los objetos Equipos
		Equipos equipoFerrari = new Equipos(1, "Ferrari", "Ferrari","Santander", ca2, pi6);
		Equipos equipoMercedes = new Equipos(2, "Mercedes", "Brackley", "Petronas", ca1, pi2);
		Equipos equipoRedBull = new Equipos(3, "Red Bull", "Milton Keynes", "Red Bull", ca1, pi3);
		Equipos equipoAstonMartin = new Equipos(4, "Aston Martin", "Silverstone", "Aston Martin", ca2,pi1);
		Equipos equipoMcLaren = new Equipos(5, "McLaren", "Woking", "McLaren", ca1, pi8);

		// Ahora creamos las listas de pilotos para cada equipo
		List<Pilotos> pilotosFerrari = Arrays.asList(pi1, pi6);
		List<Pilotos> pilotosMercedes = Arrays.asList(pi2, pi7);
		List<Pilotos> pilotosRedBull = Arrays.asList(pi3);
		List<Pilotos> pilotosAstonMartin = Arrays.asList(pi4);
		List<Pilotos> pilotosMcLaren = Arrays.asList(pi5, pi8);
		
		
	}

}
