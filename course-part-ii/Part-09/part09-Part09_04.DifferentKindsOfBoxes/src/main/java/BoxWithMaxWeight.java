import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> slots;

    public BoxWithMaxWeight (int capacity) {
        this.capacity = capacity;
        this.slots = new ArrayList<>();
    }

    private int currentCapacity() {
        int currentWeight = 0;
        for (Item item : slots) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + currentCapacity() <= capacity) {
            slots.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return slots.contains(item);
    }
}
