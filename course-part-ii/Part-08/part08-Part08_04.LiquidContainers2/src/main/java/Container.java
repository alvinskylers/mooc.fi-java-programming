
public class Container {

    private int maxAmount;
    private int currentAmount;

    public Container() {
        this.currentAmount = 0;
        this.maxAmount = 100;
    }

    public void add(int amount) {
        if (amount > 0 ) {
            this.currentAmount += amount;
        }

        if (this.currentAmount > this.maxAmount) {
            this.currentAmount = this.maxAmount;
        }
    }

    public void remove (int amount) {
        if (amount > 0) {
            this.currentAmount -= amount;
        }

        if (this.currentAmount < 0) {
            this.currentAmount = 0;
        }
    }

    public int contains() {
        return this.currentAmount;
    }

    public String toString() {
        return this.currentAmount + "/100";
    }
}
