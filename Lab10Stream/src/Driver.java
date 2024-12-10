import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		
		// create your Stream solutions here
		
		students.stream()
		.forEach(System.out::println);
		System.out.println("  ");
		students.stream().filter(s -> s.getGrade() >= 70)
		.forEach(System.out::println);
		System.out.println("  ");
		
		
		//Stream<Student> studentArray = 

		Object studentArray = students.stream()
		.map(s -> s.getName().toUpperCase())
		.sorted(Comparator.reverseOrder())
		//.filter(getName())
		//.toArray(students)
	    .collect(Collectors.toList());
		//.forEach(System.out::println);
		
		
		System.out.println(studentArray);
		//students.stream();
		
		System.out.println("  ");
		
		 IntStream.range(90, 100)
		.map(s ->s*s*s)
		.forEach(num -> System.out.println(num));
		 
		 System.out.println("  ");
		 
		List<Integer> numList = Stream.generate(new Random()::nextInt)
		 //.map(IntStream.range(0, 5));
		 .distinct()//if there is a duplicate value it will change it so its unique
		 .limit(10)
		 .collect(Collectors.toList());
		
		for(int next: numList)
			System.out.println("Next Value is: "+ next);
		
		System.out.println("  ");
		
		
		
		
	}

	
	
	
	
	
	
}
