package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in);
		
		
		System.out.print("Inserisci i Km che vuoi percorrere: ");
		String userKm = myObj.nextLine();  
		System.out.print("Inserisci la tua eta: ");
		String userEta = myObj.nextLine();
		
		int km = Integer.valueOf(userKm);
		int eta = Integer.valueOf(userEta);
		
		double prezzoBiglietto = km * 0.21;
				
		if(eta < 18) {
			
			double sconto = prezzoBiglietto * 20 / 100;
			
			prezzoBiglietto = prezzoBiglietto - sconto;
			
			System.out.println("Il prezzo del biglietto sara: " + Math.round(prezzoBiglietto*100.0)/100.0 + " euro");
		}else if(eta >=65) {
			double sconto = prezzoBiglietto * 40 / 100;
			
			prezzoBiglietto = prezzoBiglietto - sconto;
			
			System.out.println("Il prezzo del biglietto sara: " + Math.round(prezzoBiglietto*100.0)/100.0 + " euro");
		}else {
			System.out.println("Il prezzo del biglietto sara: " + Math.round(prezzoBiglietto*100.0)/100.0 + " euro");
		}
		
		
		
	}
	
	
}
