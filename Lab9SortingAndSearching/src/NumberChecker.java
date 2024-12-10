
public class NumberChecker {

	
	int findMax(Integer [] numbers) {
		int max = 0;
		int count = 0;
		for (Integer i:numbers) {
			if (i > numbers[count]) {
				count ++;
				max = i;
			}
		}
		
		
		
		
		return max;
	}
}
