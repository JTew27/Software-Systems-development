package wk4Exceptions;
//import java.util.Scanner;
public class Menu {
	
	void displayMenuOption(int opt)throws InvalidOptionException {
	if(opt < 1 || opt>3) {
		throw new InvalidOptionException();
	}
		//Scanner in = new Scanner(System.in);
		switch(opt) {
		case 1:
		System.out.println("Option 1 selected-");
			break;
		case 2:
		System.out.println("Option 2 selected-");
			break;
		case 3:
		System.out.println("Option 3 selected-");
			break;
		}
	}
	}



