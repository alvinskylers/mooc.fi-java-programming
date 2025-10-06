public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory (String product, double capacity, double initialBalance) {
        super(product, capacity);
        this.changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        double balance = super.getBalance() + amount;
        super.addToWarehouse(amount);
        changeHistory.add(balance);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double balance = super.getBalance() - amount;
        changeHistory.add(balance);
        return super.takeFromWarehouse(amount);
    } 

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

}