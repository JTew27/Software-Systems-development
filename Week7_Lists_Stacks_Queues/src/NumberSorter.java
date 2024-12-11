import java.util.Stack;

public class NumberSorter {

	public void sort(int [] numbers, boolean ascending) {
		//source stack where numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		//dest stack where numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		for (int number : numbers)
			srcStack.push(number);
		
		while(!srcStack.isEmpty()) {
			int next = srcStack.pop(); //pop next item off top of list
			System.out.println(next);
			while(destStack.size() < 0){
				srcStack.push(destStack.pop());	
	   
				}
			destStack.push(next); //push next item onto stack
			//System.out.println(srcStack);
			System.out.println(destStack);
			}
		for (int number : destStack) //for numbers in the stack that is pushed too
	     	System.out.println(number + " ");
		}
		//System.out.println();	
}
		
		//while(!destStack.isEmpty()) {
			//System.out.println(srcStack.pop());}
		
	
	
	


