package com.JavaFunda;

import java.util.ArrayList;
import java.util.Scanner;

public class First_N_Even_No_Sum {

		
	public static void main(String[] args) {
		//This is like sum of even numbers below given number	
		int evenNum = 0;
		short requiredNo = 100;
		ArrayList<Object>evenNumberList = new ArrayList<>();
		for(int n=1; n<=requiredNo; n++)
		{
			if(n%2==0)
			{		
				evenNumberList.add(n);
				evenNum =evenNum+n;
			}
		}
System.out.println("The sum of First "+requiredNo+" Even Numbers is:- "+evenNum);	
	System.out.println("No.of Even Numbers are:- "+evenNumberList.size());
	
	System.out.print("{ ");
	for	(int i =0; i<evenNumberList.size();	i++)
	{
		System.out.print(evenNumberList.get(i).toString()+", ");
		
	}System.out.println(" }");
	
//But we need sum of first given N even numbers
	 // function to find sum of
    // first n even numbers
    static int evenSum(int n)
    {
        int curr = 2, sum = 0;
 
        // sum of first n even numbers
        for (int i = 1; i <= n; i++) {
            sum += curr;
 
            // next even number
            curr += 2;
        }
 
        // required sum
        return sum;    
    }
     
    // driver function
  
        int n = 20;
        System.out.println("Sum of first " + n +
                          " Even numbers is: " +
                          evenSum(n))
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
