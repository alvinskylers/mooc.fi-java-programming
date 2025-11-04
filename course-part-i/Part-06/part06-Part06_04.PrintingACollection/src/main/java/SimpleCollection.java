
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String printList() {
        String list = "";
        if (this.elements.size() == 1) {
            list += "The collection " + this.name + " has " + this.elements.size() + " element:";
        } else {
            list += "The collection " + this.name + " has " + this.elements.size() + " elements:";
        }

        for (String name : this.elements) {
            list += ("\n" + name);
        }

        return list;
    }

    @Override
    public String toString() {
        return this.elements.isEmpty() ? "The collection " + this.name+ " is empty." :  printList();
    }
    
}
