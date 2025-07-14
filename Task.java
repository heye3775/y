import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Comparator;

class Task {
    String taskName;
    String dueDate;
    boolean status;

    Task(String taskName, String dueDate, boolean status) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.status = status;
    }
    void display() {
        System.out.println("Task: " + taskName + ", Due: " + dueDate);
    }
}
class Main {
    public static void main(String[] args)
    {
        Task[] tasks = 
        {
            new Task("Submit report", "2025-07-15", false),
            new Task("Team meeting", "2025-07-12", true),
            new Task("Project update", "2025-07-13", false),
            new Task("Code review", "2025-07-14", false),
            new Task("Email client", "2025-07-11", true)
        };
        Arrays.stream(tasks)
              .filter(t -> !t.status)
              .sorted(Comparator.comparing((Task t) -> t.dueDate))
              .forEach(t -> t.display());
    }
}