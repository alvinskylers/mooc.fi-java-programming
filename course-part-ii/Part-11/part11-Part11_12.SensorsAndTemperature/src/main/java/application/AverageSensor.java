package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class AverageSensor implements Sensor{

    private List<Sensor> sensors;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
       return !this.sensors.isEmpty();
    }

    @Override
    public void setOn() {
        sensors.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || isOn()==false)  
            throw new IllegalStateException("Unimplemented method 'read'");
        else 
           return (int) sensors.stream()
                    .mapToInt(s -> Integer.valueOf(s.read()))
                    .average()
                    .getAsDouble();
    }

    public List<Integer> readings() {
        return sensors.stream()
            .mapToInt(s -> s.read())
            .boxed()
            .collect(Collectors.toList());
    }

    
}
