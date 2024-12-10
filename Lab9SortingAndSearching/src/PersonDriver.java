
public class PersonDriver {
	public static void main(String[] args) {
		
		Census person = new Census();
		
		Person james = new Person(180,19,true);
		Person zach = new Person(179,20,true);
		Person lucy = new Person(169,19,false);
		
		person.addPerson(james);
		person.addPerson(zach);
		person.addPerson(lucy);
		
		person.countMales();
		person.countFemales();
		
		person.sortOnAge();
		person.toString();
		
		person.sortOnHeight();
		person.toString();
		
		person.sortOnGender();
		person.toString();
	}
}
