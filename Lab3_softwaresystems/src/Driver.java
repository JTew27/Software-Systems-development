import java.util.Random;

/*
 * links stats to the driver to get the data 
 */
public class Driver {
public static void main(String[] args) {final int VALUES = 10;
Stats stats = new Stats(VALUES);
Random random = new Random();
		
for (int i = 0; i < VALUES; i++) {
stats.addValue(random.nextInt(100));//creates 10 random numbers in the range of 1 -100
}

// outputs all methods with their asscoiated messages
System.out.println("Numbers stored : ");
System.out.println(stats);		
System.out.println("Average = " + stats.getAverage());
System.out.println("Count = " + stats.getCount());
System.out.println("Total = " + stats.getTotal());
System.out.println("Minimum value = " + stats.getB());
System.out.println("Maximum value = " + stats.getA());
}}
