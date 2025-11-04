import java.util.LinkedList;

public class Pipe<T> {
    private LinkedList<T> values;
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    } 

    public T takeFromPipe() {
        if (values.isEmpty()) 
            return null;

        T object = values.getFirst();
        values.removeFirst();
        return object;
    }

    public boolean isInPipe() {
        return !values.isEmpty();
    }
}
