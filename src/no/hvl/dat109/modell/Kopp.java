package no.hvl.dat109.modell;

public class Kopp {

	private static int id = 0;
	private int sum;
	
	public Kopp() {
		id++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void trill() {
		Terning t1 = new Terning();
		Terning t2 = new Terning();
		
		sum = t1.getVerdi()+t2.getVerdi();
		
	}
		
}
