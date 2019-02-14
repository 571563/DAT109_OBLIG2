package no.hvl.dat109.modell;

public class Terning {

	private static int id;
	private int verdi;
	
	public Terning() {
		id++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
	
	
}
