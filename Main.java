import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to your task tracker!");

        while (running) {
            System.out.println("\n--- Main Menue ---");
            System.out.println("1. Add a task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Complete a task");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n-- Adding a new Task --");
                    System.out.println("Enter task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Task Title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter Task Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Choose a priority:");
                    System.out.println("1. LOW");
                    System.out.println("2. INTERMEDIATE");
                    System.out.println("3. HIGH");
                    Priority priority = Priority.LOW; // for safety

                    int priorityChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (priorityChoice) {
                        case 1: 
                            priority = Priority.LOW;
                            break;
                        case 2: 
                            priority = Priority.INTERMEDIATE;
                            break;
                        case 3: 
                            priority = Priority.HIGH;
                            break;
                        default:
                            System.out.println("Invalid input. Please choose a number from 1 to 3");
                    }

                    Task newTask = new Task(id, title, description, priority);
                    manager.addTask(newTask);
                    break;
                case 2:
                    manager.viewAllTasks();

                    break;
                case 3:
                    System.out.println("Enter the ID of the task you finished: ");
                    int idToComplete = scanner.nextInt();
                    manager.completeTask(idToComplete);

                    break;
                case 4:
                    System.out.println("Goodbye!! :)");
                    running = false;

                    break;
                default:
                    System.out.println("Invalid input. Please choose a number from 1 to 4");
            }
        }

        scanner.close();
    }
}