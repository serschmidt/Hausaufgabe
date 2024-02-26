package l34_collection.Task;

import java.util.Objects;

public class Task {
    private static int counter = 0;
    private static final int ID_BASE = 829232;
    private int id;
    private String title;
    private TaskStatus status;

    public Task(String title) {
        this.title = title;
        this.id = ID_BASE + counter;
        this.status = TaskStatus.INIT;
        Task.counter += 1;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static int getIdBase() {
        return ID_BASE;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public static void setCounter(int counter) {
        Task.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "[" + id +"]" + title + " " + status;
    }
}
