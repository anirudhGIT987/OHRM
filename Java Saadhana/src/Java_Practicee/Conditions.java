package Java_Practicee;

public class Conditions {
	public static void main(String[]args)
	{
	//if condition sample
		int x, y, z, a;
		x= 20; y= 30; z =40; x+=30;
		
		if(x<y)
			System.out.println("X is smaller than y");
		else
			System.out.println("Larger");
		// end of example 1
		
		
		/*/IF EXAMPLE FOR RUTUVULU
				int nela = 9; //march
				String Rutuvu;
				
				if(nela ==12 || nela == 1 || nela == 2 || nela == 11)
					Rutuvu = "Salikaalam";
				else if (nela == 3 || nela == 4 || nela == 5 || nela == 6 || nela == 7)
					Rutuvu = "Yendakaalam";
				else if (nela ==8 || nela == 9|| nela == 10)
					Rutuvu = "Vaanaakaalam";
				else 
					Rutuvu = "Tappu nela";
				System.out.println("  nela ante mana oorlo " + Rutuvu + ".");
			*/	
	/// end of the above example
				
				
				String nela = "Juuly"; //march
				String Rutuvu;
				
				if(nela == "December" || nela == "Janavary" || nela == "Febrevary" || nela == "Novumbur")
					Rutuvu = "Salikaalam";
				else if  (nela == "Marche"|| nela == "Aprilu" || nela == "May" || nela == "Joonu" || nela == "Juuly")
					Rutuvu = "Yendaakaalam";
				else if (nela =="Augustu" || nela == "Septemberu"|| nela == "Octoberu")
					Rutuvu = "Vaanaakaalam";
				else 
					Rutuvu = "Tappu nela";
				System.out.println(nela + "  nela ante mana oorlo " + Rutuvu + ".");
		
				
				
		// while example
		short j = 100;
        short k = 200;
        while(++j < --k);
        {

        System.out.println("Midpoint is " + j);
        }
	}

	
		// TODO Auto-generated method stub
		
	}
}
