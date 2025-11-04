import java.util.ArrayList;

public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int max) {
        this.maxWeight = max;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int freeSpace = this.maxWeight - this.currentWeight;

        if (suitcase.totalWeight() <= freeSpace) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    } 

}
