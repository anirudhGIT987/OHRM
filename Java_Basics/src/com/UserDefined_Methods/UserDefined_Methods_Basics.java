package com.UserDefined_Methods;

public class UserDefined_Methods_Basics {

	public void concatenate() {
		String greet1="Dandaal";
		String greet2 = "Doera";
		String Greetings;
		Greetings = greet1+" "+greet2;
		System.out.println(Greetings);
	}
	public static void main(String[] args) {
	
			UserDefined_Methods_Basics object1 = new UserDefined_Methods_Basics();
			object1.concatenate();
			
			object1.multi();
			System.out.println();
			object1.koodika();
			object1.hecchu();
	}
	private void multi() {
		double lightSpeed=3*(Math.pow(10, 8));
		System.out.println("Kaanti Vegam = " +lightSpeed+"m/s");
		
	}
	protected void koodika () {
		float f1=2.6f;
		float f2=33.456789f;
		float f3 = f1+f2;
	System.out.println(f3);
	}

	void hecchu() {
		int 
		modatidi = 4567;
		int rendovadi = 4321;int moodavadi = modatidi*rendovadi;
		System.out.println(moodavadi);
	}
	
	
	

	
}
