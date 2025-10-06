import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeHistory{

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        if (this.history.size() == 1) {
            return history.get(0);
        }

        double max = this.history.get(0);
        for (Double value:history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        if (this.history.size() == 1) {
            return history.get(0);
        }
        
        double min = this.history.get(0);
        for (Double value:history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {
       if (this.history.isEmpty()) {
            return 0;
        }

        if (this.history.size() == 1) {
            return history.get(0);
        }

        int count = 0;
        int sum = 0;
        for (Double value:history) {
            sum += value;
            count++;
        }
        return 1.0 * sum / count;
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }
}