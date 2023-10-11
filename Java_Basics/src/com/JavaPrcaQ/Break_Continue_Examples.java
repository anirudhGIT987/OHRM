	package com.JavaPrcaQ;

public class Break_Continue_Examples {
public static void main(String[] args) {
	/*for(int i =0; i<=20; i+=2)
	{
		System.out.println(i);
		System.out.println("Lopp goes on");
		if(i==4)
		{
			System.out.println("Ayipaye");
			break;
		}
	}*/

	/*short sh = 300;
	do {
		System.out.println("Occurence " + sh);
		
	
	sh-=10;
	}while (sh>250);
		System.out.println("Loop ends");
	*/
		
	for (int in =0; in>=-5; in--) {
		if(in==-3)
		{	System.out.println();
			System.out.println("Entered If");
			System.out.println();
			continue;
		}
		System.out.println(in +" "+"great");
	
	}
	
	
}
}
