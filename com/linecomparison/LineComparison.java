package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, LengthOfLine;  
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the value of x1 :");
		x1 = scanner.nextDouble();

		System.out.println("Enter the value of x2 :");
		x2 = scanner.nextDouble();

		System.out.println("Enter the value of y1 :");
		y1 = scanner.nextDouble();

		System.out.println("Enter the value of y2 :");
		y2 = scanner.nextDouble();

		LengthOfLine = Math.sqrt(  (Math.pow(x2-x1,2))  + (Math.pow(y2-y1,2)) );

		System.out.println(LengthOfLine);
	}
}
