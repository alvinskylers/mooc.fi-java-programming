import java.util.ArrayList;

public class Box implements Packable {
    
    private double maxWeight;
    private ArrayList<Packable> items;


    public Box(double initialWeight){
        this.maxWeight = initialWeight;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double currentWeight = 0;
        for (Packable item:items ) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString () {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg" ;
    }
}
