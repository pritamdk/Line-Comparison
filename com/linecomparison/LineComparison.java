package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		
		double x11, x21, y11, y21, LengthOfLine , LengthOfLine2 ; 

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the value of x11 :");
		x11 = scanner.nextDouble();
		
		System.out.println("Enter the value of x21 :");
		x21 = scanner.nextDouble();
		
		System.out.println("Enter the value of y11 :");
		y11 = scanner.nextDouble();
		
		System.out.println("Enter the value of y21 :");
		y21 = scanner.nextDouble();

		LengthOfLine = Math.sqrt(  (Math.pow(x21-x11 , 2))  + (Math.pow(y21-y11 , 2)) );
		System.out.println(LengthOfLine);
		System.out.println("Length of Line 1:" + LengthOfLine);


		System.out.println("Enter the value of x11 : ");

		y21 = scanner.nextDouble(); 

		LengthOfLine2 = Math.sqrt(  (Math.pow(x21-x11, 2))  + (Math.pow(y21-y11, 2)));
		System.out.println(LengthOfLine2);
		System.out.println("Length of Line 1:" + LengthOfLine2);

		String s1,s2;
		s1 = Double.toString(LengthOfLine);
		s2 = Double.toString(LengthOfLine2);
		System.out.println("Equality of two length is " +s1.equals(s2));
		System.out.println("Equality of two lines using Equal Method : " +s1.equals(s2));
		System.out.println("Compare of two length is :" + s1.compareTo(s2));
	}
}