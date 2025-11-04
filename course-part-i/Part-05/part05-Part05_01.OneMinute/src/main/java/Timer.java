import java.time.Clock;

public class Timer {
    
    private ClockHand seconds;
    private ClockHand hundredths;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    public String toString() {
        return seconds.toString() + ":" + hundredths.toString();
    }

    public void advance() {
        this.hundredths.advance();
        if (hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
}
