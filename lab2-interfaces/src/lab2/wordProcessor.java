package lab2;

public class wordProcessor implements Counter{
	
	//default void wordProcessor(String sentence) {
String text ="sentence not found";
	public String getText() {
	return text;}

public void setText(String text) {
	this.text = text;}

public wordProcessor(String sentence) {}

	@Override
	public int countWords(String sentence) {
	if (sentence == null) {
		System.out.println(text);
		return 0;}
			String[] list = sentence.split(" ");
			int words = 0;;
			for (int i =0; i< list.length; i++) {
				words++;}
			return words;}
					
	@Override
	public int countLetters(String sentence) {
		
		if (sentence == null) {
			System.out.println(text);
			return 0;}	
	    int characters = 0;
	   for (int i = 0; i < sentence.length(); i ++) {
	    	if (Character.isLetter(sentence.charAt(i)))
	    			characters++;}
	   return characters;}
		

	@Override
	public int getLength(String sentence) {
		
		if (sentence == null) {
			System.out.println(text);
			return 0;}
		int length = sentence.length();
		return length;}}
	
