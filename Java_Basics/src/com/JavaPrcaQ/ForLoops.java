package com.JavaPrcaQ;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner odd = new Scanner(System.in);
		
			 System.out.print("Enter value n : ");
	       int n = odd.nextInt();
	         
	        for(int i=1; i<n; i++)
	        {
	            if(i%2!=0)
	                System.out.print(i+" ");
	        }   
	        
	         
	
	}

}
