package com.JavaBasics;

import java.util.Scanner;

public class EscpaeSequences {
	private static int ψ;

	public static void main(String[] args) {
		/*
		System.out.println("\'Java\'is an \nobject\toriented Programming language");
		
		System.out.println("\u03C8Ammoru\fthalli");
	
			short s = 23;
			double d =20.0;
			String st = "Jai";
			System.out.println("The short value:- "+s+"\nThe Double value:- "+d+"\nThe String value:- "+st);
					
	*/
		//Finding Percentage using arrays
				
		int totalMarks=0;
		short marks[]= {45,55,67,87,99};
		for(int i=0;i<marks.length;i++)
		{
			totalMarks+=marks[i];
			
		}System.out.println("Total Marks of 5 subjects: "+totalMarks);
		
		float average = totalMarks/(float)marks.length;
		System.out.println("Percentage is "+average+ "%");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The Area of Rectange is: "+(5*7)+ " The perimeter of rectangle is: "+ 2*(5+7));
		
	
	}
}
