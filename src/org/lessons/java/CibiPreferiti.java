package org.lessons.java;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		String[] cibi = {"pizza","pasta","carne","patatine","dolci"};
		
		System.out.println("lunghezza classifica " + cibi.length);
		
		
		System.out.println("Prima posizione: " + cibi[0]);
		System.out.println("Ultima posizione: " + cibi[cibi.length - 1]);
		
		int metaPosizione = (cibi.length - 1) / 2;
		
		
		
		System.out.println("Meta posizione: " + cibi[metaPosizione]);
	}
	
	
}
