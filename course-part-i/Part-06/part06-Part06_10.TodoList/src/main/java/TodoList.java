import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : this.list) {
            System.out.println(index + ": " + task);
            index++;
        }
    }

    public void remove(int number) {
        this.list.remove(number-1);
    }


}
