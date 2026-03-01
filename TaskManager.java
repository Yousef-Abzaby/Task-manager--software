import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;

    // constructor
    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    // Method for adding a new task to te list
    public void addTask(Task newTask) {
        taskList.add(newTask);
        System.out.println("Task added successfully!");
    }

    // Method for viewing the tasks
    public void viewAllTasks() {
        // incase no tasks are present
        if (taskList.isEmpty()) {
            System.out.println("No tasks to show.");
            return;
        }

        System.out.println("--- Your Tasks ---");
        for (Task t : taskList) {
            System.out.println("ID: " + t.getId() + 
                               " | Title: " + t.getTitle() + 
                               " | Priority: " + t.getPriority() + 
                               " | Done: " + t.getIsComplete());
        }
        System.out.println("-------------------------");
    }

    // Method for updating the tasks
    public void completeTask(int searchId) {
        for (Task t : taskList) {
            if (t.getId() == searchId) {
                t.markAsDone();
                System.out.println("Task " + searchId + " marked complete!");
                return;
            }
        }
        // incase not found
        System.out.println("Error: Task with ID: " + searchId + "not found.");
    }
}