package com.syntax.class05;

public class logicalOperator {
	public static void main(String[] args) {
	
	boolean job = true;
	double salary = 905000;
	
	if (job && salary >= 100000) {
		System.out.println("im happy");
	}
	
	boolean study = true;
	boolean homeWork = true;
	boolean practice = true;
	if (study && homeWork && practice ) {
		System.out.println("im happy");
	} else {
		System.out.println("looser");
		
	}
	}

	
        Scanner output = new Scanner(System.in);  
 System.out.println("Please enter a number");
        int number = output.nextInt();  
if (number % 2 == 0) {
 System.out.println("Value is even"); 
   if (number > 1000) {
     System.out.println("Even value is large");
   } else {
     System.out.println("Even value is just right");
   }

 }
else {
 System.out.println("Value is odd"); 
   if (number > 1000) {
     System.out.println("Odd value is large");
   } else {
     System.out.println("Odd value is just right");
   }
 }

 }
}
	

