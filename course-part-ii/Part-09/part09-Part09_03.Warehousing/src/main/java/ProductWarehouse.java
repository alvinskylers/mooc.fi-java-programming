public class ProductWarehouse extends Warehouse  {
    
    private String product;

    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }

    public String getName() {
        return this.product;
    }

    public void setName(String name) {
        this.product = name;
    }

    @Override
    public String toString() {
        return this.product +": "+ super.toString();
    }
}
