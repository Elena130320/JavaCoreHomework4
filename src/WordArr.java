import java.util.HashMap;
import java.util.Map;

public class WordArr {
    public String[] arrayWord;

    public WordArr(String[] arrayWord) {
        this.arrayWord = arrayWord;
    }
    public void doArrayWord() {
        HashMap<String,Integer> mapWords = getMapWords(arrayWord);
        for (Map.Entry entry: mapWords.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapWords(String[] arrayWord) {
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < arrayWord.length; i++) {
            if (mapWords.containsKey(arrayWord[i])) {
                mapWords.put(arrayWord[i], mapWords.get(arrayWord[i]) + 1);
            }
            else {
                mapWords.put(arrayWord[i],1);
            }
        }
        return mapWords;
    }

}
