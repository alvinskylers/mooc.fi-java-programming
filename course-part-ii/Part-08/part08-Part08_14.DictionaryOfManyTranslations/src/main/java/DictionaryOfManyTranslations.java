import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (dictionary.keySet().contains(word)) {
        } else {
            dictionary.put(word, new ArrayList<>());
        }

        dictionary.get(word).add(translation);
    }    

    public ArrayList<String> translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return new ArrayList<String>();
        }
    }

    public void remove(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }
}
