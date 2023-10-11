package com.JavaPrcaQ;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Liveit";
		String s2=s1.toUpperCase();
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(" string1 variable value is similar to string2 variable value ");
		}
		else
		{
			System.out.println("string1 variable value is NOT similar to string2 variable value ");
		}
		System.out.println();
		
		String astring="		ATREE			";		
		System.out.println(astring);
		System.out.println(astring.trim());
		
		
		String font = "Rameshwaram CafE";
		System.out.println(font.substring(0,10));
		int value=font.length();
		System.out.println(value);
		String fontLowerCaseLetters= font.toLowerCase();
		System.out.println("The string type font variable value after converting to Lower Case Letters is : " + fontLowerCaseLetters);
		System.out.println();
		
		// problem 2
		String underScores = "Govindaaa   GOvindaa  ";
		String replacingSpaces = underScores.replace(" " , " _");
		System.out.println(replacingSpaces);
		System.out.println(underScores.indexOf("  "));
		System.out.println(underScores.indexOf("   "));
		System.out.println();
		
		//problem 3
		String name = "Dear <|name|>, Thanks a Lot";
		name = name.replace("<|name|>", "Hari");
		System.out.println(name);
		System.out.println(name.startsWith("Har", 6));
		
		String just=6+7-4+"str"+ 40+4;
		System.out.println(just);
		
		/* StringBuilder s1 = new StringBuilder("Hello");    //String 1  
	        StringBuilder s2 = new StringBuilder(" World");    //String 2  
	        StringBuilder s = s1.append(s2);   //String 3 to store the result  
	            System.out.println(s.toString());  //Displays result  
	    */
	    }  
		
		
		
	}


