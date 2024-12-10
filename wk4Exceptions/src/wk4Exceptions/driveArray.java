package wk4Exceptions;

public class driveArray {

	public static void main(String[] args) {
		ArrayProcessor ap = new ArrayProcessor();
		Menu m = new Menu();
		
		int len = ap.getArrayLength(new String[]{"one", "two", "three"});
		System.out.println("Array length is " + len);
		
		try {
			m.displayMenuOption(1);
			//m.displayMenuOption(2);
			//m.displayMenuOption(3);
			m.displayMenuOption(4);
	}
		catch (InvalidOptionException e) {
			System.out.println("unable to display message");
			
		}

	
	}



}
