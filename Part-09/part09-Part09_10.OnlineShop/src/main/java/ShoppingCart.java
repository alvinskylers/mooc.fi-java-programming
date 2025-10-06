import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int currentPrice = 0;
        for (Item item:items.values()) {
            currentPrice += item.price();
        }
        return currentPrice;
    }

    public void increaseQuantity(String product) {
        this.items.get(product).increaseQuantity();
    }

     public void print() {
        for (String str : items.keySet()) {
            System.out.println(items.get(str).toString());
        }
    }
}
