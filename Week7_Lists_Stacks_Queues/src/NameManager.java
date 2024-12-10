

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {

	List<String> names = new ArrayList<String>();
	
	
	int size = names.size();
	
	//NameManager manager = new NameManager();
	
	void addName(String name) {
		names.add(name);}

	void printNames() {
		for(String name : names) {
			System.out.println("Next name in list is "+ name);}
		System.out.println(names);}
			
	public void removeLongNames() {
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if (name.length() > 15) {
				iter.remove();
			}
		}
	}

		
		
			

	
	
}
