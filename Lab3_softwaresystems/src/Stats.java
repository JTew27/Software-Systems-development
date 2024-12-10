import java.util.Arrays;


public class Stats {

int[] numbers;//declares an integer array called numbers
int count;// declares a variable integer count

/**
 * 
 * @return creates the array and increments count by 1
 */
	
public void addValue(int value) {
numbers[count] = value; 
count++;}//count increments by 1 

/**
 * 
 * @return the total length of numbers
 */
public int getCount() {
return numbers.length;// returns the length of then array with the built in method
	}

/**
 * 
 * @return maximum value in array
 */
	public int getA() {
		int max = numbers[0];	// creates a variables with the first value in the array
		for (int i = 1; i < numbers.length; i++) {// loops through to get all items
			if (numbers[i] > max)
				max = numbers[i];}
		return max;
	}
/**
 * 
 * @return lowest value in array
 */
public int getB() {int min = numbers[0]; //creates variable for in value to print later
for (int i = 1; i < numbers.length; i++) {

if (numbers[i] < min)
			min = numbers[i];}
	return min;
	}
	

/**
 * 
 * @return total amount of the array numbers added up
 */
public int getTotal() {
		int total = 0;
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {// stores the total length when ran through whole array
		total += numbers[i];
		}	return total;
	}
	
/**
 * 
 * @return the average number from numbers in the array
 */
public double getAverage() {
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {//loops through whole lenght of array
			x += numbers[i];
		}
		double y = x/(double)numbers.length;		//calculates average
		return y;
	}

@Override
public String toString() {return Arrays.toString(numbers);
	}
	

public Stats(int capacity) {
numbers = new int[capacity];
	}
	
	
	
	
	
	
}