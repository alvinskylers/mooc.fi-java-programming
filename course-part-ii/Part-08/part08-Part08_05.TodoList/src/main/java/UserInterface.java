import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                addTask();
            }

            if (command.equals("list")) {
                viewTasks();
            }

            if (command.equals("remove")) {
                completeTask();
            }
        }
    }

    private void addTask() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.todoList.add(task);
    }

    private void viewTasks() {
        this.todoList.print();
    }

    private void completeTask() {
        System.out.print("Which one is removed? ");
        int number = scanner.nextInt();
        this.todoList.remove(number);
    }


}
