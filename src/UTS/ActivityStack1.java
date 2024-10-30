package UTS;
import java.util.ArrayDeque;
import java.util.Deque;

public class ActivityStack1 {
    private Deque<String> undoDeque;
    private Deque<String> redoDeque;

    public ActivityStack1() {
        undoDeque = new ArrayDeque<>();
        redoDeque = new ArrayDeque<>();
    }

    public void performAction(String action) {
        undoDeque.push(action);
        redoDeque.clear();
    }

    public String undo() {
        if (!undoDeque.isEmpty()) {
            String action = undoDeque.pop();
            redoDeque.push(action);
            return "Undid: " + action;
        }
        return "No actions to undo";
    }

    public String redo() {
        if (!redoDeque.isEmpty()) {
            String action = redoDeque.pop();
            undoDeque.push(action);
            return "Redid: " + action;
        }
        return "No actions to redo";
    }

    public static void main(String[] args) {
        ActivityStack1 activity = new ActivityStack1();
        activity.performAction("Write code");
        activity.performAction("Compile code");
        activity.performAction("Run code");

        System.out.println(activity.undo()); // Output: Undid: Run code
        System.out.println(activity.undo()); // Output: Undid: Compile code
        System.out.println(activity.redo()); // Output: Redid: Compile code
    }
}
