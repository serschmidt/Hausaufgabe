package l34_collection.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        Task task = new Task(title);
        this.tasks.add(task);
    }

    public Task remove(int id) {
        for (Task task : tasks) {
            if(task.getId() != id)
                continue;
            tasks.remove(task);
            return task;
        }
        return null;
    }

    public void printTask() {
        for (Task task : this.tasks) {
            System.out.println(task);
        }
    }

    public void changeStatus(int id) {
        for (Task task : this.tasks) {
            System.out.println(task);
//            if(task.getId() == id)
//                task.getStatus() = id;

        }
    }
}
