package no.hvl.dat109.modell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terningspill {

	private static int id = 0;
	private List<Spiller> spillere;
	private Kopp kopp;
	
	public Terningspill() {
		id++;
		spillere = new ArrayList<Spiller>();
		kopp = new Kopp();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void leggTilSpiller(String navn) {
		spillere.add(new Spiller(navn));
	}
	
	public void spill() {
		for (Spiller s : spillere) {
			s.spill(kopp);
			System.out.println(s);
		}
		
		Spiller vinner = spillere.get(0);
		for (int i = 1; i < spillere.size(); i++) {
			if (spillere.get(i).getVerdi() > vinner.getVerdi()) {
				vinner = spillere.get(i);
			}
		}
		System.out.println("Vinneren er: "+ vinner);
		
	}
	
	public void lagSpill() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Skriv navn på spiller nr. " + i + ": ");
		String navn = sc.nextLine();
		
		while(!navn.equals("0")) {
			leggTilSpiller(navn);
			i++;
			System.out.println("Skriv navn på spiller nr. " + i + ": (Skriv 0 for å gå videre)");
			navn = sc.nextLine();
			
			
		}
		
	}
	
}
