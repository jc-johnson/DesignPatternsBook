package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.TV;

/**
 * Created by jordan on 7/15/16.
 */
public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
