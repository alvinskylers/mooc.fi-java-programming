public class Container {
 
    private int currentAmount;
    private int maxAmount;

    public Container() {
        this.currentAmount = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.currentAmount += amount;
        }

        if (this.currentAmount > 100) {
            this.currentAmount = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.currentAmount -= amount;
        }

        if (this.currentAmount < 0) {
            this.currentAmount = 0;
        }
    }

    public String toString() {
        return this.currentAmount + "/100";
    }

}
