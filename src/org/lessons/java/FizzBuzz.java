package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero da valutare: ");
		int userNumber = sc.nextInt();     
		
		if(userNumber % 15 == 0) {
			System.out.println("FizzBuzz");
		}else if(userNumber % 3 == 0) {
			System.out.println("Fizz");
		}else if(userNumber % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(userNumber);
		}
		
		sc.close();
	}   		                 
}
