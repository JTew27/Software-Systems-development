import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Census {
	
		
	
	private List<Person> people = new ArrayList<Person>();

	 boolean addPerson(Person person) {
		return people.add(person);}
	
	
	boolean removePerson(Person person) {
		if(people.contains(person)) 
			return people.remove(person);
			return false;}
	
	int countPeople(Person person) {
		return people.size();
	}
	
	int countMales() {
		int count = 0;
		for(Person person : people) {
			boolean sex = person.gender;
			if (sex ==true) {
				count++;
			}
		}
	System.out.println(count);
	return count;
	}
	 int countFemales() {
		int count = 0;
		for(Person person : people) {
			boolean sex = person.gender;
			if (sex ==false) {
				count++;
		
			}
		}
	System.out.println(count);
	return count;
	}

	 void sortOnAge() {
		 Collections.sort(people, new Comparator<Person>() {
			 @Override
			 public int compare(Person p1, Person p2) {
			 // TODO compare p1 to p2 here using appropriate attribute
				 return Integer.compare(p1.age, p2.age);
			 }
		 });
			 
	 }
	 void sortOnHeight() {
		 Collections.sort(people, new Comparator<Person>() {
			 @Override
			 public int compare(Person p1, Person p2) {
			 // TODO compare p1 to p2 here using appropriate attribute
				 return Integer.compare(p1.height, p2.height);
			 }
		 });
	 }
	 void sortOnGender() { 
		 Collections.sort(people, new Comparator<Person>() {
			 @Override
			 public int compare(Person p1, Person p2) {
			 // TODO compare p1 to p2 here using appropriate attribute
				 return Boolean.compare(p1.gender, p2.gender);
			 }
		 });
	 }

	@Override
	public String toString() {
		System.out.println(people);
		return "Census [people=" + people  + "]";
	}
	 
	 

}