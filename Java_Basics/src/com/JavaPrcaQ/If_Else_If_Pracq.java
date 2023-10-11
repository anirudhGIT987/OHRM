package com.JavaPrcaQ;
import java.time.Year;
import java.util.Scanner;

public class If_Else_If_Pracq {
	public static void main(String[] args) {
		
		short s1, s2,s3;
		Scanner sc = new Scanner(System.in);
		/*	System.out.println("Enter marks of Physics");
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
		else {
			System.out.println("Tappadu rayalsinde");
		}
		*/

	
		// Code for tax Evaluation
	/*	System.out.println("Enter Your annual Salary in Lakhs/year");
		double mSalary = sc.nextDouble();
		double tax = 0;
		if(mSalary <=2.5) {
			tax = tax + 0;
		}
		else if (mSalary>2.5 && mSalary<=5.0) {
			tax = tax + 0.05*(mSalary-2.5);
		}
		else if (mSalary>5.0 && mSalary<=10.0)
		{
			tax = tax + 0.05*(5.0 - 2.5);
			tax = tax + 0.2*(mSalary - 5.0);
		}
		else if (mSalary > 10.0) {
			tax = tax + 0.05*(5.0-2.5);
			tax = tax + 0.2*(10.0 - 5.0);
			tax = tax + 0.3* (mSalary - 10.0);
				
		}
		
		if( tax <= 0.999)
		{
			System.out.println("Amount of Tax Deducted =  " +  tax* Math.pow(10, 5));
			
		}
		else if (tax > 0.999) 
		{
			System.out.println("Amount of Tax Deducted " + tax);
		}
		System.out.println();
		System.out.println("In hand =  " + (mSalary - tax));
		
		Year year = Year.of(2090);
		System.out.println(year.isLeap());
		System.out.println("Enter a year");int year = sc.nextInt();
		
	if (year % 4 ==0) {
			System.out.println("Is a leap year");
		}*/
	
		/* int year = sc.nextInt();
		String result;

    result =
      (
        (year % 4 == 0 && year % 100 != 0)
          ? "is a leap year."
          : (year % 400 == 0) ? "is a leap year." : "is not a leap year."
      );
	System.out.println(year + " "+ result);
		
		*/
		for (int index1=5; index1>=1; index1--)
		{
			for (int index2=1; index2< index1; index2++)
			{
				System.out.println(index2+" * ");
			} System.out.println();
		}
		
		
		
		
	}
}
