package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.Hottub;

/**
 * Created by jordan on 7/15/16.
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOn();
    }

    public void undo() {
        hottub.jetsOff();
    }
}
