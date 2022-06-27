package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		
		double x1, x2, y1, y2, LengthOfLine1;  
		double x11 = 0, x21 = 0, y11 = 0, y21=0, LengthOfLine2; 

		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the value of y21 :");
		y21 = scanner.nextDouble();

		LengthOfLine1 = Math.sqrt(  (Math.pow(x21-x11,2))  + (Math.pow(y21-y11,2)) );

		LengthOfLine1 = Math.sqrt(  (Math.pow(x21-x11 , 2))  + (Math.pow(y21-y11 , 2)) );
		System.out.println(LengthOfLine1);


		System.out.println("Enter the value of x11 : ");
		x11 = scanner.nextDouble(); 

		System.out.println("Enter the value of x21 : ");
		x21 = scanner.nextDouble(); 

		System.out.println("Enter the value of y11 : ");
		y11 = scanner.nextDouble(); 

		System.out.println("Enter the value of y21 : ");
		y21 = scanner.nextDouble(); 

		LengthOfLine2 = Math.sqrt(  (Math.pow(x21-x11, 2))  + (Math.pow(y21-y11, 2)));
		System.out.println(LengthOfLine2);

		String s1,s2;
		s1 = Double.toString(LengthOfLine1);
		s2 = Double.toString(LengthOfLine2);
		System.out.println("Equality of two length is " +s1.equals(s2));
	}
}