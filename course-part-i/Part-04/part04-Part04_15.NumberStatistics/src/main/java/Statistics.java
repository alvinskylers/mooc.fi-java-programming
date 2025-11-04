
public class Statistics {

    private int count;
    private int sum;


    public Statistics () {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        count++;
    }

    public int sum() {
        return this.sum;
    }

    public int getCount() {
        return this.count;
    }

    public double average() {
        return this.count == 0 ? 0 : 1.0 * this.sum / this.count;
    }

}
