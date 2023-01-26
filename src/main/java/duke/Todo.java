package duke;

import duke.Task;

public class Todo extends Task {
    public Todo(String description) {
        super(description);
        super.type = 'T';
    }

    @Override
    public String toString() {
        return "[" + super.type + "]" + super.toString();
    }
}