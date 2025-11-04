public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    } 

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (0 < increaseBy) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (0 < decreaseBy) {
            this.value -= decreaseBy;
        }   
    }
    
    
}
