package UTS;
public class TaskList {
    private TaskNode head;

    public TaskList() {
        head = null;
    }

    public void addTask(String task) {
        TaskNode newNode = new TaskNode(task);
        newNode.next = head;
        head = newNode;
    }

    public void removeTask(String task) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.task.equals(task)) {
            head = head.next;
            return;
        }

        TaskNode current = head;
        while (current.next != null && !current.next.task.equals(task)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Task not found");
        }
    }

    public void displayTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
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