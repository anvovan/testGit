package com.syntax.class05;
import java.util.Scanner;
public class hM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner output = new Scanner(System.in);  
	    System.out.println("what is the amount of loan is needed?");
	           int amount = output.nextInt();  
	  if (amount <= 200000) {
	    System.out.println("congrats"); 
	     
	      } else {
	        System.out.println("decline");
	      }
	  
	  System.out.println("what is the salary and how many years ?");
      int am = output.nextInt();
      int years = output.nextInt();
      
      if (years >= 5 && am >= 300000) {
    	  System.out.println("bonus 5000");
      } else if  
    	  (years >= 5 && am < 300000) {
    		  System.out.println("bonus 3000");
    	  } else {
    		  System.out.println("sayonara");
    	  }
      }
	}



