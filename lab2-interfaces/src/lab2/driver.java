package lab2;
import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){	
		System.out.println("Enter a sentence: ");
		String sentence = in.nextLine();
		if(sentence.trim() == ("")){
			sentence = null;}
		
		wordProcessor input = new wordProcessor(sentence);
		
		int w = input.countWords(sentence);
		int l = input.countLetters(sentence);
		int len = input.getLength(sentence);
		
		System.out.println("Words:" +w);
		System.out.println("Letters:" +l);
		System.out.println("Total Length:" +len);

	}
}
}
