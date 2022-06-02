package com.syntax.class09;

public class newDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] num = new int[3][4]; 
num[0][0] = 10;
num[0][1] = 20;
num[0][2] = 30;
num[0][3] = 40;

num[1][0] = 1;
num[1][1] = 2;
num[1][2] = 2;
num[1][3] = 4;

num[3][0] = 9;
num[3][1] = 8;
num[3][2] = 7;
num[3][3] = 6;
	System.out.println(num[1][3]);//4
	
	int rows=num.length;
	System.out.println("num of rows " + rows);
	int colOfrows=num[0].length;
	System.out.println("num of cols in 1 row " + colOfrows);
	for (int row=0; row<num.length; row++ ) {
		for(int col=0; col<num[row].length; col++) {
			System.out.println(num[row][col]);
		}
	}
	

	}

}
