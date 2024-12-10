
public class NameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName("Joshua Taylor Biggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathon Smython");
		manager.addName("P.Thompson");
		
		manager.printNames(); // should print all names
		manager.removeLongNames();
		manager.printNames(); // should now have longer names removed

	}

}

