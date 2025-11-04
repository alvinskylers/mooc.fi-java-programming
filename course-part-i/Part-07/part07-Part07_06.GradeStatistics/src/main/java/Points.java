import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;

    public Points () {
        this.points = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (0 <= point && point <= 100) {
            this.points.add(point);
        }
    }

    public double average() {
        int total = this.points.size();
        int sumPoints = 0;
        for (Integer point : points) {
            sumPoints += point;
        }
    
        return 1.0 * sumPoints / total;
    }

    public String averagePassed() {
        ArrayList<Integer> passed = new ArrayList<>();

        for (Integer point : points) {
            if (50 <= point) {
                passed.add(point);
            }
        }

        if (!passed.isEmpty()) {
            int total = passed.size();
            int sumPassed = 0;
            for (Integer pass : passed) {
                sumPassed += pass;
            }
            return Double.toString(1.0 * sumPassed / total);
        } 

        return "-";
        
    }
    
    public double passedPercentage() {
        ArrayList<Integer> passed = new ArrayList<>();

        for (Integer point : points) {
            if (50 <= point) {
                passed.add(point);
            }
        }

        int total = this.points.size();
        int pass = passed.size();

        return  1.0 * pass * 100 / total;
    }

    public String printGrade() {
        String result = "5: ";
        for (Integer point : this.points) {
            if (point >= 90) {
                result += "*";
            }    
        } 

        result += "\n4: ";

        for (Integer point : this.points) {
            if ( 80 <= point && point < 90) {
                result += "*";
            }    
        }

        result += "\n3: ";

        for (Integer point : this.points) {
            if ( 70 <= point && point < 80) {
                result += "*";
            }    
        }

        result += "\n2: ";
        for (Integer point : this.points) {
            if (60 <= point && point < 70) {
                result += "*";
            }    
        } 

        result += "\n1: ";

        for (Integer point : this.points) {
            if ( 50 <= point && point < 60) {
                result += "*";
            }    
        }

        result += "\n0: ";

        for (Integer point : this.points) {
            if ( point < 50) {
                result += "*";
            }    
        }
        return result;
    }

    
}
