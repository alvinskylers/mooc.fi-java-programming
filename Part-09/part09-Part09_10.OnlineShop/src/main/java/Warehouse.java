import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> stocks;
    private Map<String, Integer> prices;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stocks.getOrDefault(product, 0) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return stocks.keySet();
    }
}
