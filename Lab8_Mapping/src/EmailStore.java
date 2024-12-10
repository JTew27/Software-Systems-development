import java.util.HashSet;
import java.util.Set;

public class EmailStore {
//private static final boolean False = false;
Set<String> emailAddresses = new HashSet<String>();



public boolean addEmail(String email) {
//	boolean emailAdded = False;
	if(emailAddresses.contains(email)) {
		
		System.out.print("Duplicate email ");		
		return false;
	}
	else {
		emailAddresses.add(email);
		return true;
	}
}

public boolean hasEmail(String email) {
	try {
		emailAddresses.contains(email);
		return true;}
	catch(Exception e){
		System.out.println("email is duplicate");
		return false;
	}
	
	
}

public void displayEmails() {
	for (String email : emailAddresses) {
		System.out.println(email);
	}
}
}