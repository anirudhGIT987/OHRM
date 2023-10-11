package com.JavaFunda;

import java.util.Scanner;

public class SlipTest_1 {
	Scanner keyboard = new Scanner(System.in);

	private void gpaCalculation() {
		//Finding out percentage / gpa of a student in 4 subjects
System.out.println("Enter data from keyboard");		
		System.out.println("Enter marks of subject 1: ");		
		int subj1=keyboard.nextInt();
System.out.println("Enter marks of subject 2: ");		
		int subj2=keyboard.nextInt();
System.out.println("Enter marks of subject 3: ");		
		int subj3 = keyboard.nextInt();
System.out.println("Enter marks of subject 4: ");		
		int subj4=keyboard.nextInt();
		int marksObtained=subj1+subj2+subj3+subj4;
System.out.println("MarksObtained:-	"+marksObtained);		
		double totalMarks=399.0;
		double percentage=(marksObtained/totalMarks)*100;
System.out.println("Your Percentage is:- "+percentage);	
		
	}
	
	public static void main(String[] args) {
		
		SlipTest_1 task1 = new SlipTest_1();
		//task1.gpaCalculation();
		//task1.subjectFail();
		task1.stringReversal();
	}// main method
	
	protected void subjectFail() {
		short s1, s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Physics");
		 s1 = sc.nextShort();
		 
		System.out.println("Enter marks of Chemistry");
			s2 = sc.nextShort();
			
		System.out.println("ENter marks of biology");
		s3 = sc.nextShort();
		
		double result = (s1+s2+s3)/3.0;
		
System.out.println("Your Overall Percentage	" + result) ;
		if(result>=40 && s1>33 && s2>33 && s3>33) {
System.out.println("hmmm, malla rayaballa");
		}
		if(s1<33)
System.out.println("PHY Marks:- "+s1+" is <33 | You need to write Physics again");
		
		if(s2<33)
System.out.println("CHEM Marks:- "+s2+" is <33 | You need to write Chemistry again");
		if(s3<33)
System.out.println("BIOLOGY Marks:- "+s3+" is <33 | You need to write Biology again");
		
			else {
System.out.println("Tappadu rayalsinde");
		}
	}//fail method

	public void stringReversal()	{
		
		String normal="Anuloma Vilomamu";
		String reverse="";
		int txtLength=normal.length();
System.out.println("The normal string lenght is:- "+txtLength);
System.out.println(normal.lastIndexOf(txtLength));
		for(int in =txtLength-1; in>=0;in--)
		{		reverse=reverse+normal.charAt(in);
			}
System.out.println("The Reversed String is:- "+reverse);
System.out.println("String Reversal Completed");
	}//reverse Method

}// original class
