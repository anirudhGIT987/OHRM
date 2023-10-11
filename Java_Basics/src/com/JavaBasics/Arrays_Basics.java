package com.JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class Arrays_Basics {

	public static void main(String[] args) {
							//SingleDimensional Arrays
	/* String ee_Naadu[] = {"Aadivaram","Somavaram","Managalavaram","Budhavaaram","Guruvaaram","Sukravaaram","Sanivaaram"};
	String [] day = new String[7];
		day[0] = "Aadivaram";
		day[1] = "Somavaram";
		day[2] = "Managalavaram";
		day[3] = "Budhavaaram";
		day[4] = "Guruvaaram";
		day[5] = "Sukravaaram";
		day[6] = "Sanivaaram";
	//System.out.println(day[0]);
	
	String[]dayE = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	System.out.println(ee_Naadu[0]);	
		
	System.out.println(dayE[0]);
		 	
	//Displaying an array wholly instead of printing every element
	//for(int i = 0; i<ee_Naadu.length;i+=1)
	//{
	//	System.out.println("THe day is "+ ee_Naadu[i]);
	//}
	
	int i=0;
	while(i<ee_Naadu.length)
	{
		System.out.println("EENADU "+ee_Naadu[i]);
		i+=1;
	}
	
	short array1[] = {34,34,35,65}; 
	System.out.println(array1[2]);
	
	double temp[] = {20.1, 30.1, 40.1, 50.1};
	System.out.println(temp[3]);
	System.out.println(temp[0]);	
for (int arrayIndex=0; arrayIndex<temp.length;arrayIndex+=1)
	{
		System.out.println(arrayIndex +" "+ temp[arrayIndex]);
	}
	*/
	
				//MultiDimensional Arrays
	
		short matrix[][] = new short[2][3];
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		System.out.println(matrix.length);
		//System.out.println(matrix[1][0]);
		
		for(int rowIndex=0; rowIndex<matrix.length
				;rowIndex+=1)
		{
			for(int rowofCellIndex=0; rowofCellIndex<matrix.length; rowofCellIndex+=1)
			{
				System.out.print(matrix[rowIndex][rowofCellIndex]+" ");
				
			}System.out.println();
		}
		
			Object oarray[][] = new Object[3][3];
			oarray[0][0] = "OOOOOOoo";
			oarray[0][1] = 'E';
			oarray[0][2] = true;
			oarray[1][0] = 22;
			oarray[1][1] = 50.0;
			
			for(int rI = 0;rI<=2;rI++)
			{
				for(int cI=0;cI<=2;cI++)
				{
					System.out.print("         "+oarray[rI][cI]);
			
				}System.out.println();
			}
			
			List<Object>anyType = new ArrayList<>();
			
			anyType.add(false);
			anyType.add(23.4);
			anyType.add("Balayya");
			
			for(Object Po: anyType)
			{
				System.out.println(Po);
			}
			
	}
}
