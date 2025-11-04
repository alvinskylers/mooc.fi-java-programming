import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int taskNumber = 1;
        for (String task:tasks) {
            System.out.println(taskNumber + ": " + task);
            taskNumber++;
        }
    }

    public void remove(int number) {
        number--;
        this.tasks.remove(number);
    }

}   
