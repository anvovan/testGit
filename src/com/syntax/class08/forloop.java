package com.syntax.class08;
import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven=0;
		int sumOdd=0;

		for (int i = 1; i <= 70; i++) {

		if (i % 2 == 0) {
		sumEven+=i;
		}else {
		sumOdd+=i;
		}
		}

		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum even numbers is "+sumOdd);
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Number");
	
	int secret = 8;
	int guess;
 guess = scan.nextInt();
	for (int i = 1; i <= 70; i++) {

	if (i == 8) {
		
	System.out.println("good");
	break;
	}else {
	System.out.println("try");
	}
	}



}
}
