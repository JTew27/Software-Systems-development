
public class WordDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCounter wc = new WordCounter();
		wc.addSentence("This sentence has the word word in it twice");
		wc.addSentence("word");
		wc.outputResults();

	}

}
