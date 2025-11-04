package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;


public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        //if the word is in keyset(original word)
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        //if word is in value(translation word)
        for (String key : dictionary.keySet()) {
            if (dictionary.get(key).equals(word)) {
                return key;
            }
        }
        return null;

    }

    public void delete(String word) {

        String value = dictionary.remove(word);

        if (value == null) {
            dictionary.values().removeIf(val -> val.equals(word));
        }
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    dictionary.put(parts[0].trim(), parts[1].trim());
                }
            }
            fileReader.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : dictionary.keySet()) {
                String value = dictionary.get(key);
                writer.write(key + ":" + value + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}