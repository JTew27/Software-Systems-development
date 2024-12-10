import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {

	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

	
	public void addWord(String word) {
		if (wordMap.containsKey(word)) {
			Integer var = wordMap.get(word)+1;
			wordMap.put(word, var);
		}
		else {
			wordMap.put(word, 1);
		}
	}
	
	public void addSentence(String sentence) {
		String Array[] = sentence.split(" ");
		for (String word:Array) {
				addWord(word);
		}
	}
	
	public final void outputResults(){
		for(Entry<String, Integer> entry : wordMap.entrySet()){
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+":"+val);	
		}
			
		}
		
	}

