package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
		
//		metodo senza bonus
		
//		for (int i = 1; i <= 100; i++) {
//			if(i % 15 == 0) {
//				System.out.println("FizzBuzz");
//			}else if(i % 3 == 0) {
//				System.out.println("Fizz");
//			}else if(i % 5 == 0) {
//				System.out.println("Buzz");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		
//		metodo con bonus
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int userNumber = sc.nextInt();     
		
		for (int i = 1; i <= userNumber; i++) {
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		
		sc.close();
	}   		                 
}
