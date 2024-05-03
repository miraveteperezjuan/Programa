package modelo.javabeans;

import java.util.Objects;

public class Formula1 {
	
	private int Id;
	private String Name;
	private String Country;
	private int Laps;
	private boolean Calendar;
	private String LastWinner;

	public Formula1() {
		super();
	}

	public Formula1(int id, String name, String country, int laps, boolean calendar, String lastWinner) {
		super();
		Id = id;
		Name = name;
		Country = country;
		Laps = laps;
		Calendar = calendar;
		LastWinner = lastWinner;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getLaps() {
		return Laps;
	}

	public void setLaps(int laps) {
		Laps = laps;
	}

	public boolean isCalendar() {
		return Calendar;
	}

	public void setCalendar(boolean calendar) {
		Calendar = calendar;
	}

	public String getLastWinner() {
		return LastWinner;
	}

	public void setLastWinner(String lastWinner) {
		LastWinner = lastWinner;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formula1 other = (Formula1) obj;
		return Id == other.Id;
	}

	@Override
	public String toString() {
		return "Formula1 [Id=" + Id + ", Name=" + Name + ", Country=" + Country + ", Laps=" + Laps + ", Calendar="
				+ Calendar + ", LastWinner=" + LastWinner + "]";
	}
	
}
