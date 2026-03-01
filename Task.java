public class Task {
    private int id;
    private String title;
    private String description;
    private Priority priority;
    private boolean isComplete;

    public Task(int id, String title, String description, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setpriority(Priority newPriority) {
        this.priority = newPriority;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void markAsDone() {
        this.isComplete = true;
    }      
}
