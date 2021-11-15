import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Task {
    private String taskName;
    private String taskDescription;
    enum TaskCategory{
        cat1,
        cat2,
        cat3
    };

    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop; //The deadline



    //Empty constructor
    public Task() {
    }

    //Arguments constructor

    TaskCategory taskCategory;

    public Task(String taskName, String taskDescription, TaskCategory taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory=taskCategory;
        this.taskDateTimeStart= LocalDateTime.now();
        this.taskDateTimeStop = taskDateTimeStop;
    }

    //Getters and Setters


/*    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }*/
}
