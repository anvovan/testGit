package com.syntax.class04;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine = false;
		int dose=1;
		if(vaccine) {
			System.out.println("How many doses?");
		if (dose==1) {
			System.out.println("You need more");
		} else {
			System.out.println("you good");
		}
		}
		//__________________________________________
		
		String month = "June";
		int day = 8;
		if (month.equals("May")) {
			System.out.println("What day todays");
			if (day==8) {
				System.out.println("mom day");
			}
			
		}else if (month.equals("June")) {
			System.out.println("What day todays");
			if (day==19) {
			System.out.println("faher days");
			}
		}
 
	}

}
