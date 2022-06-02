package com.syntax.class04;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("give your name");
String name=input.next();
		System.out.println(name);
		System.out.println(name + "give your age");
		int age= input.nextInt();
		System.out.println(name + "is" +age + "old");
	}

}
