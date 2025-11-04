import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        int freeSpace = this.maxWeight - this.currentWeight;

        if (item.getWeight() <= freeSpace) {
            items.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }   

    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    private String printFormat() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.currentWeight + " kg)";
        } else {
            return this.items.size() + " items (" + this.currentWeight + " kg)";
        }
    }

    @Override
    public String toString() {
        return printFormat(); 
    }

}