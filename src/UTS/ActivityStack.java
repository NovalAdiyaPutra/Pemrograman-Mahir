package UTS;
import java.util.Stack;

public class ActivityStack {
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public ActivityStack() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void performAction(String action) {
        undoStack.push(action);
        redoStack.clear();
    }

    public String undo() {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();
            redoStack.push(action);
            return "Undid: " + action;
        }
        return "No actions to undo";
    }

    public String redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            undoStack.push(action);
            return "Redid: " + action;
        }
        return "No actions to redo";
    }

    public static void main(String[] args) {
        ActivityStack activity = new ActivityStack();
        activity.performAction("Write code");
        activity.performAction("Compile code");
        activity.performAction("Run code");

        System.out.println(activity.undo()); // Output: Undid: Run code
        System.out.println(activity.undo()); // Output: Undid: Compile code
        System.out.println(activity.redo()); // Output: Redid: Compile code
    }
}