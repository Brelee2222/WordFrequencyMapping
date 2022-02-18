import java.util.HashMap;
import java.util.Map;

public class Reader {
    private int wordCount = 0;
    private Map<String, Integer> words = new HashMap<String, Integer>();
    public void newEntry(String line) {
        String[] wordsInLine = line.split(" ");
        wordCount += wordsInLine.length;
        for(String word : wordsInLine)
            insertWord(word);
    }
    public boolean insertWord(String word) {
        word.trim();
        if(word.equals(""))
            return false;
        if(words.containsKey(word))
            words.put(word, words.get(word) + 1);
        else
            words.put(word, 1);
        return true;
    }
    public void printAll() {
        for(Map.Entry entry : words.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
