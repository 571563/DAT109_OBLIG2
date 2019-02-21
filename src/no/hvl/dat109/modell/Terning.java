package no.hvl.dat109.modell;

import java.util.Random;

public class Terning {

	private static final Random RAND = new Random(System.currentTimeMillis());
	private static int id;
	private int verdi;
	
	public Terning() {
		id++;
		verdi = RAND.nextInt(6)+1;
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
