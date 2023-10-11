package com.JavaBasics;
import java.util.Scanner;
public class Practice_Questions {
	 
	public static void main(String[] args) {
		// Finding out the percent of marks of 3 subjects
		
		/*System.out.println("Taking input from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subj1");
		int subj1 = sc.nextInt();
		System.out.println("Enter marks of subj2;");
		int subj2 = sc.nextInt();
		System.out.println("Enter marks of subj3");
		int subj3 = sc.nextInt();
		int student_marks = subj1+ subj2 + subj3;
		System.out.println(student_marks);
		
		double percentage = ((double)student_marks/300);
	double percentage = (((double)(subj1+ subj2 + subj3)/300)*100);
		System.out.println("Your percentage of marks is:  " + percentage);
	*/
		
	/*	int Telugu = 85;
        int Hindi = 89;
        int English = 91;
        int Math = 67;
        int social = 95;
        int total = 500;
        int Marks_obtained = (Telugu + Hindi + English + Math + social);
      System.out.println(Marks_obtained);
        double result = ((double)Marks_obtained/total);

        System.out.println( result*100);
	*/
		
		//double a = 7.0/4 *9/2.0;
	//System.out.println(a);
	
		//Like manipulating your marksheet
		char grade = 'D';
		grade = (char)(grade-2);
		//System.out.println(grade);
		
		//now back to original
		grade = (char)(grade + 2);
		//System.out.println(grade);
		
		Scanner sca = new Scanner(System.in);
		float f1 = sca.nextFloat();
		System.out.println(f1>4);
		
		
		
	}

}
