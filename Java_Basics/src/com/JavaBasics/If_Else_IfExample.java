package com.JavaBasics;
import java.util.Scanner;

public class If_Else_IfExample {
	public static void main(String[] args) {
		
	/*int a = 27;
	if(a==26) 
	{
		//true block
		System.out.println("you are good to go");
	}
	else {
		System.out.println("Oh!no");
	}
	
		
	int age;
	System.out.println("Enter your Age:");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();
	
	if(age>55)
	{
		System.out.println("Experienced");
	}
	 if(age>45)
	{
		System.out.println("Semi Experienced");
	}
	 if(age>35)
	{
		System.out.println("A bit experienced");
	
	}
	else
	{
		System.out.println("not experienced");
	}
	
		
		int a =10;
		if(a==11) {
			System.out.println("I am 11");
		
		}
		else {
			System.out.println("I am not 11");
		}
*/
	// ASsignments
		/*System.out.println("Enter your marks");
		Scanner marks = new Scanner(System.in);
		System.out.println("subject1:-");
		int subject1 = marks.nextInt();
		System.out.println("subject2");
		int subject2 = marks.nextInt();
		System.out.println("subject3");
		int subject3 = marks.nextInt();
		int obtainedMarks = subject1 + subject2 + subject3;
		System.out.println(obtainedMarks);
		int totalMarks = 300;
		double result = ((double)(obtainedMarks/totalMarks)*100);
		
		
		if(result>= 44 && subject1>=33 && subject2>=33 && subject3>=33 )
		{
			System.out.println("Meeru Utternulayyyaru");
		}
		else {
			System.out.println("Malli raasko");
		}
*/

/*	short m1, m2, m3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Marks in Physics");
	m1 =sc.nextShort();
	
	System.out.println("Enter your marks in Chemistry");
	m2 = sc.nextShort();
	
	System.out.println("Enter Your marks in Biology");
	m3 = sc.nextShort();
	double avg  = ((m1+m2+m3)/300.00)*100.00;
	System.out.println("your overall percentage : " + avg);
	if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
	{
		System.out.println("Congrats");
	}
	else
	{
		System.out.println("Once more");
	}
	*/
	
	// Amount of tax in a person's salary
		
	
	

	Scanner tx = new Scanner(System.in);
	/*System.out.println("ENter your yearly salary");
	double annualSalary = tx.nextInt();
	
	if(annualSalary < 
			2_50_000) 
	{
		System.out.println("No Tax deduction");
	}
	else if(annualSalary>=2_50_000 && annualSalary<5_00_000)
	{
		System.out.println("Tax deducted= " + annualSalary);
	}
	else if (annualSalary>=5_00_000 && annualSalary<10_00_000)
	{
		System.out.println("tax deducted= " + annualSalary*(20.0/100));
	}
	else
	{
		System.out.println("tax deducted= " + annualSalary*(30.0/100));
	}
	*/
	
	System.out.println("Enter URL");
	String url = tx.next();
	switch (url) {
		case ".com":
			System.out.println("Comapny Website");
			break;
		
		case ".org":
			System.out.println("organisational website");
			break;
		
		case ".in":
			System.out.println("Indian Website");
			break;
		default:
			System.out.println("Not valid now");
	
	}
	/*
	for(url=".com")
	
	if(url.endsWith(".com"))
	{
		System.out.println("Company Website");
	}
	if(url.endsWith(".org"))
	{
		System.out.println("Organizational Website");
	}
	else if (url.endsWith(".in")) {
		System.out.println("Indian Website");
	}
	
	else
	{
		System.out.println("Not valid for now");
	}
	*/
	
	
	
	
	
	
	
	}
	
	
}
	
	
	

