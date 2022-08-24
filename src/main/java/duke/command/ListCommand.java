package duke.command;

import duke.*;
import duke.exception.*;
public class ListCommand extends Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showTasks(tasks);
    }

    @Override
    public String toString() {
        return "List command";
    }
}
