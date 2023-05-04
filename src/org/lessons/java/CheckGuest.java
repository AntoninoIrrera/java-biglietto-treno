package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String userName= sc.nextLine();     
		
		boolean presente = false;
		
//		metodo for
		
		for (int i = 0; i < listaInvitati.length; i++) {
			
			
			if(userName.equals(listaInvitati[i])) {
				presente = true;
				
			}
			
		}
		
//		metodo while
		
//		int i = 0;
//		
//		while(i < listaInvitati.length) {
//			
//			if(userName.equals(listaInvitati[i])) {
//				presente = true;
//			}
//			
//			i++;
//		}
//		
		
		if(presente == true) {
			System.out.println("sei nella lista");
		}else {
			System.out.println("non sei nella lista");
		}
		
		sc.close();
	}
}
