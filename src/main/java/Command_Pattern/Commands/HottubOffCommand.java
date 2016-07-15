package Command_Pattern.Commands;

import Command_Pattern.Command;
import Command_Pattern.Vendor_Classes.Hottub;

/**
 * Created by jordan on 7/15/16.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOff();
    }

    public void undo() {
        hottub.jetsOn();
    }
}
