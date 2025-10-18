package application;

public class TemperatureSensor implements Sensor{

    private boolean sensorStatus;
    private int currentSensor;

    public TemperatureSensor() {
        this.sensorStatus = false;
        this.currentSensor = 0;
    }

    @Override
    public boolean isOn() {
        return this.sensorStatus;
    }

    @Override
    public void setOn() {
       this.sensorStatus = true;
    }

    @Override
    public void setOff() {
        this.sensorStatus = false;
    }

    @Override
    public int read(){
        if (sensorStatus) {
            return (int) (Math.random() * 61) - 30;
        } else {
            throw new IllegalCallerException("SENSOR is turned OFF.");
        }
    }

}

