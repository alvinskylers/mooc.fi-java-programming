public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (value < 5) {
            value++;
        }
    }
    
    public void decrease() {
        if (0 < value) {
            value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
    
}
