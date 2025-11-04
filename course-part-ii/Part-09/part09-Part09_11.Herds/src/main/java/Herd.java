import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd; 

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m:herd) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString(){
        String result = "";
        for (Movable m:herd) {
            result += m+"\n";
        }
        return result;
    }

}