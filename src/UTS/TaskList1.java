package UTS;
import java.util.ArrayList;

public class TaskList1 {
    private ArrayList<String> tasks;

    public TaskList1() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Removed task: " + task);
        } else {
            System.out.println("Task not found");
        }
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskList1 taskList = new TaskList1();
        taskList.addTask("Kerjakan PR Matematika");
        taskList.addTask("Belajar untuk Ujian");
        taskList.addTask("Selesaikan Laporan");

        System.out.println("Tasks:");
        taskList.displayTasks();

        taskList.removeTask("Belajar untuk Ujian");
        System.out.println("Tasks after removal:");
        taskList.displayTasks();
    }
}
